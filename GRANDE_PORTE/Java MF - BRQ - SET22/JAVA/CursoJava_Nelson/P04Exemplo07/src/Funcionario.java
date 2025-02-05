// superclasse 
public class Funcionario {
   protected int idFunc;
   protected String nomeFunc;
   protected double salarioHora;

   // construtor
   public Funcionario(int    idFunc, 
                      String nomeFunc, 
                      double salarioHora) {
        this.idFunc = idFunc;
        this.nomeFunc = nomeFunc;
        this.salarioHora = salarioHora;
   }

   // cálculo do salário líquido para funcionários
   public double calculaSalario(double horasTrabalhadas){
        double salBruto = salarioHora * horasTrabalhadas;
        double salLiquido;

        if (salBruto <= 1000.00)
            salLiquido = salBruto;
        else
            if(salBruto <= 2000.00)
               salLiquido = salBruto * 0.9;
            else
               salLiquido = salBruto * 0.85;
        return salLiquido;
    }
   
   // cálculo da bonificação para os funcionarios
   public double bonificacao(){
        return salarioHora * 50;
    }

}