package Parte2;



public class CoachExigente extends Coach {
	
	//FALTA ADAPTARLO AL COMPOSITE
	public void addParticipante(ElementoBanda e, RestriccionParticipante restriccion) {
		if(restriccion.cumpleRestriccion(e)) {
			equipo.add(e);
		}
	}
}
