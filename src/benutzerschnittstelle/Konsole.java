package benutzerschnittstelle;

import fachkonzept.Wuerfel;
import fachkonzept.Einser;

public class Konsole
{
	public static void main(String[] args)
	{
//		Wuerfel derWuerfel = new Wuerfel();
//		derWuerfel.wirf();
//		System.out.println(derWuerfel.liesAugenzahl());
		
		
		Einser dieEinser = new Einser();
		int[] augenzahlen = {2, 1, 1, 6, 1};
		dieEinser.trageEin(augenzahlen);
		
		System.out.println(dieEinser.istEingetragen());
		System.out.println(dieEinser.liesPunktzahl());
	}
}
