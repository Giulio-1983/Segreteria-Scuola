package GestioneScuola;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class insegnante extends Persona {
	private List<String> materie = new ArrayList<>();
	private List<String> lezioni = new ArrayList<>();

	public insegnante(int id, String nome, String cognome, LocalDate dataDiNascita, String comuneNascita,
			String comuneResidenza, String sesso, String mail, List<String> materie, List<String> lezioni, String tipo) {
		super(id, nome, cognome, dataDiNascita, comuneNascita, comuneResidenza, sesso, mail, tipo);
	
	}
public void addProf() {
	
}
	public void getMaterie() {
		for (String element : materie) {
			System.out.println(element);
		}
	}

	public void getLezioni() {
		for (String element : lezioni) {
			System.out.println(element);
		}

	}

	public void addMaterie(String materia) {
		materie.add(materia);
	}

	public void addLezioni(String lezione) {
		lezioni.add(lezione);
	}

}
