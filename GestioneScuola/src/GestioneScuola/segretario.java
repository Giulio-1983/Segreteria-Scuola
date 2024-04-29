package GestioneScuola;

import java.time.LocalDate;
import java.time.LocalTime;

public class segretario extends Persona{
	private String ufficio;
	private LocalTime orarioLavoroEntrata;
	private LocalTime orarioLavoroUscita;
	public segretario(int id, String nome, String cognome, LocalDate dataDiNascita, String comuneNascita,
			String comuneResidenza, String sesso, String mail,String ufficio, LocalTime orarioLavoroEntrata, LocalTime orarioLavoroUscita, String tipo) {
		super(id, nome, cognome, dataDiNascita, comuneNascita, comuneResidenza, sesso, mail, tipo);
		this.ufficio = ufficio;	
		this.orarioLavoroEntrata = orarioLavoroEntrata;
		this.orarioLavoroUscita = orarioLavoroUscita;
	}
	public String getUfficio() {
		return ufficio;
	}
	public LocalTime getOrarioLavoroEntrata() {
		return orarioLavoroEntrata;
	}
	public LocalTime getOrarioLavoroUscita() {
		return orarioLavoroUscita;
	}



}
