package trilJavaEx01;

import java.util.ArrayList;

import enums.Veiculos;

public class Clientes {

	private String nome;
	private int idade;
	private int id;
	private double totalLoc;
	private ArrayList<Veiculos> veiculosLocados;
	
public Clientes() {
	// TODO Auto-generated constructor stub
}

	public Clientes(String nome, int idade, double total, int id) {
		this.nome = nome;
		this.idade = idade;
		this.id = id;
		this.totalLoc = total;

		
	}
	
	public ArrayList<Veiculos> getVeiculosLocados() {
		return veiculosLocados;
	}
	
	public void setVeiculosLocados(Veiculos veiculos) {
		this.veiculosLocados.add(veiculos);
	}

	public double getTotalLoc() {
		return totalLoc;
	}

	public void setTotalLoc(double totalLoc) {
		this.totalLoc = totalLoc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "id=" + id  + "Cliente nome=" + nome + ", idade=" + idade;
	}
	
	

}
