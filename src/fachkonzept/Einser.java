package fachkonzept;

public class Einser
{
	private boolean istEingetragen;
	private int punktzahl;
		
	public Einser()
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
		
		istEingetragen = true;
	}
}
