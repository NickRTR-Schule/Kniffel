package fachkonzept;

public class Kniffel extends Figur
{
	public void trageEin(int[] pAugenzahl)
	{
		// Punktzahl 50 wird nur eingetragen, wenn es fünf gleiche Würfel gibt

		int wieOft[] = {0, 0, 0, 0, 0, 0};

		for (int w = 0; w < pAugenzahl.length; w++)
		{
			int a = pAugenzahl[w] - 1;
			wieOft[a]++;
		}

		boolean fuenfGleiche = false;

		for (int a = 0; a < wieOft.length; a++)
		{
			if (wieOft[a] == 5)
			{
				fuenfGleiche = true;
			}
		}

		if (fuenfGleiche)
		{
			punktzahl = 50;
		}
		istEingetragen = true;
	}
}
