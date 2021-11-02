package Parte1.Filtro;

import Parte2.ElementoBanda;

public class TocaInstrumento extends TipoCualidad {
	
	private String instrumento;

	public TocaInstrumento(String instrumento) {
		super();
		this.instrumento = instrumento;
	}

	@Override
	public boolean cumpleCualidad(ElementoBanda e1) {
		return e1.tocaInstrumento(instrumento);
	}

}
