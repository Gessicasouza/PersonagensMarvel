package personagens.marvel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2) Faça um programa que receba do usuário o nome de personagens da Marvel até que o nome Homem de Ferro seja lido.
   Todos devem ser inseridos em um ArrayList e depois exibidos na tela um abaixo do outro.
   Adapte o exercício anterior para que o mesmo, após receber um nome, exiba as informações
   na tela e apresente um menu onde o usuário possa escolher entre as seguintes operações:

   -Digite um nome de personagem para verificar se o mesmo já está cadastrado.
   -Digite o nome do personagem que deseja retirar da lista.
   -Digite o nome do personagem que deseja alterar o nome. 

*/
public class PersonagensMarvel {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		List<String> listaDePersonagens = new ArrayList<String>();

		String nomePersonagem = "";

		while (!nomePersonagem.equalsIgnoreCase("Homem Aranha")) {

			System.out.println("Digite um nome do personagem da Marvel: ");
			nomePersonagem = entrada.nextLine();

			listaDePersonagens.add(nomePersonagem);

		}

		System.out.println("Os personagens da lista são: ");
		for (String string : listaDePersonagens) {
			System.out.println(string);
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Digite 1  para verificar se o personagem já está cadastrado: ");
		System.out.println("Digite 2 para deletar o nome do personagem na lista: ");
		System.out.println("Digite 3 para alterar o nome do personagem na lista: ");
		System.out.println("Digite 4 para visualizar sua lista de personagens: ");
		int opcao = entrada.nextInt();

		if (opcao == 1) {

			Scanner procurarNome = new Scanner(System.in);

			System.out.println("Digite um nome de personagem para verificar se o mesmo já está cadastrado");
			String buscar = procurarNome.nextLine();

			if (listaDePersonagens.contains(buscar) == true) {
				System.out.println(buscar + " cadrastrado na lista");
			} else {
				System.out.println(buscar + " não cadrastrado na lista");
			}

			
		} else if (opcao == 2) {

			Scanner removerNome = new Scanner(System.in);
			String excluiNome = "";
			System.out.println("Digite o nome do personagem que deseja deletar da lista.");
			excluiNome = removerNome.nextLine();

			listaDePersonagens.remove(excluiNome);

			System.out.println("Os personagens da lista atual são: ");
			for (String string : listaDePersonagens) {
				System.out.println(string);
			}

			
		} else if (opcao == 3) {

			Scanner alterandoNome = new Scanner(System.in);

			System.out.println("Digite o nome do personagem que deseja alterar o nome: ");
			String buscarNome = alterandoNome.nextLine();
			int pesquisarNome = listaDePersonagens.indexOf(buscarNome);

			System.out.println("Digite um novo nome: ");
			String  mudançaNome = alterandoNome.nextLine();

			listaDePersonagens.set(pesquisarNome, mudançaNome);

			System.out.println("Os personagens da lista agora são: ");
			for (String string : listaDePersonagens) {
				System.out.println(string);
			}

		} else if (opcao == 4) {

			System.out.println("Os personagens da lista são: ");
			for (String string : listaDePersonagens) {
				System.out.println(string);
			}

		} else {
			System.out.println("Numero inexistente!");
		}

		entrada.close();

	}
}
