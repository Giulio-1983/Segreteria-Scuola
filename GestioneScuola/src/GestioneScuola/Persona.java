package GestioneScuola;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {

	private int id;
	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	private String comuneNascita;
	private String comuneResidenza;
	private String sesso;
	private String mail;
	private String tipo;

	public Persona(int id, String nome, String cognome, LocalDate dataDiNascita, String comuneNascita,String comuneResidenza ,String sesso,
			String mail, String tipo) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.comuneNascita = comuneNascita;
		this.comuneResidenza=comuneResidenza;
		this.sesso = sesso;
		this.mail = mail;
		this.tipo=tipo;

	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public LocalDate getDataNascita() {
		return dataDiNascita;
	}
	public String getComuneNascita() {
		return comuneNascita;
	}
	public String getComuneResidenza() {
		return comuneResidenza;
	}
	public String getSesso() {
		return sesso;
	}
	public String getMail() {
		return mail;
	}
	public String getTipo() {
		return tipo;
	}

	public void printToString() {
		System.out.println("ID: " + getId() + " --- Nome: " + getNome()+ " --- Cognome: "+ getCognome());
	}

}
