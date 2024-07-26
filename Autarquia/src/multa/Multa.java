package multa;

import java.util.Scanner;

public class Multa {

	private double valor;
	private int pontos;
	private String nome;
	private String gravidade;
	private String desc;
	Scanner scanner = new Scanner ( System.in );
	
	public Multa(String nome, int pontos, String gravidade, String desc, double valor) {
		setNome(nome);
		setPontos(pontos);
		setGravidade(gravidade);
		setDesc(desc);
		setValor(valor);
		
		
	}
	
	public void setValor(double novoValor) {

		this.valor = novoValor;
	}
	
	public double getValor() {

		return this.valor;
	}
	
	public void setPontos(int novoPontos) {
		
		this.pontos = novoPontos;
	}
	
	public int getPontos() {
		return this.pontos;
	}
	
	public void setNome(String novoNome) {
		
		this.nome = novoNome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setGravidade(String novaGravidade) {
		
		this.gravidade = novaGravidade;
	}
	
	public String getGravidade() {
		return this.gravidade;
	}
	
	public void setDesc(String novaDesc) {
		
		this.desc = novaDesc;
	}
	
	public String getDesc() {
		return this.desc;
	}
}

