package trilhaJavaEx02;

import java.util.Scanner;

/*
 * 
 * Cria um Sistema de biblioteca com os seguintes pontos:
Criar menu:

Cadastrar Livros
Pesquisas livro
Sair

Livro deve ter: Título, Autor, Editora, Número de páginas
A Pesquisa do Livro deve ser feita pelo Titulo (Não precisa ser uma parte especifica do texto do titulo, pode ser todo o titulo), mas fique tranquilo para usar o recurso para buscar um livro por uma parte do titulo.
Caso não encontrado o livro mostrar “Titulo não Encontrado”

 * 
 * @Kleryton de Souza
 * 
 * */

public class Application {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("-----------------------------------------------------");
			System.out.println("BEM VINDO A SUA BIBLIOTECA");
			System.out.println("-----------------------------------------------------");
			
			Userful userful = new Userful();		
			
			userful.cadastroLivros();
			
			sc.close();
		}


}
