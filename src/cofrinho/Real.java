package cofrinho;

public class Real extends Moeda {
	// || CONSTRUTOR
	public Real(double valor) throws Exception {
		super(valor);
	}

	// || METODOS
	@Override
	// CONVERTER REAL PARA REAL
	public double converter() {
		return valor;
	}

	@Override
	// TO STRING PARA LISTAGEM DAS MOEDAS
	public String toString() {
		return "Real: R$" + valor;
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
