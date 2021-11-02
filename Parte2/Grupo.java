package Parte2;

import java.util.ArrayList;

import Parte1.Filtro.TipoCualidad;

public class Grupo extends ElementoBanda {

	private ArrayList<ElementoBanda> elementos;
	
	public Grupo(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}
	
	public void addElementoBanda(ElementoBanda e) {
		elementos.add(e);
	}
	
	public String toString() {
		return getNombre()+"\n";
	}

	public double getEdad() {
		double suma = 0;
		int cantidad = 0;
		for (ElementoBanda elementoBanda : elementos) {
			suma += elementoBanda.getEdad();
			cantidad++;
		}return suma/cantidad;
	}
	
	 /*
		Los géneros de preferencia se calculan como la intersección de 
		los géneros de preferencia de todos sus miembros. Por ejemplo si un
		grupo tienen dos miembros A y B, el integrante A tiene preferencias
		{g1,g2,g3,g4} y el integrante B las preferencias {g1,g4,g7,g11}
		el grupo tendrá como preferencias de géneros {g1, g4}
	 */

	@Override
	public ArrayList<String> getGenerosPreferencia() {
		ArrayList<String> generosPreferencia = new ArrayList<String>();
		ArrayList<String> parcial = new ArrayList<String>();
		for (ElementoBanda elementoBanda : elementos) {
			ArrayList<String> aux = new ArrayList<String>();
			aux.addAll(elementoBanda.getGenerosPreferencia());
			for (String genero : aux) {
				if (parcial.size() == 0) {
					parcial.addAll(aux);
				}if (parcial.contains(genero)) {
					if (!generosPreferencia.contains(genero)) {
						generosPreferencia.add(genero);
					}
				}
			}
		}return generosPreferencia;
	}

	/*
		En el caso de los idiomas que pueden interpretar
		una banda o grupo se considera la unión de los idiomas 
		de todos sus miembros (no pueden existir repetidos), lo
		mismo ocurre para los instrumentos que puede tocar una banda.
	 */

	@Override
	public ArrayList<String> getIdiomasInterpretables() {
		ArrayList<String> idiomasInterpretables = new ArrayList<String>();
		for (ElementoBanda elementoBanda : elementos) {
			ArrayList<String> aux = new ArrayList<String>();
			aux.addAll(elementoBanda.getIdiomasInterpretables());
			for (String idioma : aux) {
				if (idiomasInterpretables.size() == 0 || !(idiomasInterpretables.contains(idioma))) {
					idiomasInterpretables.add(idioma);
				}
			}
		}return idiomasInterpretables;
	}

	@Override
	public ArrayList<String> getInstrumentosInterpretables() {
		ArrayList<String> instrumentosInterpretables = new ArrayList<String>();
		for (ElementoBanda elementoBanda : elementos) {
			ArrayList<String> aux = new ArrayList<String>();
			aux.addAll(elementoBanda.getInstrumentosInterpretables());
			for (String instrumento : aux) {
				if (instrumentosInterpretables.size() == 0 || !(instrumentosInterpretables.contains(instrumento))) {
					instrumentosInterpretables.add(instrumento);
				}
			}
		}return instrumentosInterpretables;
	}

	@Override
	public boolean cantaIdioma(String idioma) {
		ArrayList<String> idiomas = getIdiomasInterpretables();
		return idiomas.contains(idioma);
	}

	@Override
	public boolean tocaInstrumento(String instrumento) {
		ArrayList<String> instrumentos= getInstrumentosInterpretables();
		return instrumentos.contains(instrumento);
	}

	@Override
	public boolean prefiereGenero(String genero) {
		ArrayList<String> generosPreferencia = getGenerosPreferencia();
		return generosPreferencia.contains(genero);
	}

	@Override
	public ArrayList<ElementoBanda> seleccionParticipante(TipoCualidad tipo) {
		ArrayList<ElementoBanda>lista=new ArrayList<>();
		if(tipo.cumpleCualidad(this)) {
			lista.add(this);
			return lista;
		}else {
			for (ElementoBanda e : elementos) {
				if(tipo.cumpleCualidad(e)) {
					lista.add(e);
				}
			}
			return lista;
		}
	}

	@Override
	public boolean puedeCantarTema(Tema tema) {
		ArrayList<String> idiomas = getIdiomasInterpretables();
		ArrayList<String> generosPreferencia = getGenerosPreferencia();
		for (String genero : generosPreferencia) {
			if(tema.tieneGenero(genero) && idiomas.contains(tema.getIdioma())) {
				return true;
			}
		}
		return false;
	}
	
	
	
	

}
