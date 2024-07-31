package autuacoes;

import local.Local;
import pessoas.Pessoa;
import veiculo.Veiculo;

public class AutuacaoMaquina extends Autuacao {

	public AutuacaoMaquina(Local local, Veiculo veiculo, Pessoa pessoa) {
		super(local, veiculo, pessoa);
		setTipo("Maquina");
	}
	
}
