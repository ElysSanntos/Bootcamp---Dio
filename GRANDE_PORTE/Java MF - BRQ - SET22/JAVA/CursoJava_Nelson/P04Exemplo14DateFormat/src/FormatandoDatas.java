import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatandoDatas {
	public static void main(String[] args) {
		SimpleDateFormat ft1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat ft2 = new SimpleDateFormat("E dd/MM/yyyy G");
		SimpleDateFormat ft3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		String nascimento = "01/10/1967";
		boolean flag = false;
		Date n = null;
		try {
			n = ft1.parse(nascimento);
			
			flag = true;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally " + flag);
			if (flag) {
				System.out.println(ft2.format(n));
				System.out.println(ft3.format(n));
			}
		}
	}
}