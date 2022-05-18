package telas;

import java.util.ArrayList;

public class Carro {
	//criando os atributos para a nossa classe carro
	private String vMarca;
	private String vModelo;
	private String vCor;
	private String vPlaca;
	private int vValor;
	
	//gerando o get e set da Marca do carro
	public String getvMarca() {
		return vMarca;
	}
	public void setvMarca(String vMarca) {
		this.vMarca = vMarca;
	}
	
	//gerando o get e set do modelo do carro
	public String getvModelo() {
		return vModelo;
	}
	public void setvModelo(String vModelo) {
		this.vModelo = vModelo;
	}
	
	//gerando o get e set da cor do carro
	public String getvCor() {
		return vCor;
	}
	public void setvCor(String vCor) {
		this.vCor = vCor;
	}
	
	//gerando o get e set da placa do carro
	public String getvPlaca() {
		return vPlaca;
	}
	public void setvPlaca(String vPlaca) {
		this.vPlaca = vPlaca;
	}
	
	//gerando get e set do valo
	public int getvValor() {
		return vValor;
	}
	public void setvValor(int vValor) {
		this.vValor = vValor;
	}
	
	//criando o construtor da classe carro para passarmos todos os atribudos
	public Carro(String vMarca,
				String vModelo,
				String vCor,
				int vValor) {
		this.vMarca = vMarca;
		this.vModelo = vModelo;
		this.vCor = vCor;
		this.vValor = vValor;
	}
	
	//criando o metodo para demonstrar as informações do carro quando solicitado
	void Exibir_carro() {
		System.out.println("Marca: "+vMarca+"\n"+
							"Modelo: "+vModelo+"\n"+
							"Cor: "+vCor+"\n"+
							"Valor: "+vValor+"\n");
	}
	
	ArrayList<Carro> ListCarro = new ArrayList<Carro>();

}
