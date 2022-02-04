package trilJavaEx01;

import enums.Veiculos;

public class Servicos {

	private static int id = 1;
	private int qtdeDias;

	public int getQtdeDias() {
		return qtdeDias;
	}

	public Servicos() {
		// TODO Auto-generated constructor stub
	}

	public static int gerarid() {
		return id++;
	}
	public void setQtdeDias(int qtdeDias) {
		this.qtdeDias = qtdeDias;
	}

	public int getId() {
		this.qtdeDias = id;
		return id;
	}

	public double totalPago(int dias, Veiculos veiculos) {
		this.qtdeDias = dias;
		return dias * veiculos.getValor();

	}
}
