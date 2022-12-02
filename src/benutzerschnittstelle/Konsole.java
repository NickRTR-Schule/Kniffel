package benutzerschnittstelle;

import fachkonzept.Wuerfel;

public class Konsole
{
	public static void main(String[] args)
	{
		Wuerfel[] derWuerfel = new Wuerfel[5];
		
		for (int i = 0; i < 5; i++) 
		{
			derWuerfel[i] = new Wuerfel();
			derWuerfel[i].wirf();
		}
		Wuerfel.geworfen();
		System.out.println(Wuerfel.darfNochmalWuerfelnAktFigur());

		
		derWuerfel[1].wirf();
		Wuerfel.geworfen();
		System.out.println(Wuerfel.darfNochmalWuerfelnAktFigur());
		
		derWuerfel[3].wirf();
		Wuerfel.geworfen();
		System.out.println(Wuerfel.darfNochmalWuerfelnAktFigur());
		
		Wuerfel.starteNeueFigur();
		System.out.println(Wuerfel.darfNochmalWuerfelnAktFigur());		
	}
}
