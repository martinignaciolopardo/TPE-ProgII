package Parte2.Composite;

import java.util.ArrayList;

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
}
