package cofrinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {
		// || ATRIBUTOS
		int escolha1, escolha2; // RECEBE O INPUT DE ESCOLHAS NO MENU
		double valor; // RECEBE O INPUT DOS VALORES DE MOEDA
		boolean exeApp = true; // CONTROLA O WHILE LOOP

		// || INSTANCIAS
		Cofrinho cofrinho = new Cofrinho(); // COFRINHO PARA ARMAZENAR AS MOEDAS
		Moeda moeda = null; // MOEDA QUE VAI SER INSTANCIADA EM REAL, EURO OU DOLAR
		Scanner input = new Scanner(System.in); // INPUT DO USUARIO
		Menu menu = new Menu(); // MENSAGENS RELACIONADAS AO MENU
		menu.header(); // METODO DO MENU NECESSARIO APENAS AO INICIAR O PROGRAMA

		// || WHILE LOOP E SWITCH CASES
		while (exeApp) {
			menu.menu();
			escolha1 = input.nextInt();
			
			switch (escolha1)  {
			case 1:
				menu.case1();
				escolha2 = input.nextInt();

				if (escolha2 == 1) {
					menu.caseAddReal();
					valor = input.nextDouble();
					moeda = new Real(valor);
				}
				else if (escolha2 == 2) {
					menu.caseAddEuro();
					valor = input.nextDouble();
					moeda = new Euro(valor);
				}
				else if (escolha2 == 3) {
					menu.caseAddDolar();
					valor = input.nextDouble();
					moeda = new Dolar(valor);
				}
				else if (escolha2 == 4) {
					break;
				}
				else {
					menu.caseDefault();
					menu.case1();
					escolha2 = input.nextInt();
				}

				cofrinho.adicionar(moeda);
				break;

			case 2:
				menu.case2();
				escolha2 = input.nextInt();

				if (escolha2 == 1) {
					menu.caseDelReal();
					valor = input.nextDouble();
					moeda = new Real(valor);
				}
				else if (escolha2 == 2) {
					menu.caseDelEuro();
					valor = input.nextDouble();
					moeda = new Euro(valor);
				}
				else if (escolha2 == 3) {
					menu.caseDelDolar();
					valor = input.nextDouble();
					moeda = new Dolar(valor);
				}
				else if (escolha2 == 4) {
					break;
				}
				else {
					menu.caseDefault();
					menu.case2();
					escolha2 = input.nextInt();
				}

				cofrinho.remover(moeda);
				break;

			case 3:
				menu.linha();
				cofrinho.listagemMoedas();
				menu.linha();
				break;

			case 4:
				menu.linha();
				cofrinho.totalConvertido();
				menu.linha();
				break;

			case 5:
				menu.case5();
				exeApp = false;
				break;

			default:
				menu.caseDefault();
			}
		}
	}

}
