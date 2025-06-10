package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import entidades.Administrador;
import entidades.Diretor;
import entidades.Membro;
import servicos.FreePatinho;
import servicos.Patinho;

public class Programa {
	
	public static void Iniciar(List<Administrador> lista_administrador, DateTimeFormatter dtf) {
		
		// DIRETORES
		
		lista_administrador.add(new Diretor(
		        "Camila Rocha",  "12", "c.rocha@gmail.com",     912345678,
		        LocalDate.parse("10/02/2004", dtf), LocalDate.parse("15/02/2025", dtf),
		        "Eng. Computação", new Patinho(), "Marketing"
		    ));
		    lista_administrador.add(new Diretor(
		        "Marcos Ramalho", "14", "m.ramalho@gmail.com",   923456781,
		        LocalDate.parse("22/08/2002", dtf), LocalDate.parse("01/03/2025", dtf),
		        "Eng. Computação", new Patinho(), "Financeiro"
		    ));
		    lista_administrador.add(new Diretor(
		        "Caio Povoas",    "2", "c.povoas@gmail.com",     934567812,
		        LocalDate.parse("05/11/2005", dtf), LocalDate.parse("20/03/2025", dtf),
		        "Eng. Computação", new Patinho(), "Projetos"
		    ));
		    lista_administrador.add(new Diretor(
		        "Maria Fernanda Ribeiro","16","m.ribeiro@gmail.com",   945678123,
		        LocalDate.parse("30/06/2006", dtf), LocalDate.parse("10/04/2025", dtf),
		        "Eng. Computação", new Patinho(), "Vice Presidente"
		    ));
		    lista_administrador.add(new Diretor(
		        "Lucas Choucate", "9", "l.choucate@gmail.com",   956781234,
		        LocalDate.parse("12/12/2002", dtf), LocalDate.parse("05/05/2025", dtf),
		        "Eng. Computação", new Patinho(), "Presidente"
		    ));
		    lista_administrador.add(new Diretor(
		        "Eric Carneiro",  "3", "e.carneiro@gmail.com",   967812345,
		        LocalDate.parse("17/03/2003", dtf), LocalDate.parse("25/05/2025", dtf),
		        "Eng. Computação", new Patinho(), "Eventos Esportivos"
		    ));
		    lista_administrador.add(new Diretor(
		        "Eulália Ribeiro","17","e.ribeiro@gmail.com",    978123456,
		        LocalDate.parse("08/09/2004", dtf), LocalDate.parse("30/06/2025", dtf),
		        "Eng. Computação", new Patinho(), "Eventos Sociais"
		    ));
		    lista_administrador.add(new Diretor(
		        "Pedro Tanajura", "7", "p.tanajura@gmail.com",   989234567,
		        LocalDate.parse("25/01/2005", dtf), LocalDate.parse("10/06/2025", dtf),
		        "Eng. Computação", new FreePatinho(), "Estagiario"
		    ));
		    lista_administrador.add(new Diretor(
		        "Matheus Garrido","1", "m.garrido@gmail.com",    991345678,
		        LocalDate.parse("03/04/2006", dtf), LocalDate.parse("15/01/2025", dtf),
		        "Eng. Computação", new Patinho(), "Aulas"
		    ));

	    // MEMBROS
	    
		    List<String> areas;

		    areas = new ArrayList<>();
		    areas.add("Marketing");
		    lista_administrador.add(new Membro(
		        "Henrique Vieira","8", "h.vieira@gmail.com",   992456789,
		        LocalDate.parse("14/07/2002", dtf), LocalDate.parse("05/01/2025", dtf),
		        "Eng. Computação", new Patinho(), areas
		    ));

		    areas = new ArrayList<>();
		    areas.add("Marketing");
		    lista_administrador.add(new Membro(
		        "Felipe Nogueira","4", "f.nogueira@gmail.com", 993567812,
		        LocalDate.parse("24/04/2003", dtf), LocalDate.parse("12/02/2025", dtf),
		        "Eng. Computação", new Patinho(), areas
		    ));

		    areas = new ArrayList<>();
		    areas.add("Projetos");
		    lista_administrador.add(new Membro(
		        "Ramon Papes",   "13","r.papes@gmail.com",     994678123,
		        LocalDate.parse("01/01/2004", dtf), LocalDate.parse("20/03/2025", dtf),
		        "Eng. Computação", new FreePatinho(), areas
		    ));

		    areas = new ArrayList<>();
		    areas.add("Eventos Sociais");
		    areas.add("Eventos Esportivos");
		    areas.add("Projetos");
		    lista_administrador.add(new Membro(
		        "Beatriz Mourino","6", "b.mourino@gmail.com",  995781234,
		        LocalDate.parse("11/11/2005", dtf), LocalDate.parse("18/04/2025", dtf),
		        "Eng. Computação", new FreePatinho(), areas
		    ));

		    areas = new ArrayList<>();
		    areas.add("Marketing");
		    lista_administrador.add(new Membro(
		        "Guilherme Duque","10","g.duque@gmail.com",     996892345,
		        LocalDate.parse("22/02/2006", dtf), LocalDate.parse("02/05/2025", dtf),
		        "Eng. Computação", new Patinho(), areas
		    ));

		    areas = new ArrayList<>();
		    areas.add("Eventos Sociais");
		    areas.add("Eventos Esportivos");
		    lista_administrador.add(new Membro(
		        "Matheus Sobral", "11","m.sobral@gmail.com",    997903456,
		        LocalDate.parse("05/05/2002", dtf), LocalDate.parse("10/06/2025", dtf),
		        "Eng. Computação", new Patinho(), areas
		    ));

		    areas = new ArrayList<>();
		    areas.add("Financeiro");
		    lista_administrador.add(new Membro(
		        "Beatriz Araújo", "15","b.araujo@gmail.com",    998014567,
		        LocalDate.parse("17/07/2003", dtf), LocalDate.parse("15/06/2025", dtf),
		        "Eng. Computação", new FreePatinho(), areas
		    ));

		    areas = new ArrayList<>();
		    areas.add("Aulas");
		    lista_administrador.add(new Membro(
		        "Rafael Cezimbra","18","r.cezimbra@gmail.com",  999125678,
		        LocalDate.parse("30/09/2004", dtf), LocalDate.parse("20/06/2025", dtf),
		        "Eng. Computação", new Patinho(), areas
		    ));

		    areas = new ArrayList<>();
		    areas.add("Aulas");
		    lista_administrador.add(new Membro(
		        "Yasmin Queiroz", "5", "y.queiroz@gmail.com",   990236789,
		        LocalDate.parse("09/09/2006", dtf), LocalDate.parse("25/03/2025", dtf),
		        "Eng. Computação", new Patinho(), areas
		    ));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String nome;
		String ra;
		String email;
		int telefone;
		LocalDate nascimento = null;
		LocalDate ingresso = null;
		String curso;
		
		List<Administrador> lista_administrador = new ArrayList<>();
		
		Iniciar(lista_administrador, dtf); // Chama função para setar 7 diretores e 7 membros ja preestabelecidos
		
		boolean loopPrincipal = true;
		int i, j;
		
		do { // Loop principal do sistema
			List<String> area_atuacao = new ArrayList<>();
			
			System.out.println("CADASTRO DE ADMINISTRADORES DO CLUBE DE PROGRAMAÇÃO"); // Menu
			System.out.println("1) Visualizar");
			System.out.println("2) Adicionar");
			System.out.println("3) Remover");
			System.out.println("4) Buscar");
			System.out.println("5) Editar");
			System.out.println("6) Ordenar");
			System.out.println("7) Membresia");
			System.out.println("0) Sair");
			

			int escolhaInt = sc.nextInt();
			sc.nextLine();
			
			switch(escolhaInt) { // Switch case do menu
				case 0: // Sair do loop principal
					loopPrincipal = false;
				break;
				
				case 1: // Visualizar lista
					System.out.println("VISUALIZAR LISTA");
					System.out.println();
					
					if(lista_administrador.isEmpty()) { // Verifica se a lista está vazia
						System.out.println("Ainda não há membros cadastrados.");
						System.out.println();
						break;
					} 
					
					i = 1;
					for(Administrador integrantes : lista_administrador) {
						System.out.print((i) + ") ");
						System.out.println(integrantes);
						i++;
					}
					System.out.println();
				break;
				
				case 2: // Adicionar administrador
					System.out.println("Deseja cadastrar um diretor ou um membro?");
					System.out.println("1) Diretor");
					System.out.println("2) Membro");
					System.out.println("0) Sair");
					int DM = sc.nextInt();
					sc.nextLine();
					
					if(DM == 0) break; // DM = 1 (DIRETOR) ; DM = 2 (MEMBRO)
					
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
		
					sc.nextLine();
					System.out.println("Curso:");
					curso = sc.nextLine();
					
					System.out.println("Participa da membresia? (S/N)");
					char escolhaChar = sc.nextLine().charAt(0);
					
					if(DM == 1) { // Adiciona diretor
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
					else { // Adiciona membro
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
					System.out.println();
				break;
				
				case 3: // Remover administrador
					System.out.println("REMOVER ADMINISTRADOR");
					System.out.println();
					j = 0;
					
					if(lista_administrador.isEmpty()) { // Verifica se a lista está vazia
						System.out.println("Ainda não há membros cadastrados."); 
						System.out.println();
						break;
					}
					
					for(Administrador adm : lista_administrador) { // Printa todos adms cadastrados
							System.out.print((j+1) + ") ");
							System.out.println(adm);
					}
					
					System.out.println();
					System.out.println("Digite o nome de quem deseja remover ou 'sair':");
					String remove = sc.nextLine();
					
					if(remove.equalsIgnoreCase("sair") || remove.equalsIgnoreCase("Sair") || remove.equalsIgnoreCase("SAIR")) break;
					lista_administrador.removeIf(adm -> adm.getNome().equals(remove));
					System.out.println();
				break;
				
				case 4: // Buscar adm
					System.out.println("BUSCAR ADMINISTRADOR");
					System.out.println();
					int cadastrado = 0;
					
					if(lista_administrador.isEmpty()) { // Verifica se a lista está vazia
						System.out.println("Ainda não há membros cadastrados."); 
						System.out.println();
						break;
					}
					
					System.out.println("Digite o RA do administrador:");
					ra = sc.nextLine();
					for(Administrador adm : lista_administrador) { // Loop de busca passando cada adm cadastrado
						if(adm.buscarRA(adm, ra) != null) { // Verifica se o RA do adm atual é igual ao solicitado
							cadastrado = 1;
							System.out.println("Administrador: " + adm);
							break; // Caso o adm seja encontrado, o loop se encerra
						}
					}
					if(cadastrado == 0) System.out.println("RA não encontrado"); // Caso não ache nenhum adm com o RA solicitado
					System.out.println();
				break;
				
				case 5: // Editar adm
					System.out.println("EDITAR ADMINISTRADOR");
					System.out.println();
					Administrador adm_editado = null;

					if(lista_administrador.isEmpty()) { // Verifica se a lista está vazia
						System.out.println("Ainda não há membros cadastrados.");
						System.out.println();
						break;
					} 
					
					System.out.println("Deseja editar um diretor ou um membro?");
					System.out.println("1) Diretor");
					System.out.println("2) Membro");
					DM = sc.nextInt();
					sc.nextLine();
					
					i = 1;
					for (Administrador adm : lista_administrador) {
						if((DM == 1 && adm instanceof Diretor) || (DM == 2 && adm instanceof Membro)) { // Confere qual a classe para que printe apenas os que o usuário queira editar
							System.out.print(i + ") ");
					        System.out.println(adm);
					        i++;
					    }
					}
					
					System.out.println();
					System.out.println("Digite o nome de quem deseja editar ou 'sair':");
					String nome_do_editado = sc.nextLine();
					
					if(nome_do_editado.equalsIgnoreCase("sair") || nome_do_editado.equalsIgnoreCase("Sair") || nome_do_editado.equalsIgnoreCase("SAIR")) break;
					
					System.out.println("Escolha o que deseja editar:"); // Menu editar adm
					System.out.println("1) Nome");
					System.out.println("2) RA");
					System.out.println("3) Email");
					System.out.println("4) Telefone");
					System.out.println("5) Data de nascimento (dd/MM/yyyy)");
					System.out.println("6) Data de ingresso (dd/MM/yyyy)");
					System.out.println("7) Curso");
					System.out.println("8) Membresia");
					if(DM == 1) { // Se for diretor, menu possui a opção de área de direção
						System.out.println("9) Área de direção");
						adm_editado = new Diretor();
					}
					if(DM == 2) { // Se for membro, menu possui a opção de área de atuação
						System.out.println("9) Área de atuação");
						adm_editado = new Membro();
					}
					
					escolhaInt = sc.nextInt();
					sc.nextLine();
					
					for(Administrador adm : lista_administrador) { // Criar um "novo" adm para edita-lo e depois fazer com que o adm antigo o receba
						if(nome_do_editado.equalsIgnoreCase(adm.getNome())) {
							adm_editado = adm; //Adm "novo" recebe adm "antigo"
							break;
						}
					}
					
					switch(escolhaInt) {
						case 1:
							System.out.println("Digite o novo nome:");
							nome = sc.nextLine();
							adm_editado.setNome(nome);
						break;
						
						case 2:
							System.out.println("Digite o novo RA:");
							ra = sc.nextLine();
							adm_editado.setRa(ra);
						break;
						
						case 3:
							System.out.println("Digite o novo email:");
							email = sc.nextLine();
							adm_editado.setEmail(email);
						break;
						
						case 4:
							System.out.println("Digite o novo telefone:");
							telefone = sc.nextInt();
							sc.nextLine();
							adm_editado.setTelefone(telefone);
						break;
						
						case 5:
							do { // Loop para scanear e verificar se a data segue o formato
								try {
									System.out.print("Digite a nova data de nascimento (dd/MM/yyyy): ");
									nascimento = LocalDate.parse(sc.next(), dtf);
									loop = false;
								} catch (DateTimeParseException e) {
									System.out.println("Erro: Data fora do formato!");
									loop = true;
								}
							} while (loop);
							adm_editado.setNascimento(nascimento);
						break;
						
						case 6:
							do { // Loop para scanear e verificar se a data segue o formato
								try {
									System.out.print("Digite a nova data de ingresso (dd/MM/yyyy): ");
									ingresso = LocalDate.parse(sc.next(), dtf);
									loop = false;
								} catch (DateTimeParseException e) {
									System.out.println("Erro: Data fora do formato!");
									loop = true;
								}
							} while (loop);
							adm_editado.setIngresso(ingresso);
						break;
						
						case 7:
							System.out.println("Digite o novo curso:");
							curso = sc.nextLine();
							adm_editado.setCurso(curso);
						break;
						
						case 8:
							System.out.println("Digite se é membro: (S/N)");
							escolhaChar = sc.nextLine().charAt(0);
							
							if(escolhaChar == 's' || escolhaChar == 'S') {
								adm_editado.setMembresia(new Patinho());
							}
							else {
								adm_editado.setMembresia(new FreePatinho());
							}
						break;
						
						case 9:
							if(DM == 1) {
								System.out.println("Digite a nova área de direção");
								String area_direcao = sc.nextLine();
								((Diretor) adm_editado).setArea_direcao(area_direcao); // Downcast
							}
							else {
								List<String> novas_area_atuacao = new ArrayList<>(); // Ojeto novo, logo as áreas antigas foram perdidas
								loop = true;
								
								System.out.println("Todas áreas foram resetadas!"); // Explica o reset das áreas para o usuário
								do { // Loop para cadastro de todas áreas de atuação
									System.out.println("Área de atuação:");
									System.out.println("1) Adicionar nova área");
									System.out.println("0) Sair");
									escolhaInt = sc.nextInt();
									sc.nextLine();	
									
									if(escolhaInt == 1) {
										System.out.println("Digite o setor:");
										String area = sc.nextLine();
										novas_area_atuacao.add(area); // Lista de setores em que o membro atua
									} else loop = false;
								} while(loop);
								
								((Membro) adm_editado).setArea_atuacao(novas_area_atuacao); // Downcast
							}
						break;
				}
				
				for(Administrador adm : lista_administrador) {
					if(nome_do_editado.equalsIgnoreCase(adm.getNome())) {
						adm = adm_editado; // Adm "antigo" recebe adm "novo" com as modificações
						break;
					}
				}
					
				break;
				
				case 6: // Ordernar adm's
					System.out.println("ORDENAR ADMINISTRADORES");
					System.out.println("1) Por nome (A-Z)");
					System.out.println("2) Por data de ingresso (crescente)");
					System.out.println("0) Sair");
					escolhaInt = sc.nextInt();
					sc.nextLine();
					
					List<Administrador> lista_administrador_ordenada = new ArrayList<>(lista_administrador); // Cria nova lista para que a original não se perca

					switch (escolhaInt) {
						case 1:
							lista_administrador_ordenada.sort(Comparator.comparing(Administrador::getNome)); // Ordena por nome
							System.out.println("Lista ordenada por nome.\n");
						break;

						case 2:
							lista_administrador_ordenada.sort(Comparator.comparing(Administrador::getIngresso)); // Ordena por data de ingresso
							System.out.println("Lista ordenada por data de ingresso.\n");
						break;

						case 0:
						break;

						default:
							System.out.println("Opção inválida.\n");
						break;
					}
					
					if(lista_administrador_ordenada.isEmpty()) { // Verifica se a lista está vazia
						System.out.println("Ainda não há membros cadastrados.");
						System.out.println();
						break;
					} 
					
					i = 1;
					for(Administrador integrantes : lista_administrador_ordenada) { // Print final da lista ordenada
						System.out.print((i) + ") ");
						System.out.println(integrantes);
						i++;
					}
					System.out.println();
					
				break;
				
				case 7:
					System.out.println("VERIFICAR PREÇO DA MEMBRESIA");
					System.out.println();
					
					if(lista_administrador.isEmpty()) { // Verifica se a lista está vazia
						System.out.println("Ainda não há membros cadastrados."); 
						System.out.println();
						break;
					}
					
					System.out.println("Digite o nome do administrador para conferir o pagamento semestral:");
					String nome_membresia = sc.nextLine();
					
					cadastrado = 0;
					
					for(Administrador adm : lista_administrador) {
						if(nome_membresia.equalsIgnoreCase(adm.getNome())) {
							cadastrado = 1;
							System.out.println("Preço semestral: R$ " + adm.getMembresia().TaxaMensal());
						}
					}
					
					if(cadastrado == 0) System.out.println("RA não encontrado"); // Caso não ache nenhum adm com o RA solicitado
					System.out.println();
				break;
			}
			
		} while(loopPrincipal);
		
		sc.close();
	}
}
