package rpsPackage;

import java.util.Scanner;

public class PlayerInput 
{
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String getString()
	{
		return sc.nextLine();
	}

}
