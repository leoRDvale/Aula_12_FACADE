import Facade.AgenciaFacade;
import Model.Cliente;
import Model.PacoteViagem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AgenciaFacade facade = new AgenciaFacade();

        System.out.println("=================================");
        System.out.println("Seja Bem vindo a Agência de Viagem");
        System.out.println("=================================");

        System.out.print("\nQual a quantidade de passageiros: ");
        int qtdClientes = sc.nextInt();
        sc.nextLine();

        Cliente[] clientes = new Cliente[qtdClientes];

        for (int i = 0; i < qtdClientes; i++) {

            System.out.println("\nPassageiro " + (i + 1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("CPF: ");
            String cpf = sc.nextLine();

            clientes[i] = new Cliente(nome, cpf);
        }

        System.out.println("\n===== MAPA DE ASSENTOS =====");

        System.out.println("\n=Escolha a Fileira desejada:");

        System.out.println("1ª Classe -> Fileiras 1 até 3");
        System.out.println("Executiva -> Fileiras 4 até 8");
        System.out.println("Econômica -> Fileiras 9 até 32");
        int fileira = sc.nextInt();

        System.out.println("\nDigite a poltrona (A-F): ");
        System.out.println("A e F = Janela");
        System.out.println("B e E = Meio");
        System.out.println("C e D = Corredor");
        char poltrona = sc.next().toUpperCase().charAt(0);

        System.out.println("\n===== HOTEL =====");

        System.out.println("1 - Simples");
        System.out.println("2 - Executivo");
        System.out.println("3 - Suíte Presidencial");

        System.out.print("Escolha o quarto: ");
        int opcaoHotel = sc.nextInt();

        String quarto = "";

        switch (opcaoHotel) {

            case 1:
                quarto = "Simples";
                break;

            case 2:
                quarto = "Executivo";
                break;

            case 3:
                quarto = "Suíte Presidencial";
                break;

            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        System.out.print("Quantidade de diárias do hotel: ");
        int diariasHotel = sc.nextInt();

        System.out.println("\n===== ALUGUEL DE CARRO =====");

        System.out.println("1 - Econômico");
        System.out.println("2 - Executivo");
        System.out.println("3 - Luxo");

        System.out.print("Escolha a categoria do carro: ");
        int opcaoCarro = sc.nextInt();

        String carro = "";

        switch (opcaoCarro) {

            case 1:
                carro = "Econômico";
                break;

            case 2:
                carro = "Executivo";
                break;

            case 3:
                carro = "Luxo";
                break;

            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        System.out.print("Quantidade de diárias do carro: ");
        int diariasCarro = sc.nextInt();

        System.out.println("\n===== PAGAMENTO =====");

        System.out.println("1 - PIX (10% desconto)");
        System.out.println("2 - Boleto (5% desconto)");
        System.out.println("3 - Débito");
        System.out.println("4 - Crédito");

        System.out.print("Escolha a forma de pagamento: ");
        int opcaoPagamento = sc.nextInt();

        String pagamento = "";
        int parcelas = 1;

        switch (opcaoPagamento) {

            case 1:
                pagamento = "pix";
                break;

            case 2:
                pagamento = "boleto";
                break;

            case 3:
                pagamento = "debito";
                break;

            case 4:

                pagamento = "credito";

                System.out.print("Quantidade de parcelas (1 a 6): ");
                parcelas = sc.nextInt();

                if(parcelas < 1 || parcelas > 6) {

                    System.out.println("Número de parcelas inválido!");
                    System.exit(0);
                }

                break;

            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        PacoteViagem pacote =
                facade.reservarPacote(
                        clientes,
                        fileira,
                        poltrona,
                        quarto,
                        diariasHotel,
                        carro,
                        diariasCarro,
                        pagamento,
                        parcelas
                );

        System.out.println("\n=================================");
        System.out.println("RESUMO DO PEDIDO");
        System.out.println("=================================");

        System.out.println("\nPASSAGEIRO(S):");

        for (Cliente c : pacote.getClientes()) {

            System.out.println(
                    "Nome: " + c.getNome()
                            + " | CPF: " + c.getCpf()
            );
        }

        System.out.println("\nDADOS DA VIAGEM");

        System.out.println("Poltrona: " + pacote.getAssento());

        System.out.println("Classe do voo: "
                + pacote.getClasseVoo());

        System.out.println("Quarto hotel: "
                + pacote.getQuartoHotel());

        System.out.println("Categoria carro: "
                + pacote.getCategoriaCarro());

        System.out.println("Forma pagamento: "
                + pacote.getFormaPagamento());

        System.out.printf(
                "\nValor Base: R$ %.2f",
                pacote.getValorBase()
        );

        if (pacote.getDescontoOuAcrescimo() < 0) {

            System.out.printf(
                    "\nDesconto: R$ %.2f",
                    Math.abs(
                            pacote.getDescontoOuAcrescimo()
                    )
            );

        } else {

            System.out.printf(
                    "\nAcréscimo: R$ %.2f",
                    pacote.getDescontoOuAcrescimo()
            );
        }

        System.out.printf(
                "\nValor Final: R$ %.2f",
                pacote.getValorFinal()
        );

        System.out.println("\n=================================");

        sc.close();
    }
}