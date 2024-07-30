package multa;



public class Veiculo {
	private String placa;
	private String modelo;
	private String chassi;
	private String marca;
	private int ano;

	
	public Veiculo(String placa, String modelo, String chassi, String marca, int ano) {
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
		
		this.ano = novoAno;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	
	
}



