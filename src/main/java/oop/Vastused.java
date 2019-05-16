package oop;

class Vastused {
    //Väljastab vastused mängimiseks

     static void väljastaVastused() throws Exception {
        väljastaAjalugu();
        väljastaGeograafia();
        väljastaMatemaatika();
        väljastaMeedia();
        väljastaTeadus();
        väljastaVaria();
        väljastaTühi();
        väljastaÜles();
        väljastaAlla();
    }

     static void väljastaAjalugu() throws Exception {
        java.io.File fail = new java.io.File("AjaluguVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("1918");
            pw.println("1632");
            pw.println("1914");
            pw.println("Jannsen");
            pw.println("Tartus");
            pw.println("sumerid");
            pw.println("vaaraod");
            pw.println("Zeusi");
            pw.println("Pythagoras");
            pw.println("Austrias");
            pw.println("Dallases");
            pw.println("Inglismaa");

        }
    }

     static void väljastaGeograafia() throws Exception {
        java.io.File fail = new java.io.File("GeograafiaVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Vaikne ookean");
            pw.println("Niilus");
            pw.println("Roomas");
            pw.println("litosfäär");
            pw.println("laamade");
            pw.println("reljeef");
            pw.println("loodusgeograafia");
            pw.println("mussoonid");
            pw.println("Atlandi ookean");
            pw.println("Mount Everest");
            pw.println("Missouri");
            pw.println("Sahara");
            pw.println("Arizona");
            pw.println("Vatikan");

        }
    }

     static void väljastaMatemaatika() throws Exception {
        java.io.File fail = new java.io.File("MatemaatikaVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("10");
            pw.println("8");
            pw.println("47");
            pw.println("0");
            pw.println("15");
            pw.println("0");
            pw.println("6");
            pw.println("144");
            pw.println("9");
            pw.println("kiirendus");
            pw.println("pi");

        }
    }

     static void väljastaMeedia() throws Exception {
        java.io.File fail = new java.io.File("MeediaVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("2014");
            pw.println("muna");
            pw.println("Youtube rewind");
            pw.println("PewDiePie");
            pw.println("Lenna");
            pw.println("nublu");
        }
    }

     static void väljastaTeadus() throws Exception {
        java.io.File fail = new java.io.File("TeadusVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Marss");
            pw.println("Bell");
            pw.println("muna");
            pw.println("4");
            pw.println("madalrõhkkonna");
            pw.println("Newton");
            pw.println("naatriumhüdroksiid");
            pw.println("väävlishape");
            pw.println("lämmastik");
            pw.println("fotosüntees");
            pw.println("70%");
            pw.println("mitokonder");
            pw.println("hügromeeter");
            pw.println("temperatuurist");
            pw.println("Saturn");
            pw.println("Apollo");

        }
    }

     static void väljastaVaria() throws Exception {
        java.io.File fail = new java.io.File("VariaVastused.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Saskia Alusalu");
            pw.println("Zeusi");
            pw.println("Tyler Joseph");
            pw.println("14");
            pw.println("kõrgusekartus");
            pw.println("Magnus Kirt");
            pw.println("Leonardo da Vinci");
            pw.println("kaljukits");
            pw.println("gooti");
            pw.println("mardipäev");

        }
    }
     static void väljastaTühi() throws Exception {
        java.io.File fail = new java.io.File("tühi.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("tühi");
        }
    }
     static void väljastaÜles() throws Exception {
        java.io.File fail = new java.io.File("üles.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("üles");
        }
    }
     static void väljastaAlla() throws Exception {
        java.io.File fail = new java.io.File("alla.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("alla");
        }
    }
}
