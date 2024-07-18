package multa;

import java.util.Scanner;

public class Multa {

	private double valor;
	private int pontos;
	private String nome;
	private String gravidade;
	private String desc;
	Scanner scanner = new Scanner ( System.in );
	
	public Multa() {
		
		setNome(nome);
		setValor(valor);
		setPontos(pontos);
		setGravidade(gravidade);
		setDesc(desc);
	}
	
	public void setValor(double novoValor) {
		novoValor = scanner.nextDouble();
		this.valor = novoValor;
	}
	
	public double getValor() {
		System.out.println("Digite o valor: ");
		return this.valor;
	}
	
	public void setPontos(int novoPontos) {
		System.out.println("Digite quantos pontos: ");
		this.pontos = novoPontos;
	}
	
	public int getPontos() {
		return this.pontos;
	}
	
	public void setNome(String novoNome) {
		System.out.println("Digite o nome: ");
		this.nome = novoNome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setGravidade(String novaGravidade) {
		System.out.println("Digite a gravidade: ");
		this.gravidade = novaGravidade;
	}
	
	public String getGravidade() {
		return this.gravidade;
	}
	
	public void setDesc(String novaDesc) {
		System.out.println("Digite a descricao: ");
		this.desc = novaDesc;
	}
	
	public String getDesc() {
		return this.desc;
	}
}

