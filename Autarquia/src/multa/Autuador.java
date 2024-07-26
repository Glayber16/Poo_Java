package multa;

import java.util.ArrayList;
import java.util.List;

public class Autuador {
	List<Autuacao> a;
	Local l;
	Pessoa p;
	Veiculo v;
	
	
	
	public Autuador(Veiculo v, Pessoa p, Local l) {
		a = new ArrayList<Autuacao>();
	}
	
	public void addAutuacao(Autuacao autuacao) {
		a.add(autuacao);
	}
	
	
	public int getAutuacao(Veiculo v) {
		if(a.contains(v.getPlaca())) {
			return a.indexOf(v.getPlaca());
		}
		else {
			return 0; 
		}
	}
	
}
