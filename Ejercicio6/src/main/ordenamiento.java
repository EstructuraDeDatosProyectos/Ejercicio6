package main;

import java.util.Scanner;

public class ordenamiento {

	private static Scanner sc = new Scanner(System.in);
	private static ordenando order = new ordenando();;

	public static void main(String[] args) {
		int numCasos = sc.nextInt();
		int casos = 1;
		while (numCasos > 0) {
			sc.nextInt();
			sc.nextLine();
			String letras = sc.nextLine().toUpperCase();
			String[] letrasI = letras.split(" ");
			String operaciones = sc.nextLine().toUpperCase();
			String[] conSeparadas = operaciones.split(" ");
			for (int i = 0; i < conSeparadas.length; i++) {
				order.orden(conSeparadas[i], casos);
			}
			System.out.println("Caso #"+casos);
			System.out.println(order.resultado());
			casos++;
			numCasos--;
		}

	}

}
