package aula_09_03;

public class Moto {
	
		
		private String vModelo;
		private int vAno;
		private String vCor;
		private double vVelocidade;
		private float vDistancia_Percorrida;
		
		public Moto(
				String vModelo,
				int vAno,
				String vCor,
				double vVelocidade,
				float vDistancia_Percorrida) {
			
			this.vModelo = vModelo;
			this.vAno = vAno;
			this.vCor = vCor;
			this.vVelocidade = vVelocidade;
			this.vDistancia_Percorrida = vDistancia_Percorrida;
			}
		public void listar(Moto m) {
			System.out.println(
					"Modelo:\t"+m.vModelo + "\n" +
					"Ano:\t"+m.vAno + "\n" +
					"cor:\t"+m.vCor + "\n" +
					"velocidade:\t"+m.vVelocidade+"\n" +
					"Quilometragem:\t"+m.vDistancia_Percorrida+"\n"
					
					);
			
			
		}
		
		
	public static void main(String[] args) {
		
		Moto moto1 = new Moto("Yamaha",2020,"Cinza Neon",220,1500);
		Moto moto2 = new Moto("Ninja",2022,"Verde",300,0);
		
		moto1.listar(moto2);
		moto1.listar(moto1);
		
		
	}

}
