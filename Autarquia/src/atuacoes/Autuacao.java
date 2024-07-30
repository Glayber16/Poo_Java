package atuacoes;

import java.util.ArrayList;
import java.util.List;

import local.Local;
import pessoas.Pessoa;
import veiculo.Veiculo;
import multa.*;
import multa.*;
public class Autuacao {
	List<Multa> m;
	Local local;
	Veiculo veiculo;
	Pessoa pessoa;
	
	public Autuacao(Local local, Veiculo veiculo, Pessoa pessoa){
		m = new ArrayList<Multa>();
		this.veiculo = veiculo;
		this.pessoa = pessoa;
		this.local = local;	
		
	}
	public void addMulta(Multa multa) {
		m.add(multa);
	}
	
	public void printar() {
		for(Multa multa : m) {
			System.out.print(multa.getNome() + " " + multa.getGravidade()  + "\n");
		}
	}
	
	public List<Multa> getMulta(){
		return m;
	}
	
    public Local getLocal() {
        return local;
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }
    
    public Pessoa getPessoa() {
    	return pessoa;
    }
    
   
	
	
}
