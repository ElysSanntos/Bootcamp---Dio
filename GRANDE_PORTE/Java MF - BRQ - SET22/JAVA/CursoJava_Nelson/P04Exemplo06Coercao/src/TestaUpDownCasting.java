public class TestaUpDownCasting {
	public static void main(String[] args) {
		
		Pessoa [] minhaLista = new Pessoa[3];
		
		minhaLista[0] = new Pessoa("jose");
		minhaLista[1] = new Funcionario("Maria",8000.0);
		minhaLista[2] = new Gerente("Ana",12500.0,20);
		
		for(Pessoa balde: minhaLista) {
			if(balde instanceof Gerente ) {
				Gerente g = (Gerente) balde; 
				System.out.println("Gerente");
				System.out.println(g.getNome());
				System.out.println(g.getSalario());
				System.out.println(g.getQtdFunc());
			}
			else {
				if(balde instanceof Funcionario) {
					Funcionario f = (Funcionario) balde; 
					System.out.println("Funcionario");
					System.out.println(f.getNome());
					System.out.println(f.getSalario());
				}
				else {
					if(balde instanceof Pessoa) {
						System.out.println("Pessoa");
						System.out.println(balde.getNome());
					}
					else {
						System.out.println("Objeto Desconhecido!");
					}
				}
			}
		}
	}
}