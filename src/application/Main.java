package application;

import java.util.Scanner;
import entities.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean executando = true;
		

		System.out.println("Bem-vindo ao sistema de ouvidoria da Unifacisa!");
		System.out.println("Digite seu nome: ");
		String nome = input.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpf = input.nextLine();
		Usuario usuario = new Usuario(cpf, nome);
		String descricao = "";
		Ocorrencias ocorrencias = new Ocorrencias();
		
		while (executando) {
			System.out.println("Olá " + usuario.getNome() + "\nDigite um número para selecionar uma opção.");
			System.out.println("1) Registrar Ocorrências" + "\n2) Listar Ocorrências" + "\n3) Sair do sistema");

			int opt = input.nextInt();
			input.nextLine();

			if (opt >= 4 || opt < 1) {
				System.out.println("* Erro! Digite um valor válido. *");
			}else {
				switch (opt) {
				case 1:
					System.out.println("Digite um número para selecionar o tipo de ocorrência:");
					System.out.println("1) Elogio \n2) Reclamação \n3) Sugestão");
					
					int opt2 = input.nextInt();
					input.nextLine();
					
					if (opt2 >= 4 || opt2 < 1) {
						System.out.println("* Erro! Digite um valor válido. *");
					}else {
						switch (opt2) {
						case 1:
							System.out.println("Digite a descrição para o seu elogio:");
							descricao = input.nextLine();
							Ocorrencias elogio = new Elogio("Elogio", descricao, usuario);
							ocorrencias.addOcorrencias(elogio);
							break;
						case 2:
							System.out.println("Digite a descrição para a sua reclamação:");
							descricao = input.nextLine();
							Ocorrencias reclamacao = new Reclamacao("Reclamacao", descricao, usuario);
							ocorrencias.addOcorrencias(reclamacao);
							break;
						case 3:
							System.out.println("Digite a descrição para a sua sugestão:");
							descricao = input.nextLine();
							Ocorrencias sugestao = new Sugestao("Sugestão", descricao, usuario);
							ocorrencias.addOcorrencias(sugestao);
							break;
						}
					}
					break;
				case 2:
					System.out.println("Lista de ocorrências:");
						ocorrencias.listarOcorrencia();
					break;
				case 3:
					input.close();
					executando = false;
					System.out.println("Encerrando...");
					break;
				}
			}

		}
	}

}
