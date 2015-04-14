package agenziaviaggi;

public class Cliente {
	private String nome;
	private String cognome;

	public Cliente(String nome, String cognome) {
		if (nome != null) {
			if (nome.length() > 0)
				this.nome = nome;
			else
				throw new IllegalArgumentException(
						"Lunghezza nome deve essere maggiore di 0");
		} else
			throw new IllegalArgumentException("Assegnare un nome");

		if (cognome != null) {
			if (cognome.length() > 0)
				this.cognome = cognome;
		} else
			throw new IllegalArgumentException("Assegnare un cognome");
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + "]";
	}
}
