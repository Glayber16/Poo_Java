package multa;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multa multa;
		multa = new Multa("Glayber", 2, 5, "Grave", "desc");
		Multa multa2;
		multa2 = new Multa("Lucas", 1, 7, "Leve", "desc");
		
		Veiculo veiculo;
		veiculo = new Veiculo("12345", "Gol", "23423521", "Volks", 2014);
		Veiculo veiculo1;
		veiculo1 = new Veiculo("56789", "Uno", "23423521", "Fiat", 2017);
		
		Local local;
		local = new Local("Estado", "Cidade", "Rua", "0000-00");
		
		Condutor pessoa;
		pessoa = new Condutor("Glayber", "12345-678", 12345, "AB");
		Condutor pessoa1;
		pessoa1 = new Condutor("Lucas", "12345-67", 12345, "AB");
		
		AutuacaoAgente autuacao;
		autuacao = new AutuacaoAgente(local, veiculo, pessoa);
		autuacao.addMulta(multa);
		autuacao.addMulta(multa2);
		AutuacaoMaquina autuacao1;
		autuacao1 = new AutuacaoMaquina(local, veiculo1, pessoa1);
		autuacao1.addMulta(multa2);
		
		Autuador autuador;
		autuador = new Autuador(veiculo, pessoa, local);
		autuador.addAutuacao(autuacao);
		autuador.addAutuacao(autuacao1);
		autuador.printar(autuador.getAtuacaol(local));
	}
}
