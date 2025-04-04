package cofrinho;

public abstract class Moeda {
	// || ATRIBUTOS
	double valor;

	// || CONSTRUTOR
	public Moeda(double valor) {
		super();
		if (valor <= 0) {
			throw new RuntimeException("\u001b[1mValor inválido.\u001b[m\n");
		}
		this.valor = valor;
	}

	// || METODOS
	public abstract double converter();

	// || EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

}
