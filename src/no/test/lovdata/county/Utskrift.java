package no.test.lovdata.county;
import java.util.List;

import com.google.common.collect.Lists;

public class Utskrift {

	public static void main (String[] args) {
		County fylke1 = County.lookup("Svalbard");
		System.out.println(fylke1);
		
		String fNr = fylke1.getCountyNumber();
		System.out.println(fNr);

		boolean bVirkelig = fylke1.isReallyCounty();
		System.out.println(bVirkelig);
		
		County fylke2 = County.lookup("Viken");
		System.out.println(fylke2);

		bVirkelig = fylke2.isReallyCounty();
		System.out.println(bVirkelig);

		List<County> tabell = County.getRealCounties();
		System.out.println(tabell);
		
		
		
System.out.println(tabell.toString());		
		
		//int index = County.finn("Sval");
		
		/*
		for(int i=0;i<tabell.size();++i){
			String navn = tabell.get(i);
			if (tabell.get(i).contains("")) {
				System.out.println("Substring found in: "+i);
			}
		}
*/
		
		
	}
	
}