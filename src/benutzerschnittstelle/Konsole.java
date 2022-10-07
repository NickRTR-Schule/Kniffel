package benutzerschnittstelle;

import fachkonzept.Wuerfel;

public class Konsole
{
	public static void main(String[] args)
	{
		Wuerfel derWuerfel = new Wuerfel();
		derWuerfel.wirf();
		System.out.println(derWuerfel.liesAugenzahl());
	}
}
