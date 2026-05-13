package Model;

import java.util.ArrayList;
import java.util.List;

public class PacoteViagem {

    private List<Cliente> clientes = new ArrayList<>();

    private String assento;
    private String classeVoo;

    private String quartoHotel;
    private String categoriaCarro;

    private String formaPagamento;

    private double valorBase;
    private double valorFinal;
    private double descontoOuAcrescimo;

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public String getClasseVoo() {
        return classeVoo;
    }

    public void setClasseVoo(String classeVoo) {
        this.classeVoo = classeVoo;
    }

    public String getQuartoHotel() {
        return quartoHotel;
    }

    public void setQuartoHotel(String quartoHotel) {
        this.quartoHotel = quartoHotel;
    }

    public String getCategoriaCarro() {
        return categoriaCarro;
    }

    public void setCategoriaCarro(String categoriaCarro) {
        this.categoriaCarro = categoriaCarro;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double getDescontoOuAcrescimo() {
        return descontoOuAcrescimo;
    }

    public void setDescontoOuAcrescimo(double descontoOuAcrescimo) {
        this.descontoOuAcrescimo = descontoOuAcrescimo;
    }
}