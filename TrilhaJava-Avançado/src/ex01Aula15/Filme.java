package ex01Aula15;

import java.util.Objects;

public class Filme {

	private String nome;
	private String nomeDiretor;
	private String categoria;
	private int duracao;
	private int anoDeLancamento;
	private int classificacao;
	private int qtdePublico;

	public Filme() {
		// TODO Auto-generated constructor stub
	}

	public Filme(String nome, String nomeDiretor, String categoria, int duracao, int anoDeLancamento,
			int classificacao, int qtdePublico) {
		super();
		this.nome = nome;
		this.nomeDiretor = nomeDiretor;
		this.categoria = categoria;
		this.duracao = duracao;
		this.anoDeLancamento = anoDeLancamento;
		this.classificacao = classificacao;
		this.qtdePublico = qtdePublico;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeDiretor() {
		return nomeDiretor;
	}

	public void setNomeDiretor(String nomeDiretor) {
		this.nomeDiretor = nomeDiretor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String documentario) {
		this.categoria = documentario;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public int getQtdePublico() {
		return qtdePublico;
	}

	public void setQtdePublico(int qtdePublico) {
		this.qtdePublico = qtdePublico;
	}

	@Override
	public String toString() {
		return "Filme [nome=" + nome + ", nomeDiretor=" + nomeDiretor + ", documentario=" + categoria + ", duracao="
				+ duracao + ", anoDeLancamento=" + anoDeLancamento + ", classificacao=" + classificacao
				+ ", qtdePublico=" + qtdePublico + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoDeLancamento, classificacao, categoria, duracao, nome, nomeDiretor, qtdePublico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		return anoDeLancamento == other.anoDeLancamento && classificacao == other.classificacao
				&& Objects.equals(categoria, other.categoria) && duracao == other.duracao
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeDiretor, other.nomeDiretor)
				&& qtdePublico == other.qtdePublico;
	}
	
	

}
