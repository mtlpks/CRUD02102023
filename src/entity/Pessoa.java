package entity;

public class Pessoa {
	private String nome;
	
	public Pessoa(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String val) {
		this.nome = val;
	}
	
	public String getInfo() {
		return "Método básico para exemplificar polimorfismo.";
	}
}
