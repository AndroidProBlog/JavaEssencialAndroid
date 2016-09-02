package br.com.androidpro.javaandroid.exercicio4;

public class Jogador {

    private float peso;
    private float altura;
    private int idade;
    private Posicao posicao;

    public static int quantidaGols = 0;

    public Jogador(float peso, float altura, int idade, Posicao posicao) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.posicao = posicao;
    }

    public static int getQuantidaGols() {
        return quantidaGols;
    }

    public static void setQuantidaGols(int quantidaGols) {
        Jogador.quantidaGols = quantidaGols;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
}
