package fachkonzept;

public abstract class Figur
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
	
	public abstract void trageEin(int[] pAugenzahl);
}