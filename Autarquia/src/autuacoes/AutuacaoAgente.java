package autuacoes;


import local.Local;
import veiculo.Veiculo;
import pessoas.*;

public class AutuacaoAgente extends Autuacao {
	

	public AutuacaoAgente(Local local, Veiculo veiculo, Pessoa pessoa) {
		super(local, veiculo, pessoa);
		setTipo("Agente");
	}

	

}
