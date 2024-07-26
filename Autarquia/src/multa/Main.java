package multa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multa multa;
<<<<<<< HEAD
		multa = new Multa(null, 1, null, null, 1);
=======
		multa = new Multa("Glayber", 2, 5, "Grave", "desc");
		
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
		Veiculo veiculo;
<<<<<<< HEAD
		veiculo = new Veiculo();
		Local local;
		local = new Local("Estado padrão", "Cidade padrão", "Rua padrão", "00000-000" );
		Autuacao atua;
		atua = new Autuacao(local, veiculo);
		atua.addMulta(multa);
		System.out.println(atua.printar(multa, local, veiculo));
		Multa multa1;
		multa1 = new Multa(null, 0, null, null, 0);
		Veiculo veiculo1;
		veiculo1 = new Veiculo();
		Local local1;
		local1 = new Local("Estado padrão1", "Cidade padrão1", "Rua padrão1", "11111-111" );
		Autuacao atua1;
		atua1 = new Autuacao(local1, veiculo1);
		atua1.addMulta(multa1);
		System.out.println(atua.printar(multa1, local1, veiculo1));
=======
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
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
	}

}
