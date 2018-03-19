package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.IMenjacnica;

public class Menjacnica implements IMenjacnica {
	private String ime;
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public LinkedList<Valuta> getValute() {
		return valute;
	}

	public void setValute(LinkedList<Valuta> valute) {
		this.valute = valute;
	}


	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajniKurs,
			double kupovniKurs) {

	Kurs k = new Kurs();
	k.setDatum(datum);
	k.setProdajni(prodajniKurs);
	k.setKupovni(kupovniKurs);
	k.setSrednji((prodajniKurs + kupovniKurs)/2);
		
	Valuta v = new Valuta();
	v.setNaziv(naziv);
	v.setSkraceniNaziv(skraceniNaziv);
	v.setKurs(k);
	
	valute.add(v);	
	}

	@Override
	public void obrisiKurs(String skraceniNaziv, GregorianCalendar datum) {	
		if(skraceniNaziv!=null && datum != null) {	
		
	for (int i = 0; i < valute.size(); i++) {
	int god = valute.get(i).getKurs().getDatum().YEAR;
	int mesec = valute.get(i).getKurs().getDatum().MONTH;
	int dan = valute.get(i).getKurs().getDatum().DAY_OF_MONTH;
		if(valute.get(i).getSkraceniNaziv().equals(skraceniNaziv) && datum.YEAR == god && datum.MONTH == mesec && datum.DAY_OF_MONTH == dan) {
		valute.remove(i);				
			}  	
		
		
	}
		
		}
	}

	@Override
	public Valuta vratiKurs(String skraceniNaziv, GregorianCalendar datum) {
	if(skraceniNaziv!=null && datum != null) {	
	
	for (int i = 0; i < valute.size(); i++) {
	int god = valute.get(i).getKurs().getDatum().YEAR;
	int mesec = valute.get(i).getKurs().getDatum().MONTH;
	int dan = valute.get(i).getKurs().getDatum().DAY_OF_MONTH;
		if(valute.get(i).getSkraceniNaziv().equals(skraceniNaziv) && datum.YEAR == god && datum.MONTH == mesec && datum.DAY_OF_MONTH == dan) {
		return valute.get(i);				
		}  	
	}
}
	
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ime == null) ? 0 : ime.hashCode());
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menjacnica other = (Menjacnica) obj;
		if (ime == null) {
			if (other.ime != null)
				return false;
		} else if (!ime.equals(other.ime))
			return false;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Menjacnica [ime=" + ime + ", valute=" + valute + "]";
	}
}
