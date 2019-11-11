package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.common.TODO;

public class Tekst extends Innlegg {

	// TODO: objektvariable
	
	private String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		super (id, bruker, dato);
		this.tekst = tekst;
		
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super (id, bruker, dato, likes);
		this.tekst = tekst;
	}
	
	public String getTekst() {
		return tekst;

	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		
		String string = "TEKST\n"+ super.getId() + "\n" + super.getBruker() + "\n" + super.getDato() + "\n" + super.getLikes() + "\n" + getTekst() + "\n";	
		
		return string;

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
