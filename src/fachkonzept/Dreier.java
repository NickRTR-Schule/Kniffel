package fachkonzept;

public class Dreier extends Figur
{
	public void trageEin(int[] pAugenzahl)
	{
		// nur 3er werden eingetragen

		for (int w = 0; w < pAugenzahl.length; w++)
		{
			if (pAugenzahl[w] == 3)
			{
				punktzahl += pAugenzahl[w];
			}
		}
		istEingetragen = true;
	}
}
