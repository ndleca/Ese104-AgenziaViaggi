package agenziaviaggi;

import java.util.Vector;

public class Pacchetto {
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector<Prenotazione> prenotazioni;
	
	public Pacchetto(String codice, String descrizione, int postiTotali) {
		if (codice != null) {
			if (codice.length() > 0)
				this.codice = codice;
			else
				throw new IllegalArgumentException("Lunghezza codice deve essere maggiore di 0"); 
		}
		else
			throw new IllegalArgumentException("Assegnare un codice"); 
		
		this.descrizione = descrizione;
		
		if(postiTotali > 0)
			this.postiTotali = postiTotali;
		
		this.prenotazioni = new Vector<Prenotazione>();
	}

	public String getCodice() {
		return codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public Vector<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	
	public int getPostiDisponibili() {
		int postiRichiesti = 0;
		for (Prenotazione p : prenotazioni) {
			postiRichiesti += p.getPostiRichiesti();
		}
		return postiTotali - postiRichiesti;
	}
	
	public void addPrenotazione(Prenotazione p) throws Exception {
		int postiDisponibili = this.getPostiDisponibili();
		if(p.getPostiRichiesti() <= postiDisponibili) {
			p.setPacchetto(this);
			this.getPrenotazioni().add(p);
		}
		else
			throw new Exception("Posti richiesti (" + p.getPostiRichiesti() + ") superiori ai posti disponibili (" + postiDisponibili + ")");
	}

	@Override
	public String toString() {
		return "Pacchetto [codice=" + codice + ", descrizione=" + descrizione
				+ ", postiTotali=" + postiTotali + ", n. prenotazioni="
				+ prenotazioni.size() + ", postiDisponibili="
				+ getPostiDisponibili() + "]";
	}
}
