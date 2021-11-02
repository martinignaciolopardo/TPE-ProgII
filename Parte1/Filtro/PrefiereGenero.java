package Parte1.Filtro;

import Parte2.ElementoBanda;

public class PrefiereGenero extends TipoCualidad {
	
	private String genero;

	public PrefiereGenero(String genero) {
		super();
		this.genero = genero;
	}

	@Override
	public boolean cumpleCualidad(ElementoBanda e1) {
		return e1.prefiereGenero(genero);
	}

}
