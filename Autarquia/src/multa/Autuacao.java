package multa;

import java.util.ArrayList;
import java.util.List;

public abstract class Autuacao {
	protected List<Multa> m;
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
	
<<<<<<< HEAD
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
=======
	public void printar() {
		for(Multa multa : m) {
			System.out.print(multa.getNome() + " " + multa.getGravidade()  + "\n");
		}
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
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
    
   
	
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
	
}
