package Aula_03;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        final int IDADE_MASC_APOSENTAR = 65;
        final int IDADE_FEM_APOSENTAR = 60;
        final int IDADE_FEM_CONTRIBUICAO = 30;
        final int IDADE_MASC_CONTRIBUICAO = 35;
        int contribuicao;
        int idade;
        String sexo;

        System.out.println("Digite sua idade:");
        idade = tc.nextInt();

        System.out.println("Digite seu tempo de contribuição:");
        contribuicao = tc.nextInt();

        System.out.println("Digite seu sexo:");
        sexo = tc.next();

        if (sexo.equalsIgnoreCase("m")) {
            if (idade >= IDADE_MASC_APOSENTAR) {
                System.out.println("Você já pode se aposentar por idade.");
            }
        } else {
            if (contribuicao >= IDADE_MASC_CONTRIBUICAO) {
                System.out.println("Você já pode se aposentar por tempo de contribuiçao.");

            } else {
                System.out.println("Você ainda não pode se aposentar falta:");
                System.out.println(IDADE_MASC_CONTRIBUICAO - contribuicao + "de contribuição");
                System.out.println(IDADE_MASC_APOSENTAR - idade + "de idade");

            }

            if (sexo.equalsIgnoreCase("f")) {
                if (idade >= IDADE_FEM_APOSENTAR) {
                    System.out.println("Você já pode se aposentar por idade.");
                }
            } else {
                if (contribuicao >= IDADE_FEM_CONTRIBUICAO) {
                    System.out.println("Você já pode se aposentar por tempo de contribuiçao.");

                } else {
                    System.out.println("Você ainda não pode se aposentar falta:");
                    System.out.println(IDADE_FEM_CONTRIBUICAO - contribuicao + "de contribuição");
                    System.out.println(IDADE_FEM_APOSENTAR - idade + "de idade");

                }

            }


        }

    }
}
