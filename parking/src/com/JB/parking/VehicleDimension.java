package com.JB.parking;

public class VehicleDimension {

	public static void main(String[] args) {
int length = 310;
int width = 210;
int surface = length * width;
int perimeter = (length + width)/2;
int difference = length - width;
float ratio = (float)width/length;
System.out.println("La surface au sol de la voiture est :" +surface);
System.out.println("Le périmètre de la voiture est :" +perimeter);	
System.out.println("La difference entre la longueur et la largeur est :" +difference);
System.out.println("Le ratio entre la longueur et la largeur est de :" +ratio);

	}

}
