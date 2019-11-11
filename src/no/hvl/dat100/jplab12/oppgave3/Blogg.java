package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable

	private Innlegg[] innleggstabell;
	private int nesteledig;

	public Blogg() {
		innleggstabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggstabell;

	}

	public int finnInnlegg(Innlegg innlegg) {
		int posisjon = -1;
		for (int i = 0; i < nesteledig; i++) {
			if (innleggstabell[i].erLik(innlegg)) {
				posisjon = i;
			}
		}
		return posisjon;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		for (int i = 0; i < nesteledig; i++) {
			if (innleggstabell[i].erLik(innlegg)) {
				funnet = true;
			} 
		}
		return funnet;
	}

	public boolean ledigPlass() {
		if (nesteledig < innleggstabell.length) {
			return true;
		} else return false;
	}

	public boolean leggTil(Innlegg innlegg) {	
		if (ledigPlass() == true && finnes(innlegg) == false) {
			innleggstabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else return false;
	}

	public String toString() {
		String string = nesteledig + "\n";
		
		for (int i = 0; i < nesteledig; i++) {
			string += innleggstabell[i].toString();
		}
		return string;
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}