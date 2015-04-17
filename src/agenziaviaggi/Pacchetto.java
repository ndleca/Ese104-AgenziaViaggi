package agenziaviaggi;

import java.util.Vector;

public class Pacchetto {
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector<Prenotazione> prenotazioni;
	
	public Pacchetto(String codice, String descrizione, int postiTotali) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.postiTotali = postiTotali;
		this.prenotazioni = new Vector<Prenotazione>();
	}

	public void addPrenotazione(Prenotazione p) throws Exception {
		if(p.getPostiRichiesti() <= getPostiDisponibili()) {
			p.setPacchetto(this);
			this.getPrenotazioni().add(p);
		}
		else
			throw new Exception("Posti richiesti (" + p.getPostiRichiesti() + ") superiori ai posti disponibili (" + getPostiDisponibili() + ")");
	
	}
	
	public int getPostiDisponibili() {
		int postiRichiesti = 0;
		for (int i=0; i<this.prenotazioni.size(); i++) {
			postiRichiesti += this.prenotazioni.get(i).getPostiRichiesti();
		}
		return postiTotali - postiRichiesti;
	}
	
	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public String getCodice() {
		return codice;
	}
	
	@Override
	public String toString() {
		return "Pacchetto [codice=" + codice + ", descrizione=" + descrizione
				+ ", postiTotali=" + postiTotali + ", n. prenotazioni="
				+ prenotazioni.size() + ", postiDisponibili="
				+ getPostiDisponibili() + "]";
	}
}