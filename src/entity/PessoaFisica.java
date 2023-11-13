package entity;

//exemplo de herança
public class PessoaFisica extends Pessoa{
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	private String cpf;
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String val) {
		this.cpf = val;
	}
	
	// exemplo de encapsulamento
	public String toString() {
		return "Nome: "+ getNome()+", CPF: "+ this.cpf;
	}
	
	// exemplo de polimorfismo
	public String getInfo() {
		String superInfo = super.getInfo();
		return superInfo + "A segunda frase foi adicionada dentro da classe PessoaFisica.";
	}
}
