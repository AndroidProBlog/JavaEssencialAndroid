package br.com.androidpro.javaandroid.exercicio3;

import java.util.*;

public class TestaHashMap {
    public static void main(String[] args) {
        // Criação de um HashMap
        HashMap<String, Double> androidMap = new HashMap<String, Double>();
        // Adicionando elementos
        androidMap.put("Donut", new Double(1.6));
        androidMap.put("Eclair", new Double(2.1));
        androidMap.put("Froyo", new Double(2.2));
        androidMap.put("Gingerbread", new Double(2.3));
        androidMap.put("Honeycomb", new Double(3.1));
        androidMap.put("Ice Cream Sandwich", new Double(4.0));
        androidMap.put("Jelly Bean", new Double(4.1));
        // Obter um conjunto de entradas
        Set<Map.Entry<String, Double>> set = androidMap.entrySet();
        // Obter um iterador
        Iterator<Map.Entry<String, Double>> i = set.iterator();
        // Elementos de indicação
        while (i.hasNext()) {
            Map.Entry<String, Double> me = (Map.Entry<String, Double>) i.next();
            System.out.println(me.getKey() + ":" + me.getValue());
        }
        System.out.println();
        // Aumentar o número da versão do Eclair
        Double versao = androidMap.get("Eclair");
        androidMap.put("Eclair", new Double(versao + 0.1));
        System.out.println("Novo número da versão do Eclair:" + androidMap.get("Eclair"));
    }
}