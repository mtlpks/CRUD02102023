package controll;



import java.util.ArrayList;
import java.util.List;

import entity.Pessoa;

public class RepositorioPessoa implements IRepositorioPessoa {
	List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
	@Override
	public boolean salvaPessoa(Pessoa pessoa) {
		boolean ok;
		try {
			ok=listaPessoa.add(pessoa);
		} catch (Exception e) {
			ok=false;
		}
		return ok;
	}
	
	@Override
	public List<Pessoa> retornaListaPessoa() {
		return listaPessoa;
	}
	
	@Override
	public boolean atualizaPessoa(Pessoa pessoa) {
		for (int i = 0; i < listaPessoa.size(); i++) {
			Pessoa pessoaExistente = listaPessoa.get(i);
			
			if (pessoaExistente.getNome() == pessoa.getNome()) {
				listaPessoa.set(i, pessoa);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean deletaPessoa(String val) {
		for (int i = 0; i < listaPessoa.size(); i++) {
			if (listaPessoa.get(i).getNome() == val) {
				listaPessoa.remove(i);
				return true;
			}
		}
		return false;
	}
}
