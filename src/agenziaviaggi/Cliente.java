package agenziaviaggi;

public class Cliente {
	private String nome;
	private String cognome;
	
	public Cliente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
}