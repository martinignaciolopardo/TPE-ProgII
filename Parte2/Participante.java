package Parte2;

import java.util.ArrayList;

import Parte1.Filtro.TipoCualidad;

public class Participante extends ElementoBanda {
	
	private double edad;
	private String apellido;
	protected ArrayList<String>idiomas;
	protected ArrayList<String>generos;
	protected ArrayList<String>instrumentos;
	
	public Participante(String nombre, String apellido, double edad) {
		super(nombre);
		this.edad = edad;
		this.apellido = apellido;
		this.idiomas = new ArrayList<>();
		this.generos = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public double getEdad() {
		return this.edad;
	}
	
	public void addIdioma(String idioma) {
		this.idiomas.add(idioma);
	}
	
	public void addGeneros(String genero) {
		this.generos.add(genero);
	}
	
	public void addInstrumentos(String instrumento) {
		this.instrumentos.add(instrumento);
	}
	
	public boolean cantaIdioma(String idioma) {
		return idiomas.contains(idioma);
	}
	
	public boolean prefiereGenero(String genero) {
		return generos.contains(genero);
	}
	
	public boolean tocaInstrumento(String instrumento) {
		return instrumentos.contains(instrumento);
	}
	
	public String toString() {
		return "Nombre: "+getNombre()+" - Apellido: "+getApellido()+"\n";
	}

	@Override
	public ArrayList<String> getGenerosPreferencia() {
		ArrayList<String> generosPreferencia = new ArrayList<String>();
		for (String genero : generos) {
			generosPreferencia.add(genero);
		}return generosPreferencia;
	}

	@Override
	public ArrayList<String> getIdiomasInterpretables() {
		ArrayList<String> idiomasInterpretables = new ArrayList<String>();
		for (String idioma : idiomas) {
			idiomasInterpretables.add(idioma);
		}return idiomasInterpretables;
	}

	@Override
	public ArrayList<String> getInstrumentosInterpretables() {
		ArrayList<String> intrumentosInterpretables = new ArrayList<String>();
		for (String instrumento : instrumentos) {
			intrumentosInterpretables.add(instrumento);
		}return intrumentosInterpretables;
	}

	@Override
	public ArrayList<ElementoBanda> seleccionParticipante(TipoCualidad tipo) {
		ArrayList<ElementoBanda>lista=new ArrayList<>();
		if(tipo.cumpleCualidad(this)) {
			lista.add(this);
		}
		return lista;
	}

	@Override
	public boolean puedeCantarTema(Tema tema) {
		for (String genero : generos) {
			if(tema.tieneGenero(genero) && idiomas.contains(tema.getIdioma())) {
				return true;
			}
		}
		return false;
	}
}
