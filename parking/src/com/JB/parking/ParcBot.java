package com.JB.parking;

public class ParcBot {
	/**
	 * Ceci la fonction principale d'un programme JAVA
	 * @param args Représente les données passées en paramètre lors du lancement du programme
	 */
    public static void main(String[] args) {
    	sayHello(args);	
    }

	/**
	 * Permet d'accueillir et de présenter des services l'utilisateurs potentiel du Parking 
	 * @param args Représente le nom de l'utilisateur potentiel
	 */
	private static void sayHello(String[] args) {
		String welcomeMessage = "Hello " + args[0] + " , Binvenue au Parking Big Show";
    	String services = "Nous offrons les services suivants: Gardinage, Laverie...";
    	String warning = "Places restantes: 20!";
    	 System.out.println(welcomeMessage);
    	 System.out.println(services);
    	 System.out.println(warning.toUpperCase());
	}
   
}

