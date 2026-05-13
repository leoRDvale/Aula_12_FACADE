package Subsystem;

public class SistemaAereo {

    public String definirClasse(int fileira) {

        if(fileira >= 1 && fileira <= 3) {
            return "1ª Classe";
        }

        if(fileira >= 4 && fileira <= 8) {
            return "Executiva";
        }

        return "Econômica";
    }

    public double calcularValorPassagem(String classe) {

        double economica = 500;

        switch (classe) {

            case "Executiva":
                return economica * 3.5;

            case "1ª Classe":
                return (economica * 3.5) * 2.5;

            default:
                return economica;
        }
    }
}