public class TestaCalculadora {
	public static void main(String[] args) {
		Calculadora cassio = new Calculadora();
		cassio.somar(100.0);
		cassio.subtrair(50.0);
		cassio.multiplicar(5.0);
		cassio.dividir(10.0);
		cassio.exibeMemoria();
	}
}