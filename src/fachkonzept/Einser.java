package fachkonzept;

public class Einser extends Figur
{
	public void trageEin(int[] pAugenzahl)
	{
		for (int i = 0; i < pAugenzahl.length; i++)
		{
			if (pAugenzahl[i] == 1)
			{				
				punktzahl += pAugenzahl[i];
			}
		}
		istEingetragen = true;
	}
}
