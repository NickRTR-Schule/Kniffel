package fachkonzept;

public class Fuenfer extends Figur
{
	public void trageEin(int[] pAugenzahl)
	{
		// nur 5er werden eingetragen

		for (int w = 0; w < pAugenzahl.length; w++)
		{
			if (pAugenzahl[w] == 5)
			{
				punktzahl += pAugenzahl[w];
			}
		}
		istEingetragen = true;
	}
}
