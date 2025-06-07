package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Administrador;
import entidades.Diretor;
import entidades.FreePatinho;
import entidades.Membro;
import entidades.Patinho;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String nome;
		String ra;
		String email;
		Integer telefone;
		LocalDate nascimento = null;
		LocalDate ingresso = null;
		String curso;
		
		List<Administrador> lista_administrador = new ArrayList<>();

		boolean loopPrincipal = true;
		
		do { // Loop principal do sistema
			List<String> area_atuacao = new ArrayList<>();
			
			System.out.println("CADASTRO DE ADMINISTRADORES DO CLUBE DE PROGRAMAÇÃO");
			System.out.println("1) Visualizar");
			System.out.println("2) Adicionar");
			System.out.println("3) Remover");
			System.out.println("4) Buscar");
			System.out.println("0) Sair");
			

			int escolhaInt = sc.nextInt();
			sc.nextLine();
			
			switch(escolhaInt) {
				case 0: // Sair do loop principal
					loopPrincipal = false;
				break;
				
				case 1: // Visualizar lista
					System.out.println("VISUALIZAR LISTA");
					int i = 0;
					
					if(lista_administrador.equals(null)) { // Verifica se a lista está vazia
						System.out.println("Ainda não há membros cadastrados.");
						break;
					} 
					for(Administrador integrantes : lista_administrador) {
						System.out.print((i+1) + ") ");
						System.out.println(integrantes);
					}
				break;
				
				case 2: // Adicionar administrador
					System.out.println("Deseja cadastrar um diretour ou um membro?");
					System.out.println("1) Diretor");
					System.out.println("2) Membro");
					int DM = sc.nextInt();
					sc.nextLine();
					
					if(DM == 1) {
						System.out.println("ADICIONAR DIRETOR");
					} 
					else {
						System.out.println("ADICIONAR MEMBRO");
					}
					
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
					do { // Loop para scanear e verificar se a data segue o formato
						try {
							System.out.print("Data de nascimento (dd/MM/yyyy): ");
							nascimento = LocalDate.parse(sc.next(), dtf);
							loop = false;
						} catch (DateTimeParseException e) {
							System.out.println("Erro: Data fora do formato!");
							loop = true;
						}
					} while (loop);
		
					do { // Loop para scanear e verificar se a data segue o formato
						try {
							System.out.print("Data de ingresso (dd/MM/yyyy): ");
							ingresso = LocalDate.parse(sc.next(), dtf);
							loop = false;
						} catch (DateTimeParseException e) {
							System.out.println("Erro: Data fora do formato!");
							loop = true;
						}
					} while (loop);
		
					sc.nextLine();
					System.out.println("Curso:");
					curso = sc.nextLine();
					
					System.out.println("Participa da membresia? (S/N)");
					char escolhaChar = sc.nextLine().charAt(0);
					
					if(DM == 1) {
						System.out.println("Digite a área de direção:");
						String area = sc.nextLine();
						
						if(escolhaChar == 's' || escolhaChar == 'S') { // Cadastro com membresia
							Administrador diretor = new Diretor(nome, ra, email, telefone, nascimento, ingresso, curso, new Patinho(), area);
							lista_administrador.add(diretor);
						}
							
						else if(escolhaChar == 'n' || escolhaChar == 'N') { // Cadastro sem membresia
							Administrador diretor = new Diretor(nome, ra, email, telefone, nascimento, ingresso, curso, new FreePatinho(), area);
							lista_administrador.add(diretor);
						}
					}
					else {
						loop = true;
						do { // Loop para cadastro de todas áreas de atuação
							System.out.println("Área de atuação:");
							System.out.println("1) Adicionar nova área");
							System.out.println("0) Sair");
							escolhaInt = sc.nextInt();
							sc.nextLine();		
							
							if(escolhaInt == 1) {
								System.out.println("Digite o setor:");
								String area = sc.nextLine();
								area_atuacao.add(area); // Lista de setores em que o membro atua
							} else loop = false;
						} while(loop);
						
						if(escolhaChar == 's' || escolhaChar == 'S') { // Cadastro com membresia
							Administrador membro = new Membro(nome, ra, email, telefone, nascimento, ingresso, curso, new Patinho(), area_atuacao);
							lista_administrador.add(membro);
						}
							
						else if(escolhaChar == 'n' || escolhaChar == 'N') { // Cadastro sem membresia
							Administrador membro = new Membro(nome, ra, email, telefone, nascimento, ingresso, curso, new FreePatinho(), area_atuacao);
							lista_administrador.add(membro);
						}
					}		
				break;
				
				case 3: // Remover administrador
					System.out.println("REMOVER ADMINISTRADOR");
					int j = 0;
					
					if(lista_administrador.isEmpty()) { // Verifica se a lista está vazia
						System.out.println("Ainda não há membros cadastrados."); 
						break;
					}
					
					for(Administrador adm : lista_administrador) { // Printa todos adms cadastrados
							System.out.print((j+1) + ") ");
							System.out.println(adm);
					}
					
					System.out.println("Escolha quem deseja remover:");
					String remove = sc.nextLine();
					
					lista_administrador.removeIf(adm -> adm.getNome().equals(remove));
				break;
				
				case 4: // Buscar aluno
					int cadastrado = 0;
					
					System.out.println("Digite o RA do aluno:");
					ra = sc.nextLine();
					for(Administrador adm : lista_administrador) { // Loop de busca passando cada adm cadastrado
						if(adm.buscarRA(adm, ra) != null) { // Verifica se o RA do adm atual é igual ao solicitado
							cadastrado = 1;
							System.out.println("Aluno: " + adm);
							break; // Caso o aluno seja encontrado, o loop se encerra
						}
					}
					if(cadastrado == 0) System.out.println("RA não encontrado"); // Caso não ache nenhum adm com o RA solicitado
				break;
			}
			
		} while(loopPrincipal);
		
		sc.close();
	}
}
