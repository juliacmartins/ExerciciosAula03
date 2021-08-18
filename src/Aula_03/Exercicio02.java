package Aula_03;

import javax.swing.*;

public class Exercicio02 {

    public static void main(String[] args) {
        double itbi;
        double valorVenal;
        double valorTransacao;
        double impostoPago;
        String dado;
        dado = JOptionPane.showInputDialog("Digite o valor da transação:");
        valorTransacao = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Digite o valor da venal:");
        valorVenal = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Digite a porcentagem do imposto:");
        itbi = Double.parseDouble(dado);

        if(valorTransacao > valorVenal){
            impostoPago = valorTransacao*itbi/100;
        }else{
            impostoPago = valorVenal*itbi/100;
        }

        JOptionPane.showMessageDialog(null,"Imposto a ser pago é: " +impostoPago);


    }
}
