package fachkonzept;

public class Spiel {
	private Figur[] dieFiguren = new Figur[13];
	
	public Spiel() {
		for (int i = 0; i < 13; i++) {
			dieFiguren[0] = new Einser();
			dieFiguren[1] = new Zweier();
			dieFiguren[2] = new Dreier();
			dieFiguren[3] = new Vierer();
			dieFiguren[4] = new Fuenfer();
			dieFiguren[5] = new Sechser();
			dieFiguren[6] = new Dreierpasch();
			dieFiguren[7] = new Viererpasch();
			dieFiguren[8] = new FullHouse();
			dieFiguren[9] = new KleineStrasse();
			dieFiguren[10] = new GrosseStrasse();
			dieFiguren[11] = new Kniffel();
			dieFiguren[12] = new Chance();
		}
	}
	
	public void trageEin(int pFigurNr, int[] pAugenzahl)
	{
		dieFiguren[pFigurNr].trageEin(pAugenzahl);
		dieFiguren[pFigurNr].istEingetragen();
	}
	
	public int ermittleBonus()
	{
		int summe = 0;
		for (int i = 0; i < 5; i++)
		{
			summe += dieFiguren[i].liesPunktzahl();
		}
		
		if (summe >= 63)
		{
			return 35;
		}
		else {
			return 0;
		}
	}
	
	public void starteNeu()
	{
		
	}
	
	public boolean istBeendet()
	{
		for (int i = 0; i < dieFiguren.length; i++)
		{
			if (!dieFiguren[i].istEingetragen)
			{
				return false;
			}
		}
		return true;
	}
}
