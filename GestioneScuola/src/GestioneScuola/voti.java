package GestioneScuola;

import java.time.LocalDate;

public class voti {
private String materia;
private int voto;
private LocalDate dataVoto;

public voti(String materia, int voto, LocalDate dataVoto) {
	this.materia=materia;
	this.voto=voto;
	this.dataVoto=dataVoto;
}
public String getMateria() {
	return materia;
}
public int getVoto() {
	return voto;
}
public LocalDate getDataVoto() {
	return dataVoto;
}
public String votoToSring() {
	return "Materia: " + materia + ", Voto: " + voto + ", Data: " + dataVoto;
}
}
