package Parte1.Filtro;


import Parte2.ElementoBanda;

public class FiltroNOT extends TipoCualidad {
	
	private TipoCualidad cualidad;
	
	public FiltroNOT(TipoCualidad cualidad) {
		this.cualidad = cualidad;
	}

	@Override
	public boolean cumpleCualidad(ElementoBanda e1) {
		return !cualidad.cumpleCualidad(e1);
	}

}
