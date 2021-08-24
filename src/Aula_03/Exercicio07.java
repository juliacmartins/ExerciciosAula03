package Aula_03;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        String usuarioAutorizado = "Java08";
        String senhaAutorizada = "Java08";
        String senhaInformada;
        String usuarioInformado;
        int cont=0;
        boolean logado = false;

                Scanner tc= new Scanner(System.in);

                do{
                    System.out.println("Digite o Usuario:");
                    usuarioInformado = tc.next();
                    System.out.println("Digite a senha:");
                    senhaInformada = tc.next();
                    cont--;
                    if ((usuarioInformado.equals(usuarioAutorizado))&&(senhaInformada.equals(senhaAutorizada))){
                        System.out.println("Login efetuado com sucesso! Numero de tentativas: "+cont);
                        logado=true;
                    }else {
                        System.out.println("Login não efetuado! Confira os dados. Numeros de tentativas:" +cont);
                    }
                } while ((cont<0) || (!logado));
    }
}
