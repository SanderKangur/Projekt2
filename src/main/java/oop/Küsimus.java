package oop;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

 class Küsimus {
    //Võtab küsimuse ja kontrollib kohe ära, kas vastus on õige

     static void väljastaKüsimus(File f1, File f2,Nupud nupud, Mängija mängija) throws Exception {

        KüsVasNr põhi = choose(f1, f2);
        String küss = põhi.getKüs();
        String kategooria = f1.getName().replaceFirst("[.][^.]+$", ""); //Kaotab .txt extensioni ära

        if(kategooria.equalsIgnoreCase("Üles")){
            JOptionPane.showMessageDialog(new JFrame(), "Liigud järgmisele tühjale ruudule!");
            mängija.setMängija(mängija.getMängija()+4);
        }
        else if(kategooria.equalsIgnoreCase("Alla")){
            JOptionPane.showMessageDialog(new JFrame(), "Liigud eelmisele tühjale ruudule!");
            mängija.setMängija(mängija.getMängija()-4);
        }
        else if(kategooria.equalsIgnoreCase("Tühi")){
            JOptionPane.showMessageDialog(new JFrame(), "Siin ruudul ei juhtu midagi!");
        }
        else {
            JOptionPane.showMessageDialog(new JFrame("Küsimus"), kategooria);
            String sisestatakse = JOptionPane.showInputDialog(null, küss, kategooria, JOptionPane.QUESTION_MESSAGE); //Mängija vastab küsimusele
            if (sisestatakse.equalsIgnoreCase(põhi.getVas())) { //Kontrollib vastuse õigsust
                System.out.println("Õige");
                if (kategooria.equalsIgnoreCase("Matemaatika")) {
                    nupud.setMata(true);
                    JOptionPane.showMessageDialog(new JFrame("Mäng"), "Said Matemaatika nupu!");
                }
                if (kategooria.equalsIgnoreCase("Meedia")) {
                    nupud.setMeedia(true);
                    JOptionPane.showMessageDialog(new JFrame("Mäng"), "Said Meedia nupu!");
                }
                if (kategooria.equalsIgnoreCase("Ajalugu")) {
                    nupud.setAja(true);
                    JOptionPane.showMessageDialog(new JFrame("Mäng"), "Said Ajaloo nupu!");
                }
                if (kategooria.equalsIgnoreCase("Geograafia")) {
                    nupud.setGeo(true);
                    JOptionPane.showMessageDialog(new JFrame("Mäng"), "Said Geograafia nupu!");
                }
                if (kategooria.equalsIgnoreCase("Teadus")) {
                    nupud.setTeadus(true);
                    JOptionPane.showMessageDialog(new JFrame("Mäng"), "Said Teaduse nupu!");
                }
                if (kategooria.equalsIgnoreCase("Varia")) {
                    nupud.setVaria(true);
                    JOptionPane.showMessageDialog(new JFrame("Mäng"), "Said Varia nupu!");
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame("Mäng"), "Vastasid valesti!");
                //System.out.println("Vale");
                JOptionPane.showMessageDialog(new JFrame("Mäng"), "Õige vastus oleks olnud : " + põhi.getVas());
                //System.out.println("Õige vastus oleks olnud: " + põhi.getVas());
            }
        }
    }

     static KüsVasNr choose(File f1, File f2) throws Exception {
         //Tagastab klassi, kus on küsimus ja selle vastus ning rea nr, kus nad asusid

        BufferedReader reader = new BufferedReader(new FileReader(f1));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();
        int nr = (int) (Math.random() * lines);
        String küs = Files.readAllLines(Paths.get(f1.getPath())).get(nr);
        String vas = Files.readAllLines(Paths.get(f2.getPath())).get(nr);

        return new KüsVasNr(küs, vas, nr);
    }

}
