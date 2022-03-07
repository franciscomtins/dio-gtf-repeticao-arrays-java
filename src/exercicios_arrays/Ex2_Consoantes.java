/*
vetor recebe 6 caracteres e informa quantas são consoantes
 */

package exercicios_arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdeConsoantes = 0;

        int contador = 0;
        do {
            System.out.println("Informe a letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                   letra.equalsIgnoreCase("e") |
                   letra.equalsIgnoreCase("i") |
                   letra.equalsIgnoreCase("o") |
                   letra.equalsIgnoreCase("u")) ) {
                consoantes[contador] = letra;
                qtdeConsoantes++;
            }
            contador++;

        } while(contador < consoantes.length);

        System.out.print("São consoantes: ");
        for ( String consoante : consoantes) {
            if(consoante != null) {
                System.out.print(consoante + " ");
            }
        }

        System.out.print("\nQuantidade de consoantes: " + qtdeConsoantes);
    }
}
