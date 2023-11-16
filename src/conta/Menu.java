package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
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
			
			opcao = leia.nextInt();
			
			if(opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("\nCriar Conta\n\n");
				break;
			case 2:
				System.out.println("\nListar todas as Contas\n\n");
				break;
			case 3:
				System.out.println("\nConsultar dados da Conta- por número\n\n");
				break;
			case 4:
				System.out.println("\nAtualizar dados da Conta\n\n");
				break;
			case 5:
				System.out.println("\nApagar a Conta\n\n");
				break;
			case 6:
				System.out.println("\nSaque\n\n");
				break;
			case 7:
				System.out.println("\nDepósito\n\n");
				break;
			case 8:
				System.out.println("\nTransferência entre Contas\n\n");
				break;
			default:
				System.out.println("\nOpção Inválida\n");
				break;
			}
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
