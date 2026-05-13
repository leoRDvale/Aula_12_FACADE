package Facade;

import Model.Cliente;
import Model.PacoteViagem;
import Subsystem.*;

public class AgenciaFacade {

    private SistemaAereo sistemaAereo;
    private SistemaHotel sistemaHotel;
    private SistemaCarro sistemaCarro;
    private SistemaPagamento sistemaPagamento;

    public AgenciaFacade() {

        sistemaAereo = new SistemaAereo();
        sistemaHotel = new SistemaHotel();
        sistemaCarro = new SistemaCarro();
        sistemaPagamento = new SistemaPagamento();
    }

    public PacoteViagem reservarPacote(
            Cliente[] clientes,
            int fileira,
            char poltrona,
            String quarto,
            int diariasHotel,
            String carro,
            int diariasCarro,
            String pagamento,
            int parcelas
    ) {

        PacoteViagem pacote = new PacoteViagem();

        for(Cliente c : clientes) {
            pacote.adicionarCliente(c);
        }

        String assento = fileira + "" + poltrona;

        String classe = sistemaAereo.definirClasse(fileira);

        double valorPassagem =
                sistemaAereo.calcularValorPassagem(classe)
                        * clientes.length;

        double valorHotel =
                sistemaHotel.calcularHotel(
                        quarto,
                        clientes.length,
                        diariasHotel
                );

        double valorCarro =
                sistemaCarro.calcularCarro(
                        carro,
                        diariasCarro
                );

        double valorBase =
                valorPassagem + valorHotel + valorCarro;

        double valorFinal =
                sistemaPagamento.calcularPagamento(
                        valorBase,
                        pagamento,
                        parcelas
                );

        pacote.setAssento(assento);
        pacote.setClasseVoo(classe);
        pacote.setQuartoHotel(quarto);
        pacote.setCategoriaCarro(carro);
        pacote.setFormaPagamento(pagamento);

        pacote.setValorBase(valorBase);
        pacote.setValorFinal(valorFinal);
        pacote.setDescontoOuAcrescimo(valorFinal - valorBase);

        return pacote;
    }
}