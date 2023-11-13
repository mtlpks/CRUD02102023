package entity;

import controll.RepositorioPessoa;
public class Teste {
	public static void main(String[] args) {
		PessoaFisica m = new PessoaFisica("Matheus", "300000000");
		RepositorioPessoa repPessoa = new RepositorioPessoa();
		
		PessoaJuridica z = new PessoaJuridica("TI", "12345678912345L");
	}
}
