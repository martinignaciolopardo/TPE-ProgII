package Parte2;

import Parte1.Filtro.PrefiereGenero;

public class Main {

	public static void main(String[] args) {
		Participante p1 = new Participante("Lautaro", "Nievas", 20);
		p1.addIdioma("Ingles");
		p1.addIdioma("Español");
		p1.addIdioma("Frances");
		p1.addGeneros("Rock");
		p1.addGeneros("Pop");
		p1.addInstrumentos("Guitarra");
		p1.addInstrumentos("Bateria");
		p1.addInstrumentos("Piano");
		
		Participante p2 = new Participante("Mauro", "Coello", 23);
		p2.addIdioma("Ingles");
		p2.addIdioma("Español");
		p2.addIdioma("Aleman");
		p2.addGeneros("Rock");
		p2.addGeneros("Cumbia");
		p2.addInstrumentos("Bajo");
		p2.addInstrumentos("Bateria");
		
		Participante p3 = new Participante("Ignacio", "Lopardo", 25);
		p3.addIdioma("Ingles");
		p3.addIdioma("Frances");
		p3.addGeneros("Bachata");
		p3.addGeneros("Pop");
		p3.addInstrumentos("Guitarra");
		p3.addInstrumentos("Bateria");
	
		Participante p4 = new Participante("Martin", "Perez", 19);
		p4.addIdioma("Italiano");
		p4.addIdioma("Español");
		p4.addIdioma("Aleman");
		p4.addGeneros("Pop");
		p4.addInstrumentos("Guitarra");
		p4.addInstrumentos("Bateria");
		p4.addInstrumentos("Piano");
		p4.addInstrumentos("Triangulo");
		
		Participante p5 = new Participante("Hernan", "Diaz", 27);
		p5.addIdioma("Ingles");
		p5.addGeneros("Rock");
		p5.addGeneros("Pop");
		p5.addGeneros("Cumbia");
		p5.addInstrumentos("Guitarra");
		
		Grupo g1 = new Grupo("Grupo1");
		g1.addElementoBanda(p1);
		g1.addElementoBanda(p2);
		g1.addElementoBanda(p3);
		
		Coach c1 = new Coach();
		c1.addParticipante(g1);
		c1.addParticipante(p4);
		c1.addParticipante(p5);
		
		
		RestriccionParticipante restriccion = new RestriccionParticipante("Guitarra", "Pop");
		restriccion.addIdioma("Ingles");
		restriccion.addIdioma("Español");
		CoachExigente c2 = new CoachExigente();
		c2.addParticipante(p1,restriccion);
		c2.addParticipante(p2,restriccion);
		c2.addParticipante(p3,restriccion);
		c2.addParticipante(p4,restriccion);
		c2.addParticipante(p5,restriccion);
		
		System.out.println(c1.seleccionParticipante(new PrefiereGenero("Rock")));
	}

}
