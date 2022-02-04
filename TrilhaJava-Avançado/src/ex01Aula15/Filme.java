package ex01Aula15;

public class Filme {

	private String nome;
	private String nomeDiretor;
	private String documentario;
	private int duracao;
	private int anoDeLancamento;
	private int classificacao;
	private int qtdePublico;
	
	public Filme() {
		// TODO Auto-generated constructor stub
	}

	public Filme(String nome, String nomeDiretor, String documentario, int duracao, int anoDeLancamento,
			int classificacao, int qtdePublico) {
		super();
		this.nome = nome;
		this.nomeDiretor = nomeDiretor;
		this.documentario = documentario;
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

	public String getDocumentario() {
		return documentario;
	}

	public void setDocumentario(String documentario) {
		this.documentario = documentario;
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

}
