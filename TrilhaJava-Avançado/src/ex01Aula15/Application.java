package ex01Aula15;

import java.io.BufferedReader;


import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Usando Lambdas e Streams aprendidos em aula, você vai criar um processo de leitura de arquivo, lendo o arquvio “filmes.txt” encaminhado para realizar o exercício.
Necessário criar uma classe Filme para popular os objetos filme, um outro arquivo para importar o arquivo responsável por fazer o papel de leitura e popular o objeto, juntamente com os métodos lambdas/Streams
Um classe processoFilme que mostra os dados processados da classe importaFilme. que consome o arquivo.
* 3 classes são suficiente: faça uma analise se necessário.
* Primeira linha do arquivo (cabeçalho) pode remover para facilitar a leitura.
As Regras são:
->Listar todos os Filmes
->Listar todos os Filmes do ano de 2021
->Listar o Filme de maior bilheteria
->Agrupar por nome do Diretor
->Agrupar por Categoria
->Calcular média da classificação de todos os filmes
->Calcular média Público de todos os filmes
 * 
 * @Kleryton de Souza
 * 
 * */

public class Application {

	public static void main(String[] args) {

		FilmesProcessados filmesProcessados = new FilmesProcessados();
		String nomeArquivo = "C:\\Users\\55839\\Desktop\\GitHub\\STS - GitHub\\Bootcamp-TrilhaJava-Avancado\\TrilhaJava-Avançado\\src\\ex01Aula15\\filmes.txt";

		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));

			String linha;

			while ((linha = bufferedReader.readLine()) != null) {
				// Esse linha quebra em dados separado por ;
				List<String> dados = new ArrayList<>(Arrays.asList(linha.split(";")));

				Filme filme = new Filme();
				filme.setNome(Normalizer.normalize(dados.get(0), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", ""));
				filme.setNomeDiretor(
						Normalizer.normalize(dados.get(1), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", ""));
				filme.setCategoria(Normalizer.normalize(dados.get(2), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", ""));
				filme.setDuracao(Integer.valueOf(dados.get(3)));
				filme.setAnoDeLancamento(Integer.valueOf(dados.get(4)));
				filme.setClassificacao(Integer.valueOf(dados.get(5)));
				filme.setQtdePublico(Integer.valueOf(dados.get(6)));
				filmesProcessados.addProcessamentoFilmes(filme);
			}

			bufferedReader.close();
		}

		catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}

		System.out.println("Listagem de todos os Filmes:");

		filmesProcessados.saidaFilmes().forEach(System.out::println);

		System.out.println();

		System.out.println("Listagem Filmes do ano de 2021:\n");

		List<Filme> filmes21 = filmesProcessados.saidaFilmes().stream().filter(p -> p.getAnoDeLancamento() == 2021)
				.collect(Collectors.toList());

		for (Filme filme : filmes21) {
			System.out.println(filme);
		}
		System.out.println();

		System.out.println("Listagem Filme de maior bilheteria:\n");

		Filme maiorBileteria = filmesProcessados
				.saidaFilmes()
				.stream().max(Comparator.comparing(Filme::getQtdePublico)).get();
				
			System.out.println(maiorBileteria);

		System.out.println();

		System.out.println("Listagem Filme Agrupado por nome do Diretor:\n");

		List<Filme> agrupamentoPorDiretor = filmesProcessados.saidaFilmes().stream().sorted((p1, p2) -> p1
				.getNomeDiretor().compareTo(p2.getNomeDiretor())).collect(Collectors.toList());
		
		for (Filme filme : agrupamentoPorDiretor) {
			System.out.println(filme);
			
		}
		
		System.out.println();
		
		System.out.println("Listagem Filme Agrupado por categoria:\n");
		
		List<Filme> agrupamentoPorCategoria = filmesProcessados.saidaFilmes().stream().sorted((p1, p2) -> p1
				.getNomeDiretor().compareTo(p2.getCategoria())).collect(Collectors.toList());
		
		for (Filme filme : agrupamentoPorCategoria) {
			System.out.println(filme);
			
		}
		
		System.out.println();
		
		System.out.println("Calculo media da classificacao com todos os filmes:\n");
		
		Double mediaClassificacao = filmesProcessados.saidaFilmes().stream().mapToDouble(Filme::getClassificacao)
				.average().getAsDouble();
		
		System.out.println(mediaClassificacao);
		
		
	
	System.out.println();
	
	System.out.println("Calculo media Público de todos os filmes:\n");
	
	Double mediaPublicoo = filmesProcessados.saidaFilmes().stream().mapToDouble(Filme::getQtdePublico)
			.average().getAsDouble();
	
	System.out.println(mediaPublicoo);
	
	}
}


