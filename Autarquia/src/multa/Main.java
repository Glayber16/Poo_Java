package multa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multa multa;
		multa = new Multa();
		System.out.println(multa.getNome()); 
		System.out.println(multa.getDesc()); 
		System.out.println(multa.getPontos()); 
		System.out.println(multa.getGravidade()); 
		System.out.println(multa.getValor()); 
		Veiculo veiculo;
		veiculo = new Veiculo();
		System.out.println(veiculo.getAno());
	}

}
