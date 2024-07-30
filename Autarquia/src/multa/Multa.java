package multa;

import java.util.Date;

public class Multa {

	private double valor;
	private int pontos;
	private String nome;
	private String gravidade;
	private String desc;

	
	public Multa(String nome, double valor, int pontos, String gravidade, String desc) {
		
		setNome(nome);
		setValor(valor);
		setPontos(pontos);
		setGravidade(gravidade);
		setDesc(desc);
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
	
	public Date getDate() {
		Date data = new Date();
		return data;
	}
}

