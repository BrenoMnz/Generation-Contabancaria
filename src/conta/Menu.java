package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		ContaController contas = new ContaController();
		System.out.println(Cores.TEXT_GREEN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		
		System.out.println("\nCriar contas\n");
		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);
		
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);
		
		while(true) {
			
			System.out.println(Cores.TEXT_GREEN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO HACKEADO HAHAHAHA              ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as contas               ");
			System.out.println("            3 - Buscar contas por número             ");
			System.out.println("            4 - Atualizar dados da conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros HAHAHAHA!");
				leia.nextLine();
				opcao = 0;
			}
			
			if(opcao == 9) {
				System.out.println("\nBANCO HACKEADO HAHAHAHA - O seu futuro termina aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("\nCriar Conta HACKEADA\n\n");
				
				System.out.println("Digite o número da agência HACKEADA: ");
				agencia = leia.nextInt();
				System.out.println("Digite o nome do titular HACKEADO: ");
				leia.skip("\\R");
				titular = leia.nextLine();
				
				do {
					System.out.println("Digite o tipo da conta HACKEADA(1-CC ou 2-CP): ");
					tipo = leia.nextInt();
				}while(tipo < 1 || tipo > 2);
				
				System.out.println("Digite o saldo da conta HACKEADA(R$): ");
				saldo = leia.nextFloat();
				
				switch(tipo) {
					case 1 -> {
						System.out.println("Digite o limite de crédito HACKEADO(R$): ");
						limite = leia.nextFloat();
						contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do aniversário da conta HACKEADA: ");
						aniversario = leia.nextInt();
						contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
				}
				keyPress();
				break;
			case 2:
				System.out.println("\nListar todas as Contas HACKEADAS\n\n");
				contas.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println("\nConsultar dados da Conta HACKEADA por número\n\n");
				
			    System.out.println("Digite o número da conta HACKEADA: ");
			    numero = leia.nextInt();
			    
			    contas.procurarPorNumero(numero);
			    
				keyPress();
				break;
			case 4:
				System.out.println("\nAtualizar dados da Conta HACKEADA\n\n");
				
				System.out.println("Digite o número da conta HACKEADA: ");
				numero = leia.nextInt();
				
				var buscaConta = contas.buscarNaCollection(numero);
				
				if (buscaConta != null) {
					
					tipo = buscaConta.getTipo();
					
					System.out.println("Digite o número da agência HACKEADA: ");
					agencia = leia.nextInt();
					System.out.println("Digite o nome do titular HACKEADO: ");
					leia.skip("\\R");
					titular = leia.nextLine();
					
					System.out.println("Digite o saldo da conta HACKEADA(R$): ");
					saldo = leia.nextFloat();
					
					switch (tipo) {
						case 1 -> {
							System.out.println("Digite o limite de crédito HACKEADO(R$): ");
							limite = leia.nextFloat();
							
							contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
						}
						case 2 -> {
							System.out.println("Digite o dia do aniversario da conta: ");
							aniversario = leia.nextInt();
							
							contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
						}
						default -> {
							System.out.println("Tipo de conta inválido HAHAHA!");
						}
					}
				} else { 
					System.out.println("A conta não foi encontrada HAHAHAH");
				}
				keyPress();
				break;
			case 5:
				System.out.println("\nApagar a Conta HACKEADA\n\n");
				
				System.out.println("Digite o número da conta HACKEADA: ");
				numero = leia.nextInt();
				
				contas.deletar(numero);
				
				keyPress();
				break;
			case 6:
				System.out.println("\nSaque HAHAHAH\n\n");
				keyPress();
				break;
			case 7:
				System.out.println("\nDepósito pra conta do HACKER\n\n");
				keyPress();
				break;
			case 8:
				System.out.println("\nTransferência entre Contas HACKEADAS\n\n");
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida\n");
				keyPress();
				break;
			}
		}

	}
	
	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para continuar AHAHAHA...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
	
	public static void sobre() {
		System.out.println("\n*****************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Breno Menezes - breno.luizmenezes0123@gmail.com");
		System.out.println("github.com/BrenoMnz");
		System.out.println("Em parceria com: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*****************************************************");
	}

}
