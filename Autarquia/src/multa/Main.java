package multa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multa multa;
		multa = new Multa("Glayber", 2, 5, "Grave", "desc");
		
		Veiculo veiculo;
		veiculo = new Veiculo("12345", "Gol", "23423521", "Volks", 2014);
		
		Local local;
		local = new Local("Estado", "Cidade", "Rua", "0000-00");
		
		Pessoa pessoa;
		pessoa = new Pessoa("Nome", "12345-67", 12345, "AB");
		
		Autuacao autuacao;
		autuacao = new Autuacao(local, veiculo);
		autuacao.addMulta(multa);
		System.out.println(autuacao.printar(multa));
		Autuador autuador;
		autuador = new Autuador(veiculo, pessoa, local);
		autuador.addAutuacao(autuacao);
		System.out.println(autuador.getAutuacao(veiculo));
	}

}
