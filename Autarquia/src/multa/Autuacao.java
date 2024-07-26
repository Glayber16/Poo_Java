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
	
<<<<<<< HEAD
	public String printar(Multa multa, Local local, Veiculo veiculo) {
		return	multa.getGravidade() + "\n" +
				multa.getDesc() + "\n" +
				multa.getNome() + "\n" +
				multa.getPontos() + "\n" +
				multa.getValor() + "\n" +
				local.getCep();
				
	}
=======
	public String printar(Multa multa) {
		return multa.getDesc() + multa.getGravidade() +
				multa.getNome() + multa.getPontos() +
				multa.getValor();
	}
	
	
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
	
}
