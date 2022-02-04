package trilJavaEx01;

import java.util.Scanner;

/* 
 * Cria um programa de cadastro de clientes com atributos (id, nome, idade) para uma empresa de locação de veiculos, solicitar o quantidade de veiculos que cada cliente (similar com um exercício já encaminhado) quer alugar Informar o cliente as categorias com a tabela de preços:
Tabela de aluguel valor diario do veiculo. Categoria e Veiculo:

BÁSICO
Fiat Uno – Modelo way – motor 1.0 – cor preto – 130, 00
VW Gol – Modelo G3 – motor 1.0 – cor branco – 150,00
INTERMEDIÁRIO
Jeep Renagade – Modelo std AT – motor 1.8 - 350,00
Renault Duster – Modelo Dynamique – motor 1.6 - 350,00
EXECUTIVO
Toyota Hilux – Modelo SW4 – motor 3.0 – 1500,00
GM TrailBlazer – Modelo LTZ – motor 3.0 – 1800,00
PREMIUM
Porche Cayenne – Modelo turbo GT – motor 4.0 – 3500,00
Ford Mustang - Modelo Mach 1 – motor 5.0 – 4000,00

Categorias e Veiculos devem ser populadas assim que o programa inicia.
Usar a busca por ID para mostrar o nome dos clientes(id, nome, idade) cadastrados com as listas de carros alugados do cliente e soma total dos veículos alugados de cada cliente.
O calculo deve ser com base na quantidade de dias alugados x quantidade de veiculos por categoria.
 * 
 * @Kleryton de Souza
 * 
 * */

public class Application {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Userful userful = new Userful();		
		System.out.println("=====================LOCADORA DE VEICULOS====================== ");
		System.out.print("Deseja iniciar uma locação? S- SIM | N - NÃO: ");
		userful.cadastroClientes(sc.next());
		
		sc.close();
	}

}
