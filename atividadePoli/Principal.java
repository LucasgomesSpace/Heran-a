package atividadePoli;

public class Principal {

	public static void main(String[] args) {
		
	Horista horista = new Horista();
	System.out.println("Salario Horista");
	System.out.println(horista.calculaSalario(35, 10));
	
	Jornada jornada = new Jornada();
	System.out.println("Salario Jornada");
	System.out.println(jornada.calculaSalario(150, 20));
	
	PessoaJuridica Pj = new PessoaJuridica();
	System.out.println("Salario Consultor PJ");
	System.out.println(Pj.calculaSalario(10000.00, 1000));
	
	}

}
