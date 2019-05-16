package oop;

class Reeglid {

     static void väljastaReeglid() throws Exception {

        java.io.File fail = new java.io.File("Reeglid.txt");
        try (java.io.PrintWriter pw = new java.io.PrintWriter(fail, "UTF-8")) {
            pw.println("Tere!");
            pw.println();
            pw.println("Mängu võitmiseks on kaks võimalust: ");
            pw.println("1) Kogu kokku kõigi 6 kategooria nupud");
            pw.println("2) Jõua esimesena lõppu");
            pw.println("Kategooriad on: Matemaatika, Meedia, Ajalugu, Geograafia, Teadus, Varia");
            pw.println();
            pw.println("Mänguväli: ");
            pw.println("Väljal on kategooriatele vastavad värvilised ringid küsimuste jaoks,");
            pw.println("'+' märgiga ringid saadavad 4 kohta edasi ja '-' märgiga 4 kohta tagasi,");
            pw.println("tühjad hallid ringid, kus midagi ei juhtu");
            pw.println("ning must ring alguse ja lõpu jaoks - kokku 65 ringi");
            pw.println();
            pw.println("Mängukäik: ");
            pw.println("Mäng algab esimese mängija täringu veeretusega");
            pw.println("Iga raundi lõpus väljastatakse hetkeskoor");
            pw.println("Kui nupp 'EDASI' on punane, siis vajuta seda jätkamiseks");
            pw.println();
            pw.println("EDU!");
        }
    }
}
