package cofrinho;

public class Euro extends Moeda {
	// || CONSTRUTOR
	public Euro(double valor) throws Exception {
		super(valor);
	}

	// || METODOS
	@Override
	// CONVERTER EURO PARA REAL
	public double converter() {
		return valor * 6.22;
	}

	@Override
	// TO STRING PARA LISTAGEM DAS MOEDAS
	public String toString() {
		return "Euro: €" + valor;
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
