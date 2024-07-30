package pessoas;

import java.util.Scanner;

public abstract class Pessoa {
	private String nome;
	private String CPF;
	private int CNH;
	private String tipoCNH;
	Scanner scanner = new Scanner ( System.in );
	
	public Pessoa(String nome, String CPF, int CNH, String tipoCNH) {
		setNome(nome);
		setCPF(CPF);
		setCNH(CNH);
		setTipoCNH(tipoCNH);
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
	
	public void setCNH (int novaCNH) {
		
		this.CNH = novaCNH;
	}
	
	public int getCNH () {
		return this.CNH;
	}
	
	public void setTipoCNH (String novoTipoCNH) {
	
		this.tipoCNH = novoTipoCNH;
	}
	
	public String getTipoCNH () {
		return this.tipoCNH;
	}
}
