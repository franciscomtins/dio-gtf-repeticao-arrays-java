package exercicios_arrays;
/*
Gera 20 (entre 0 a 100) números aleatórios e guarda em um vetor, mostra os números e seus sucessores
 */

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i =0; i< numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos números aleatórios");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}
