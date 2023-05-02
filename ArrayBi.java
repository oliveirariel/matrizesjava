package Matriz;

import java.util.Scanner;

public class ArrayBi {

    public int[] tamanhoMatriz(){
        int[] vetor = new int[2];
        Scanner input = new Scanner(System.in);
        vetor[0] = input.nextInt();
        System.out.printf("Número de lnhas: ", vetor[0]);
        vetor[1] = input.nextInt();
        System.out.printf("Número de colunas: ", vetor[1]);

        return vetor;
    }
    public int [] [] criarMatriz(int [] v){
        int [] [] matriz = new int [v[0]] [v[1]];

        for(int i=0; i<matriz.length; i++){
            System.out.println("Insira os elementos");
            for(int j=0; j<matriz[i].length; j++){
                Scanner input = new Scanner(System.in);
                matriz [i] [j] = input.nextInt();
                System.out.printf("Matriz [%d] [%d]: ",i,j);
            }
        }
        return matriz;
    }
    public void imprimirMatriz(int [] [] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz [%d] [%d]: %d \n ", i, j, matriz[i][j]);
            }
        }
    }
}