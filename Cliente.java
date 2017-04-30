public class Cliente {
   //variaveis e atributos
   private String nome;
   private String cpf;
   private ContaCorrente conta;
   
   //construtor
   public Cliente(String nome, String cpf, ContaCorrente conta){
      this.nome = nome;
      this.cpf = cpf;
      this.conta = conta;
   }
   
   //métodos de acesso
   public String getNome(){
      return this.nome;
   }
   
   public String getCpf(){
      return this.cpf;
   }
   
   public ContaCorrente getConta(){
      return this.conta;
   }
   
   //métodos modificadores
   public void setNome(String n){
      this.nome = n;
   }
   
   public void setCpf(String c){
      this.cpf = c;
   }
   
   public void setConta(ContaCorrente cc){
      this.conta = cc;
   }
   //obter dados
   public String getDados(){
      String msg =   "      Cliente:      \n";
             msg +=  "Nome: " + nome + "\n";
             msg +=  "CPF: "  + cpf  + "\n";
      return msg;
   }
   
}