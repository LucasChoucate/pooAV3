package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Administrador;
import entidades.AlunoAlgoritmos;
import entidades.AlunoOBI;
import entidades.FreePatinho;
import entidades.Membro;
import entidades.Patinho;
import entidades.Pessoa;

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
		List<Pessoa> lista_pessoa = new ArrayList<>();

		System.out.println("CADASTRO DE MEMBROS DO CLUBE DE PROGRAMAÇÃO");//Menu
		System.out.println("1) Visualizar lista");
		System.out.println("2) Acessar agenda de aulas");
		System.out.println("3) Adicionar membro");
		System.out.println("4) Remover membro");
		System.out.println("5) Adicionar diretor");
		System.out.println("6) Remover diretor");

		int escolhaInt = sc.nextInt();//escolha do menu
		sc.nextLine();
		
		switch(escolhaInt){
		case 1: 
			//VISUALIZAR LISTA
			System.out.println("VISUALIZAR LISTA");
			//for each lista; checar se está vazia
			break;
		case 2:
			//AGENDA DE AULAS
			System.out.println("AGENDA DE AULAS");
			System.out.println("Selecione a opção de acordo com as aulas que você participa.");
			System.out.println("1) Algoritmos");
			System.out.println("2) OBI");
			
			
			int opcao = sc.nextInt();
			sc.nextLine();
			
			AlunoAlgoritmos algoritmos = new AlunoAlgoritmos();
			AlunoOBI obi = new AlunoOBI();
			
			if(opcao == 1) {
				algoritmos.matriculaAula(); //print dos horários de aula do algoritmos
			}else if(opcao == 2) {	
				obi.matriculaAula(); //print dos horários de aula da obi
			}
			break;
		case 3:
			//ADICIONAR MEMBRO
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
			//conversão de data
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
			sc.nextLine();
			
			loop = true;
			//adicionar área de atuaçõ 
			System.out.println("Área de atuação:");
			do {
				System.out.println("1) Adicionar nova área");
				System.out.println("2) Sair");
				escolhaInt = sc.nextInt(); //escolha do menu
				sc.nextLine();		
				
				if(escolhaInt == 1) {
					System.out.println("Digite o setor:");
					String area = sc.nextLine();
					area_atuacao.add(area); //lista de setores em que o membro atua
				} else loop = false;
			}while(loop);
			
			System.out.println("Membro ativo? (S/N)"); //confirmação de membro ativo
			char escolhaChar = sc.nextLine().charAt(0);
			boolean membro_ativo;
			
			if(escolhaChar == 's' || escolhaChar == 'S') {
				membro_ativo = true;
			} else {
				membro_ativo = false;
			}
			
			System.out.println("Participa da membresia? (S/N)");//confirmação da membresia
			escolhaChar = sc.nextLine().charAt(0);
			
			if(escolhaChar == 's' || escolhaChar == 'S') { //cadastro com membresia
				Pessoa membro = new Membro(nome, ra, email, telefone, nascimento, ingresso, curso, new Patinho(), membro_ativo);
				lista_pessoa.add(membro);
			}
				
			else if(escolhaChar == 'n' || escolhaChar == 'N') { //cadastro sem membresia
				Pessoa membro = new Membro(nome, ra, email, telefone, nascimento, ingresso, curso, new FreePatinho(), membro_ativo);
				lista_pessoa.add(membro);
			}
				
			break;
		case 4:
			break;
		case 5:
			System.out.println("ADICIONAR DIRETOR");
			
			System.out.println("Nome:");
			nome = sc.nextLine();

			System.out.println("RA:");
			ra = sc.nextLine();

			System.out.println("Email:");
			email = sc.nextLine();

			System.out.println("Telefone:");
			telefone = sc.nextInt();
			sc.nextLine();

			Boolean loop2;
			//conversão de data
			do {
				try {
					System.out.print("Data de nascimento (dd/MM/yyyy): ");
					nascimento = LocalDate.parse(sc.next(), dtf);
					loop2 = false;
				} catch (DateTimeParseException e) {
					System.out.println("Erro: Data fora do formato!");
					loop2 = true;
				}
			} while (loop2);

			do {
				try {
					System.out.print("Data de ingresso (dd/MM/yyyy): ");
					ingresso = LocalDate.parse(sc.next(), dtf);
					loop2 = false;
				} catch (DateTimeParseException e) {
					System.out.println("Erro: Data fora do formato!");
					loop2 = true;
				}
			} while (loop2);

			System.out.println("Curso:");
			curso = sc.nextLine();
			sc.nextLine();
			
			loop = true;
			//adicionar área de direção
			System.out.println("Área de direção:");
			String area_direcao = sc.nextLine();
			
			//coletar membros que fazem parte do setor 	
			
			System.out.println("Participa da membresia? (S/N)");//confirmação da membresia
			escolhaChar = sc.nextLine().charAt(0);
			
			if(escolhaChar == 's' || escolhaChar == 'S') { //cadastro com membresia
				Pessoa adm = new Administrador(nome, ra, email, telefone, nascimento, ingresso, curso, new Patinho(), area_direcao);
				lista_pessoa.add(adm);
			}
				
			else if(escolhaChar == 'n' || escolhaChar == 'N') { //cadastro sem membresia
				Pessoa adm = new Administrador(nome, ra, email, telefone, nascimento, ingresso, curso, new FreePatinho(), area_direcao);
				lista_pessoa.add(adm);
			}
			break;
			
		}

		sc.close();
	}
}
