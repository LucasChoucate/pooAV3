package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.FreePatinho;
import entidades.Membro;
import entidades.Patinho;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		String ra;
		String email;
		Integer telefone;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate nascimento = null;
		LocalDate ingresso = null;
		String curso;
		List<String> area_atuacao = new ArrayList<>();

		System.out.println("CADASTRO DE MEMBROS DO CLUBE DE PROGRAMAÇÃO");
		System.out.println("1) Visualizar lista");
		System.out.println("2) Adicionar membro");
		System.out.println("3) Remover membro");
		System.out.println("4) Adicionar diretor");
		System.out.println("5) Remover diretor");

		int escolhaInt = sc.nextInt();
		sc.nextLine();
		
		switch(escolhaInt){
		case 1:
			System.out.println("VISUALIZAR LISTA");
			//for each lista; checar se está vazia
			break;
		case 2:
			System.out.println("ADICIONAR MEMBRO");
			
			System.out.println("Nome:");
			nome = sc.nextLine();

			System.out.println("RA:");
			ra = sc.nextLine();

			System.out.println("Email:");
			email = sc.nextLine();

			System.out.println("Telefone:");
			telefone = sc.nextInt();
			sc.nextLine();

			Boolean loop;
			do {
				try {
					System.out.print("Data de nascimento (dd/MM/yyyy): ");
					nascimento = LocalDate.parse(sc.next(), dtf);
					loop = false;
				} catch (DateTimeParseException e) {
					System.out.println("Erro: Data fora do formato!");
					loop = true;
				}
			} while (loop);

			do {
				try {
					System.out.print("Data de ingresso (dd/MM/yyyy): ");
					ingresso = LocalDate.parse(sc.next(), dtf);
					loop = false;
				} catch (DateTimeParseException e) {
					System.out.println("Erro: Data fora do formato!");
					loop = true;
				}
			} while (loop);

			System.out.println("Curso:");
			curso = sc.nextLine();
			
			loop = true;
			
			System.out.println("Área de atuação:");
			do {
				System.out.println("1) Adicionar nova área");
				System.out.println("2) Sair");
				escolhaInt = sc.nextInt();
				sc.nextLine();				
				if(escolhaInt == 1) {
					String area = sc.nextLine();
					area_atuacao.add(area);
				} else loop = false;
			}while(loop);
			
			System.out.println("Membro ativo? (S/N)");
			char escolhaChar = sc.nextLine().charAt(0);
			boolean membro_ativo;
			
			if(escolhaChar == 's' || escolhaChar == 'S') {
				membro_ativo = true;
			} else {
				membro_ativo = false;
			}
			
			System.out.println("Participa da membresia? (S/N)");
			escolhaChar = sc.nextLine().charAt(0);
			
			if(escolhaChar == 's' || escolhaChar == 'S') { //cadastro com membresia
				Membro membro = new Membro(nome, ra, email, telefone, nascimento, ingresso, curso, new Patinho(), membro_ativo);
			}
				
			else if(escolhaChar == 'n' || escolhaChar == 'N') { //cadastro sem membresia
				Membro membro = new Membro(nome, ra, email, telefone, nascimento, ingresso, curso, new FreePatinho(), membro_ativo);
			}
				
			break;
		}

		sc.close();
	}
}
