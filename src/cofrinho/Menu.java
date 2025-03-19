package cofrinho;

public class Menu {

	// || TODAS AS MENSAGENS RELACIONADAS AO MENU

	public void header() {
		System.out.println("---------------------------------------");
		System.out.println("\u001b[1m       BEM VINDO AO SEU COFRINHO\u001b[m");
		System.out.println("---------------------------------------");
		System.out.println("               ︵ヘ︵৲フ               ");
		System.out.println("             ε( ( ･∞･)  $$$          ");
		System.out.println("              しーしーJ                ");
		System.out.println("---------------------------------------");
	}

	public void menu() {
		System.out.println("\u001b[1mO que gostaria de fazer?\u001b[m");
		System.out.println("[1] Adicionar moedas");
		System.out.println("[2] Remover moedas");
		System.out.println("[3] Listar moedas");
		System.out.println("[4] Calcular total em Reais");
		System.out.println("[5] Sair");
	}

	public void case1() {
		System.out.println("[1] Adicionar em Real");
		System.out.println("[2] Adicionar em Euro");
		System.out.println("[3] Adicionar em Dólar");
		System.out.println("[4] Voltar para o menu");
	}

	public void caseAddReal() {
		linha();
		System.out.println("\u001b[1mQuantos Reais gostaria de adicionar?\u001b[m");
		linha();
	}

	public void caseAddEuro() {
		linha();
		System.out.println("\u001b[1mQuantos Euros gostaria de adicionar?\u001b[m");
		linha();
	}

	public void caseAddDolar() {
		linha();
		System.out.println("\u001b[1mQuantos Dólares gostaria de adicionar?\u001b[m");
		linha();
	}

	public void case2() {
		System.out.println("[1] Remover em Real");
		System.out.println("[2] Remover em Euro");
		System.out.println("[3] Remover em Dólar");
		System.out.println("[4] Voltar para o menu");
	}

	public void caseDelReal() {
		linha();
		System.out.println("\u001b[1mQuantos Reais gostaria de remover?\u001b[m");
		linha();
	}

	public void caseDelEuro() {
		linha();
		System.out.println("\u001b[1mQuantos Euros gostaria de remover?\u001b[m");
		linha();
	}

	public void caseDelDolar() {
		linha();
		System.out.println("\u001b[1mQuantos Dólares gostaria de remover?\u001b[m");
		linha();
	}

	public void case5() {
		System.out.println("\u001b[1m----------PROGRAMA--ENCERRADO----------\u001b[m");
	}

	public void caseDefault() {
		linha();
		System.out.println("\u001b[1mOpção inválida.\u001b[m");
		linha();
	}

	public void linha() {
		System.out.println("---------------------------------------");
	}
}
