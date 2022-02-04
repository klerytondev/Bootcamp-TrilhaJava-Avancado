package trilhaJavaEx02;

public class Books {
	private String titulo;
	private String autor;
	private String editora;
	private int numeroPag;

	public Books() {
	}

	public Books(String titulo, String autor, String editora, int numeroPag) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.numeroPag = numeroPag;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getNumeroPag() {
		return numeroPag;
	}

	public void setNumeroPag(int numeroPag) {
		this.numeroPag = numeroPag;
	}

	@Override
	public String toString() {
		return "titulo: " + titulo + "\nAutor: " + autor + "\nEditora: " + editora + "\nNumero de Páginas=" + numeroPag;
	}
	
	

}
