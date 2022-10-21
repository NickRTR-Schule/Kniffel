package fachkonzept;

public class Figur
{
	protected boolean istEingetragen;
	protected int punktzahl;
		
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
