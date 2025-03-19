package cofrinho;

public class Dolar extends Moeda {
	// || CONSTRUTOR
	public Dolar(double valor) {
		super(valor);
	}

	// || METODOS

	@Override
	// CONVERTER DOLAR PARA REAL
	public double converter() {
		return valor * 5.71;
	}

	@Override
	// TO STRING PARA LISTAGEM DAS MOEDAS
	public String toString() {
		return "Dolar: $" + valor;
	}

	@Override
	// EQUALS PARA REMOCAO DE MOEDAS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

}
