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
		this.l = l;
	    this.p = p;
	    this.v = v;
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
