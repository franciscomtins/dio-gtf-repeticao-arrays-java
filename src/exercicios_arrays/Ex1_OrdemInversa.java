/*
Crie um vetor de 6 números e mostre na ordem inversa
 */

package exercicios_arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        int posicao = 0;

        System.out.print("Vetor na ordem normal: ");
        while(posicao < (vetor.length)) {
            System.out.print(vetor[posicao] + " ");
            posicao++;
        }

        System.out.print("\nVetor na ordem inversa: ");
        for(int i = (vetor.length - 1); i >= 0 ; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
