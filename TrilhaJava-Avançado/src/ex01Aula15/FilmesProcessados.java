package ex01Aula15;

import java.util.ArrayList;
import java.util.List;

public class FilmesProcessados {

	private List<Filme> processamentoFilmes = new ArrayList<>();

	public List<Filme> saidaFilmes() {
		return processamentoFilmes;
	}

	public void addProcessamentoFilmes(Filme Filmes) {
		processamentoFilmes.add(Filmes);
	}

	@Override
	public String toString() {
		return "FilmesProcessados [processamentoFilmes=" + processamentoFilmes + "]";
	}

}
