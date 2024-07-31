package autuacoes;

import java.util.ArrayList;
import java.util.List;

import local.Local;
import multa.Multa;
import pessoas.Agente;
import pessoas.Condutor;
import pessoas.Pessoa;
import veiculo.Veiculo;



public abstract class Autuacao {
	private List<Multa> m;
	private Local local;
	private Veiculo veiculo;
	private Pessoa condutor;
	private String tipo;
	
	public Autuacao(Local local, Veiculo veiculo, Pessoa pessoa){
		m = new ArrayList<Multa>();
		this.veiculo = veiculo;
		this.condutor = pessoa;
		this.local = local;	
		setTipo(tipo);
		
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
    	return condutor;
    }
    
   public void setTipo(String novoTipo) {
	   this.tipo = novoTipo;
   }
	
   public String getTipo() {
	   return this.tipo;
   }
	
}