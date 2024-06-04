package it.exercise;

import java.util.Scanner;

public class PasswordGenerator {
		
	public static void main(String[] args) {
		
		
	System.out.println("Verrà generata una password" + " con le info fornite"); 
	
	System.out.println("Nome:");
	Scanner scan = new Scanner(System.in);
	String Nome = scan.nextLine();
	
	System.out.println("Cognome:");
	String Cognome = scan.nextLine();
	
	System.out.println("Colore preferito:");
	String Colore = scan.nextLine();
	
	
	
	System.out.println("Giorno di nascita:");
	int day = scan.nextInt();
	System.out.println("Mese di nascita:");
	int month = scan.nextInt();
	System.out.println("Anno di nascita:");
	int year = scan.nextInt();
	
	System.out.println("Calcolo della password");
	
	String Password = Nome + "-" + Cognome + "-" + Colore + "-" + (day + month + year);
	
	System.out.println("la tua password è: " + Password);
	
	

	
	
	
	
	
	
	
	}
}
