package fachkonzept;

public class Sechser extends Figur
{
	public void trageEin(int[] pAugenzahl)
	{
		// nur 6er werden eingetragen

		for (int w = 0; w < pAugenzahl.length; w++)
		{
			if (pAugenzahl[w] == 6)
			{
				punktzahl += pAugenzahl[w];
			}
		}
		istEingetragen = true;
	}
}
