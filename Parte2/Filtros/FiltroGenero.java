package Parte2.Filtros;

import Parte2.Composite.Participante;

public class FiltroGenero extends Filtro {
	
	private String genero;

	public FiltroGenero(String genero) {
		super();
		this.genero = genero;
	}

	@Override
	public boolean cumpleCualidad(Participante p1) {
		return p1.prefiereGenero(genero);
	}

}
