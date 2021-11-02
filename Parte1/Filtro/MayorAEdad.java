package Parte1.Filtro;


import Parte2.ElementoBanda;

public class MayorAEdad extends TipoCualidad {

	private int edad;
	
	public MayorAEdad(int edad) {
		super();
		this.edad = edad;
	}

	@Override
	public boolean cumpleCualidad(ElementoBanda e1) {
		return e1.getEdad()>edad;
	}

}
