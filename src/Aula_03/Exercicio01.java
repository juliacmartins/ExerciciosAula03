package Aula_03;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double preco;
        double porcentagem;
        double desconto;
        double precoComDesconto;

        System.out.println("Digite o valor do produto:");
        preco = teclado.nextFloat();
        System.out.println("Digite a porcentagem do desconto:");
        porcentagem = teclado.nextFloat();

        desconto = preco*porcentagem/100;

        precoComDesconto = preco - desconto;

        System.out.println("Valor do Produto: " +preco);
        System.out.println("Valor do Desconto: " +desconto);
        System.out.println("Valor do Produto com Desconto:: " +precoComDesconto);
    }
}
