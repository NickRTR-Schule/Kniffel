package fachkonzept;

public class Viererpasch extends Figur
{
	public void trageEin(int[] pAugenzahl)
	{
		// Augensumme wird nur eingetragen, wenn es mind. vier gleiche Würfel gibt

		int wieOft[] = {0, 0, 0, 0, 0, 0};
		int summe = 0;

		for (int w = 0; w < pAugenzahl.length; w++)
		{
			int a = pAugenzahl[w] - 1;
			wieOft[a]++;
			summe += pAugenzahl[w];
		}

		boolean vierGleiche = false;

		for (int a = 0; a < wieOft.length; a++)
		{
			if (wieOft[a] >= 4)
			{
				vierGleiche = true;
			}
		}

		if (vierGleiche)
		{
			punktzahl = summe;
		}
		istEingetragen = true;
	}
}
