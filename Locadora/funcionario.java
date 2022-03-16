package Locadora;

public class Funcionario {
    //atributos de classe
    String vNome;
    int vIdade;
    String vEmail;
    int vTelefone;
    String vFuncao;
    int vAniversario;


    // metodos construtor apenas no ato da instancia
    public Funcionario(
    		String vNome,
    		String vFuncao, int vIdade,
    		String vEmail,
    		int vTelefone,
    		int vAniversario) {

        this.vNome = vNome;
        this.vFuncao = vFuncao;
        this.vIdade = vIdade;
        this.vEmail = vEmail;
        this.vTelefone = vTelefone;
        this.vAniversario = vAniversario;

    }

    public void Informacao(){

        System.out.println("Nome: " + vNome + "\n" +
        "Função: " + vFuncao + "\n" +
        "Idade: " + vIdade + "\n" +
        "Email: " + vEmail + "\n" +
        "Telefone: " + vTelefone + "\n" +
        "Aniversario: "+vAniversario+"\n");
    }


    public static void main(String[] args) {

        Funcionario F1 = new Funcionario("Rodrigo", "Vendedor", 18, "rodrigo01office@gmail.com", 996825661,02102000);
        Funcionario F2 = new Funcionario("Osvaldo", "Gerente", 21, "osvaldo@gmail.com", 989284982,01052000);

        F1.Informacao();
        F2.Informacao();
        
    }

}
