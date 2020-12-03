package A5POO;

import javax.swing.JOptionPane;

public class Clientes {
      
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public String placa;
    public float duracao;

    public Clientes() {
    }
    
    public void imprimir(){
      JOptionPane.showMessageDialog(null, "  Comprovante: \n\n\nNome: "+ this.nome + "\nCPF: " +
        this.cpf + "\nPlaca: " + this.placa + "\nTelefone: " + this.telefone + "\n\n A Cópia do comprovante foi enviada para o e-mail: " + this.email + "\n\nObrigada por usar nossa rede de Parquimetros! \n\n Até mais!");
     // int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "\n\nGostaria de receber o comprovante por e-mail?"
     //    +"\n\n1- Sim \n2- Não "));
        
     ///if (opcao == 1){
      //  email();
       // } else{
        //  JOptionPane.showMessageDialog(null,"Obrigado por usar a nossa rede de Parquímetros!\n\n Até mais!");
        //  }
     // } 
     
    //public void email(){
    //  JOptionPane.showInputDialog("Digite seu e-mail: " + this.email);
     // JOptionPane.showMessageDialog(null,"Comprovante enviado para \ne-mail: " + this.email);
   // }
} 

}
