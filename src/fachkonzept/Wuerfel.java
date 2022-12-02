package fachkonzept;

public class Wuerfel
{
	private static int anzahlVersucheAktFigur;
	private int augenzahl;
	
	public static boolean darfNochmalWuerfelnAktFigur()
	{
		return anzahlVersucheAktFigur < 3;
	}
	
	public int liesAugenzahl() 
	{
		return augenzahl;
	}
	
	public void wirf()
	{
		augenzahl = (int) (Math.random() * 6) + 1;
	}
	
	public static void geworfen()
	{
		anzahlVersucheAktFigur++;
	}
	
	public static void starteNeueFigur()
	{
		anzahlVersucheAktFigur = 0;
	}
}
