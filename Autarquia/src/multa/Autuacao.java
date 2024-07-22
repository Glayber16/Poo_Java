package multa;

import java.util.ArrayList;
import java.util.List;

public class Autuacao {
	List<Multa> m;
	Local local;
	Veiculo veiculo;
	
	public Autuacao(Local local, Veiculo veiculo){
		m = new ArrayList<Multa>();
		
	}
	public void addMulta(Multa multa) {
		m.add(multa);
	}
	
}
