package Subsystem;

public class SistemaPagamento {

    public double calcularPagamento(double valor, String forma, int parcelas) {

        switch (forma.toLowerCase()) {

            case "pix":
                return valor * 0.90;

            case "boleto":
                return valor * 0.95;

            case "debito":
                return valor;

            case "credito":

                if(parcelas > 1) {

                    double juros = (parcelas - 1) * 0.0399;
                    return valor + (valor * juros);
                }

                return valor;
        }

        return valor;
    }
}