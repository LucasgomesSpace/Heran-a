package veiculo;

class Automovel extends Veiculo {

	private int numeroPortas ;
	private String motor ;
	
	public Automovel(String marca, String modelo, int ano, String cor,int numeroPortas,String motor) {
		super(marca, modelo, ano, cor);
		this.numeroPortas = numeroPortas;
		this.motor = motor;
	}
	
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Numero De Portas: "+ numeroPortas);
		System.out.println("Motor: "+ motor);
	}
	
}
