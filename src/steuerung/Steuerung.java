package steuerung;

import benutzerschnittstelle.Benutzerschnittstelle;
import fachkonzept.Wuerfel;
import fachkonzept.Spiel;
import fachkonzept.Bestenliste;

public class Steuerung {
	private Wuerfel dieWuerfel[] = new Wuerfel[5];
	private Spiel dasSpiel;
	private Bestenliste dieBestenliste;
	
	public Steuerung(Benutzerschnittstelle dieBenutzerschnittstelle) {
		for (int i = 0; i < 5; i++) {
			dieWuerfel[i] = new Wuerfel();
		}
		dasSpiel = new Spiel();
		dieBestenliste = new Bestenliste();
	}
	
	public void geklicktWuerfeln(boolean[] pWuerfelWerfen)
	{
		for (int i = 0; i < pWuerfelWerfen.length; i++) {
			if (pWuerfelWerfen[i])
			{
				dieWuerfel[i].wirf();
			}		
		}
	}
	
	public void geklicktNeuesSpiel()
	{
		dasSpiel.starteNeu();
	}
	
	public void geklicktEintragen(int pFigurNr)
	{
		int[] augenzahlen = new int[5];
		for (int i = 0; i < dieWuerfel.length; i++) {
			augenzahlen[i] = dieWuerfel[i].liesAugenzahl();		
		}
		dasSpiel.trageEin(pFigurNr, augenzahlen);
	}
}
