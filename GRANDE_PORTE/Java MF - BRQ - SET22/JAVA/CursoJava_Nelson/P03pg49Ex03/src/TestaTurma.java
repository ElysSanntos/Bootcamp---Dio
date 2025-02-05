import java.util.Scanner;

public class TestaTurma {
	private static int sequencia;
	private static Scanner lerTeclado = new Scanner(System.in);
	
	public static void main(String args[]) {
		Turma t1 = getTurma();
		Turma t2 = getTurma();
		
		imprimeAcimaMedia(t1);
		imprimeAcimaMedia(t2);
		
		lerTeclado.close();
	}
	
	public static Turma getTurma() {
		System.out.print("Entre qtde Alunos....: ");
		int qtde = Integer.parseInt(lerTeclado.nextLine());
		
		double n [] = new double[qtde];
		
		for(int i=0;i<n.length;i++) {
			System.out.print("nota...: ");
			n[i] = Double.parseDouble(lerTeclado.nextLine());
		}
		return new Turma(++sequencia,qtde,n);
	}
	
	public static void imprimeAcimaMedia(Turma t) {
		double media = t.mediaTurma();
		System.out.println("media="+media);
		double n[] = t.getNotas();
		System.out.print("==> ");
		for(double balde:n) {
			if(balde >= media) {
				System.out.print(balde + " - ");
			}
		}
		System.out.print(" <==\n");
	}
}