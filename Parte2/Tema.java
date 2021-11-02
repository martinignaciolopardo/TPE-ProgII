package Parte2;

import java.util.ArrayList;

public class Tema {
	private String titulo;
	private String idioma;
	private ArrayList<String>generos;
	private ArrayList<String>instrumentos;
	
	public Tema(String titulo, String idioma, ArrayList<String> generos, ArrayList<String> instrumentos) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.generos = generos;
		this.instrumentos = instrumentos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void addGenero(String genero) {
		generos.add(genero);
	}
	
	public void addInstrumento(String instrumento) {
		instrumentos.add(instrumento);
	}

	public boolean tieneGenero(String genero) {
		return generos.contains(genero);
	}
}
