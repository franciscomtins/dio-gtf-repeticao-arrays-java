package exercicios_estr_repeticao;

import java.util.Scanner;

/*
Nota entre 0 e 10 e informa se o valor for inválido
 */
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota >10) {
            System.out.println("Nota inválida! Tente novamente.");
            nota = scan.nextInt();
        }

        System.out.println("Nota válida! Encerrado.");
    }
}

