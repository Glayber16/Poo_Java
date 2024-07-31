package multa;

import veiculo.*;
import pessoas.*;

import java.util.ArrayList;
import java.util.List;

import autuacoes.*;
import local.*;
import autuacoes.AutuacaoAgente;
import local.Local;
import veiculo.Veiculo;
import pessoas.Condutor;
import pessoas.Pessoa;

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
		
		 List<Multa> MultasA = new ArrayList<>();
	     MultasA.add(multa);
	     List<Multa> MultasC = new ArrayList<>();
	     MultasC.add(multa2);
		
		Pessoa pessoa;
		pessoa = new Condutor("Glayber", "12345-678", 12345, "AB");
		Pessoa pessoa1;
		pessoa1 = new Agente("Lucas", "12345-67", "AB");
		
		Autuador autuador;
		autuador = new Autuador();
		autuador.autuar(local, veiculo1, MultasA, pessoa1);
		autuador.autuar(local, veiculo, MultasC, pessoa);
		System.out.println(autuador.getAtuacaop(pessoa));
		autuador.printar(autuador.getAtuacaop(pessoa));
	}
}
