package A5POO;
import javax.swing.JOptionPane;


public class avaliacao5final {

    public static void main(String[] args) {
    
    for (int i = 0; i < 5000000; i++) {
        
   int op =Integer.parseInt(JOptionPane.showInputDialog(null, "\nOlá! Seja Bem-Vindo sou Alexy."
           + "\nSeu assistente Virtual de Parquimetro. \n\nDigite: \n\n 1- Cadastrar Carro\n 2- Cadastrar Moto"));
   
  switch(op){
            
     case 1:
        ClienteCarro carro = new ClienteCarro();
        carro.nome = JOptionPane.showInputDialog("Informe o seu nome: ");
        carro.cpf = JOptionPane.showInputDialog("Informe o seu CPF: ");
        carro.placa = JOptionPane.showInputDialog("Informe a placa do veiculo: ");
        carro.telefone = JOptionPane.showInputDialog("Informe o seu número de telefone: ");
        carro.duracao=Float.parseFloat(JOptionPane.showInputDialog("Por quantas horas vc deixará o carro estacionado? "));
        carro.email=JOptionPane.showInputDialog("Informe o seu e-mail para receber uma cópia do comprovante: ");
        carro.calcularvalor();
        carro.imprimir();
        
        break;

        
    case 2:
        ClienteMoto moto = new ClienteMoto();
        moto.nome = JOptionPane.showInputDialog("Informe o nome: ");
        moto.cpf = JOptionPane.showInputDialog("Informe o CPF: ");
        moto.placa = JOptionPane.showInputDialog("Informe a placa do veiculo: ");
        moto.telefone= JOptionPane.showInputDialog("Informe o número de telefone: ");
        moto.duracao= Float.parseFloat(JOptionPane.showInputDialog("Por quantas horas vc deixará a moto estacionada? "));
        moto.email= JOptionPane.showInputDialog("Informe o seu e-mail para receber uma cópia do comprovante: ");
        moto.calcularvalor();
        moto.imprimir();
            
        break;
     }
        
  }
 }
}
        
        
   