package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.Dialog.ModalExclusionType;
public class Tela_Cadastro {
	
	ArrayList<Carro> ListCarro = new ArrayList<Carro>();

	JFrame frmCadastroCarro;
	private JTextField textField_Marca;
	private JTextField textField_Modelo;
	private JTextField textField_Cor;
	private JTextField textField_Valor;
	private JButton btnRetorna;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cadastro window = new Tela_Cadastro();
					window.frmCadastroCarro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Cadastro() {
		initialize();
	}

	public Tela_Cadastro(ArrayList<Carro>Lista) {
		
		this.ListCarro=Lista;
		
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroCarro = new JFrame();
		frmCadastroCarro.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frmCadastroCarro.setTitle("Cadastro Carro");
		frmCadastroCarro.setBounds(100, 100, 320, 400);
		frmCadastroCarro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroCarro.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Marca");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(50, 10, 140, 13);
		frmCadastroCarro.getContentPane().add(lblNewLabel);
		
		textField_Marca = new JTextField();
		textField_Marca.setBounds(50, 25, 190, 19);
		frmCadastroCarro.getContentPane().add(textField_Marca);
		textField_Marca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblModelo.setBounds(50, 54, 140, 13);
		frmCadastroCarro.getContentPane().add(lblModelo);
		
		textField_Modelo = new JTextField();
		textField_Modelo.setColumns(10);
		textField_Modelo.setBounds(50, 70, 190, 19);
		frmCadastroCarro.getContentPane().add(textField_Modelo);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCor.setBounds(50, 94, 140, 13);
		frmCadastroCarro.getContentPane().add(lblCor);
		
		textField_Cor = new JTextField();
		textField_Cor.setColumns(10);
		textField_Cor.setBounds(50, 111, 190, 19);
		frmCadastroCarro.getContentPane().add(textField_Cor);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValor.setBounds(50, 140, 140, 13);
		frmCadastroCarro.getContentPane().add(lblValor);
		
		textField_Valor = new JTextField();
		textField_Valor.setBounds(50, 163, 190, 19);
		frmCadastroCarro.getContentPane().add(textField_Valor);
		textField_Valor.setColumns(10);
		
		ArrayList<Carro> ListCarro = new ArrayList<Carro>();
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//paassando um if para garantir que o usuario preencha todos campos
				if(!textField_Marca.getText().equals("") &&
						!textField_Marca.getText().equals("") &&
						!textField_Cor.getText().equals("") &&
						!textField_Valor.getText().equals("")) {
					
					Carro c1 = new Carro(textField_Marca.getText(),
							textField_Modelo.getText(),
							textField_Cor.getText(),
							Integer.parseInt(textField_Valor.getText()));
					
					ListCarro.add(c1);
					
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					
					
				} 
				else {
					//com o JOptionPane ativamos um alerta para o usuario explicando a razão pela qual não entrou dentro do if
					JOptionPane.showMessageDialog(null, "Preencha todos os campos");
					}
			}
		});
		btnNewButton.setBounds(50, 300, 190, 21);
		frmCadastroCarro.getContentPane().add(btnNewButton);
		
		btnRetorna = new JButton("Retorna");
		btnRetorna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Tela_Comprar window = new Tela_Comprar(ListCarro);
							window.frmLocao.setVisible(true);
							frmCadastroCarro.setVisible(false);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				

			}
		});
		btnRetorna.setBounds(50, 331, 190, 21);
		frmCadastroCarro.getContentPane().add(btnRetorna);
	}
}
