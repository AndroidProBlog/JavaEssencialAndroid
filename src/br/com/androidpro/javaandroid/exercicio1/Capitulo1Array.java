package br.com.androidpro.javaandroid.exercicio1;

public class Capitulo1Array {
    public static void main(String[] args) {
        // Alocar memória para 5 inteiros
        int[] umArray;
        umArray = new int[5];
        // Inicializa elementos
        umArray[0] = 10;
        umArray[1] = 20;
        umArray[2] = 30;
        umArray[3] = 40;
        umArray[4] = 50;
        System.out.println("Valor no índice 0:" + umArray[0]);
        System.out.println("Valor no índice 1:" + umArray[1]);
        System.out.println("Valor no índice 2:" + umArray[2]);
        System.out.println("Valor no índice 3:" + umArray[3]);
        System.out.println("Valor no índice 4:" + umArray[4]);
    }
}
