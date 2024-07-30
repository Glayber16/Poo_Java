package multa;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multa multa;
<<<<<<< HEAD
		multa = new Multa(null, 1, null, null, 1);
=======
		multa = new Multa("Glayber", 2, 5, "Grave", "desc");
		Multa multa2;
		multa2 = new Multa("Lucas", 1, 7, "Leve", "desc");
		
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
<<<<<<< HEAD
		System.out.println(autuador.getAutuacao(veiculo));
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
=======
		autuador.addAutuacao(autuacao1);
		autuador.printar(autuador.getAtuacaol(local));
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
	}
}
