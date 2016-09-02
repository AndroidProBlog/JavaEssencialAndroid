package br.com.androidpro.javaandroid.exercicio3;

import java.util.HashSet;

public class TestaHashSet {
    public static void main(String[] args) {
        // Criação de um HashSet
        HashSet<String> androidHash = new HashSet<String>();
        // Adicionando elementos
        androidHash.add("Eclair");
        androidHash.add("Eclair");
        androidHash.add("Gingerbread");
        androidHash.add("Gingerbread");
        androidHash.add("Honeycomb");
        androidHash.add("Ice Cream Sandwich");
        androidHash.add("Jelly Bean");
        androidHash.add("Jelly Bean");

        System.out.println("O conteúdo do HashSet:" + androidHash);
    }
}