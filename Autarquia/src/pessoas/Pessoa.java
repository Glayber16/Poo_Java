package pessoas;

import java.util.Scanner;

public abstract class Pessoa {
	private String nome;
	private String CPF;
	private int CNH;
	private String tipoCNH;
	Scanner scanner = new Scanner ( System.in );
	
	public Pessoa(String nome, String CPF) {
		setNome(nome);
		setCPF(CPF);
		
	}
	
	
	public void setNome(String novoNome) {
		
		this.nome = novoNome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCPF(String novoCPF) {
	
		this.CPF = novoCPF;
	}
	
	public String getCPF() {
		return this.CPF;
	}
	
	
}
