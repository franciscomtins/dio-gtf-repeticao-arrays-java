package exercicios_estr_repeticao;

import java.util.Scanner;

/*
Ler 5 números inteiros, informar o valor maior e fazer a média deles.
 */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maior = 0;
        int somaNumeros = 0;
        float media = 0;


        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            contador++;
            somaNumeros = somaNumeros + numero;

            if (numero > maior){
                maior = numero;
            }

        } while (contador < 5);

        media = somaNumeros / 5;
        System.out.println("O maior número informado é " + maior);
        System.out.println("A média dos números informados é: " + media);
    }
}
