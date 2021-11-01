package Parte2.Filtros;

import Parte2.Composite.Participante;

public class FiltroNOT extends Filtro {
	
	private Filtro cualidad;
	
	public FiltroNOT(Filtro cualidad) {
		this.cualidad = cualidad;
	}

	@Override
	public boolean cumpleCualidad(Participante p1) {
		return !cualidad.cumpleCualidad(p1);
	}

}
