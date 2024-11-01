package polimorfismoProfissional;

public class Fisioterapia extends ProfissionalSaude {

	private String crefito;

	public Fisioterapia(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
		this.crefito = crefito;
	}
	
	@Override
	public void agendarConsulta() {
		super.agendarConsulta();
		System.out.println("Crefito: "+crefito);
	}
	
	
	
	
}