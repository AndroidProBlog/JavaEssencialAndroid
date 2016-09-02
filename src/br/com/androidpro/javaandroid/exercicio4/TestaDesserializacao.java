package br.com.androidpro.javaandroid.exercicio4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestaDesserializacao {

    @SuppressWarnings("Unchecked")
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        try {
            FileInputStream fileIn = new FileInputStream("/home/funcionario.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            funcionario = (Funcionario) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Classe Funcionario não foi encontrada.");
            c.printStackTrace();
            return;
        } finally {
            if (funcionario instanceof Funcionario) {
                System.out.println("-----------------------");
                System.out.println("Desserializando objeto funcionario...");
                System.out.println("Nome:" + funcionario.getNome());
                System.out.println("Endereço:" + funcionario.getEndereco());
                System.out.println("Cargo:" + funcionario.getCargo());
                System.out.println("-----------------------");
            }
        }
    }
}