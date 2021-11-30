package no.test.lovdata.county;


import java.util.List;

import com.google.common.collect.Lists;

public enum County {
	Agder("Agder", "42"),
	Innlandet("Innlandet", "34"),
	MoreOgRomsdal("Møre og Romsdal", "15"),
	Nordland("Nordland", "18"),
	Oslo("Oslo", "03"),
	Rogaland("Rogaland", "11"),
	Svalbard("Svalbard", false, "21"),
	TromsOgFinnmark("Troms og Finnmark", "54"),
	Trondelag("Trøndelag", "50"),
	VestfoldOgTelemark("Vestfold og Telemark", "38"),
	Vestland("Vestland", "46"),
	Viken("Viken", "30")
	;
	private final String countyNumber;
	private String name;
	private boolean reallyCounty;

	County(String n, String i) {
		this(n, true, i);
	}

	County(String n, boolean reallyCounty, String cn) {
		name = n;
		this.countyNumber = cn; // http://nn.wikipedia.org/wiki/Fylkesnummer
		this.reallyCounty = reallyCounty;
	}

	public static County lookup(String in) {
		for(County c : County.values()) {
			if(c.name().equals(in) || c.getName().equals(in)) {
				return c;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public static List<County> getRealCounties(){
		List<County> counties = Lists.newArrayList();
		for(County county : values()){
			//if( county.isReallyCounty() ){
				counties.add(county);
			//}
		}
		return counties;
	}

	public boolean isReallyCounty() {
		return reallyCounty;
	}

	public String getCountyNumber() {
		return countyNumber;
	}
	
	public String toString() {
		return "Navn: " +name +" fNr: " + countyNumber + "Faktisk fylke ? " + reallyCounty ;
	}
	
}
