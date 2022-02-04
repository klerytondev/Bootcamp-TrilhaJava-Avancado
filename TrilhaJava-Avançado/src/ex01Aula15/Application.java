package ex01Aula15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		String nomeArquivo = "C:\\Users\\55839\\git\\Bootcamp-TrilhaJava-Avancado\\TrilhaJava-Avançado\\src\\ex01Aula15";

		List<Filme> filmes = new ArrayList<>();

		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));

			String linha;

			while ((linha = bufferedReader.readLine()) != null) {
				// Esse linha quebra em dados separado por ;
				List<String> dados = new ArrayList<>(Arrays.asList(linha.split(";")));

				Filme filme = new Filme();
				filme.setNome(dados.get(0));
				filme.setNomeDiretor(dados.get(1));
				filme.setDocumentario(dados.get(2));
				filme.setDuracao(Integer.valueOf(dados.get(3)));
				filme.setAnoDeLancamento(Integer.valueOf(dados.get(4)));
				filme.setClassificacao(Integer.valueOf(dados.get(5)));
				filme.setQtdePublico(Integer.valueOf(dados.get(6)));
				filmes.add(filme);

			}

			bufferedReader.close();

		}

		catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
	}
}
