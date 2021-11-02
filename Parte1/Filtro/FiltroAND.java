package Parte1.Filtro;


import Parte2.ElementoBanda;

public class FiltroAND extends TipoCualidad{
	
	private TipoCualidad cualidad1;
	private TipoCualidad cualidad2;
	
	public FiltroAND(TipoCualidad cualidad1, TipoCualidad cualidad2) {
		this.cualidad1 = cualidad1;
		this.cualidad2 = cualidad2;
	}

	@Override
	public boolean cumpleCualidad(ElementoBanda e1) {
		return cualidad1.cumpleCualidad(e1) && cualidad2.cumpleCualidad(e1);
	}

}
