import java.util.Random;
import java.util.Date;

public class Aleatorio {

	public static void main(String[] args) {
		//System.out.println(Math.random());
		
 		Date coelhoBranco = new Date();
		long semente = coelhoBranco.getTime();
		
		Random mariaLouca = new Random(semente);
		for(int i=0;i<10;i++)
			System.out.println(mariaLouca.nextFloat());
		
		
	}

}
