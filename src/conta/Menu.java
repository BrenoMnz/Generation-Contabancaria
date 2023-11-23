package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		System.out.println(Cores.TEXT_GREEN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
		
		// Teste da Classe Conta
		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		
		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		 // Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
        cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
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
				System.out.println("\nDigite valores inteiros!");
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
				keyPress();
				break;
			case 2:
				System.out.println("\nListar todas as Contas HACKEADAS\n\n");
				keyPress();
				break;
			case 3:
				System.out.println("\nConsultar dados da Conta HACKEADA por número\n\n");
				keyPress();
				break;
			case 4:
				System.out.println("\nAtualizar dados da Conta HACKEADA\n\n");
				keyPress();
				break;
			case 5:
				System.out.println("\nApagar a Conta HACKEADA\n\n");
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
