package Aula_03;

import javax.swing.*;

public class Exercicio03 {
    public static void main(String[] args) {
        double np1, np2, nt3;
        double media;
        String dado;

        dado = JOptionPane.showInputDialog("Informe nota da prova 1");
        np1=Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe nota da prova 2");
        np2=Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe nota do Trabalho 3");
        nt3=Double.parseDouble(dado);

        media = (np1+np2+nt3)/3;

        if(media>6){
            JOptionPane.showMessageDialog(null,"Aprovado! média:" +media);
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado! Média: " +media);
        }

    }
}
