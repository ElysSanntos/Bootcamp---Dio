public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario("Geronimo Veiga",
 				                        "14.444.222-3",
 				                        8000.0);
		Chefe c = new Chefe("Helena de Troia", 
				            "12.111.655-6",
				            16000.0, 
				            2000.0,
				            3000.0,
				            5000.0);
		System.out.println("Funcionario pagamento "+f.pagamento());
		System.out.println("Chefe pagamento "+c.pagamento());
		System.out.println("Chefe pagamento com Extra "+c.pagamentoExtra());
	}
}