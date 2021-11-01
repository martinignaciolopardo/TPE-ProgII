package Parte2;

import java.util.ArrayList;
import java.util.Collections;

import Parte2.Composite.ElementoBanda;
import Parte2.Composite.Participante;
import Parte2.Filtros.TipoCualidad;

public class Coach {
	
	protected ArrayList<ElementoBanda>elemento; // pueden ser solistas, grupos o bandas.
	
	public Coach() {
		this.elemento = new ArrayList<>();
	}
	
	public void addParticipante(ElementoBanda e) {
		elemento.add(e);
	}
	
	
	
	public ArrayList<String> instrumentosDeEquipo(){
		ArrayList<String> instrumentosEquipo = new ArrayList<>();
		for (ElementoBanda e : elemento) {
			instrumentosEquipo.addAll(e.getInstrumentosInterpretables());
		}
		return instrumentosEquipo;
	}
	
	public ArrayList<String> idiomasDeEquipo(){
		ArrayList<String> idiomasEquipo = new ArrayList<>();
		for (ElementoBanda e : elemento) {
			idiomasEquipo.addAll(e.getIdiomasInterpretables());
		}
		return idiomasEquipo;
	}
	
	
	public ArrayList<String> generosDeEquipo(){
		ComparadorApellido comparador = new ComparadorApellido();
		ArrayList<String> generosEquipo = new ArrayList<>();
		for (ElementoBanda elementoBanda : elemento) {
			generosEquipo.addAll(elementoBanda.getGenerosPreferencia());
		}
		Collections.sort(generosEquipo, comparador);
		return generosEquipo;
	}
	
	public double promedioEdadEquipo() {
		double promedio = 0;
		for (ElementoBanda elementoBanda : elemento) {
			promedio = elementoBanda.getEdad();
		}return promedio;
	}
	
	//falta adaptar los filtros al composite
	public Participante seleccionParticipante(TipoCualidad tipo) {
		for (Participante participante : equipo) {
			if(tipo.cumpleCualidad(participante))
				return participante;
		}
		return null;
	}
}
