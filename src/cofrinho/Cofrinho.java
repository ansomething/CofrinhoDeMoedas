package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
	// || ARRAYLIST
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	// || METODOS
	public void adicionar(Moeda valor) throws Exception {
		// ADICIONAR MOEDAS
//		if (valor <= 0) {
//			throw new Exception("\u001b[1mValor inválido. Digite novamente.\u001b[m");
//		};
		listaMoedas.add(valor);
	}
	
	public void remover(Moeda valor) {
		// REMOVER MOEDAS
		listaMoedas.remove(valor);
	}
	
	public void listagemMoedas() {
		// LISTAR MOEDAS
		for (Moeda valor : listaMoedas) {
			System.out.println(valor);
		}
	}
	
	public void totalConvertido() {
		// SOMA DE TODAS AS MOEDAS CONVERTIDAS
		double total = 0;
		for (Moeda valor : listaMoedas) {
			total += valor.converter();
		}
		System.out.printf("Total: R$%.2f\n", total);
	}

}
