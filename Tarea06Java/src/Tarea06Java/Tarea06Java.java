package Tarea06Java;

import java.util.Scanner;

public class Tarea06Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Crear un programa en Java que realice lo siguiente:
		eduardo
		odraude
		Debe solicitar al usuario por consola una palabra o frase.
		Debe mostrar por consola el texto escrito al revés.
		*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("escribe una palabra y te daré el texto escrito al revés");
		
		String palabra =s.nextLine().toLowerCase();
		String palabraAlReves = backwards(palabra);
		
		System.out.println("la palabra al revés es: " + palabraAlReves);
	}

	private static String backwards(String palabra) {
		// TODO Auto-generated method stub
		return new StringBuilder(palabra).reverse().toString();
	}

}
