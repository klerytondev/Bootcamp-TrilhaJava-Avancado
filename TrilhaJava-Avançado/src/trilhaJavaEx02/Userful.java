package trilhaJavaEx02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Userful {

	Scanner sc = new Scanner(System.in);

	int op;

	public void cadastroLivros() {

		Map<String, Books> mapaLivros = new HashMap<>();

		op = selecionaOpcao();

		if (op == 1 || op == 2) {

			do {
				switch (op) {
				case 1:
					System.out.println("=======================================");
					System.out.print("Digite o nome do livro: ");
					String nomeLivro = sc.nextLine();
					System.out.print("Digite o autor do livro: ");
					String autorLivro = sc.nextLine();
					System.out.print("Digite a editora do livro: ");
					String editoraLivro = sc.nextLine();
					System.out.println("Digite o numero de paginas do livro: ");
					int paginasLivro = sc.nextInt();
					System.out.println("=======================================");
					Books livros = new Books(nomeLivro, autorLivro, editoraLivro, paginasLivro);
					mapaLivros.put(livros.getTitulo(), livros);
					break;

				case 2:
					System.out.println("Digite o nome do titulo a ser pesquisado: ");
					String titulo = sc.nextLine();
					System.out.println();
					for (Map.Entry<String, Books> entry : mapaLivros.entrySet()) {
						if (titulo.equalsIgnoreCase(entry.getValue().getTitulo().toString())) {
							System.out.println(entry.getValue());
						} else
							System.out.println("Titulo não encontado!");
						System.out.println("=======================================");
						break;
					}
					break;
				}
				op = selecionaOpcao();

			} while (op != 0);

			System.out.print("Você saiu!");

		} else if(op < 0 || op > 2) {
			System.out.println("Entrada inválida!");
		}
		System.out.println("Fim do programa...");
	}

	private int selecionaOpcao() {
		int opcao;
		try {
			System.out.println("Digite 01 para novo livro. ");
			System.out.println("Digite 02 para consultar livro. ");
			System.out.println("Digite 0 para sair. ");
			System.out.println("-----------------------------------------------------");
			opcao = sc.nextInt();
			sc.nextLine();
				return opcao;
		} catch (Exception e) {
			System.out.println("Você não digitou uma opção válida!");
			e.printStackTrace();
			return 0;
		}

	}
}
