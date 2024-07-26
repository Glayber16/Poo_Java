package multa;

import java.util.Scanner;

public class Veiculo {
	private String placa;
	private String modelo;
	private String chassi;
	private String marca;
	private int ano;
	Scanner scanner = new Scanner ( System.in );
	
	public Veiculo(String placa, String modelo, String chassi, String marca, int ano) {
		setPlaca(placa);
		setModelo(modelo);
		setChassi(chassi);
		setMarca(marca);
		setAno(ano);
	}
	
	public void setPlaca(String novaPlaca) {
		//System.out.println("Digite a placa do veiculo: ");
		//novaPlaca = scanner.nextLine();
		this.placa = novaPlaca;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setModelo(String novoModelo) {
		//System.out.println("Digite o modelo do veiculo: ");
		//novoModelo = scanner.nextLine();
		this.modelo = novoModelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setChassi(String novoChassi) {
		//System.out.println("Digite o chassi do veiculo: ");
		//novoChassi = scanner.nextLine();
		this.chassi = novoChassi;
	}
	
	public String getChassi() {
		return this.chassi;
	}
	
	public void setMarca(String novaMarca) {
		//System.out.println("Digite a marca do veiculo: ");
		//novaMarca = scanner.nextLine();
		this.marca = novaMarca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setAno(int novoAno) {
<<<<<<< HEAD
=======
		//System.out.println("Digite o ano do veiculo: ");
		//novoAno = scanner.nextInt();
>>>>>>> branch 'master' of https://github.com/Glayber16/Poo_Java.git
		this.ano = novoAno;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	
	
}



