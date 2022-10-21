package fachkonzept;

public class Vierer extends Figur
{
	public void trageEin(int[] pAugenzahl)
	{
		// nur 4er werden eingetragen

		for (int w = 0; w < pAugenzahl.length; w++)
		{
			if (pAugenzahl[w] == 4)
			{
				punktzahl += pAugenzahl[w];
			}
		}
		istEingetragen = true;
	}
}
