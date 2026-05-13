package Subsystem;

public class SistemaHotel {

    public double calcularHotel(String tipoQuarto, int pessoas, int diarias) {

        double valorBase = 200;

        switch (tipoQuarto) {

            case "Executivo":
                valorBase = valorBase * 2.5;
                break;

            case "Suíte Presidencial":
                valorBase = (valorBase * 2.5) * 4;
                break;
        }

        return valorBase * pessoas * diarias;
    }
}