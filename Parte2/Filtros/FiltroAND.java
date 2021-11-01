package Parte2.Filtros;

import Parte2.Composite.Participante;

public class FiltroAND extends Filtro{
	
	private Filtro cualidad1;
	private Filtro cualidad2;
	
	public FiltroAND(Filtro cualidad1, Filtro cualidad2) {
		this.cualidad1 = cualidad1;
		this.cualidad2 = cualidad2;
	}

	@Override
	public boolean cumpleCualidad(Participante p1) {
		return cualidad1.cumpleCualidad(p1) && cualidad2.cumpleCualidad(p1);
	}

}
