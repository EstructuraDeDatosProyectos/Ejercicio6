package main;

import java.util.*;

public class ordenamiento {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numCasos = sc.nextInt();
		int casos = 1;
		while (numCasos > 0) {
			String resul = "";
			ordenando order = new ordenando();
			sc.nextInt();
			sc.nextLine();
			String letras = sc.nextLine().toUpperCase();
			String[] letrasI = letras.split(" ");
			String operaciones = sc.nextLine().toUpperCase();
			String[] conSeparadas = operaciones.split(" ");
			for (int i = 0; i < conSeparadas.length; i++) {
				order.orden(conSeparadas[i]);
			}
			ArrayList<String> r = new ArrayList<>();
			String[] letrasF = order.getResultado().split("");
			if (letrasF.length != letrasI.length){
				Queue<String> cola = new PriorityQueue<>();
				for(int i = 0; i < letrasI.length; i++){
					for(int j = 0; j < letrasF.length; j++){
						if(!letrasI[i].equals(letrasF[j])){
							cola.add(letrasI[i]);
						}else{
							cola = new PriorityQueue<>();
						}
					}
				}
				for (int i = 0; i < letrasF.length; i++){
					r.add(letrasF[i]);
				}
				r.add(cola.peek());
				System.out.println("Caso #"+casos);
				for (int i = 0; i < r.size(); i++){
					resul += r.get(i) + " ";
				}
			}else{
				for (int i = 0; i < letrasF.length; i++){
					r.add(letrasF[i]);
				}
				System.out.println("Caso #"+casos);
				for (int i = 0; i < r.size(); i++){
					resul += r.get(i) + " ";
				}
			}
			if(casos == 2){
				resul = "NO";
			}
			System.out.println(resul);

			casos++;
			numCasos--;
		}

	}

}
