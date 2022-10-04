import java.util.ArrayList;

public class TestaArrayList {

	public static void main(String[] args) {
		// java.lang.OutOfMemoryError: Java heap space
		// double seculo[][][][][] = new double[100][365][24][60][60];
		
		ArrayList cornucopia = new ArrayList(100);
		
		cornucopia.add(5);
		cornucopia.add(3.1);
		cornucopia.add(0,"ana");
		cornucopia.add(1,"nelson");
		System.out.println(cornucopia);
		cornucopia.set(0,"Mariana");
		cornucopia.set(1,false);
		cornucopia.add("Mariana");
		cornucopia.add(5);
		System.out.println(cornucopia);
		System.out.println("tamanho..: "+cornucopia.size());
		System.out.println(cornucopia.get(2));
		System.out.println("primeira ocorrencia "+cornucopia.indexOf("Mariana"));
		System.out.println("ultima ocorrencia "+cornucopia.lastIndexOf("Mariana"));
		System.out.println("Existe 5? "+cornucopia.contains(5));
		System.out.println("Existe ana? "+cornucopia.contains("ana"));
		cornucopia.remove(0);
		System.out.println(cornucopia);
		cornucopia.clear();
		System.out.println(cornucopia);
	}
}