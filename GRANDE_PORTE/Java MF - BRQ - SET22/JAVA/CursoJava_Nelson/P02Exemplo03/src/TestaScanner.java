import java.util.Scanner;

public class TestaScanner {
	public static void main(String[] args) {
		Scanner ze = new Scanner(System.in);
		System.out.print("Entre um numero..: ");
	    int n = ze.nextInt();
		System.out.println("numero digitado = " + n);
		ze.nextLine();
		System.out.print("Entre um nome..: ");
		String nome = ze.nextLine();
		System.out.println("nome digitado = " + nome);
		ze.close();
	}
}