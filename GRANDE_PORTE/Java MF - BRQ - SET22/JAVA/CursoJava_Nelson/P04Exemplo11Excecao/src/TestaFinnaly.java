public class TestaFinnaly {
	public static void main(String[] args) {
		try {
			int x = 10 / 0;
			System.out.println("Deu certo!");
		}
		catch(Exception e) {
			System.out.println("Vai estudar matematica...");
		}
		finally {
			System.out.println("Servimos bem para Servir Sempre...");
		}
		
		System.out.println("Fim do programa");
	}
}