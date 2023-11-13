package controll;
import java.util.List;

import entity.Pessoa;
import entity.PessoaFisica;
import entity.PessoaJuridica;

public interface IRepositorioPessoa {
	public boolean salvaPessoa(Pessoa pessoa);
	public List<Pessoa> retornaListaPessoa();
	public boolean atualizaPessoa(Pessoa pessoa);
	public boolean deletaPessoa(String nome);
}
