package steuerung;

import benutzerschnittstelle.GUI;
import fachkonzept.Wuerfel;
import fachkonzept.Spiel;
import fachkonzept.Bestenliste;

public class Steuerung {
	private Wuerfel dieWuerfel[] = new Wuerfel[5];
	private Spiel dasSpiel;
	private Bestenliste dieBestenliste;
	
	
	public Steuerung(GUI dieBenutzerschnittstelle) {
		for (int i = 0; i < 5; i++) {
			dieWuerfel[i] = new Wuerfel();
		}
		dasSpiel = new Spiel();
		dieBestenliste = new Bestenliste();
	}
}
