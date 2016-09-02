package br.com.androidpro.javaandroid.exercicio2;

public class Carro extends Veiculo {

    private int numeroLugares;

    public static int numeroCarros;

    public Carro(int velocidade, int marcha, int numeroLugares) {
        super(velocidade, marcha);
        this.numeroLugares = numeroLugares;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Carro: Lugares " + this.numeroLugares);
    }

    public static int getNumeroCarros() {
        return numeroCarros;
    }
}
