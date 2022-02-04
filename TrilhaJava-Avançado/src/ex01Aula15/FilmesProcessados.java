package ex01Aula15;

import java.util.ArrayList;
import java.util.List;

public class FilmesProcessados {

	private List<Filme> filmesProcessados = new ArrayList<>();

	public List<Filme> getFilmesProcessados() {
		return filmesProcessados;
	}

	public void setFilmesProcessados(List<Filme> filmesProcessados) {
		this.filmesProcessados = filmesProcessados;
	}

	public void addFilmes(Filme filme) {

		this.filmesProcessados.add(filme);
	}

	public void retornoDeVideosProcessados() {
		System.out.println(filmesProcessados);
	}

}
