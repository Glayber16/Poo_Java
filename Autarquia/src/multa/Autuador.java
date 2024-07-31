package multa;

import java.util.ArrayList;
import java.util.List;

import autuacoes.Autuacao;
import autuacoes.AutuacaoAgente;
import autuacoes.AutuacaoMaquina;
import local.Local;

import pessoas.Agente;
import pessoas.Condutor;
import pessoas.Pessoa;
import veiculo.Veiculo;



public class Autuador {
	private List<Autuacao> a;
	
	
	
	
	public Autuador() {
		a = new ArrayList<Autuacao>();
		
	}
	
	public void autuar(Local l, Veiculo v, List<Multa> m , Pessoa p){
		Autuacao au = null;
		if(p instanceof Agente) {
			au = new AutuacaoAgente(l,v,p);
		}
		if(p instanceof Condutor) {
			au = new AutuacaoMaquina(l,v,p);
		}
		for(int i = 0; i < m.size(); i++) {
			au.addMulta(m.get(i));
		}
		
		a.add(au);
		
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
				if(p instanceof Agente) {
					if(autuacao.getPessoa().getCPF().equals(p.getCPF())) {
						resultado.add(autuacao);
					}
				}	
				if(p instanceof Condutor) {
					if(autuacao.getPessoa().getCPF().equals(p.getCPF())) {
						resultado.add(autuacao);
					}
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
