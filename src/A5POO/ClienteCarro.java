package A5POO;

import javax.swing.JOptionPane;

public class ClienteCarro extends Clientes {
    float valor; 
    public ClienteCarro() {
        }
    
    public void calcularvalor(){
     valor = duracao * 8;
   }

    public float getDuracao() {
        return duracao;
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null,"\nCliente " + this.nome + " cadastrado! \n\nComprovante: \n\nNome: "+ this.nome + "\nCPF: " +
        this.cpf + "\nPlaca: " + this.placa + "\nTelefone: " + this.telefone + "\nValor total a pagar: R$" + this.valor + "\n\nA Cópia do comprovante foi enviada para o e-mail: " + this.email + "\n\nObrigada por usar nossa rede de Parquimetros! \n\n Até mais!");
    }



}

