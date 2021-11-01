package Parte2.Filtros;

import Parte2.Composite.Participante;

public class FiltroIdioma extends Filtro {
	
	private String idioma;
	
	public FiltroIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public boolean cumpleCualidad(Participante p1) {
		return p1.cantaIdioma(idioma);
	}

}
