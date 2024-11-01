package veiculo;

public class Moto extends Veiculo  {

	private int Cilindradas;


	public Moto(String marca, String modelo, int ano, String cor,int Cilindradas) {
		super(marca, modelo, ano, cor);
		this.Cilindradas = Cilindradas;
	}

	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Cilindrada: "+ Cilindradas);

	}
}