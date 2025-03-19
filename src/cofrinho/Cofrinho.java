package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
	// || ARRAYLIST
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	// || METODOS
	public void adicionar(Moeda valor) {
		// ADICIONAR MOEDAS
		listaMoedas.add(valor);
	}

	public void remover(Moeda valor) {
		// REMOVER MOEDAS
		if (listaMoedas.contains(valor)) {
			// mensagens caso tenha sido possivel ou nao a remocao da moeda
			System.out.println("\u001b[1mMoeda removida com sucesso!\u001b[m");
		}
		else {
			System.out.println("\u001b[1mNão foi possível remover essa moeda.\u001b[m");
		}

		listaMoedas.remove(valor);

	}

	public void listagemMoedas() {
		// LISTAR MOEDAS
		if (listaMoedas.isEmpty()) {
			// mensagem caso não tenha items dentro da ArrayList
			System.out.println("\u001b[1mNenhuma moeda a ser listada.\u001b[m");
		}

		for (Moeda valor : listaMoedas) {
			System.out.println(valor);
		}


	}

	public void totalConvertido() {
		// SOMA DE TODAS AS MOEDAS CONVERTIDAS PARA REAL
		double total = 0;
		for (Moeda valor : listaMoedas) {
			total += valor.converter();
		}
		System.out.printf("Total: R$%.2f\n", total);
	}

}
