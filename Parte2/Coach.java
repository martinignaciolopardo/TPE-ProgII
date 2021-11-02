package Parte2;

import java.util.ArrayList;
import java.util.Collections;


import Parte1.Filtro.TipoCualidad;

public class Coach {
	
	protected ArrayList<ElementoBanda>equipo; // pueden ser solistas, grupos o bandas.
	
	public Coach() {
		this.equipo = new ArrayList<>();
	}
	
	public void addParticipante(ElementoBanda e) {
		equipo.add(e);
	}
	
	
	
	public ArrayList<String> instrumentosDeEquipo(){
		ArrayList<String> instrumentosEquipo = new ArrayList<>();
		for (ElementoBanda e : equipo) {
			ArrayList<String> aux = new ArrayList<String>();
			aux.addAll(e.getInstrumentosInterpretables());
			for (String instrumento : aux) {
				if(!instrumentosEquipo.contains(instrumento)) {
					instrumentosEquipo.add(instrumento);
				}
			}
		}
		return instrumentosEquipo;
	}
	
	public ArrayList<String> idiomasDeEquipo(){
		ArrayList<String> idiomasEquipo = new ArrayList<>();
		for (ElementoBanda e : equipo) {
			ArrayList<String> aux = new ArrayList<String>();
			aux.addAll(e.getIdiomasInterpretables());
			for (String idioma : aux) {
				if(!idiomasEquipo.contains(idioma)) {
					idiomasEquipo.add(idioma);
				}
			}
		}
		return idiomasEquipo;
	}
	
	
	public ArrayList<String> generosDeEquipo(){
		ComparadorApellido comparador = new ComparadorApellido();
		ArrayList<String> generosEquipo = new ArrayList<>();
		for (ElementoBanda elementoBanda : equipo) {
			ArrayList<String> aux = new ArrayList<String>();
			aux.addAll(elementoBanda.getGenerosPreferencia());
			for (String genero : aux) {
				if(!generosEquipo.contains(genero)) {
					generosEquipo.add(genero);
				}
			}
		}
		Collections.sort(generosEquipo, comparador);
		return generosEquipo;
	}
	
	public double promedioEdadEquipo() {
		double promedio = 0;
		for (ElementoBanda elementoBanda : equipo) {
			promedio = elementoBanda.getEdad();
		}return promedio;
	}
	
	//falta adaptar los filtros al composite
	public ArrayList<ElementoBanda> seleccionParticipante(TipoCualidad tipo) {
		ArrayList<ElementoBanda>lista=new ArrayList<>();
		for (ElementoBanda elemento : equipo) {
			lista.addAll(elemento.seleccionParticipante(tipo));
		}
		return lista;
	}
}
