package multa;

import java.util.Scanner;

public class Pessoa {
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
		//System.out.println("Digite o nome: ");
		//novoNome = scanner.nextLine();
		this.nome = novoNome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCPF(String novoCPF) {
		//System.out.println("Digite o CPF: ");
		//novoCPF = scanner.nextLine();
		this.CPF = novoCPF;
	}
	
	public String getCPF() {
		return this.CPF;
	}
	
	public void setCNH (int novaCNH) {
		//System.out.println("Digite a CNH: ");
		//novaCNH = scanner.nextInt();
		this.CNH = novaCNH;
	}
	
	public int getCNH () {
		return this.CNH;
	}
	
	public void setTipoCNH (String novoTipoCNH) {
		//System.out.println("Digite o tipo da CNH: ");
		//novoTipoCNH = scanner.nextLine();
		this.tipoCNH = novoTipoCNH;
	}
	
	public String getTipoCNH () {
		return this.tipoCNH;
	}
}
