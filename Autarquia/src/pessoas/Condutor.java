package pessoas;

public class Condutor extends Pessoa {

	int CNH;
	String tipoCNH;
	public Condutor(String nome, String CPF, int CNH, String tipoCNH) {
		super(nome, CPF);
		this.CNH = CNH;
		this.tipoCNH = tipoCNH;
	}
	public void setCNH (int novaCNH) {
		
		this.CNH = novaCNH;
	}
	
	public int getCNH () {
		return this.CNH;
	}
	
	public void setTipoCNH (String novoTipoCNH) {
	
		this.tipoCNH = novoTipoCNH;
	}
	
	public String getTipoCNH () {
		return this.tipoCNH;
	}
}
