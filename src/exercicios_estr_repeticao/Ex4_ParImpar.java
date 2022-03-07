/*
O usuário informa uma qtde N de números e retorno quantos são pares e qtos são impares.
 */

package exercicios_estr_repeticao;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdeNumeros;
        int contador = 1;
        int numeroTestado;
        int totalPares = 0;
        int totalimpares = 0;

        System.out.println("Informe a quantidade de números para testar : ");
        qtdeNumeros = scan.nextInt();

        do{
            System.out.println("Informe o número para teste: ");
            numeroTestado = scan.nextInt();
            contador++;

            if(numeroTestado % 2 == 0 ){
                totalPares++;
            }else{
                totalimpares++;
            }

        } while(contador <= qtdeNumeros);

        System.out.println("Total de números pares foi: " + totalPares);
        System.out.println("Total de números impares foi: " + totalimpares);
    }
}
