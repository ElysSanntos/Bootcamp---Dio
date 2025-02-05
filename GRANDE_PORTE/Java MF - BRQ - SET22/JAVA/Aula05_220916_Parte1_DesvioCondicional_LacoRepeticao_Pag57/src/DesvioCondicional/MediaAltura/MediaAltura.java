package DesvioCondicional.MediaAltura;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class MediaAltura {

	public static void main(String[] args) {
		System.out.println("Media das Alturas");
		System.out.println("Media = " + viaDigitacao(5));
		System.out.println("Media = " + viaRandomico(10000));
	}
	
	public static double viaDigitacao(int qtd) {
		Scanner ze = new Scanner(System.in);
		int qtdePessoas;
		double somaAltura = 0.0;
		
		for(qtdePessoas = 0;qtdePessoas<qtd;qtdePessoas++) {
			System.out.print("Entre altura..("+(qtdePessoas+1)+" de "+qtd+").: ");
			double altura = Double.parseDouble(ze.nextLine());
			somaAltura += altura;
		}
		
		ze.close();
		return somaAltura / qtdePessoas;
	}

	public static double viaRandomico(int qtd) {
		Random maria = new Random(new Date().getTime());
		int qtdePessoas;
		double somaAltura = 0.0;
		
		for(qtdePessoas = 0;qtdePessoas<qtd;qtdePessoas++) {
			double altura = maria.nextGaussian(1.65, 0.4);
			somaAltura += altura;
		}

		return somaAltura / qtdePessoas;
	}
	
	
}