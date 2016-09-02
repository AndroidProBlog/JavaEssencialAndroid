package br.com.androidpro.javaandroid.exercicio2;

public class Capitulo2 {
    public static void main(String[] args) {
        Veiculo veiculo1, veiculo2, veiculo3;
        veiculo1 = new Veiculo(50, 2);
        veiculo2 = new Carro(50, 2, 4);
        veiculo3 = new Caminhao(40, 2, 500);
        System.out.println("Veiculo 1 info:");
        veiculo1.mostrar();
        System.out.println("Veiculo 2 info:");
        veiculo2.mostrar();
        System.out.println("Veiculo 3 info:");
        veiculo3.mostrar();
    }
}
