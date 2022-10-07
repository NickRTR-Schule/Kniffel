package fachkonzept;

public class Chance
{
	private boolean istEingetragen;
	private int punktzahl;
		
	public Chance()
	{
		istEingetragen = false;
		punktzahl = 0;
	}
	
	public boolean istEingetragen()
	{
		return istEingetragen;
	}
	
	public int liesPunktzahl() 
	{
		return punktzahl;
	}
	
	public void trageEin(int[] pAugenzahl)
	{
		int summe = 0;
		for (int i = 0; i < pAugenzahl.length; i++)
		{
			summe += pAugenzahl[i];
		}
		punktzahl = summe;
		istEingetragen = true;
	}
}
