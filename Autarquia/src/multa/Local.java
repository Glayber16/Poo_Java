package multa;

import java.util.Scanner;


public class Local {
	private String estado;
	private String cidade;
	private String rua;
	private String cep;
	Scanner scanner = new Scanner ( System.in );
	
	public Local(String estado, String cidade, String rua, String cep) {
		setEstado(estado);
		setCidade(cidade);
		setRua(rua);
		setCep(cep);
		
	}
	
	public void setEstado(String novoEstado) {
		//System.out.println("Digite o estado: ");
		//novoEstado = scanner.nextLine();
		this.estado = novoEstado;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setCidade(String novaCidade) {
		//System.out.println("Digite a Cidade: ");
		//novaCidade = scanner.nextLine();
		this.cidade = novaCidade;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setRua(String novaRua) {
		//System.out.println("Digite a rua: ");
		//novaRua = scanner.nextLine();
		this.rua = novaRua;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public void setCep(String novoCep) {
		//System.out.println("Digite o CEP: ");
		//novoCep = scanner.nextLine();
		this.cep = novoCep;
	}
	
	public String getCep() {
		return this.cep;
	}
}
