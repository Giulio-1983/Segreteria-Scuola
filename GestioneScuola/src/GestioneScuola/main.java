package GestioneScuola;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		scuola scuola = new scuola();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Scegli tipologia profilo\n\nA) Studente\nB)Insegnante\nC)Segretario\nG) per uscire");

			String n = s.nextLine().toUpperCase();
			switch (n) {
			case "A": {
				boolean w = true;
				while (w) {
					System.out.println(
							"\nScegli come interagire\n\nA)Stampa lista Alunni\nB)Aggiungi Alunno\nC)Aggiungi voto alunno\nD)Stampa voti alunno\nE)Stampa media voti alunno\nF)stampa media voti alunno per materia\nG)Torna indietro");
					String m = s.nextLine().toUpperCase();
					switch (m) {
					case "A": {
						scuola.printListaAlunni();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "B": {
						scuola.anagraficaAlunno();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "C": {
						scuola.addVoto();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "D": {
						scuola.stampaVotoAlunno();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "E": {
						scuola.stampaMedia();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "F": {
						scuola.stampaMediaMateria();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "G": {
						w = false;
						break;
					}
					}
				}
			}
			case "B": {
				boolean w = true;
				while (w) {
					System.out.println(
							"\nScegli come interagire\n\nA)Stampa lista Insegnanti\nB)Aggiungi Insegnante\nC)Aggiungi lezione Insegnante\nD)Aggiungi Materia Insegnante\nE)Stampa lezioni insegnante\nF)stampa materie insegnante\nG)Torna indietro");
					String o = s.nextLine().toUpperCase();
					switch (o) {
					case "A": {
						scuola.printListaProf();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "B": {
						scuola.anagraficaProf();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "C": {
						scuola.addLezione();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "D": {
						scuola.addMateria();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "E": {
						scuola.stampaLezioniProf();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "F": {
						scuola.stampaMaterieProf();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "G": {
						w = false;
						break;
					}
					}

				}

			}
			case "C": {
				boolean w = true;
				while (w) {
					System.out.println(
							"\nScegli come interagire\n\nA)Stampa lista Segretari\nB)Aggiungi Segretario\nG)Torna indietro");
					String p = s.nextLine().toUpperCase();
					switch (p) {
					case "A": {
						scuola.printListaSegretari();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "B": {
						scuola.anagraficaSegretario();
						System.out.println("------------");
						String wait = s.nextLine();
						break;
					}
					case "G": {
						w = false;
						break;
					}
					}
				}

			}
			case "G": {
				return;
			}
			}
		}
	}
}
