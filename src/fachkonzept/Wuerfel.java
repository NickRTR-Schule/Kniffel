package fachkonzept;

public class Wuerfel
{
	private int augenzahl;
	
	public void wirf()
	{
		augenzahl = (int) (Math.random() * 6) + 1;
	}
	
	public int liesAugenzahl() 
	{
		return augenzahl;
	}
}
