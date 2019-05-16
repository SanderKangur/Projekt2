package oop;

class Küsimused {
    //Väljastab küsimused mängimiseks

     static void väljastaKüsimused() throws Exception {
        väljastaAjalugu();
        väljastaGeograafia();
        väljastaMatemaatika();
        väljastaMeedia();
        väljastaTeadus();
        väljastaVaria();
    }

     static void väljastaAjalugu() throws Exception {
        java.io.File fail = new java.io.File("Ajalugu.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Mis aastal Eesti iseseisvus?");
            pw.println("Mis aastal asutati Tartu Ülikool?");
            pw.println("Esimene maailmasõda algas...(aasta)");
            pw.println("Esimese üldlaulupeo idee algataja, peamine elluviija ja üldjuht.(perekonnanimi)");
            pw.println("Kus toimus esimene laulupidu?");
            pw.println("Mesopotaamia vanimad asukad.");
            pw.println("Egiptuse kõrgem ametkond u 3000 a eKr");
            pw.println("Kelle auks peeti Kreekas Olümpiamänge?");
            pw.println("Vanakreeka filosoof ja matemaatik(omab oma teoreemi).");
            pw.println("Kus sündis Adolf Hitler?");
            pw.println("Kus mõrvati John F. Kennedy?");
            pw.println("Saja-aastane Sõda toimus Prantsusmaa ja ... vahel");



        }
    }

     static void väljastaGeograafia() throws Exception {
        java.io.File fail = new java.io.File("Geograafia.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Suurim ookean.");
            pw.println("Maailm pikim jõgi.");
            pw.println("Mis linnas asub Colosseum?");
            pw.println("Maa väline tahke kivimikest.");
            pw.println("...liikumine põhjustab maavärinaid ja vulkaanipurskeid.");
            pw.println("Vaadeldava maa-ala pinnavormide kogum on pinnamood ehk...");
            pw.println("Füüsiline geograafia");
            pw.println("Püsivad tuuled, mis suvel ja talvel puhuvad vastassuunas.");
            pw.println("Milline ookean on USA ida rannikul?");
            pw.println("Maailma kõrgeim mägi maailmas.");
            pw.println("Pikim jõgi Ameerikas.");
            pw.println("Suurim kõrb maailmas.");
            pw.println("Millises osariigis asub Suur Kanjon?");
            pw.println("Mis on pindalalt kõige väiksem riik?");





        }
    }

     static void väljastaMatemaatika() throws Exception {
        java.io.File fail = new java.io.File("Matemaatika.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("5+5");
            pw.println("16/2");
            pw.println("55-8");
            pw.println("14*0");
            pw.println("|-15|");
            pw.println("2-2*2+2");
            pw.println("42/7");
            pw.println("12*12");
            pw.println("6/2(1+2)");
            pw.println("Kiiruse tuletis");
            pw.println("3.14159265359");

        }
    }

     static void väljastaMeedia() throws Exception {
        java.io.File fail = new java.io.File("Meedia.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Mis aastal oli Kimye pulm?");
            pw.println("Kes/mis on kõige enam \"laike\" kogunud pildi peal Instagramis?");
            pw.println("Youtube kõige enim \"dislaigitud\" video.");
            pw.println("Kes omab kõige enam \"tellijaid\" YouTubes?");
            pw.println("Kes võitis Eesti Muusikaauhindadel Aasta Naisartisti auhinna?");
            pw.println("Kes võitis Eesti Muusikaauhindadel Aasta Meesartisti auhinna?");
            /*pw.println("");
            pw.println("");
            pw.println("");
            pw.println("");
            pw.println("");  */      }
    }

     static void väljastaTeadus() throws Exception {
        java.io.File fail = new java.io.File("Teadus.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Neljas planeet Päikesest.");
            pw.println("Kes leiutas telefoni?(perekonnanimi)");
            pw.println("Mis tuli esimesena - muna või kana?");
            pw.println("Mis temperatuuril on vesi kõige tihedam?");
            pw.println("... keskel on tõusvad õhuvoolud.");
            pw.println("Kes formuleeris gravitatsiooniseaduse?(perekonnanimi)");
            pw.println("NaOH ehk...");
            pw.println("H2SO3 ehk...");
            pw.println("Mida on õhus 78%?");
            pw.println("Protsess, mille käigus elusorganismid muudavad päikeseenergia keemiliseks energiaks.");
            pw.println("Mitu protsenti Maast on kaetud veega?");
            pw.println("Raku energiat tootev organell.");
            pw.println("Õhuniiskuse mõõtja.");
            pw.println("Tähtede värvuse erinevus on tingitud...");
            pw.println("Asteroidid pöörlevad ümber kahe planeedi, milleks on Marss ja ...");
            pw.println("Esimene kosmoselaev Kuul.");
        }
    }

     static void väljastaVaria() throws Exception {
        java.io.File fail = new java.io.File("Varia.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Kes oli 2018. eesti aasta naissportlane?");
            pw.println("Üks seitsmest maailmaimest:... kuju Olümpias");
            pw.println("Mis on Twenty One Pilots solisti nimi?");
            pw.println("Mitu käänet on eesti keeles?");
            pw.println("Karofoobia ehk...");
            pw.println("Kes oli 2018. eesti aasta meesportlane?");
            pw.println("Kes mõtles välja käärid?");
            pw.println("Mis tähtkuju on 22.detsember - 20.jaanuar?");
            pw.println("Mis stiilis on Tallinna raekoda?");
            pw.println("Eesti rahvakalendri järgi on 10.november...");
        }
    }
}
