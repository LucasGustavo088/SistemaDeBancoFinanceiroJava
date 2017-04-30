public class ContaCorrente {
   //variaveis e atributos
   private int numero;
   private int digito;
   private Agencia agencia;
   private double saldo;
   //construtor
   public ContaCorrente(int numero, int digito, Agencia agencia, double saldo){
      if(numero >= 0 && numero < 10000) this.numero = numero;
         //desmembramento do numero da conta e algoritmo para verificação de digito
         int d1 = (numero % 10000) / 1000;
         int d2 = (numero % 1000) / 100;
         int d3 = (numero % 100) / 10;
         int d4 = (numero % 10) / 1;
         int modulo11 = ((d1 * 4) + (d2 * 6) + (d3 * 8) + (d4 * 2)) % 11;
         if(modulo11 == 10) modulo11 = 0; 
         if(digito == modulo11)this.digito = digito;
      
      this.agencia = agencia;
      this.saldo = saldo;
   }
   //metodos de acesso
   public int getNumero(){
      return this.numero;
   }
   
   public int getDigito(){
      return this.digito;
   }
   
   public Agencia getAgencia(){
      return this.agencia;
   }
   
   public double getSaldo(){
      return this.saldo;
   }
   //métodos modificadores
   public void setNumero(int n){
      numero = n;
   }
   
   public void setDigito(int d){
      digito = d;
   }
   
   public void setAgencia(Agencia a){
      agencia = a;
   }
   
   public void setSaldo(double s){
      saldo = s;
   }
   
   //métodos de operações
   public double depositar(double deposito){
      saldo += deposito;
      return deposito;
   }
   
   public double sacar(double saque){
      if(saque > saldo) return 0.0;  
      else {
         saldo -= saque;
         return saque;
      }
   }
   
   public double consultarSaldo(){
      return saldo;
   }
   
   public String imprimirSaldo(){
      String impressao =  "Numero da conta corrente: " + numero + " - " + digito + "\n";
             impressao +=  "Numero da agencia: " + agencia.getNumero();
             impressao +=  " - " + agencia.getDigito() + "\n";
             impressao +=  "saldo: " + saldo + "\n";
             
      return impressao;
   }
   
}