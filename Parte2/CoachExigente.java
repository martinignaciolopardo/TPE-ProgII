package Parte2;

import Parte2.Composite.Participante;

public class CoachExigente extends Coach {
	
	//FALTA ADAPTARLO AL COMPOSITE
	public void addParticipante(Participante participante, RestriccionParticipante restriccion) {
		if(restriccion.cumpleRestriccion(participante)) {
			equipo.add(participante);
		}
	}
}
