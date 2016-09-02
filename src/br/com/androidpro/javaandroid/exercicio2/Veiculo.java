package br.com.androidpro.javaandroid.exercicio2;

public class Veiculo implements IVeiculo {

    private int velocidade;

    private int marcha;

    public Veiculo(int velocidade, int marcha) {
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    @Override
    public void acelerar(int incremento) {
        this.velocidade = this.velocidade + incremento;
    }

    @Override
    public void trocarMacha(int novaMarcha) {
        this.marcha = novaMarcha;
    }

    public void mostrar() {
        System.out.println("Veiculo: Velocidade " + this.velocidade + " Marcha " + this.marcha);
    }
}
