package br.com.androidpro.javaandroid.exercicio2;

public class Caminhao extends Veiculo {

    private int capacidadeCarga;

    public Caminhao(int velocidade, int marcha, int capacidadeCarga) {
        super(velocidade, marcha);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Caminhao: Capacidade " + this.capacidadeCarga);
    }
}
