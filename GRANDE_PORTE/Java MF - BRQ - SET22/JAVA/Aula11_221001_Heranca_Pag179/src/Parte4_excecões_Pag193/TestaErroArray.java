package Parte4_excec�es_Pag193;

public class TestaErroArray {

	public static void main(String[] args) {

		int[] num = { 0, 1, 2, 3, 4 };

		try {
			// for iterando at� exceder os limites do array
			for (int i = 0; i < 10; i++) {
				System.out.println(num[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Contate a Elys...." + e);
		}
	}

}
