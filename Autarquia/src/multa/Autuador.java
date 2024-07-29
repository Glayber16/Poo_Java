package multa;

import java.util.ArrayList;
import java.util.List;

public class Autuador {
	protected List<Autuacao> a;
	
	
	
	
	public Autuador(Veiculo v, Pessoa p, Local l) {
		a = new ArrayList<Autuacao>();
		
	}
	
	public void autuar(Local l, Veiculo v, List<Multa> m , Pessoa p){
		Autuacao au = new Autuacao(l,v, p) 
		for(int i = 0; i < m.size(); i++) {
			au.addMulta(m.get(i));
		}
		
		
		
	}
	
	public void addAutuacao(Autuacao autuacao) {
		a.add(autuacao);
	}
	
	public List<Autuacao> getAtuacaov(Veiculo v) {
		List<Autuacao> resultado = new ArrayList<>();
		for(Autuacao autuacao : a) {
			if(autuacao.getVeiculo().getPlaca().equals(v.getPlaca())) {
				resultado.add(autuacao);
			}
			
		}
		return resultado;
		
	}
	
	public List<Autuacao> getAtuacaop(Pessoa p) {
		//checar se é agente ou condutor, caso agente retorna as autuacôes feitas, caso condutor retorna as multas tomadas //
		List<Autuacao> resultado = new ArrayList<>();
		for(Autuacao autuacao : a) {
			if(autuacao.getPessoa().getCPF().equals(p.getCPF())) {
				resultado.add(autuacao);
			}
			
		}
		return resultado;
		
	}
	
	public List<Autuacao> getAtuacaol(Local l) {
		List<Autuacao> resultado = new ArrayList<>();
		for(Autuacao autuacao : a) {
			if(autuacao.getLocal().getRua().equals(l.getRua())) {
				resultado.add(autuacao);
			}
			
		}
		return resultado;
		
	}
	

	
	
	public void printar(List<Autuacao> resultado) {
		for(Autuacao autuacao1: resultado) {
			System.out.println(autuacao1.getMulta());
		}
	}
	
	
	
	

}
