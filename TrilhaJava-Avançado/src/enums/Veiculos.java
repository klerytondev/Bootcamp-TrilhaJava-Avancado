package enums;

public enum Veiculos {

	FIAT_UNO(1, "Basico", "Way", 1.0, "preto", 130.00), 
	VW_GOL(2, "basico", "Gol", 1.0, "branco", 150.00),
	JEEP_RENEGADE(3, "Intermediario", "std AT", 1.8, "branco", 350.00), 
	RENAULT_DUSTER(4,"Intermediario", "Dinamique", 2.0, "azul", 350.00),
	TOYOTA_RILUX(5, "Executivo", "Rilux SW4", 3.0, "vermelha", 1500.00), 
	GM_TRAIL_BLAZER(6, "Executivo", "ltz", 3.0, "cinza", 1800.00),
	PORCHE_CAYENNE(7, "Premium", "turbo GT", 4.0, "amarela", 3500.00), 
	FOR_MUSTANG(8, "Premium", "Mach 1", 5.0, "vermelho", 4000.00);

	private final int id;
	private final String categoria;
	private final String modelo;
	private final double motor;
	private final String cor;
	private final double valor;
	
	private Veiculos(int id, String categoria, String modelo, double motor, String cor, double valor) {
		this.id = id;
		this.categoria = categoria;
		this.modelo = modelo;
		this.motor = motor;
		this.cor = cor;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getModelo() {
		return modelo;
	}

	public double getMotor() {
		return motor;
	}

	public String getCor() {
		return cor;
	}

	public double getValor() {
		return valor;
	}

}
