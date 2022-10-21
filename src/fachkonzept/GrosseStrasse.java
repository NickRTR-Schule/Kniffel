package fachkonzept;

public class GrosseStrasse extends Figur
{
	public void trageEin(int[] pAugenzahl)
	{
		// Augensumme 40 wird eingetragen, wenn es fünf Würfel mit
		// aufeinanderfolgenden Augenzahlen gibt

		boolean einsVorhanden = false;
		boolean zweiVorhanden = false;
		boolean dreiVorhanden = false;
		boolean vierVorhanden = false;
		boolean fuenfVorhanden = false;
		boolean sechsVorhanden = false;

		for (int w = 0; w < pAugenzahl.length; w++)
		{
			switch (pAugenzahl[w])
			{
				case 1:
					einsVorhanden = true;
					break;
				case 2:
					zweiVorhanden = true;
					break;
				case 3:
					dreiVorhanden = true;
					break;
				case 4:
					vierVorhanden = true;
					break;
				case 5:
					fuenfVorhanden = true;
					break;
				case 6:
					sechsVorhanden = true;
					break;
			}
		}

		if (einsVorhanden && zweiVorhanden && dreiVorhanden && vierVorhanden && fuenfVorhanden ||
				zweiVorhanden && dreiVorhanden && vierVorhanden && fuenfVorhanden && sechsVorhanden)
		{
			punktzahl = 40;
		}

		istEingetragen = true;
	}
}
