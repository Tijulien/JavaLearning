package com.JB.parking;

public class ParcBot {
	
    public static void main(String[] args) {
 displayWelcomeMessage(args[0]);
 displayServices();
 displayWarning();
    }
	
public static void displayWelcomeMessage (String name){
 String welcomeMessage = "Hello  " + name + ", Bienvenue au parking Big Show";
 System.out.println(welcomeMessage);
    }


 public static void displayServices(){
		String services = "Nous offrons les services suivants: Gardinage, Lavage intérieur et extérieur";
		System.out.println(services);
	}
	public static void displayWarning(){
		
			String warning = "Nombre de places restantes: 20";
			System.out.println(warning.toUpperCase());
	}
	
}

