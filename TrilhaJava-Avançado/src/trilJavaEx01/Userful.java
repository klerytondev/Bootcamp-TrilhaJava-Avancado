package trilJavaEx01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import enums.Veiculos;

public class Userful {

	Scanner sc = new Scanner(System.in);

	Servicos servicos = new Servicos();
	int qtdeDias;
	String op;
	String cond;
	double totalLoc;
	double valorLoc;
	int id;

	public void cadastroClientes(String opcao) {

		Map<Integer, Clientes> mapa = new HashMap<>();
		Clientes locacao = new Clientes();

		if (opcao.equalsIgnoreCase("s")) {

			do {

				System.out.print("Digite o nome: ");
				String nome = sc.next();
				System.out.print("Digite a idade: ");
				int idade = sc.nextInt();
				do {
					System.out.println("Digite o Id do veículo que deseja realizar a locação: ");
					for (Veiculos veiculos : Veiculos.values()) {
						System.out.println(veiculos.getId() + " - " + veiculos + veiculos.getCategoria() + " | "
								+ veiculos.getModelo() + " | " + veiculos.getMotor() + " | " + veiculos.getValor());
					}
					id = sc.nextInt();

					switch (id) {
					case 1:
						System.out.println("Digite quantos dias deseja locar o veiculo: ");
						qtdeDias = sc.nextInt();
						servicos.setQtdeDias(qtdeDias);
						valorLoc = servicos.totalPago(qtdeDias, Veiculos.FIAT_UNO);
						locacao.setVeiculosLocados(Veiculos.FIAT_UNO);

						break;

					case 2:
						System.out.println("Digite quantos dias deseja locar o veiculo: ");
						qtdeDias = sc.nextInt();
						servicos.setQtdeDias(qtdeDias);
						valorLoc = servicos.totalPago(qtdeDias, Veiculos.VW_GOL);
						break;

					case 3:
						System.out.println("Digite quantos dias deseja locar o veiculo: ");
						qtdeDias = sc.nextInt();
						servicos.setQtdeDias(qtdeDias);
						valorLoc = servicos.totalPago(qtdeDias, Veiculos.JEEP_RENEGADE);
						break;

					case 4:
						System.out.println("Digite quantos dias deseja locar o veiculo: ");
						qtdeDias = sc.nextInt();
						servicos.setQtdeDias(qtdeDias);
						valorLoc = servicos.totalPago(qtdeDias, Veiculos.RENAULT_DUSTER);
						break;

					case 5:
						System.out.println("Digite quantos dias deseja locar o veiculo: ");
						qtdeDias = sc.nextInt();
						servicos.setQtdeDias(qtdeDias);
						valorLoc = servicos.totalPago(qtdeDias, Veiculos.TOYOTA_RILUX);
						break;

					case 6:
						System.out.println("Digite quantos dias deseja locar o veiculo: ");
						qtdeDias = sc.nextInt();
						servicos.setQtdeDias(qtdeDias);
						valorLoc = servicos.totalPago(qtdeDias, Veiculos.GM_TRAIL_BLAZER);
						break;

					case 7:
						System.out.println("Digite quantos dias deseja locar o veiculo: ");
						qtdeDias = sc.nextInt();
						servicos.setQtdeDias(qtdeDias);
						valorLoc = servicos.totalPago(qtdeDias, Veiculos.FOR_MUSTANG);
						break;

					case 8:
						System.out.println("Digite quantos dias deseja locar o veiculo: ");
						qtdeDias = sc.nextInt();
						servicos.setQtdeDias(qtdeDias);
						valorLoc = servicos.totalPago(qtdeDias, Veiculos.PORCHE_CAYENNE);

						break;
					}

					totalLoc += valorLoc;
					System.out.println("Deseja locar mais algum veículo? (S) ou (N): ");
					cond = sc.next();

				} while (cond.equalsIgnoreCase("s"));

				Clientes costumers = new Clientes(nome, idade, totalLoc, Servicos.gerarid());
				mapa.put(costumers.getId(), costumers);
				valorLoc = 0;

				System.out.print("Deseja continuar Cadastrando? (S) ou (N): ");
				op = sc.next();

			} while (op.equalsIgnoreCase("s"));

		} else {

			System.out.println("Fim do programa!");
		}
		System.out.print("Digite o ID do cliente para pesquisar a locação: ");
		int codCliente = sc.nextInt();

		for (Map.Entry<Integer, Clientes> entry : mapa.entrySet()) {

			if (codCliente == entry.getKey()) {

				System.out.println(entry.getValue());

				for (Veiculos veiculos : Veiculos.values()) {
					if (veiculos.getId() == codCliente) {
						System.out.println("Alugou por " + servicos.getQtdeDias() + " | " + veiculos.getCategoria()
								+ " | " + veiculos + " | " + veiculos.getModelo() + " | " + veiculos.getMotor() + " | "
								+ veiculos.getCor() + " com valor: R$" + veiculos.getValor());
						System.out.println("Valor total da locação: R$" + entry.getValue().getTotalLoc());

					}
				}

			}
		}

	}
}
