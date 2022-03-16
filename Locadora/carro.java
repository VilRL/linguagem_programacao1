package Locadora;

public class Carro {
	
	private String vPlaca;
	private double vPotencia;
	private String vModelo;
	private String vCor;
	private String vMarca;
	private boolean vCambio;
	private int vAno;
	
	
	//Metodo Construtor no ato de instanciar
	
	public Carro(
			String vPlaca,
			double vPotencia,
			String vModelo,
			String vCor,
			String vMarca,
			boolean vCambio, 
			int vAno){
		this.vPlaca = vPlaca;
        this.vPotencia = vPotencia;
        this.vModelo = vModelo;
        this.vCor = vCor;
        this.vMarca = vMarca;
        this.vCambio = vCambio;
        this.vAno = vAno;
	}
	
	public void Listar() {
		System.out.println
		(
		"Nome"+vPlaca+"\n"+
		"Potencia:"+vPotencia+"\n"+
		"Modelo:"+vModelo+"\n"+
		"Cor:"+vCor+"\n"+
		"Marca:"+vMarca+"\n"+
		"Cambio:"+vCambio+"\n"+
		"Ano:"+vAno+"\n"
		);
	}
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro("0205SP1",220,"Fusca","Vermelho","chevrolet",true,2020);
		Carro c2 = new Carro("0589SPJ",300,"Optimus","Vermelho/Azul","Autobot",false,2000);
		
		c1.Listar();
		c2.Listar();
	}

}
