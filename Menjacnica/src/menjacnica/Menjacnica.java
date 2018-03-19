package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.IMenjacnica;

public class Menjacnica implements IMenjacnica {
LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajniKurs,
			double kupovniKurs) {
Kurs k = new Kurs();
k.setProdajni(prodajniKurs);
k.setKupovni(kupovniKurs);
Valuta v = new Valuta();
v.setNaziv(naziv);
v.setSkraceniNaziv(skraceniNaziv);
v.setKurs(k);
valute.addLast(v);
	}

	@Override
	public void obrisiKurs(String skraceniNaziv, GregorianCalendar datum) {
		if(skraceniNaziv!=null && datum != null) {	
			for (int i = 0; i < valute.size(); i++) {
				if(valute.get(i).getSkraceniNaziv().equals(skraceniNaziv) && valute.get(i).getKurs().getDatum().equals(datum)) {
					valute.remove(i);	
				}	
	
			}
		
		}
	}

	@Override
	public Valuta vratiKurs(String skraceniNaziv, GregorianCalendar datum) {
	if(skraceniNaziv!=null && datum != null) {	
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getSkraceniNaziv().equals(skraceniNaziv) && valute.get(i).getKurs().getDatum().equals(datum)) {
			return valute.get(i);	
			}	
		}
	}	
		return null;
	}

}
