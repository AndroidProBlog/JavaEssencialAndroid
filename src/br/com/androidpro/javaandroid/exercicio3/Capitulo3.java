package br.com.androidpro.javaandroid.exercicio3;

import java.util.ArrayList;

public class Capitulo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList <String> ();
        for ( int i = 1; i <= 10; i ++) {
            arrayList.add ( "Elemento - " + i);
        }
        System.out.println("Índice do Elemento 7: " + arrayList.indexOf ("Elemento - 7"));
        arrayList.remove (4);
        System.out.println("Índice do Elemento 7: " + arrayList.indexOf ("Elemento - 7"));
    }
}
