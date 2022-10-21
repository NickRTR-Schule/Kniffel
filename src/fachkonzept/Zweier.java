package fachkonzept;

public class Zweier extends Figur
{
	public void trageEin(int[] pAugenzahl)
	{
		// nur 2er werden eingetragen

		for (int w = 0; w < pAugenzahl.length; w++)
		{
			if (pAugenzahl[w] == 2)
			{
				punktzahl += pAugenzahl[w];
			}
		}
		istEingetragen = true;
	}
}
