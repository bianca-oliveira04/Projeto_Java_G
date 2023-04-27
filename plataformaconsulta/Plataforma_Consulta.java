package plataformaconsulta;

import java.util.Scanner;

public class Plataforma_Consulta {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome, cpf, rg, Planosaude = null, especialidade = null, mes;
		int idade, x = 0, op, esp, data;
		String celular;
		boolean confirmação;

		ConsultaInfo[] lista = new ConsultaInfo[31];

		do {
			System.out.println("*****************************************************");
			System.out.println("Clinica Obstétrica Flor do Ventre");
			System.out.println("Menu");
			System.out.println("1- Marcar consulta");
			System.out.println("2- Desmarcar consulta ");
			System.out.println("3- Ver especialidades da Clínica");
			System.out.println("4- Reever dados da consulta");
			System.out.println("0- Sair");
			System.out.println("\n");
			System.out.println("*****************************************************");
			System.out.println("Digite sua opção: ");
			op = leia.nextInt();
			System.out.println("\n");

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("Insira seu nome: ");
				nome = leia.nextLine();
				System.out.println("\nInsira sua idade: ");
				idade = leia.nextInt();
				rg = leia.nextLine();
				System.out.println("\nInsira sua identidade: ");
				rg = leia.nextLine();
				System.out.println("\nInsira seu CPF: ");
				cpf = leia.nextLine();
				System.out.println("\nVai dar entrada com o Plano de Saúde ou Particular?");
				Planosaude = leia.nextLine();	
				System.out.println("\n");
		    	System.out.println("Se Particular o valor da consulta há de ser vista no dia pessoalmente ");
				System.out.println("\n");
				System.out.println("\nInsira um telefone para contato: +55 11 ");
				celular = leia.nextLine();
				System.out.println("\n");

				System.out.println("*****************************************************");

				do {
					System.out.println("\n");
					System.out.println("\nDigite qual especialidade está buscando na clínica: ");
					System.out.println("\nDigite 1 para = Ginecologista, Profissional Ana Vitória Alves");
					System.out.println("\nDigite 2 para= Ginecologista Obstetra, Profissional  Laura Rossi Macena");
					System.out.println("\nDigite 3 para= Fisioterapeuta, Profissional Jorge Mendes Gonçalves");
					System.out.println("\nDigite 4 para= Psicologo, Profisional Marcela Oliveira Ramos");
					System.out.println("\nDigite 5 para= Nutricionista, Profissional Juliana Vitoria Meireles");
					System.out.println("\nDigite 6 para= Consultora de Amamentação, Profissional Jandira Rodrigues Carvalho");
					esp = leia.nextInt();

					switch (esp) {
					case 1:
						especialidade = "Ginecologista, Profissional Ana Vitória Alves";
						break;

					case 2:
						especialidade = "Ginecologista Obstetra, Profissional  Laura Rossi Macena";
						break;

					case 3:
						especialidade = "Fisioterapeuta, Profissional Jorge Mendes Gonçalves";
						break;

					case 4:
						especialidade = "Psicologo, Profisional Marcela Oliveira Ramos";
						break;

					case 5:
						especialidade = "Nutricionista, Profissional Juliana Vitoria Meireles";
						break;

					case 6:
						especialidade = "Consultora de Amamentação, Profissional Jandira Rodrigues Carvalho";
						break;

					default:
						System.out.println("Opção inválida!!!");
						break;
					}
				} while (esp <1 || esp>6);

				mes = leia.nextLine();
				System.out.println("\nEscreva o nome do mês que busca atendimento: ");
				mes = leia.nextLine();
				System.out.println("\nColoque o dia que busca atendimento: ");
				data = leia.nextInt();
				
				lista[x] = new ConsultaInfo (nome,idade,rg,cpf,Planosaude,celular,data,mes,especialidade);
				
				
				System.out.println("\n");
				System.out.println("*****************************************************");

				System.out.println("\n Sua consulta foi agendada com sucesso!! ");
				System.out.println("\n");
				System.out.println("Atendimento por ordem de Chegada");
				
				
				lista[x].imprimir();
				
				System.out.println("\n");
				System.out.println("seu código para reagendamento de consulta é: "+x);
				
				break;
			
			case 2:
				
					
			}		
		} while (op != 0);
	
	}
}
