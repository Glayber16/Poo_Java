package multa;

import java.util.Scanner;

public class Veiculo {
	private String placa;
	private String modelo;
	private String chassi;
	private String marca;
	private int ano;
	Scanner scanner = new Scanner ( System.in );
	
	public Veiculo() {
		setPlaca(placa);
		setModelo(modelo);
		setChassi(chassi);
		setMarca(marca);
		setAno(ano);
	}
	
	public void setPlaca(String novaPlaca) {
		this.placa = novaPlaca;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setModelo(String novoModelo) {
		this.modelo = novoModelo;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setChassi(String novoChassi) {
		this.chassi = novoChassi;
	}
	
	public String getChassi() {
		return this.chassi;
	}
	
	public void setMarca(String novaMarca) {
		this.marca = novaMarca;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setAno(int novoAno) {
		novoAno = scanner.nextInt();
		this.ano = novoAno;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	
	
}



