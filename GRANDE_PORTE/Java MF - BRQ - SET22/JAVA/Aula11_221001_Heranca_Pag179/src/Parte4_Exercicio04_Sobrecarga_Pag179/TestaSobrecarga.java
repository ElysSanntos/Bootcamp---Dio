package Parte4_Exercicio04_Sobrecarga_Pag179;

public class TestaSobrecarga {

	public static void main(String[] args) {

		Funcionario F01 = new Funcionario(323, "Pedro da Costa", 35.00);
		Estagiario E01 = new Estagiario(548, "Miranda Lima", 22.00);
		
		System.out.println("Salario Funcionário = " + F01.calculaSalario(160));
		System.out.println("Salario Estagiário = " + E01.calculaSalario(120));
	}

}
