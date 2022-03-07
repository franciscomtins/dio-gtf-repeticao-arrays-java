/*
recebe um número de 1 a 10 e gera a tabuada
 */

package exercicios_estr_repeticao;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int multiplicador;

        System.out.println("Informe um número: ");
        multiplicador = scan.nextInt();

        System.out.println("Tabuada de " + multiplicador);

        for(int i = 1; i <= 10; i++){
            System.out.println(multiplicador + " x " + i + " = " + (multiplicador * i));
        }

    }
}
