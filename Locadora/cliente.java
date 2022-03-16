package Locadora;

public class Cliente {
	
	private String vNome;
	private int vIdade;
	private String vCPF;
	private int vDuracao;
	private String vCarro;
	
	public Cliente(
			String vNome,
			int vIdade,
			String vCPF,
			int vDuracao,
			String vCarro) {
		
			this.vNome = vNome;
			this.vIdade = vIdade;
			this.vCPF = vCPF;
			this.vDuracao = vDuracao;
			this.vCarro = vCarro;
			
	}
	
	public void Listar() {
		System.out.println(
				"Nome:"+vNome+"\n"+
				"Idade:"+vIdade+"\n"+
				"CPF:"+vCPF+"\n"+
				"Duração:"+vDuracao+" Meses"+"\n"+
				"Carro: "+vCarro+"\n");
				}
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Vitor",18,"50641988842",10,"C1");
		Cliente cliente2 = new Cliente("Luiz",44,"5047396528",2,"C2");
		
		cliente1.Listar();
		cliente2.Listar();
	}
	

}
