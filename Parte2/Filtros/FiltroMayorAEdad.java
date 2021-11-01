package Parte2.Filtros;

import Parte2.Composite.Participante;

public class FiltroMayorAEdad extends Filtro {

	private int edad;
	
	public FiltroMayorAEdad(int edad) {
		super();
		this.edad = edad;
	}

	@Override
	public boolean cumpleCualidad(Participante p1) {
		return p1.getEdad()>edad;
	}

}
