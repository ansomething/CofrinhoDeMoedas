package cofrinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {
		// || ATRIBUTOS
		int escolha1, escolha2; // recebe o input de escolhas no menu (camada 1 e 2 de opcoes)
		double valor; // recebe o input dos valores de moeda
		boolean exeApp = true; // controla o while loop

		// || INSTANCIAS
		Cofrinho cofrinho = new Cofrinho(); // cofrinho para armazenar as moedas
		Moeda moeda = null; // moeda que vai ser instanciada em real, euro ou dolar
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); // input do usuario
		Menu menu = new Menu(); // mensagens relacionadas ao menu
		menu.header(); // metodo do menu necessario apenas ao iniciar o programa

		// || WHILE LOOP E SWITCH CASES
		while (exeApp) {
			menu.menu();
			escolha1 = input.nextInt();

			switch (escolha1)  {
			case 1:
				menu.case1();
				escolha2 = input.nextInt();
				try {
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
						continue;
					}
					else {
						menu.caseDefault();
						continue;
					}
				} catch (Exception e) {
					/* EXCEPTION CASO O VALOR PARA ADICIONAR SEJA <= 0
					 * validacao feita na classe Moeda
					 */
					System.out.println(e.getMessage());
					continue;
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
					continue;
				}
				else {
					menu.caseDefault();
					continue;
				}
				menu.linha();
				cofrinho.remover(moeda);
				menu.linha();
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
