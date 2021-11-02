package Parte2;

import java.util.ArrayList;



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
	
	public boolean cumpleRestriccion(ElementoBanda e) {
		int contador = 0;
		for (String string : idiomas) {
			if(e.prefiereGenero(genero) && e.tocaInstrumento(instrumento) && e.cantaIdioma(string))
				contador++;
		}
		return contador == idiomas.size();
	}
}
