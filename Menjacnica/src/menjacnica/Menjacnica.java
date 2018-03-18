package menjacnica;

import java.util.GregorianCalendar;

import interfejs.IMenjacnica;

public class Menjacnica implements IMenjacnica {

	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajniKurs,
			double kupovniKurs) {
		

	}

	@Override
	public void obrisiKurs(String skraceniNaziv, GregorianCalendar datum) {
			

	}

	@Override
	public Valuta vratiKurs(String skraceniNaziv, GregorianCalendar datum) {
	
		return null;
	}

}
