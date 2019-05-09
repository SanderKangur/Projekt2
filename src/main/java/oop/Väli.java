package oop;

import java.io.File;
import java.util.ArrayList;

class Väli {
    //Loob mänguvälja

     static ArrayList<Koht> looVäli(){
        File mata = new File("Matemaatika.txt");
        File matav = new File("MatemaatikaVastused.txt");
        File aja = new File("Ajalugu.txt");
        File ajav = new File("AjaluguVastused.txt");
        File meedia = new File("Meedia.txt");
        File meediav = new File("MeediaVastused.txt");
        File varia = new File("Varia.txt");
        File variav = new File("VariaVastused.txt");
        File geo = new File("Geograafia.txt");
        File geov = new File("GeograafiaVastused.txt");
        File teadus = new File("Teadus.txt");
        File teadusv = new File("TeadusVastused.txt");
        File tühi = new File("Tühi.txt");
        File üles=new File("Üles.txt");
        File alla=new File("Alla.txt");


        ArrayList<Koht> väli = new ArrayList<>();
        väli.add(0, new Koht(0,null, tühi, tühi));
        for (int i = 1; i<56; i=i+9){
            String koht = Integer.toString(i);
            väli.add(i, new Koht(i, null, üles, üles));
            väli.add(i+1, new Koht(i+1, null, aja, ajav));
            väli.add(i+2, new Koht(i+1, null, meedia, meediav));
            väli.add(i+3, new Koht(i+1, null, mata, matav));
            väli.add(i+4, new Koht(i+1, null, tühi, tühi));
            väli.add(i+5, new Koht(i+1, null, geo, geov));
            väli.add(i+6, new Koht(i+1, null, teadus, teadusv));
            väli.add(i+7, new Koht(i+1, null, varia, variav));
            väli.add(i+8, new Koht(i+1, null, alla, alla));
        }
        väli.add(64, new Koht(64, null, tühi, tühi));
        return väli;
    }
}
