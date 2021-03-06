package Parte2;

import java.util.ArrayList;

import Parte2.Composite.Participante;

//FALTA ADAPTARLO AL COMPOSITE
public class RestriccionParticipante {
	
	private String instrumento;
	private String genero;
	private ArrayList<String>idiomas;
	
	public RestriccionParticipante(String instrumento, String genero) {
		this.instrumento = instrumento;
		this.genero = genero;
		this.idiomas = new ArrayList<>();
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void addIdioma(String idioma) {
		idiomas.add(idioma);
	}
	
	public void removeIdioma(String idioma) {
		for (String i : idiomas) {
			if(i.equals(idioma)) {
				idiomas.remove(i);
			}
		}
	}
	
	public boolean cumpleRestriccion(Participante p1) {
		int contador = 0;
		for (String string : idiomas) {
			if(p1.prefiereGenero(genero) && p1.tocaInstrumento(instrumento) && p1.cantaIdioma(string))
				contador++;
		}
		return contador == idiomas.size();
	}
}
