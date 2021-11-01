package Parte2.Filtros;

import Parte2.Composite.Participante;

public class FiltroInstrumento extends Filtro {
	
	private String instrumento;

	public FiltroInstrumento(String instrumento) {
		super();
		this.instrumento = instrumento;
	}

	@Override
	public boolean cumpleCualidad(Participante p1) {
		return p1.tocaInstrumento(instrumento);
	}

}
