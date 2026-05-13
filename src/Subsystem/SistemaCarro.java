package Subsystem;

public class SistemaCarro {

    public double calcularCarro(String categoria, int diarias) {

        double valor = 150;

        switch (categoria) {

            case "Executivo":
                valor = valor * 2;
                break;

            case "Luxo":
                valor = (valor * 2) * 2;
                break;
        }

        return valor * diarias;
    }
}