public class TestaFuncionario {
	public static void main(String[] args) {
		// criando dois funcionários
		Funcionario F01 = new Funcionario();
		Funcionario F02 = new Funcionario(1105, "Jose Carlos Silva", 6500.0);
		F01.setCodFunc(1200);
		F01.setNomeFunc("Maria Antonia Guimaraes");
		F01.setSalarioMensal(8600.00);

		// exibindo seus atributos
		System.out.println(F01.getCodFunc() + "\t\t" + F01.getNomeFunc() + "\t\t" + F01.getSalarioMensal());

		System.out.println(F02.getCodFunc() + "\t\t" + F02.getNomeFunc() + "\t\t" + F02.getSalarioMensal());

		// aumentando os salários em 15%
		F01.setAumento(15.0);
		F02.setAumento(15.0);

		// exibindo salario anual
		System.out.println(F01.getCodFunc() + "\t\t" + F01.getSalarioAnual());
		System.out.println(F02.getCodFunc() + "\t\t" + F02.getSalarioAnual());

	}
}