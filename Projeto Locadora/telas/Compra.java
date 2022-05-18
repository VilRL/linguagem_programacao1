package telas;

import java.util.ArrayList;

public class Compra {
	private String vNome_Comprador;
	private String vCPF_Comprador;
	private int vIdade_Comprador;
	private String vVendedor_Comprador;
	private int vSalario_Comprador;
	
	//gerando o get e set do nome do nosso Comprador
	public String getvNome_Comprador() {
		return vNome_Comprador;
	}
	public void setvNome_Comprador(String vNome_Comprador) {
		this.vNome_Comprador = vNome_Comprador;
	}
	
	//gerando o get e set do CPF do Comprador
	public String getvCPF_Comprador() {
		return vCPF_Comprador;
	}
	public void setvCPF_Comprador(String vCPF_Comprador) {
		this.vCPF_Comprador = vCPF_Comprador;
	}
	
	//gerando o get e set da idade do Comprador
	public int getvIdade_Comprador() {
		return vIdade_Comprador;
	}
	public void setvIdade_Comprador(int vIdade_Comprador) {
		this.vIdade_Comprador = vIdade_Comprador;
	}
	
	//gerando o get e set do responsavel pela venda
	public String getvVendedor_Comprador() {
		return vVendedor_Comprador;
	}
	public void setvVendedor_Comprador(String vVendedor_Comprador) {
		this.vVendedor_Comprador = vVendedor_Comprador;
	}
	
	//gerando o salario do nosso Comprador
	public int getvSalario_Comprador() {
		return vSalario_Comprador;
	}
	public void setvSalario_Comprador(int vSalario_Comprador) {
		this.vSalario_Comprador = vSalario_Comprador;
	}

	//criando o construtor da classe compra para passar todos os atributos
	public Compra(String vNome_Comprador,
				String vCPF_Comprador,
				int vIdade_Comprador,
				String vVendedor_Comprador,
				int vSalario_Comprador) {
		this.vNome_Comprador = vNome_Comprador;
		this.vCPF_Comprador = vCPF_Comprador;
		this.vIdade_Comprador = vIdade_Comprador;
		this.vVendedor_Comprador = vVendedor_Comprador;
		this.vSalario_Comprador = vSalario_Comprador;	
	}
	
	//metodo para efetuar a compra do carro pelo comprador

	ArrayList<Compra> ListComprador = new ArrayList<Compra>();

}
