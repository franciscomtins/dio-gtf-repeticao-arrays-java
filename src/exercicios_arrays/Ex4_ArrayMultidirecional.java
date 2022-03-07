package exercicios_arrays;
/*
Gere e imprima uma matriz M 5x4 com valores aleatórios entre 0 e 9
 */


import java.util.Random;

public class Ex4_ArrayMultidirecional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[5][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length ; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for(int[] linha : M) {
            for(int coluna: linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        int i, num = 5;
        for (i = 0; i < 3; i++) {
            num += i;
            System.out.print(i);
        }

        System.out.println();

        int num2 = 5, count = 1;
        while(count <= 3) {
            ++count;
            num2 += count;
        }
        System.out.println(num2);

    }
}
