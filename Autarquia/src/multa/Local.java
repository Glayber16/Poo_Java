package multa;

public class Local {
	private String estado;
	private String cidade;
	private String rua;
	private String cep;
	
	public Local(String estado, String cidade, String rua, String cep) {
		
		setEstado(estado);
		setCidade(cidade);
		setRua(rua);
		setCep(cep);
		
	}
	
	public void setEstado(String novoEstado) {
		this.estado = novoEstado;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public void setCidade(String novaCidade) {
		this.cidade = novaCidade;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public void setRua(String novaRua) {
		this.rua = novaRua;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public void setCep(String novoCep) {
		this.cep = novoCep;
	}
	
	public String getCep() {
		return this.cep;
	}
}
