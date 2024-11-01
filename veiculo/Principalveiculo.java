package veiculo;

public class Principalveiculo {

	public static void main(String[] args) {

		Automovel veiculo = new Automovel("Ferrari","Forte",2014,"Vermelha",4,"V8");
		Moto moto =new Moto("CG","Muito Forte",4025,"Preta",1000);

		veiculo.exibirInfo();
		moto.exibirInfo();
	}
}