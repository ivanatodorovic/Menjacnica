package menjacnica;

import java.util.GregorianCalendar;

public class Kurs {
private GregorianCalendar datum;
private double kupovni;
private double prodajni;
private double srednji;


public double getKupovni() {
	return kupovni;
}

public void setKupovni(double kupovni) {
if(kupovni < 0)
	throw new RuntimeException("Kurs ne moze biti manji od nule.");
	this.kupovni = kupovni;
}

public double getProdajni() {
	return prodajni;
}

public void setProdajni(double prodajni) {
	if(prodajni < 0)
		throw new RuntimeException("Kurs ne moze biti manji od nule.");

	this.prodajni = prodajni;
}

public double getSrednji() {
	return srednji;
}

public void setSrednji(double srednji) {
	if(srednji < 0)
		throw new RuntimeException("Kurs ne moze biti manji od nule.");

	this.srednji = srednji;
}

public GregorianCalendar getDatum() {
	return datum;
}

public void setDatum(GregorianCalendar datum) {
GregorianCalendar danasnji = new GregorianCalendar();
int dan = danasnji.DAY_OF_MONTH;
int mesec = danasnji.MONTH;
int god = danasnji.YEAR;
if(datum == null)
	throw new RuntimeException("Datumm nije unet dobro.");
if(!(god == datum.YEAR && mesec == datum.MONTH && dan == datum.DAY_OF_MONTH) )
	throw new RuntimeException("Datum nije unet dobro.Mozete uneti danasnji datum");

this.datum = datum;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((datum == null) ? 0 : datum.hashCode());
	long temp;
	temp = Double.doubleToLongBits(kupovni);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(prodajni);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(srednji);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Kurs other = (Kurs) obj;
	if (datum == null) {
		if (other.datum != null)
			return false;
	} else if (!datum.equals(other.datum))
		return false;
	if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
		return false;
	if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
		return false;
	if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
		return false;
	return true;
}

@Override
public String toString() {
	return "datum: " + datum + ", kupovni kurs: " + kupovni + ", prodajni kurs: " + prodajni + ", srednji kurs: " + srednji;
}
	







}
