public class LacoDeRepeticao {
	public static void main(String[] args) {
		{
			// laço while
			int i = 0;
			while (i < 10) {
				System.out.print(i + ", ");
				i++;
			}

			System.out.println("\nestou fora do laco while");
		}

		{
			// laço do/while
			int i = 100;
			do {
				System.out.print(i + ", ");
				i++;
			} while (i < 10);

			System.out.println("\nestou fora do laco do/while");
		}
		
		{
			// laço for
			for (int i = 0; i < 10; i++) {
				System.out.print(i + ", ");
			}
			System.out.println("\nestou fora do laco for");
		}

		{
		// laço com break
			int i = 0;
			while (i < 10) {
				System.out.print(i + ", ");
				if(i == 6) break;
				i++;
			}
			System.out.println("\nsai por causa do break");
		}
		
		{
			// laço for com continue
			for (int i = 0; i < 10; i++) {
				if(i==5) continue;
				System.out.print(i + ", ");
			}
			System.out.println("\nepa... faltou um numero");
			
		}
	}
}