package GestioneScuola;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class scuola {
	HashMap<Integer, Persona> persone = new HashMap<>();
	Scanner scan = new Scanner(System.in);

	public void addAlunno(int id, String nome, String cognome, LocalDate dataDiNascita, String comuneNascita,
			String comuneResidenza, String sesso, String mail, List<voti> voti, String sezione, int classe,
			String tipo) {
		persone.put(id, new alunno(id, nome, cognome, dataDiNascita, comuneNascita, comuneResidenza, sesso, mail, voti,
				sezione, classe, tipo));
	}

	public void anagraficaAlunno() {
		int id = 0;
		while (true) {
			System.out.println("ID:");
			try {
				id = Integer.parseInt(scan.nextLine());
				if (persone.containsKey(id)) {
					System.out.println("ID già presente");
				} else
					break;
			} catch (Exception e) {
				System.out.println("ID non valido");
			}
		}
		System.out.println("Nome:");
		String nome = scan.nextLine();
		System.out.println("Cognome:");
		String cognome = scan.nextLine();
		LocalDate dataDiNascita = LocalDate.of(1800, 01, 01);
		while (true) {
			System.out.println("Data di Nascita (yyyy-mm-dd):");
			String sdataDiNascita = scan.nextLine();
			try {
				dataDiNascita = LocalDate.parse(sdataDiNascita);
				break;
			} catch (Exception e) {
				System.out.println("Data di nascita non riconosciuta");
			}
		}
		System.out.println("Comune Di nascita:");
		String comuneNascita = scan.nextLine();
		System.out.println("Comune Di residenza:");
		String comuneResidenza = scan.nextLine();
		String sesso = null;
		while (true) {
			System.out.println("Sesso:(m/f)");
			sesso = scan.nextLine().toUpperCase();
			if (sesso.equals("M") || sesso.equals("F")) {
				break;
			} else {
				System.out.println("Sesso non riconosciuto");
			}
		}
		System.out.println("Email:");
		String mail = scan.nextLine();
		System.out.println("sezione:");
		String sezione = scan.nextLine();
		int classe = 0;
		while (true) {
			try {
				System.out.println("classe");
				classe = Integer.parseInt(scan.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Sezione non valida, serve un numero");
			}
		}
		addAlunno(id, nome, cognome, dataDiNascita, comuneNascita, comuneResidenza, sesso, mail, null, sezione, classe,
				"studente");
	}

	void printListaAlunni() {
		System.out.println("Lista Studenti:");
		for (Map.Entry<Integer, Persona> entry : persone.entrySet()) {
			if (entry.getValue().getTipo().equals("studente")) {
				entry.getValue().printToString();
			}
		}
	}

	public void stampaVotoAlunno() {
		int id = 0;
		while (true) {
			System.out.println("Di quale ID studente vuoi stampare i voti?:");
			try {
				id = Integer.parseInt(scan.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("ID non valido");
			}
		}
		for (Map.Entry<Integer, Persona> entry : persone.entrySet()) {
			if (entry.getValue().getTipo().equals("studente") && entry.getValue().getId() == id) {

				((alunno) entry.getValue()).stampaVoti();
			} else {
				System.out.println("Id studente non trovato");
			}

		}
	}
	
	public void stampaMedia() {
		int id = 0;
		while (true) {
			System.out.println("Di quale ID studente vuoi stampare la media?:");
			try {
				id = Integer.parseInt(scan.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("ID non valido");
			}
		}
		for (Map.Entry<Integer, Persona> entry : persone.entrySet()) {
			if (entry.getValue().getTipo().equals("studente") && entry.getValue().getId() == id) {

				((alunno) entry.getValue()).getMediaVoti();
			} else {
				System.out.println("Id studente non trovato");
			}

		}
	}

	public void stampaMediaMateria() {
		int id = 0;
		while (true) {
			System.out.println("Di quale ID studente vuoi stampare la media per materia?:");
			try {
				id = Integer.parseInt(scan.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("ID non valido");
			}
		}
		for (Map.Entry<Integer, Persona> entry : persone.entrySet()) {
			if (entry.getValue().getTipo().equals("studente") && entry.getValue().getId() == id) {

				((alunno) entry.getValue()).getMediaVotiMateria();
			} else {
				System.out.println("Id studente non trovato");
			}

		}
	}
	
	public void addProf(int id, String nome, String cognome, LocalDate dataDiNascita, String comuneNascita,
			String comuneResidenza, String sesso, String mail, List<String> materie, List<String> lezioni,
			String tipo) {
		persone.put(id, new insegnante(id, nome, cognome, dataDiNascita, comuneNascita, comuneResidenza, sesso, mail,
				materie, lezioni, tipo));
	}

	public void anagraficaProf() {
		int id = 0;
		while (true) {
			System.out.println("ID:");
			try {
				id = Integer.parseInt(scan.nextLine());
				if (persone.containsKey(id)) {
					System.out.println("ID già presente");
				} else
					break;
			} catch (Exception e) {
				System.out.println("ID non valido");
			}
		}
		System.out.println("Nome:");
		String nome = scan.nextLine();
		System.out.println("Cognome:");
		String cognome = scan.nextLine();
		LocalDate dataDiNascita = LocalDate.of(1800, 01, 01);
		while (true) {
			System.out.println("Data di Nascita (yyyy-mm-dd):");
			String sdataDiNascita = scan.nextLine();
			try {
				dataDiNascita = LocalDate.parse(sdataDiNascita);
				break;
			} catch (Exception e) {
				System.out.println("Data di nascita non riconosciuta");
			}
		}
		System.out.println("Comune Di nascita:");
		String comuneNascita = scan.nextLine();
		System.out.println("Comune Di residenza:");
		String comuneResidenza = scan.nextLine();
		String sesso = null;
		while (true) {
			System.out.println("Sesso:(m/f)");
			sesso = scan.nextLine().toUpperCase();
			if (sesso.equals("M") || sesso.equals("F")) {
				break;
			} else {
				System.out.println("Sesso non riconosciuto");
			}
		}
		System.out.println("Email:");
		String mail = scan.nextLine();
		addProf(id, nome, cognome, dataDiNascita, comuneNascita, comuneResidenza, sesso, mail, null, null,
				"insegnante");
	}

	void printListaProf() {
		System.out.println("Lista Insegnanti:");
		for (Map.Entry<Integer, Persona> entry : persone.entrySet()) {
			if (entry.getValue().getTipo().equals("insegnante")) {
				entry.getValue().printToString();
			}
		}
	}

	public void addVoto() {
		int id = 0;
		while (true) {
			System.out.println("A quale ID studente vuoi aggiungere un voto?:");
			try {
				id = Integer.parseInt(scan.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("ID non valido");
			}
		}
		for (Map.Entry<Integer, Persona> entry : persone.entrySet()) {
			if (entry.getValue().getTipo().equals("studente") && entry.getValue().getId() == id) {
				System.out.println("Materia:");
				String materia = scan.nextLine();
				int voto = 0;
				while (true) {
					System.out.println("Voto:");
					try {
						voto = Integer.parseInt(scan.nextLine());

						break;
					} catch (Exception e) {
						System.out.println("Voto non valido");
					}
				}
				LocalDate dataVoto = LocalDate.of(1800, 01, 01);
				while (true) {
					System.out.println("Data voto (yyyy-mm-dd):");
					String sDataVoto = scan.nextLine();
					try {
						dataVoto = LocalDate.parse(sDataVoto);
						break;
					} catch (Exception e) {
						System.out.println("Data voto non riconosciuta");
					}
				}
				((alunno) entry.getValue()).aggiungiVoto(materia, voto, dataVoto);
			} else {
				System.out.println("Id studente non trovato");
			}

		}
	}

	public void addMateria() {
		int id = 0;
		while (true) {
			System.out.println("A quale ID Insegnante vuoi aggiungere una materia?:");
			try {
				id = Integer.parseInt(scan.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("ID non valido");
			}
		
		}
		for (Map.Entry<Integer, Persona> entry : persone.entrySet()) {
			if (entry.getValue().getTipo().equals("insegnante") && entry.getValue().getId() == id) {
				System.out.println("Materia:");
				String materia = scan.nextLine();
				((insegnante) entry.getValue()).addMaterie(materia);
			} 

		}
	}

	public void addLezione() {
		int id = 0;
		while (true) {
			System.out.println("A quale ID Insegnante vuoi aggiungere una lezione?:");
			try {
				id = Integer.parseInt(scan.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("ID non valido");
			}
		}
		for (Map.Entry<Integer, Persona> entry : persone.entrySet()) {
			if (entry.getValue().getTipo().equals("insegnante") && entry.getValue().getId() == id) {
				System.out.println("Lezione:");
				String lezione = scan.nextLine();
				((insegnante) entry.getValue()).addLezioni(lezione);
			} 
		}
	}

	public void stampaLezioniProf() {
		int id = 0;
		while (true) {
			System.out.println("Di quale ID insegnante vuoi stampare le lezioni??:");
			try {
				id = Integer.parseInt(scan.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("ID non valido");
			}
		}
		for (Map.Entry<Integer, Persona> entry : persone.entrySet()) {
			if (entry.getValue().getTipo().equals("insegnante") && entry.getValue().getId() == id) {

				((insegnante) entry.getValue()).getLezioni();
			} 

		}
	}

	public void stampaMaterieProf() {
		int id = 0;
		while (true) {
			System.out.println("Di quale ID insegnante vuoi stampare le materie??:");
			try {
				id = Integer.parseInt(scan.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("ID non valido");
			}
		}
		for (Map.Entry<Integer, Persona> entry : persone.entrySet()) {
			if (entry.getValue().getTipo().equals("insegnante") && entry.getValue().getId() == id) {

				((insegnante) entry.getValue()).getMaterie();
			}

		}
	}

	public void addSegretario(int id, String nome, String cognome, LocalDate dataDiNascita, String comuneNascita,
			String comuneResidenza, String sesso, String mail,String ufficio, LocalTime orarioLavoroEntrata, LocalTime orarioLavoroUscita, String tipo) {
		persone.put(id, new segretario(id, nome, cognome, dataDiNascita, comuneNascita, comuneResidenza, sesso, mail,
				ufficio, orarioLavoroEntrata,orarioLavoroUscita, tipo));
	}

	public void anagraficaSegretario() {
		int id = 0;
		while (true) {
			System.out.println("ID:");
			try {
				id = Integer.parseInt(scan.nextLine());
				if (persone.containsKey(id)) {
					System.out.println("ID già presente");
				} else
					break;
			} catch (Exception e) {
				System.out.println("ID non valido");
			}
		}
		System.out.println("Nome:");
		String nome = scan.nextLine();
		System.out.println("Cognome:");
		String cognome = scan.nextLine();
		LocalDate dataDiNascita = LocalDate.of(1800, 01, 01);
		while (true) {
			System.out.println("Data di Nascita (yyyy-mm-dd):");
			String sdataDiNascita = scan.nextLine();
			try {
				dataDiNascita = LocalDate.parse(sdataDiNascita);
				break;
			} catch (Exception e) {
				System.out.println("Data di nascita non riconosciuta");
			}
		}
		System.out.println("Comune Di nascita:");
		String comuneNascita = scan.nextLine();
		System.out.println("Comune Di residenza:");
		String comuneResidenza = scan.nextLine();
		String sesso = null;
		while (true) {
			System.out.println("Sesso:(m/f)");
			sesso = scan.nextLine().toUpperCase();
			if (sesso.equals("M") || sesso.equals("F")) {
				break;
			} else {
				System.out.println("Sesso non riconosciuto");
			}
		}
		System.out.println("Email:");
		String mail = scan.nextLine();
		System.out.println("Ufficio:");
		String ufficio = scan.nextLine();
		LocalTime orarioLavoroEntrata = LocalTime.of(01, 01);
		while (true) {
			System.out.println("Orario di lavoro Entrata (hh:mm):");
			String sOrarioLavoroEntrata = scan.nextLine();
			try {
				orarioLavoroEntrata = LocalTime.parse(sOrarioLavoroEntrata);
				break;
			} catch (Exception e) {
				System.out.println("Orario non riconosciuto");
			}
		}
		LocalTime orarioLavoroUscita = LocalTime.of(01, 01);
		while (true) {
			System.out.println("Orario di lavoro Uscita (hh:mm):");
			String sOrarioLavoroUscita = scan.nextLine();
			try {
				orarioLavoroUscita = LocalTime.parse(sOrarioLavoroUscita);
				break;
			} catch (Exception e) {
				System.out.println("Orario non riconosciuto");
			}
		}
		addSegretario(id, nome, cognome, dataDiNascita, comuneNascita, comuneResidenza, sesso, mail, ufficio, orarioLavoroEntrata,
				orarioLavoroUscita, "segretario");
	}

	void printListaSegretari() {
		System.out.println("Lista segretari:");
		for (Map.Entry<Integer, Persona> entry : persone.entrySet()) {
			if (entry.getValue().getTipo().equals("segretario")) {
				entry.getValue().printToString();
			}
		}
	}
}