package Parte1.Filtro;

import Parte2.ElementoBanda;
import Parte2.Tema;

public class CantaTema extends TipoCualidad {

	private Tema tema;

	public CantaTema(Tema tema) {
		this.tema = tema;
	}

	@Override
	public boolean cumpleCualidad(ElementoBanda e1) {
		return e1.puedeCantarTema(tema);
	}
	
	
}
