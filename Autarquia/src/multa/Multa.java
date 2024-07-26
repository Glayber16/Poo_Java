package multa;

import java.util.Scanner;

public class Multa {

	private double valor;
	private int pontos;
	private String nome;
	private String gravidade;
	private String desc;
	Scanner scanner = new Scanner ( System.in );
	
<<<<<<< HEAD
	public Multa(String nome, int pontos, String gravidade, String desc, double valor) {
=======
	public Multa(String nome, double valor, int pontos, String gravidade, String desc) {
		
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
		setNome(nome);
		setPontos(pontos);
		setGravidade(gravidade);
		setDesc(desc);
		setValor(valor);
		
		
	}
	
	public void setValor(double novoValor) {
<<<<<<< HEAD

=======
		//System.out.println("Digite o valor: ");
		//novoValor = scanner.nextDouble();
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
		this.valor = novoValor;
	}
	
	public double getValor() {
<<<<<<< HEAD

=======
		
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
		return this.valor;
	}
	
	public void setPontos(int novoPontos) {
<<<<<<< HEAD
		
=======
		//System.out.println("Digite quantos pontos: ");
		//novoPontos = scanner.nextInt();
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
		this.pontos = novoPontos;
	}
	
	public int getPontos() {
		return this.pontos;
	}
	
	public void setNome(String novoNome) {
<<<<<<< HEAD
		
=======
		//System.out.println("Digite o nome: ");
		//novoNome = scanner.nextLine();
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
		this.nome = novoNome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setGravidade(String novaGravidade) {
<<<<<<< HEAD
		
=======
		//System.out.println("Digite a gravidade: ");
		//novaGravidade = scanner.nextLine();
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
		this.gravidade = novaGravidade;
	}
	
	public String getGravidade() {
		return this.gravidade;
	}
	
	public void setDesc(String novaDesc) {
<<<<<<< HEAD
		
=======
		//System.out.println("Digite a descricao: ");
		//novaDesc = scanner.nextLine();
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
		this.desc = novaDesc;
	}
	
	public String getDesc() {
		return this.desc;
	}
}

