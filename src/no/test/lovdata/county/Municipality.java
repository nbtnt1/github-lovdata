package no.test.lovdata.county;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public enum Municipality {

    Arendal("Arendal", County.Agder),
    Birkenes("Birkenes", County.Agder),
    Bygland("Bygland", County.Agder),
    Bykle("Bykle", County.Agder),
    EvjeogHornnes("Evje og Hornnes", County.Agder),
    Farsund("Farsund", County.Agder),
    Flekkefjord("Flekkefjord", County.Agder),
    Froland("Froland", County.Agder),
    Gjerstad("Gjerstad", County.Agder),
    Grimstad("Grimstad", County.Agder),
    Haegebostad("Hægebostad", County.Agder),
    Iveland("Iveland", County.Agder),
    Kristiansand("Kristiansand", County.Agder),
    Kvinesdal("Kvinesdal", County.Agder),
    Lillesand("Lillesand", County.Agder),
    Lindesnes("Lindesnes", County.Agder),
    Lund("Lund", County.Rogaland),
    Lyngdal("Lyngdal", County.Agder),
    Risor("Risør", County.Agder),
    Sirdal("Sirdal", County.Agder),
    Tvedestrand("Tvedestrand", County.Agder),
    Vegaarshei("Vegårshei", County.Agder),
    Valle("Valle", County.Agder),
    Vennesla("Vennesla", County.Agder),
    Aamli("Åmli", County.Agder),
    Aaseral("Åseral", County.Agder),
 
    Alvdal("Alvdal", County.Innlandet),
    Dovre("Dovre", County.Innlandet),
    Eidskog("Eidskog", County.Innlandet),
    Elverum("Elverum", County.Innlandet),
    Engerdal("Engerdal", County.Innlandet),
    Etnedal("Etnedal", County.Innlandet),
    Folldal("Folldal", County.Innlandet),
    Gausdal("Gausdal", County.Innlandet),
    Gjovik("Gjøvik", County.Innlandet),
    Gran("Gran", County.Innlandet),
    Grue("Grue", County.Innlandet),
    Hamar("Hamar", County.Innlandet),
    Kongsvinger("Kongsvinger", County.Innlandet),
    Lesja("Lesja", County.Innlandet),
    Lillehammer("Lillehammer", County.Innlandet),
    Lom("Lom", County.Innlandet),
    Loten("Løten", County.Innlandet),
    NordAurdal("Nord-Aurdal", County.Innlandet),
    NordFron("Nord-Fron", County.Innlandet),
    NordOdal("Nord-Odal", County.Innlandet),
    NordreLand("Nordre Land", County.Innlandet),
    Os("Os", County.Innlandet),
    Rendalen("Rendalen", County.Innlandet),
    Ringebu("Ringebu", County.Innlandet),
    Ringsaker("Ringsaker", County.Innlandet),
    Sel("Sel", County.Innlandet),
    Skjaak("Skjåk", County.Innlandet),
    Stange("Stange", County.Innlandet),
    StorElvdal("Stor-Elvdal", County.Innlandet),
    SondreLand("Søndre Land", County.Innlandet),
    SorAurdal("Sør-Aurdal", County.Innlandet),
    SorFron("Sør-Fron", County.Innlandet),
    SorOdal("Sør-Odal", County.Innlandet),
    Tolga("Tolga", County.Innlandet),
    Trysil("Trysil", County.Innlandet),
    Tynset("Tynset", County.Innlandet),
    Vang("Vang", County.Innlandet),
    VestreSlidre("Vestre Slidre", County.Innlandet),
    VestreToten("Vestre Toten", County.Innlandet),
    Vaagaa("Vågå", County.Innlandet),
    Vaaler("Våler", County.Innlandet),
    OstreToten("Østre Toten", County.Innlandet),
    Oyer("Øyer", County.Innlandet),
    OystreSlidre("Øystre Slidre", County.Innlandet),
    Aamot("Åmot", County.Innlandet),
    Aasnes("Åsnes", County.Innlandet),
 
    Aukra("Aukra", County.MoreOgRomsdal),
    Aure("Aure", County.MoreOgRomsdal),
    Averoy("Averøy", County.MoreOgRomsdal),
    Fjord("Fjord", County.MoreOgRomsdal),
    Giske("Giske", County.MoreOgRomsdal),
    Gjemnes("Gjemnes", County.MoreOgRomsdal),
    Hareid("Hareid", County.MoreOgRomsdal),
    Heroy("Herøy", County.MoreOgRomsdal),
    Hustadvika("Hustadvika", County.MoreOgRomsdal),
    Kristiansund("Kristiansund", County.MoreOgRomsdal),
    Molde("Molde", County.MoreOgRomsdal),
    Rauma("Rauma", County.MoreOgRomsdal),
    Sande("Sande", County.MoreOgRomsdal),
    Smola("Smøla", County.MoreOgRomsdal),
    Stranda("Stranda", County.MoreOgRomsdal),
    Sula("Sula", County.MoreOgRomsdal),
    Sunndal("Sunndal", County.MoreOgRomsdal),
    Surnadal("Surnadal", County.MoreOgRomsdal),
    Sykkylven("Sykkylven", County.MoreOgRomsdal),
    Tingvoll("Tingvoll", County.MoreOgRomsdal),
    Ulstein("Ulstein", County.MoreOgRomsdal),
    Vanylven("Vanylven", County.MoreOgRomsdal),
    Vestnes("Vestnes", County.MoreOgRomsdal),
    Volda("Volda", County.MoreOgRomsdal),
    Orsta("Ørsta", County.MoreOgRomsdal),
    Aalesund("Ålesund", County.MoreOgRomsdal),
 
    Alstahaug("Alstahaug", County.Nordland),
    Andoy("Andøy", County.Nordland),
    Beiarn("Beiarn", County.Nordland),
    Bindal("Bindal", County.Nordland),
    Bodo("Bodø", County.Nordland),
    Bronnoy("Brønnøy", County.Nordland),
    Bo("Bø", County.Nordland),
    Donna("Dønna", County.Nordland),
    Evenes("Evenes", County.Nordland),
    Fauske("Fauske", County.Nordland),
    Flakstad("Flakstad", County.Nordland),
    Gildeskaal("Gildeskål", County.Nordland),
    Grane("Grane", County.Nordland),
    Hadsel("Hadsel", County.Nordland),
    Hamaroy("Hamarøy", County.Nordland),
    Hattfjelldal("Hattfjelldal", County.Nordland),
    Hemnes("Hemnes", County.Nordland),
    Heroy2("Herøy", County.Nordland),
    Kvaefjord("Kvæfjord", County.TromsOgFinnmark),
    Leirfjord("Leirfjord", County.Nordland),
    Lodingen("Lødingen", County.Nordland),
    Luroy("Lurøy", County.Nordland),
    Meloy("Meløy", County.Nordland),
    Moskenes("Moskenes", County.Nordland),
    Narvik("Narvik", County.Nordland),
    Nesna("Nesna", County.Nordland),
    Rana("Rana", County.Nordland),
    Rodoy("Rødøy", County.Nordland),
    Rost("Røst", County.Nordland),
    Saltdal("Saltdal", County.Nordland),
    Sortland("Sortland", County.Nordland),
    Steigen("Steigen", County.Nordland),
    Somna("Sømna", County.Nordland),
    Sorfold("Sørfold", County.Nordland),
    Traena("Træna", County.Nordland),
    Vefsn("Vefsn", County.Nordland),
    Vega("Vega", County.Nordland),
    Vestvaagoy("Vestvågøy", County.Nordland),
    Vevelstad("Vevelstad", County.Nordland),
    Vaeroy("Værøy", County.Nordland),
    Vaagan("Vågan", County.Nordland),
    Oksnes("Øksnes", County.Nordland),
 
    Oslo("Oslo", County.Oslo),
 
    Bjerkreim("Bjerkreim", County.Rogaland),
    Bokn("Bokn", County.Rogaland),
    Eigersund("Eigersund", County.Rogaland),
    Gjesdal("Gjesdal", County.Rogaland),
    Haugesund("Haugesund", County.Rogaland),
    Hjelmeland("Hjelmeland", County.Rogaland),
    Haa("Hå", County.Rogaland),
    Karmoy("Karmøy", County.Rogaland),
    Klepp("Klepp", County.Rogaland),
    Kvitsoy("Kvitsøy", County.Rogaland),
    Randaberg("Randaberg", County.Rogaland),
    Sandnes("Sandnes", County.Rogaland),
    Sauda("Sauda", County.Rogaland),
    Sokndal("Sokndal", County.Rogaland),
    Sola("Sola", County.Rogaland),
    Stavanger("Stavanger", County.Rogaland),
    Strand("Strand", County.Rogaland),
    Suldal("Suldal", County.Rogaland),
    Time("Time", County.Rogaland),
    Tysvaer("Tysvær", County.Rogaland),
    Utsira("Utsira", County.Rogaland),
    Vindafjord("Vindafjord", County.Rogaland),
 
    Bjornoya("Bjørnøya", County.Svalbard, false),
    Hopen("Hopen", County.Svalbard, false),
    JanMayen("Jan Mayen", County.Svalbard, false),
    Spitsbergen("Spitsbergen", County.Svalbard, false),
 
    Alta("Alta", County.TromsOgFinnmark),
    Balsfjord("Balsfjord", County.TromsOgFinnmark),
    Bardu("Bardu", County.TromsOgFinnmark),
    Berlevaag("Berlevåg", County.TromsOgFinnmark),
    Baatsfjord("Båtsfjord", County.TromsOgFinnmark),
    Dyroy("Dyrøy", County.TromsOgFinnmark),
    Gamvik("Gamvik", County.TromsOgFinnmark),
    Gratangen("Gratangen", County.TromsOgFinnmark),
    Hammerfest("Hammerfest", County.TromsOgFinnmark),
    Harstad("Harstad", County.TromsOgFinnmark),
    Hasvik("Hasvik", County.TromsOgFinnmark),
    Ibestad("Ibestad", County.TromsOgFinnmark),
    Karasjok("Karasjok", County.TromsOgFinnmark),
    Karlsoy("Karlsøy", County.TromsOgFinnmark),
    Kautokeino("Kautokeino", County.TromsOgFinnmark),
    Kvaenangen("Kvænangen", County.TromsOgFinnmark),
    Kaafjord("Kåfjord", County.TromsOgFinnmark),
    Lavangen("Lavangen", County.TromsOgFinnmark),
    Lebesby("Lebesby", County.TromsOgFinnmark),
    Loppa("Loppa", County.TromsOgFinnmark),
    Lyngen("Lyngen", County.TromsOgFinnmark),
    Maalselv("Målselv", County.TromsOgFinnmark),
    Maasoy("Måsøy", County.TromsOgFinnmark),
    Nesseby("Nesseby", County.TromsOgFinnmark),
    Nordkapp("Nordkapp", County.TromsOgFinnmark),
    Nordreisa("Nordreisa", County.TromsOgFinnmark),
    Porsanger("Porsanger", County.TromsOgFinnmark),
    Salangen("Salangen", County.TromsOgFinnmark),
    Senja("Senja", County.TromsOgFinnmark),
    Skjervoy("Skjervøy", County.TromsOgFinnmark),
    Storfjord("Storfjord", County.TromsOgFinnmark),
    Sorreisa("Sørreisa", County.TromsOgFinnmark),
    SorVaranger("Sør-Varanger", County.TromsOgFinnmark),
    Tana("Tana", County.TromsOgFinnmark),
    Tjeldsund("Tjeldsund", County.TromsOgFinnmark),
    Tromso("Tromsø", County.TromsOgFinnmark),
    Vadso("Vadsø", County.TromsOgFinnmark),
    Vardo("Vardø", County.TromsOgFinnmark),
 
    Flatanger("Flatanger", County.Trondelag),
    Frosta("Frosta", County.Trondelag),
    Froya("Frøya", County.Trondelag),
    Grong("Grong", County.Trondelag),
    Heim("Heim", County.Trondelag),
    Hitra("Hitra", County.Trondelag),
    Holtaalen("Holtålen", County.Trondelag),
    Hoylandet("Høylandet", County.Trondelag),
    Inderoy("Inderøy", County.Trondelag),
    IndreFosen("Indre Fosen", County.Trondelag),
    Leka("Leka", County.Trondelag),
    Levanger("Levanger", County.Trondelag),
    Lierne("Lierne", County.Trondelag),
    Malvik("Malvik", County.Trondelag),
    Melhus("Melhus", County.Trondelag),
    Meraaker("Meråker", County.Trondelag),
    MidtreGauldal("Midtre Gauldal", County.Trondelag),
    Namsos("Namsos", County.Trondelag),
    Namsskogan("Namsskogan", County.Trondelag),
    Naeroysund("Nærøysund", County.Trondelag),
    Oppdal("Oppdal", County.Trondelag),
    Orkland("Orkland", County.Trondelag),
    Osen("Osen", County.Trondelag),
    Overhalla("Overhalla", County.Trondelag),
    Rennebu("Rennebu", County.Trondelag),
    Rindal("Rindal", County.Trondelag),
    Roros("Røros", County.Trondelag),
    Royrvik("Røyrvik", County.Trondelag),
    Selbu("Selbu", County.Trondelag),
    Skaun("Skaun", County.Trondelag),
    Snaasa("Snåsa", County.Trondelag),
    Steinkjer("Steinkjer", County.Trondelag),
    Stjordal("Stjørdal", County.Trondelag),
    Trondheim("Trondheim", County.Trondelag),
    Tydal("Tydal", County.Trondelag),
    Verdal("Verdal", County.Trondelag),
    Orland("Ørland", County.Trondelag),
    Aafjord("Åfjord", County.Trondelag),
 
    Bamble("Bamble", County.VestfoldOgTelemark),
    Drangedal("Drangedal", County.VestfoldOgTelemark),
    Fyresdal("Fyresdal", County.VestfoldOgTelemark),
    Faerder("Færder", County.VestfoldOgTelemark),
    Hjartdal("Hjartdal", County.VestfoldOgTelemark),
    Holmestrand("Holmestrand", County.VestfoldOgTelemark),
    Horten("Horten", County.VestfoldOgTelemark),
    Kragero("Kragerø", County.VestfoldOgTelemark),
    Kviteseid("Kviteseid", County.VestfoldOgTelemark),
    Larvik("Larvik", County.VestfoldOgTelemark),
    MidtTelemark("Midt-Telemark", County.VestfoldOgTelemark),
    Nissedal("Nissedal", County.VestfoldOgTelemark),
    Nome("Nome", County.VestfoldOgTelemark),
    Notodden("Notodden", County.VestfoldOgTelemark),
    Porsgrunn("Porsgrunn", County.VestfoldOgTelemark),
    Sandefjord("Sandefjord", County.VestfoldOgTelemark),
    Seljord("Seljord", County.VestfoldOgTelemark),
    Siljan("Siljan", County.VestfoldOgTelemark),
    Skien("Skien", County.VestfoldOgTelemark),
    Tinn("Tinn", County.VestfoldOgTelemark),
    Tokke("Tokke", County.VestfoldOgTelemark),
    Tonsberg("Tønsberg", County.VestfoldOgTelemark),
    Vinje("Vinje", County.VestfoldOgTelemark),
 
    Alver("Alver", County.Vestland),
    Askvoll("Askvoll", County.Vestland),
    Askoy("Askøy", County.Vestland),
    Aurland("Aurland", County.Vestland),
    Austevoll("Austevoll", County.Vestland),
    Austrheim("Austrheim", County.Vestland),
    Bergen("Bergen", County.Vestland),
    Bjornafjorden("Bjørnafjorden", County.Vestland),
    Bremanger("Bremanger", County.Vestland),
    Bomlo("Bømlo", County.Vestland),
    Eidfjord("Eidfjord", County.Vestland),
    Etne("Etne", County.Vestland),
    Fedje("Fedje", County.Vestland),
    Fitjar("Fitjar", County.Vestland),
    Fjaler("Fjaler", County.Vestland),
    Gloppen("Gloppen", County.Vestland),
    Gulen("Gulen", County.Vestland),
    Hyllestad("Hyllestad", County.Vestland),
    Hoyanger("Høyanger", County.Vestland),
    Kinn("Kinn", County.Vestland),
    Kvam("Kvam", County.Vestland),
    Kvinnherad("Kvinnherad", County.Vestland),
    Luster("Luster", County.Vestland),
    Laerdal("Lærdal", County.Vestland),
    Masfjorden("Masfjorden", County.Vestland),
    Modalen("Modalen", County.Vestland),
    Osteroy("Osterøy", County.Vestland),
    Samnanger("Samnanger", County.Vestland),
    Sogndal("Sogndal", County.Vestland),
    Solund("Solund", County.Vestland),
    Stad("Stad", County.Vestland),
    Stord("Stord", County.Vestland),
    Stryn("Stryn", County.Vestland),
    Sunnfjord("Sunnfjord", County.Vestland),
    Sveio("Sveio", County.Vestland),
    Tysnes("Tysnes", County.Vestland),
    Ullensvang("Ullensvang", County.Vestland),
    Ulvik("Ulvik", County.Vestland),
    Vaksdal("Vaksdal", County.Vestland),
    Vik("Vik", County.Vestland),
    Voss("Voss", County.Vestland),
    Oygarden("Øygarden", County.Vestland),
    Aardal("Årdal", County.Vestland),
 
    Aremark("Aremark", County.Viken),
    Asker("Asker", County.Viken),
    AurskogHoland("Aurskog-Høland", County.Viken),
    Baerum("Bærum", County.Viken),
    Drammen("Drammen", County.Viken),
    Eidsvoll("Eidsvoll", County.Viken),
    Enebakk("Enebakk", County.Viken),
    Flesberg("Flesberg", County.Viken),
    Flaa("Flå", County.Viken),
    Fredrikstad("Fredrikstad", County.Viken),
    Frogn("Frogn", County.Viken),
    Gjerdrum("Gjerdrum", County.Viken),
    Gol("Gol", County.Viken),
    Halden("Halden", County.Viken),
    Hemsedal("Hemsedal", County.Viken),
    Hol("Hol", County.Viken),
    Hole("Hole", County.Viken),
    Hurdal("Hurdal", County.Viken),
    Hvaler("Hvaler", County.Viken),
    IndreOstfold("Indre Østfold", County.Viken),
    Jevnaker("Jevnaker", County.Viken),
    Kongsberg("Kongsberg", County.Viken),
    Krodsherad("Krødsherad", County.Viken),
    Lier("Lier", County.Viken),
    Lillestrom("Lillestrøm", County.Viken),
    Lunner("Lunner", County.Viken),
    Lorenskog("Lørenskog", County.Viken),
    Marker("Marker", County.Viken),
    Modum("Modum", County.Viken),
    Moss("Moss", County.Viken),
    Nannestad("Nannestad", County.Viken),
    Nes("Nes", County.Viken),
    Nesbyen("Nesbyen", County.Viken),
    Nesodden("Nesodden", County.Viken),
    Nittedal("Nittedal", County.Viken),
    NordreFollo("Nordre Follo", County.Viken),
    NoreogUvdal("Nore og Uvdal", County.Viken),
    Rakkestad("Rakkestad", County.Viken),
    Ringerike("Ringerike", County.Viken),
    Rollag("Rollag", County.Viken),
    Raelingen("Rælingen", County.Viken),
    Raade("Råde", County.Viken),
    Sarpsborg("Sarpsborg", County.Viken),
    Sigdal("Sigdal", County.Viken),
    Skiptvet("Skiptvet", County.Viken),
    Ullensaker("Ullensaker", County.Viken),
    Vestby("Vestby", County.Viken),
    Vaaler2("Våler", County.Viken),
    OvreEiker("Øvre Eiker", County.Viken),
    Aal("Ål", County.Viken),
    Aas("Ås", County.Viken)
    ;
 
    private String name;
    private County county;
    private boolean reallyMunicipality;
 
    Municipality(String n, County c) {
        this(n, c, true);
    }
 
    Municipality(String n, County c, boolean reallyMunicipality) {
        this.name = n;
        this.county = c;
        this.reallyMunicipality = reallyMunicipality;
    }
 
    public static Municipality getMunicipality(String in){
        for (Municipality m : Municipality.values()) {
            if (m.name().equals(in) || m.getName().equals(in)) {
                return m;
            }
        }
        return null;
    }
 
 
    public static Municipality lookup(String in) {
        for (Municipality m : Municipality.values()) {
            if (m.getName().equals(in)) {
                return m;
            }
        }
        return null;
    }
 
    public static Municipality lookup(String in, County county) {
        if(county == null) {
            return lookup(in);
        }
        for(Municipality m : getMunicipalitiesForCounty(county)) {
            if(m.getName().equals(in)) {
                return m;
            }
        }
        return null;
    }
 
    public static List<Municipality> getMunicipalitiesForCounty(County c) {
        ArrayList<Municipality> res = new ArrayList<>();
        for (Municipality m : Municipality.values()) {
            if (m.getCounty().equals(c)) {
                res.add(m);
            }
        }
        return res;
    }
 
    public static List<Municipality> getSortedMunicipalitiesForCounty(County c) {
        List<Municipality> municipalities = getMunicipalitiesForCounty(c);
        //Erstattet custom compareTo-comparator med Collator for .no for korrekt sortering av ÆØÅ
        Collections.sort(municipalities, new Comparator<Municipality>() {
            @Override
            public int compare(Municipality o1, Municipality o2) {
                return LocaleStringComparer.compare(o1.name, o2.name);
            }
        });
        return municipalities;
    }
 
    public String getName() {
        return name;
    }
 
    public County getCounty() {
        return county;
    }
 
    public static List<Municipality> getRealMunicipalities(){
        List<Municipality> municipalities = Lists.newArrayList();
        for(Municipality municipality : values()){
            if( municipality.isReallyMunicipality() ){
                municipalities.add(municipality);
            }
        }
        return municipalities;
    }
 
    public static List<Municipality> getSortedMunicipalities() {
        List<Municipality> municipalities = getRealMunicipalities();
        Collections.sort(municipalities, new Comparator<Municipality>() {
            @Override
            public int compare(Municipality o1, Municipality o2) {
                return LocaleStringComparer.compare(o1.name, o2.name);
            }
        });
        return municipalities;
    }
 
    public boolean isReallyMunicipality(){
        return reallyMunicipality;
    }
}	
	
	
	

