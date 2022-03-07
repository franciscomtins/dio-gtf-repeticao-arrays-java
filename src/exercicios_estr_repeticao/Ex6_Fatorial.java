/*
calcula o fatorial de um número inteiro fornecido pelo usuário.
 */

package exercicios_estr_repeticao;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int calculaFatorial = 1;

        System.out.println("Informe o número para calcular seu fatorial: ");
        fatorial = scan.nextInt();

        for(int i = fatorial; i >= 1; i--) {
            calculaFatorial = calculaFatorial * i;
        }

        System.out.println(calculaFatorial);
    }
}
