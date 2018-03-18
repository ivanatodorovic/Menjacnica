package menjacnica;



public class Valuta {

private String naziv;
private String skraceniNaziv;
private Kurs kurs;

public String getNaziv() {
	return naziv;
}
public void setNaziv(String naziv) {
if(naziv == null || naziv.isEmpty())
	throw new RuntimeException("Nije unet odgovarajuci naziv.");
	this.naziv = naziv;
}
public String getSkraceniNaziv() {
	return skraceniNaziv;
}
public void setSkraceniNaziv(String skraceniNaziv) {
if(skraceniNaziv == null ||  skraceniNaziv.isEmpty())	
	throw new RuntimeException("Nije unet odgovarajuci skraaceni naziv.");
this.skraceniNaziv = skraceniNaziv;
}
public Kurs getKurs() {
	return kurs;
}
public void setKurs(Kurs kurs) {
if(kurs == null)
	throw new RuntimeException(); 
this.kurs = kurs;
}	
	
	
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
	result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
	result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
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
	Valuta other = (Valuta) obj;
	if (kurs == null) {
		if (other.kurs != null)
			return false;
	} else if (!kurs.equals(other.kurs))
		return false;
	if (naziv == null) {
		if (other.naziv != null)
			return false;
	} else if (!naziv.equals(other.naziv))
		return false;
	if (skraceniNaziv == null) {
		if (other.skraceniNaziv != null)
			return false;
	} else if (!skraceniNaziv.equals(other.skraceniNaziv))
		return false;
	return true;
}


@Override
	public String toString() {
		return "Valuta: " +naziv+" skraceni naziv "+skraceniNaziv +" kurs  [ "+ kurs+"]";
	}


}
