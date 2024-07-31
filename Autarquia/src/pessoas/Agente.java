package pessoas;

public class Agente extends Pessoa {

	String referencial;
	public Agente(String nome, String CPF, String referencial) {
		super(nome, CPF);
		this.referencial = referencial;
	}
	
}
