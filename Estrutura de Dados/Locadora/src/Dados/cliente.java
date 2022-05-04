package Dados;

public class cliente {
	//atributos do cliente
	private String vNome;
	private double vIdade;
	private String vCPF;
	private String vEmprego;
	private double vSalario;
	
	//get e set do nome do cliente
	public String getvNome() {
		return vNome;
	}
	public void setvNome(String vNome) {
		this.vNome = vNome;
	}
	
	//get e set da idade do cliente
		public double getvIdade() {
		return vIdade;
	}
	public void setvIdade(double vIdade) {
		this.vIdade = vIdade;
	}
	
	//get e set do CPF do cliente
	public String getvCPF() {
		return vCPF;
	}
	public void setvCPF(String vCPF) {
		this.vCPF = vCPF;
	}
	
	//get e set do emprego do cliente
	public String getvEmprego() {
		return vEmprego;
	}
	public void setvEmprego(String vEmprego) {
		this.vEmprego = vEmprego;
	}
	//get e set do salario do cliente
	public double getvSalario() {
		return vSalario;
	}
	public void setvSalario(double vSalario) {
		this.vSalario = vSalario;
	}
	//Construtor da classe carro              
	public cliente(String vNome,               
					double vIdade,           
					String vCPF,              
					String vEmprego,                         
					double vSalario){           
		this.vNome = vNome;
		this.vIdade = vIdade;
		this.vCPF = vCPF;
		this.vEmprego = vEmprego;
		this.vSalario = vSalario;		                                      
	}                            
	
	public void Demonstrar_Cliente() {
		System.out.println("Nome do Clinte: "+vNome+"\n"+       
				"Idade: "+vIdade+"\n"+    
				"CPF: "+vCPF+"\n"+          
				"Emprego: "+vEmprego+"\n"+          
				"Salario: "+vSalario+"\n");     
		}                                                   
	}
                                          
