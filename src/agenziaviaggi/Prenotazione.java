package agenziaviaggi;

public class Prenotazione {
	private Pacchetto pacchetto;
	private String codice;
	private int postiRichiesti;
	private Cliente cliente;
	private Filiale filiale;

	public Prenotazione(String codice, int postiRichiesti, Filiale filiale, Cliente cliente) {
		this.codice = codice;
		this.postiRichiesti = postiRichiesti;
		this.cliente = cliente;
		this.filiale = filiale;
	}

	public void setPacchetto(Pacchetto p) {
		this.pacchetto = p;
	}
	
	public String getCodice() {
		return codice;
	}

	public int getPostiRichiesti() {
		return postiRichiesti;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Filiale getFiliale() {
		return filiale;
	}

	@Override 
	public String toString() {
		return "Prenotazione [cliente=" + cliente + ", filiale=" + filiale
				+ ", codice=" + codice + ", pacchetto=" + pacchetto
				+ ", puntiRichiesti=" + postiRichiesti + "]";
	}
}