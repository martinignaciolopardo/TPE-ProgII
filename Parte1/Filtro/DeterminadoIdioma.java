package Parte1.Filtro;


import Parte2.ElementoBanda;

public class DeterminadoIdioma extends TipoCualidad {
	
	private String idioma;
	
	public DeterminadoIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public boolean cumpleCualidad(ElementoBanda e1) {
		return e1.cantaIdioma(idioma);
	}

}
