package main;

import java.util.ArrayList;

public class ordenando {

	private ArrayList<String> formaOrdenar;
	private String resultado;

	public ordenando() {
		formaOrdenar = new ArrayList<>();
	}

	public String orden(String condicion) {
		resultado= "";
		ArrayList<String> arSTR = new ArrayList<>();
		String[] letra_letra = condicion.split("");
		for (int i = 0; i < letra_letra.length; i++) {
			arSTR.add(letra_letra[i]);
		}
		if (formaOrdenar.toString().equals("[]")) {
			if (arSTR.get(1).equals("<")) {
				formaOrdenar.add(arSTR.get(0));
				formaOrdenar.add(arSTR.get(2));
			} else if (arSTR.get(1).equals(">")) {
				formaOrdenar.add(arSTR.get(2));
				formaOrdenar.add(arSTR.get(0));
			}
		} else {
			if (arSTR.get(1).equals("<")) {
				for (int i = 0; i < formaOrdenar.size(); i++) {
					if (formaOrdenar.get(i).equals(arSTR.get(0))) {
						formaOrdenar.add((i + 1), arSTR.get(2));
					}
				}
			}
			if (arSTR.get(1).equals(">")) {
				for (int i = 0; i < formaOrdenar.size(); i++) {
					if (formaOrdenar.get(i).equals(arSTR.get(0))) {
						formaOrdenar.add(i, arSTR.get(2));
						i++;
					}
				}
			}
			for (int i = 0; i < formaOrdenar.size(); i++) {
				for (int j = 0; j < formaOrdenar.size(); j++) {
					if (formaOrdenar.get(i).equals(formaOrdenar.get(j)) && i != j) {
						formaOrdenar.remove(j);
					}
				}
			}
		}
		for (String aux : formaOrdenar) {
			resultado += aux;
		}
		return resultado;
	}

	public ArrayList<String> getFormaOrdenar() {
		return formaOrdenar;
	}

	public void setFormaOrdenar(ArrayList<String> formaOrdenar) {
		this.formaOrdenar = formaOrdenar;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
}
