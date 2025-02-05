public class ArrayPrimo {
	public static void main(String[] args) {
		boolean primo [] = new boolean[100];
		
		inicializa(primo);
		verificaPrimo(primo);
		imprimePrimo(primo);
		
	}
	
	// inicializar o array com true
	public static void inicializa(boolean [] a) {
		for(int i=0; i<a.length; i++) {
			a[i]=true;
		}
	}
	
	// seta como false se a posição do array não for primo
	public static void verificaPrimo(boolean [] a) {
		for(int i=0; i<a.length; i++) {
			if(!ehPrimo(i)) {
				a[i]=false;
			}
		}
	}

	private static boolean ehPrimo(int n) {
		if(n<2) return false;
		int d=2;
		while (n%d!=0) d++;
		return n==d;
	}
	
	private static void imprimePrimo(boolean [] a) {
		for(int i=0; i<a.length; i++) {
			if(a[i]) {
				System.out.println(i);
			}
		}
	}
}