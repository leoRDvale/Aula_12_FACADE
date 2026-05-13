# Aula_12_FACADE


Criar uma aplicação usando o Facade que simule um sistema de venda de pacote de viagens.

O sistema deve conter os seguintes subsistemas:

- Um sistema de venda de passagens aérea envolve diversos subsistemas.  O sistema de reserva de passagem no avião. O sistema para escolha da classe do voo (Classe Econômica, Classe Executiva e 1a classe) O sistema de escolha dos Assentos (6 assentos por fileira iniciando em 1A, 1B, 1C 1D, 1E, 1F, sabendo que o avião possui 32 fileiras no avião. As poltronas A,B,C ficam do lado esquerdo da aeronave e as fileiras D, E, F ficam do lado direito. As poltronas A e F são junto a janela, as poltronas B e E são poltronas do meio e as poltronas C e D são ao lado do corredor. As poltronas da classe econômica custam R$ 500. As poltronas da classe Executiva custam 250% a mais da classe econômica e as poltronas da da 1a classe custam 150% a mais que da classe executiva. (1a Classe fileiras de 1 a 3, Classe Executiva fileiras de 4 a 8. As demais fileiras são da classe econômica). 

- O sistema de reserva do hotel possui três tipos de quartos: Simples, Executivo e Suíte presidencial. O preço é calculado por pessoa, sendo para o quanto simples a diária é R$ 200. Quarto executivo é 150% o valor do quarto simples por pessoa, e a Suite presidencial é 300% o valor do quarto executivo por pessoa. 

- O sistema sistema de aluguel de carro possui 3 tipos de diária Econômica R$ 150, Executiva que é 100% o valor da diária econômica e de Luxo que é 100% o valor da diária Executiva. 

- O sistema de pagamento pode ser feito via pix com 10% de desconto, boleto com 5% de desconto, no Debito com valor normal, no crédito em até 6 vezes com acrescimo de juros de 3,99% por parcela, a partir da 2a parcela.

==> O sistema deve trazer os dados do comprador (nome, cpf) (caso seja casal ou mais pessoas devem ser impresso os dados para todos) e os dados da compra (poltrona escolhida, quarto de hotel, carro e forma de pagamento). Deve ser impresso também o valor do pacote e também do desconto ou acréscimo se houver. 
