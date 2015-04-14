package agenziaviaggi;

public class Prenotazione {
	private String codice;
	private int postiRichiesti;
	private Filiale filiale;
	private Cliente cliente;
	private Pacchetto pacchetto;
	
	public Prenotazione(String codice, int postiRichiesti, Filiale filiale,
			Cliente cliente) {
		if (codice != null) {
			if (codice.length() > 0)
				this.codice = codice;
			else
				throw new IllegalArgumentException("Lunghezza codice deve essere maggiore di 0"); 
		}
		else
			throw new IllegalArgumentException("Necessario assegnare codice"); 
		
		
		if(postiRichiesti > 0)
			this.postiRichiesti = postiRichiesti;
		else
			throw new IllegalArgumentException("Posti richiesti deve essere positivo");
		
		if (filiale != null)
			this.filiale = filiale;
		else
			throw new IllegalArgumentException("Necessario assegnare una filiale");
		
		if (cliente != null)
			this.cliente = cliente;
		else
			throw new IllegalArgumentException("Necessario assegnare cliente");
	}

	public Pacchetto getPacchetto() {
		return pacchetto;
	}

	public void setPacchetto(Pacchetto pacchetto) {
		this.pacchetto = pacchetto;
	}

	public String getCodice() {
		return codice;
	}

	public int getPostiRichiesti() {
		return postiRichiesti;
	}

	public Filiale getFiliale() {
		return filiale;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "Prenotazione [codice=" + codice + ", postiRichiesti="
				+ postiRichiesti + ", filiale=" + filiale + ", cliente="
				+ cliente + ", pacchetto=" + pacchetto + "]";
	}
}
