package main;

import java.util.Scanner;

public class ordenamiento {

	private static Scanner sc = new Scanner(System.in);;

	public static void main(String[] args) {

		if ("A".compareTo("B") < "B".compareTo("A")) {
			System.out.println("Mi pana");
		} else if ("B".compareTo("A") < "A".compareTo("B")) {
			System.out.println("Hp");
		}
		System.out.println("Casos: ");
		int numCasos = sc.nextInt();
		int casos = 1;
		while (numCasos > 0) {
			System.out.println("Num Letras: ");
			int numletras = sc.nextInt();
			for (int i = 0; i < numletras; i++) {
				System.out.println("Letras: ");
				String letras = sc.next().toUpperCase();
				System.out.println(letras);
			}
			numCasos--;
		}

	}

}
