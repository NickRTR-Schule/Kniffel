package fachkonzept;

public class Figur
{
	private boolean istEingetragen;
	private int punktzahl;
		
	public Figur()
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
