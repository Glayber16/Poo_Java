package multa;

import java.util.Scanner;

public class Multa {

	private double valor;
	private int pontos;
	private String nome;
	private String gravidade;
	private String desc;
	Scanner scanner = new Scanner ( System.in );
	
	public Multa(String nome, double valor, int pontos, String gravidade, String desc) {
		
		setNome(nome);
		setValor(valor);
		setPontos(pontos);
		setGravidade(gravidade);
		setDesc(desc);
	}
	
	public void setValor(double novoValor) {
		//System.out.println("Digite o valor: ");
		//novoValor = scanner.nextDouble();
		this.valor = novoValor;
	}
	
	public double getValor() {
		
		return this.valor;
	}
	
	public void setPontos(int novoPontos) {
		//System.out.println("Digite quantos pontos: ");
		//novoPontos = scanner.nextInt();
		this.pontos = novoPontos;
	}
	
	public int getPontos() {
		return this.pontos;
	}
	
	public void setNome(String novoNome) {
		//System.out.println("Digite o nome: ");
		//novoNome = scanner.nextLine();
		this.nome = novoNome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setGravidade(String novaGravidade) {
		//System.out.println("Digite a gravidade: ");
		//novaGravidade = scanner.nextLine();
		this.gravidade = novaGravidade;
	}
	
	public String getGravidade() {
		return this.gravidade;
	}
	
	public void setDesc(String novaDesc) {
		//System.out.println("Digite a descricao: ");
		//novaDesc = scanner.nextLine();
		this.desc = novaDesc;
	}
	
	public String getDesc() {
		return this.desc;
	}
}

