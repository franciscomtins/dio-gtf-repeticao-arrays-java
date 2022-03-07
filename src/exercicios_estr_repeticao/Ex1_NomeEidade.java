/*
Objetivo: Repetir a idade e o nome até que o nome seja informado como zero (0)
*/

package exercicios_estr_repeticao;

import java.util.Scanner;

public class Ex1_NomeEidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome");
            nome = scan.next();
            if(nome.equals("0")) break;

            System.out.println("Idade");
            idade = scan.nextInt();
        }

        System.out.println("Encerrado.");
    }
}