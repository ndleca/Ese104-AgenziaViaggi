package ese104;

import agenziaviaggi.*;

public class Ese104 {

	public static void main(String[] args) throws Exception {
		Cliente presidente = new Cliente("Sergio", "Mattarella");
		Pacchetto caraibi = new Pacchetto("caraibi2015", "Un viaggio ai Caraibi molto rilassante", 10);
		Filiale montecitorio = new Filiale(17);
		
		System.out.println(caraibi.toString());
		Prenotazione p = new Prenotazione("p1", 2, montecitorio, presidente);
		caraibi.addPrenotazione(p);
		System.out.println("Aggiunta " + p);
		p = new Prenotazione("p2", 6, montecitorio, presidente);
		caraibi.addPrenotazione(p);
		System.out.println("Aggiunta " + p);
		try {
			p = new Prenotazione("p3", 3, montecitorio, presidente);
			caraibi.addPrenotazione(p);
			throw new Exception("Non è stata lanciata l'eccezione per posti non disponibili");
		}
		catch (Exception e) {
			System.out.println("Prenotazione non aggiunta " + p);
		}
		
		System.out.println("\nElenco delle prenotazioni");
		for(Prenotazione q : caraibi.getPrenotazioni()) {
			System.out.println(q.toString());
		}
	}

}
