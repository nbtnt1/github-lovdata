package no.test.lovdata.search;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.ArrayList;

public class FastSearch {

    public static void main(String[] args)
    {
    	int rader=17, kolonner=2;
    	
    	String[][] navn = {
    		{"Myhre", 		"Jonas W"},
    		{"Andenæs", 	"Johs"},
    		{"Jakhelln", 	"Henning"},
    		{"Bing", 		"Jon"},
    		{"Bratholm", 	"Anders"},
    		{"Zimmer", 		"Frederik"},
    		{"Kjønstad", 	"Asbjørn"},
    		{"Graver", 		"Hans Petter"},
    		{"Smith", 		"Eivind"},
    		{"Fleischer", 	"Carl August"},
    		{"Falkanger", 	"Thor"},
    		{"Kruger", 		"Kai"},
    		{"Skoghøy", 	"Jens Edvin A"},
    		{"Lødrup", 		"Peter"},
    		{"Hagstrøm", 	"Viggo"},
    		{"Lilleholt", 	"Kåre"},
    		{"Stenvik", 	"Are"},
    		{"Smith", 		"Carsten"}
    	};
    	
    	 for (int i = 0; i <= rader; i++) {
             System.out.println(navn[i][0]);
    	 }
          
    	 Arrays.sort(navn, new ArrayComparator(0, true));
    	
    	 for (int i = 0; i <= rader; i++) {
             System.out.println(navn[i][0] + " -- " + navn[i][1]);
    	 }
    	 
    }
}
