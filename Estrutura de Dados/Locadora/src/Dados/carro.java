package Dados;

	
public class carro {
	//Atributo 
	private String vMarca;
	private String vModelo;
	private String vCor;
	private double vAno;
	private String vPlaca;
	private double vPreco;
	
	//get e set do preço do carro
	public double getvPreco() {
		return vPreco;
	}
	public void setvPreco(double vPreco) {
		this.vPreco = vPreco;
	}
	
	//get e set da Marca do carro
	public String getvMarca() {
		return vMarca;
	}
	public void setvMarca(String vMarca) {
		this.vMarca = vMarca;
	}
	
	//get e set do Modelo do carro
	public String getvModelo() {
		return vModelo;
	}
	public void setvModelo(String vModelo) {
		this.vModelo = vModelo;
	}
	
	//get e set da cor carro
	public String getvCor() {
		return vCor;
	}
	public void setvCor(String vCor) {
		this.vCor = vCor;
	}
	
	//Get e Set do Ano do carro
	public double getvAno() {
		return vAno;
	}
	public void setvAno(double vAno) {
		this.vAno = vAno;
	}
	//Get e Set da Placa do carro
	public String getvPlaca() {
		return vPlaca;
	}
	public void setvPlaca(String vPlaca) {
		this.vPlaca = vPlaca;
	}
	
	//Construtor da classe carro
	public carro(String vMarca,
					String vModelo,
					String vCor,
					Double vAno,
					String vPlaca,
					double vPreco){
		this.vMarca = vMarca;
		this.vModelo = vModelo;
		this.vCor = vCor;
		this.vAno = vAno;
		this.vPlaca = vPlaca;
		this.vPreco = vPreco;
		
	}
	
	//Metodo utilizado para mostrar os dados do carro
	private void Demonstrar_carro() {
		System.out.println("Marca: "+vMarca+"\n"+
							"Modelo: "+vModelo+"\n"+
							"Ano: "+vAno+"\n"+
							"Cor: "+vCor+"\n"+
							"Placa: "+vPlaca+"\n");
	}
	
}
