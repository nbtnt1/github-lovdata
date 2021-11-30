package no.test.lovdata.search;

import java.util.*;

public class TwoDimHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Navn> navneliste = new HashMap<String, Navn>();

		Navn navn = new Navn("Myhre",	"Jonas W");		navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Andenæs",	"Johs");			navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Jakhelln",	"Henning");			navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Bing",	"Jon");					navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Bratholm","Anders");			navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Zimmer",	"Frederik");		navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Kjønstad","Asbjørn");			navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Graver",	"Hans Petter");		navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Smith",	"Eivind");			navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Fleischer","Carl August");		navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Falkanger","Thor");			navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Kruger",	 "Kai");			navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Skoghøy",	 "Jens Edvin A");	navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Lødrup",	 "Peter");			navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Hagstrøm", "Viggo");			navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Lilleholt","Kåre");			navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Stenvik",	 "Are");			navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		navn = new Navn("Smith",	 "Carsten");		navneliste.put(navn.etternavn + "|" + navn.fornavn, navn);
		
		
		
		for (Navn n : navneliste.values()) {
			n.skrivData();
		}
	
		System.out.println("......Plukk opp objekt med unik nøkkel.............");
		Navn n = navneliste.get("Smith|Eivind");
		n.skrivData();
	}
	
}

class Navn {
	String etternavn;
	String fornavn;

	public Navn(String etternavn, String fornavn) {
		if (etternavn == null || etternavn.trim().equals("") || fornavn == null || fornavn.trim().equals("")) {
			throw new IllegalArgumentException("Etter- og fornavn må oppgis.");
		}
		this.etternavn = etternavn.trim();
		this.fornavn = fornavn.trim();
	}
	
	public String getNavn() {
		return etternavn;
	}
	
	void skrivData() {
		System.out.println("Etternavn: 	" + etternavn + " \tFornavn: 	" + fornavn);
	}
}
