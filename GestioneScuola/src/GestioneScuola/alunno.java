package GestioneScuola;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class alunno extends Persona {
	private List<voti> voti = new ArrayList<>();
	private String sezione;
	private int classe;

	public alunno(int id, String nome, String cognome, LocalDate dataDiNascita, String comuneNascita,
			String comuneResidenza, String sesso, String mail, List<voti> voti, String sezione, int classe, String tipo) {
		super(id, nome, cognome, dataDiNascita, comuneNascita, comuneResidenza, sesso, mail,tipo);
		this.sezione = sezione;
		this.classe = classe;
	}

	public int getClasse() {
		return classe;
	}

	public String getSessione() {
		return sezione;
	}

	public void aggiungiVoto(String materia, int voto, LocalDate data) {
		voti.add(new voti(materia, voto, data));
	}

	public void stampaVoti() {
		for (voti element : voti) {
			System.out.println(element.votoToSring());
		}
	}

	public void getMediaVoti() {
		int n = 0;
		int tot = 0;
		for (voti element : voti) {
			tot += element.getVoto();
			n++;
		}
		double media = (tot / n);
		System.out.println(media);
	}

	public void getMediaVotiMateria() {
		ArrayList<String> materieMedia = new ArrayList<>();
		for (voti element : voti) {
			String mat = element.getMateria();
			if (!materieMedia.contains(mat))
				materieMedia.add(mat);

		}

		for (String element : materieMedia) {
			double tot = 0;
			int n = 0;
			for (voti elemento : voti) {
				if (elemento.getMateria().equals(element)) {
					tot += elemento.getVoto();
					n = n + 1;
				}
			}
			System.out.println("media in " +element + " = " +tot/n);
		}
	}
	
	@Override
	public void printToString() {
		System.out.println("ID: " + getId() + " --- Nome: " + getNome()+ " --- Cognome: "+ getCognome());
	}
}