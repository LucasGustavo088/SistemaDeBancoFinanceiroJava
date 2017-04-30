import javax.swing.JOptionPane;

public class CaixaEletronico {
   public static void main(String [] args){
   //entrada de dados do cliente
   String nome = JOptionPane.showInputDialog("Nome");
   String cpf = JOptionPane.showInputDialog("CPF");
   //entrada de dados da conta corrente
   int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta"));
   int digitoConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o digito da conta"));
   //entrada de dados da agencia
   String nomeAgencia = "";
   int numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da agencia"));
   int digitoAgencia = Integer.parseInt(JOptionPane.showInputDialog("Digite o digito da agencia"));
   //saldo
   double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial"));
   
   Agencia agencia1 = new Agencia(nomeAgencia, numeroAgencia, digitoAgencia);
   ContaCorrente contaCorrente1 = new ContaCorrente(numeroConta, digitoConta, agencia1, saldo);
   Cliente cliente1 = new Cliente(nome, cpf, contaCorrente1);
   
   //operações
   JOptionPane.showMessageDialog(null,"Sacar: " + contaCorrente1.sacar(140.00));
   JOptionPane.showMessageDialog(null,"Consultar Saldo: " + contaCorrente1.consultarSaldo());
   JOptionPane.showMessageDialog(null,"Sacar 200.00: " + contaCorrente1.sacar(200.00));
   JOptionPane.showMessageDialog(null,"Consultar Saldo: " + contaCorrente1.consultarSaldo());
   JOptionPane.showMessageDialog(null,"depositar: " + contaCorrente1.depositar(25.45));
   
   
   JOptionPane.showMessageDialog(null, 
   cliente1.getDados() + 
   contaCorrente1.imprimirSaldo()
   );
   
   
   
   
   }
}