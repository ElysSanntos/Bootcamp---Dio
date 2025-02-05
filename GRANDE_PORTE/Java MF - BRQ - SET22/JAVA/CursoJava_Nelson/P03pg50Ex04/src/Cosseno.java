public class Cosseno {
	// atributos
	private double x;
	private double [] parcelas = new double[10];
	private double cosseno;
	
	// construtores
	public Cosseno() {}
	public Cosseno(double x) {
		this.x = x;
	    calculaParcelas();
		somaParcelas();		
	}
	
	// getters e setters
	public double getX() {
		return x;
	}
	public double[] getParcelas() {
		return parcelas;
	}
	public double getCosseno() {
		return cosseno;
	}
	public void setX(double x) {
		this.x = x;
	}

	public void calculaParcelas() {
		int p = 0;
		double sinal = 1;
		for(int i=0; i<10; i++) {
			parcelas[i]= sinal * Math.pow(x, p)/ fatorial(p);
			p = p + 2;
			sinal = sinal * (-1);
		}
	}
	
	private long fatorial(int n) {
		if(n<=1) return 1;
		return n*fatorial(n-1);
	}
	
	public void somaParcelas() {
		double soma = 0.0;
		for(double balde:parcelas) {
			soma += balde;
		}
		cosseno = soma;
	}
	
}
