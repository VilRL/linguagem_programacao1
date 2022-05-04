package Dados;

public class funcionario {
	
	//atributos do Funcionario
	private String vNome;
	private double vIdade;
	private String vCPF;
	private String vCargo;
	private double vSalario;
	private String vData_contrado;
	
	//get e set do nome do funcionario
	public String getvNome() {
		return vNome;
	}
	public void setvNome(String vNome) {
		this.vNome = vNome;
	}
	
	//get e set da idade do funcionario
	public double getvIdade() {
		return vIdade;
	}
	public void setvIdade(double vIdade) {
		this.vIdade = vIdade;
	}
	
	//get e set do CPF do funcionario
	public String getvCPF() {
		return vCPF;
	}
	public void setvCPF(String vCPF) {
		this.vCPF = vCPF;
	}
	
	//get e set do cargo do funcionario
	public String getvCargo() {
		return vCargo;
	}
	public void setvCargo(String vCargo) {
		this.vCargo = vCargo;
	}
	
	//get e set do salario do funcionario
	public double getvSalario() {
		return vSalario;
	}
	public void setvSalario(double vSalario) {
		this.vSalario = vSalario;
	}
	
	//get e set da Data de quando o funcionario foi contratado
	public String getvData_contrado() {
		return vData_contrado;
	}
	public void setvData_contrado(String vData_contrado) {
		this.vData_contrado = vData_contrado;
	}
	
	public funcionario(String vNome,
						double vIdade,
						String vCPF,
						String vCargo,
						double vSalario,
						String vData_contrado) {
		this.vNome = vNome;
		this.vIdade = vIdade;
		this.vCPF = vCPF;
		this.vCargo = vCargo;
		this.vSalario = vSalario;
		this.vData_contrado = vData_contrado;
	}
	
	public void Demonstrar_funcionario() {
		System.out.println("Nome do Funcionario: "+vNome+"\n"+       
				"Idade: "+vIdade+"\n"+    
				"CPF: "+vCPF+"\n"+          
				"Cargo: "+vCargo+"\n"+          
				"Salario: "+vSalario+"\n"+
				"Contrado em: "+vData_contrado+"\n");     
		}      

}
