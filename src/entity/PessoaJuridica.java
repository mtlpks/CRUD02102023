package entity;

// exemplo de herança
public class PessoaJuridica extends Pessoa{
	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String val) {
		this.cnpj = val;
	}
	
	// exemplo de encapsulamento
	public String toString() {
		return "Nome: "+getNome()+", CNPJ: "+this.cnpj;
	}
	
	// exemplo de polimorfismo
	public String getInfo() {
		String superInfo = super.getInfo();
		return superInfo + "A segunda frase foi adicionada dentro da classe PessoaJuridica.";
	}
}
