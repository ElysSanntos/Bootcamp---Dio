import java.util.Date;

public class Aniversarios {
	public static void main(String[] args) {
		try {
		// current date
		Date d1 = new Date();
		System.out.println("d1  "+d1);
		System.out.println("d1  "+d1.toString());
		
		// Thread.sleep(7000);
		// System.out.println(d1);
		
		// d2 => 01/10/1967 
		Date d2 = new Date(-71020800000L);
		System.out.println("d2  "+d2);
		
		// d3 = 28/06/2000
		Date d3 = new Date(962236800000L);
		System.out.println("d3  "+d3);
		
		System.out.println("d1.after(d2) eh "+ d1.after(d2));
		System.out.println("d1.before(d3) eh "+ d1.before(d3));
		
		Date d4 = (Date) d3.clone();
		System.out.println("d3.equals(d4) eh "+ d3.equals(d4));
		System.out.println("d3 == d4 eh "+ (d3 == d4));
		
		System.out.println("d1.compareTo(d2) eh "+ d1.compareTo(d2));
		System.out.println("d3.compareTo(d4) eh "+ d3.compareTo(d4));
		System.out.println("d2.compareTo(d3) eh "+ d2.compareTo(d3));
		
		System.out.println(d1.getTime());
		d4.setTime(2000000000000L);
		System.out.println("d4  "+d4);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}