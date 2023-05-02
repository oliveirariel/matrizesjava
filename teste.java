package Matriz;

import Matriz.ArrayBi;

public class teste {
    public static void main(String[] args) {
        ArrayBi ab = new ArrayBi();
        int [] v = ab.tamanhoMatriz();
        int [] [] m = ab.criarMatriz(v);
        ab.imprimirMatriz(m);
    }
}
