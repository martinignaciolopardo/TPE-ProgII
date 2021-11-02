package Parte2;

import java.util.ArrayList;
import java.util.Collection;

import Parte1.Filtro.TipoCualidad;

public abstract class ElementoBanda {

	protected String nombre;

	public ElementoBanda(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public abstract double getEdad();
	public abstract ArrayList<String>getGenerosPreferencia();
	public abstract ArrayList<String>getIdiomasInterpretables();
	public abstract ArrayList<String>getInstrumentosInterpretables();

	public abstract boolean cantaIdioma(String idioma);
	public abstract boolean tocaInstrumento(String instrumento);
	public abstract boolean prefiereGenero(String genero);

	public abstract ArrayList<ElementoBanda> seleccionParticipante(TipoCualidad tipo);

	public abstract boolean puedeCantarTema(Tema tema);
}
