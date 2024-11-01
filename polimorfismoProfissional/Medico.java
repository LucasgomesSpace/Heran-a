package polimorfismoProfissional;

public class Medico extends ProfissionalSaude {
	
	private String crm;

	public Medico(String nome, String especialidade, int valorConsulta) {
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}
	
	@Override
	public void agendarConsulta() {
		super.agendarConsulta();
		System.out.println("Crefito: "+crm);
	}
	
	
	
}