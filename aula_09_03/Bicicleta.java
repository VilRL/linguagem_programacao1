package aula_09_03;

public class Bicicleta {
	
	private String vQuadro;
	private double vAro;
	private double vMarcha;
	private String vCor;
	private int vValor;
	
	public Bicicleta(
			String vQuadro,
			double vAro,
			double vMarcha,
			String vCor,
			int vValor
	) {
		
		
		this.vQuadro = vQuadro;
		this.vAro = vAro;
		this.vMarcha = vMarcha;
		this.vCor = vCor;
		this.vValor = vValor;
		}
	
	
	public void listar(Bicicleta m) {
		System.out.println(
				"Quadro:\t"+m.vQuadro + "\n" +
				"Aro:\t"+m.vAro + "\n" +
				"Marchas:\t"+m.vMarcha + "\n" +
				"Cor:\t"+m.vCor+"\n" +
				"Valor:\t"+m.vValor+"\n"
				
				);
	}
	
	public static void main(String[] args) {
		
		Bicicleta Bicicleta1 = new Bicicleta("Aço",18.0,6.0,"Azul",2200);
		Bicicleta Bicicleta2 = new Bicicleta("Carbono",12.0,0.0,"Vermelho",1500);
		
		Bicicleta1.listar(Bicicleta1);
		Bicicleta1.listar(Bicicleta2);
		
	}

}
