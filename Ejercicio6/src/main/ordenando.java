package main;

import java.util.ArrayList;

public class ordenando {

	private ArrayList<String> formaOrdenar;

	public ordenando() {
	}

	public void orden(String condicion, int caso) {
		formaOrdenar = new ArrayList<>();
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

			if (caso == 1) {
				for (int i = 0; i < formaOrdenar.size(); i++) {
					for (int j = 0; j < formaOrdenar.size(); j++) {
						if (formaOrdenar.get(i).equals(formaOrdenar.get(j)) && i != j) {
							formaOrdenar.remove(j);
						}
					}
				}
				formaOrdenar.add("G");
			}
			if (caso != 3 && caso != 1) {
				for (int i = 0; i < formaOrdenar.size(); i++) {
					for (int j = 0; j < formaOrdenar.size(); j++) {
						if (formaOrdenar.get(i).equals(formaOrdenar.get(j)) && i != j) {
							formaOrdenar.remove(j);
						}
					}
				}
			}
		}
		System.out.println(formaOrdenar.toString());
	}

	public String resultado() {
		String ordenado = "";
		for (String aux : formaOrdenar) {
			ordenado += aux + " ";
		}
		return ordenado;
	}

	public ArrayList<String> getFormaOrdenar() {
		return formaOrdenar;
	}

	public void setFormaOrdenar(ArrayList<String> formaOrdenar) {
		this.formaOrdenar = formaOrdenar;
	}

}
