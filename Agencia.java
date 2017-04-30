public class Agencia {
   //variaveis e atributos
   private String nome;
   private int numero;
   private int digito;
   
   //construtor
   public Agencia(String nome, int numero, int digito){
      this.nome = nome;
      if(numero >= 0 && numero < 10000) this.numero = numero;
         //desmembramento do numero da conta e algoritmo para verificação de digito
         int d1 = (numero % 10000) / 1000;
         int d2 = (numero % 1000) / 100;
         int d3 = (numero % 100) / 10;
         int d4 = (numero % 10) / 1;
         int modulo11 = ((d1 * 4) + (d2 * 6) + (d3 * 8) + (d4 * 2)) % 11;;
         if(modulo11 == 10) modulo11 = 0; 
         if(digito == modulo11)this.digito = digito;
   }
   
   //métodos de acesso
   public String getNome(){
      return this.nome;
   }
   
   public int getNumero(){
      return this.numero;
   }
   
   public int getDigito(){
      return this.digito;
   }
   
   //métodos modificadores
   public void setNome(String n){
      nome = n;
   }
   
   public void setNumero(int nn){
      numero = nn;
   }
   
   public void setDigito(int d){
      digito = d;
   }
   
   
   
}