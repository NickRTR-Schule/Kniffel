package fachkonzept;

public class Chance extends Figur
{
	public void trageEin(int[] pAugenzahl)
	{
		for (int i = 0; i < pAugenzahl.length; i++)
		{
			punktzahl += pAugenzahl[i];
		}
		istEingetragen = true;
	}
}
