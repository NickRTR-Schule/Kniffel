package fachkonzept;

public class FullHouse extends Figur
{
	public void trageEin(int[] pAugenzahl)
	{
		// Punktzahl 25 wird eingetragen, wenn es drei und zwei oder fünf gleiche Würfel gibt

		int wieOft[] = {0, 0, 0, 0, 0, 0};

		for (int w = 0; w < pAugenzahl.length; w++)
		{
			int a = pAugenzahl[w] - 1;
			wieOft[a]++;
		}
		
		boolean zweiGleiche = false;
		boolean dreiGleiche = false;		
		boolean fuenfGleiche = false;

		for (int a = 0; a < wieOft.length; a++)
		{
			switch (wieOft[a])
			{
				case 2:
					zweiGleiche = true;
					break;
				case 3:
					dreiGleiche = true;
					break;
				case 5:
					fuenfGleiche = true;
					break;
			}
		}

		if (dreiGleiche && zweiGleiche || fuenfGleiche)
		{
			punktzahl = 25;
		}
		istEingetragen = true;
	}
}
