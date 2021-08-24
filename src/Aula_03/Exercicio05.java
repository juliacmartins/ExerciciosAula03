package Aula_03;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        String produto;
        double valor;
        Scanner tc=new Scanner(System.in);
        System.out.println("Digite o nome do produto:");
        produto=tc.next();
        System.out.println("Digite o valor do produto:");
        valor=tc.nextDouble();
        if((valor>=50) && (valor<200)){
            valor=valor*0.95;
        } else if ((valor>=200) && (valor<500)) {
            valor = valor * 0.94;
        } else if ((valor>=500) && (valor<1000)) {
            valor = valor * 0.93;
        } else if (valor>=1000) {
            valor = valor * 0.92;
        }
        System.out.println("O produto" + produto +"possui o valor" +valor);
    }
}
