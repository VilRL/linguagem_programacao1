package telas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Tela_Comprar {
	
	ArrayList<Carro> ListCarro = new ArrayList<Carro>();
	ArrayList<Compra> ListComprador = new ArrayList<Compra>();
	
	JFrame frmLocao;
	private JTextField textField_Nome_Comprador;
	private JTextField textField_CPF;
	private JTextField textField_Vendedor;
	private JTextField textField_Salario;
	private JTextField textField_Idade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Comprar window = new Tela_Comprar();
					window.frmLocao.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Comprar() {
		initialize();
	}
	
	public Tela_Comprar(ArrayList<Carro>Lista) {
		
		this.ListCarro=Lista;
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLocao = new JFrame();
		frmLocao.setTitle("Loca\u00E7\u00E3o");
		frmLocao.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frmLocao.setBounds(100, 100, 320, 400);
		frmLocao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLocao.getContentPane().setLayout(null);
		
		ArrayList<Compra> ListComprador = new ArrayList<Compra>();
		
		
		JComboBox comboBox_carro = new JComboBox();
		comboBox_carro.setModel(new DefaultComboBoxModel(new String[] {"<Selecione um carro>"}));
		comboBox_carro.setBounds(140, 10, 151, 21);
		frmLocao.getContentPane().add(comboBox_carro);
		
		JLabel lblNewLabel = new JLabel("Nome do Comprador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(20, 41, 155, 13);
		frmLocao.getContentPane().add(lblNewLabel);
		
		textField_Nome_Comprador = new JTextField();
		textField_Nome_Comprador.setBounds(30, 64, 255, 19);
		frmLocao.getContentPane().add(textField_Nome_Comprador);
		textField_Nome_Comprador.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 92, 144, 13);
		frmLocao.getContentPane().add(lblNewLabel_1);
		
		textField_CPF = new JTextField();
		textField_CPF.setBounds(30, 115, 255, 19);
		frmLocao.getContentPane().add(textField_CPF);
		textField_CPF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(20, 144, 110, 13);
		frmLocao.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Vendedor");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(20, 197, 265, 13);
		frmLocao.getContentPane().add(lblNewLabel_3);
		
		textField_Vendedor = new JTextField();
		textField_Vendedor.setBounds(34, 220, 251, 19);
		frmLocao.getContentPane().add(textField_Vendedor);
		textField_Vendedor.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Salario");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(20, 249, 265, 13);
		frmLocao.getContentPane().add(lblNewLabel_4);
		
		textField_Salario = new JTextField();
		textField_Salario.setBounds(34, 272, 251, 19);
		frmLocao.getContentPane().add(textField_Salario);
		textField_Salario.setColumns(10);
		
		//Adquirindo itens das arrays pro combo box
		
		//declarando uma variavel pra armezanar nossa array
		Carro c;
		
		//for para passar pelas arrays e exibir todos os carros cadastrados
		for (int i = 0; i < ListCarro.size(); i++) {
			
			//aqui é onde pegamos o objeto de dentro da array
			c = ListCarro.get(i);
			
			//selecionamos o nome do modelo baseado no objeto puxado da array
			comboBox_carro.addItem(c.getvModelo());
			
		}
		JButton btnNewButton_1 = new JButton("Efetuar Transa\u00E7\u00E3o");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//metodo de segurança para garantir que tenha um cadastro de carro antes de rodar o sistema
				if(comboBox_carro.getItemCount() == 1){
					JOptionPane.showMessageDialog(null, "Cadastre um carro antes de efetuar a operação");
					}
					else {
						if(comboBox_carro.getSelectedItem() != "<Selecione um carro>") {
							
							//if para impedir o usuario de clicar no botão com os dados em branco
							if(!textField_Nome_Comprador.getText().equals("") &&
									!textField_CPF.getText().equals("") &&
									!textField_Idade.getText().equals("") &&
									!textField_Vendedor.getText().equals("") &&
									!textField_Salario.getText().equals("")) {
								
								//passando os atributos construtor para o objeto responsavel por armazenar as informações do usuario
								Compra v1 = new Compra(textField_Nome_Comprador.getText(),textField_CPF.getText(), Integer.parseInt(textField_Idade.getText()),
										textField_Vendedor.getText(), Integer.parseInt(textField_Salario.getText()));
								
								//adicionando a lista de compradores com o objeto v1
								ListComprador.add(v1);
								
								//por falta de conhecimento obtei por reutilizar o for para passar nas arrays para adquirir o valor dos carro
								Carro c;
									for (int i = 0; i < ListCarro.size(); i++) {
										//atribuido o objeto dentro da array carro para um objeto normal
										c = ListCarro.get(i);
										
										//através desse if a gente impedi de realizar a operação de comparação com todos os objetos na array
										//e amarra ele somente ao selecionado no comboBox
									if(comboBox_carro.getSelectedItem() == c.getvModelo()) {
										
										//condição para realizar a comparação entre o salario do comprador e o valor do carro
											//se o salario for maior que o valor a compra é realizada
										if(v1.getvSalario_Comprador() >= c.getvValor()) {
											JOptionPane.showMessageDialog(null, "!!!Compra Efetuado com sucesso!!!"+"\n"+"Carro: "+c.getvModelo()+" Adquirido"+"\n"+"Bom Role no Carro Novo");}
										//caso o salario seja menor, um alerta de tentativa falhada é realizado
										else {
											JOptionPane.showMessageDialog(null, "Infelizmente você não tem saldo suficiente");
											}
										}
			
									}
								}
						}
						else {
						//com o JOptionPane ativamos um alerta para o usuario explicando a razão pela qual não entrou dentro do if
						JOptionPane.showMessageDialog(null, "Preencha todos os campos ou selecione um carro valido");
						}
				}
			}
		});
		//criação do botão responsavel pelo evento de abrir a janela onde vamos cadastrar o carro
		btnNewButton_1.setBounds(20, 332, 165, 21);
		frmLocao.getContentPane().add(btnNewButton_1);
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Tela_Cadastro window = new Tela_Cadastro(ListCarro);
								window.frmCadastroCarro.setVisible(true);
								frmLocao.setVisible(false);
								
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					

			}
		});
		btnNewButton.setBounds(10, 10, 120, 21);
		frmLocao.getContentPane().add(btnNewButton);
		
		textField_Idade = new JTextField();
		textField_Idade.setBounds(30, 168, 255, 19);
		frmLocao.getContentPane().add(textField_Idade);
		textField_Idade.setColumns(10);
		
		
	}
}
