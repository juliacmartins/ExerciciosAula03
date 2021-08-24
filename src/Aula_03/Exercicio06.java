package Aula_03;

import java.util.Scanner;

public class Exercicio06{
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        double totalRes=0;
        double valorLido;
        double maiorRes=0, menorRes=0;

        for (int i=0; i<4;i++){
            valorLido = tc.nextDouble();
            totalRes+=valorLido;

            if(i==0){
                maiorRes = valorLido;
                menorRes = valorLido;
            }

            if(valorLido>maiorRes){
                maiorRes = valorLido;
            }

            if(valorLido<menorRes){
                menorRes=valorLido;
            }
        }

        System.out.println("O maior valor lido foi:" +maiorRes);
        System.out.println("O menor valor lido foi:" +menorRes);
        System.out.println("A resistencia total" +totalRes);
    }
}
