/*
package oop;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.event.KeyEvent;
import java.util.List;

public class Mäng {
    public static void main(String[] args) throws Exception {
        Reeglid.väljastaReeglid();
        Küsimused.väljastaKüsimused();
        Vastused.väljastaVastused();
        JOptionPane.showMessageDialog(new JFrame("INFO"), "Tutvu reeglitega failist Reeglid.txt");
        JOptionPane.showMessageDialog(new JFrame("INFO"), "MÄNGIMA!");

        List<Koht> väli = Väli.looVäli();
        Laud laud = new Laud();

        Nupud nupud1 = new Nupud(false, false, false, false, false, false);
        Nupud nupud2 = new Nupud(false, false, false, false, false, false);
        Nupud nupud3 = new Nupud(false, false, false, false, false, false);

        Mängija mängija1 = new Mängija(väli.get(0).getRing().getCenterX(), väli.get(0).getRing().getCenterY(), 5, Color.ALICEBLUE, 0);
        Mängija mängija2 = new Mängija(väli.get(0).getRing().getCenterX(), väli.get(0).getRing().getCenterY(), 5, Color.PINK, 0);
        Mängija mängija3 = new Mängija(väli.get(0).getRing().getCenterX(), väli.get(0).getRing().getCenterY(), 5, Color.LAVENDER, 0);

        boolean mäng = true;
        while (mäng) {


            */
/********************************** MÄNGIJA 1 **************************************//*

            int i = (int) (Math.random() * 6) + 1;
            JOptionPane.showMessageDialog(new JFrame("Mäng"), "Mängija1 kord");
            JOptionPane.showMessageDialog(new JFrame("Mäng"), "Täringul tuli " + i + " silma!");
            if (mängija1.getMängija() + i > 55) { //Mängija veeretas rohkem, kui lõpuni oli jäänud -> liigub tagurpidi
                mängija1.setMängija(55 - (mängija1.getMängija() + i - 55));
            } else if (mängija1.getMängija() + i == 55) { //Mängija jõudis lõppu
                JOptionPane.showMessageDialog(new JFrame("Mäng"), "Võitis Mängija1");
                break;
            } else { //Tavaline mängukäik
                mängija1.setMängija(mängija1.getMängija() + i);
            }

            JOptionPane.showMessageDialog(new JFrame("Mäng"), "Mängija1 asub " + mängija1.getMängija() + ". ruudul");
            Küsimus.väljastaKüsimus(väli.get(mängija1.getMängija()).getKüs(), väli.get(mängija1.getMängija()).getVas(), nupud1, mängija1);
            if (nupud1.isMata() && nupud1.isMeedia() && nupud1.isVaria() && nupud1.isTeadus() && nupud1.isGeo() && nupud1.isAja()) { //Mängija sai kõik nupud
                JOptionPane.showMessageDialog(new JFrame("Mäng"), "Võitis Mängija1");
                break;


            }


            */
/********************************** MÄNGIJA 2 **************************************//*

            i = (int) (Math.random() * 6) + 1;
            JOptionPane.showMessageDialog(new JFrame("Mäng"), "Mängija2 kord");
            JOptionPane.showMessageDialog(new JFrame("Mäng"), "Täringul tuli " + i + " silma!");
            if (mängija2.getMängija() + i > 55) {
                mängija2.setMängija(55 - (mängija2.getMängija() + i - 55));
            } else if (mängija2.getMängija() + i == 55) {
                JOptionPane.showMessageDialog(new JFrame("Mäng"), "Võitis Mängija2");
                break;
            } else {
                mängija2.setMängija(mängija2.getMängija() + i);
            }
            JOptionPane.showMessageDialog(new JFrame("Mäng"), "Mängija2 asub " + mängija2.getMängija() + ". ruudul");
            Küsimus.väljastaKüsimus(väli.get(mängija2.getMängija()).getKüs(), väli.get(mängija2.getMängija()).getVas(), nupud2, mängija2);
            if (nupud2.isMata() && nupud2.isMeedia() && nupud2.isVaria() && nupud2.isTeadus() && nupud2.isGeo() && nupud2.isAja()) {
                JOptionPane.showMessageDialog(new JFrame("Mäng"), "Võitis Mängija2");
                break;
            }


            */
/********************************** MÄNGIJA 3 **************************************//*

            i = (int) (Math.random() * 6) + 1;
            JOptionPane.showMessageDialog(new JFrame("Mäng"), "Mängija3 kord");
            JOptionPane.showMessageDialog(new JFrame("Mäng"), "Täringul tuli " + i + " silma!");
            if (mängija3.getMängija() + i > 55) {
                mängija3.setMängija(55 - (mängija3.getMängija() + i - 55));
            } else if (mängija3.getMängija() + i == 55) {
                JOptionPane.showMessageDialog(new JFrame("Mäng"), "Võitis Mängija3");
                break;
            } else {
                mängija3.setMängija(mängija3.getMängija() + i);
            }
            JOptionPane.showMessageDialog(new JFrame("Mäng"), "Mängija3 asub " + mängija3.getMängija() + ". ruudul");
            Küsimus.väljastaKüsimus(väli.get(mängija3.getMängija()).getKüs(), väli.get(mängija3.getMängija()).getVas(), nupud3, mängija3);
            if (nupud3.isMata() && nupud3.isMeedia() && nupud3.isVaria() && nupud3.isTeadus() && nupud3.isGeo() && nupud3.isAja()) {
                JOptionPane.showMessageDialog(new JFrame("Mäng"), "Võitis Mängija3");
                break;
            }


            */
/********************************** SKOOR **************************************//*

            System.out.println("Mängija1 nupud: " + nupud1.toString());
            System.out.println("Mängija1 asub " + mängija1.getMängija() + ". ruudul");
            System.out.println("Mängija2 nupud: " + nupud2.toString());
            System.out.println("Mängija2 asub " + mängija2.getMängija() + ". ruudul");
            System.out.println("Mängija3 nupud: " + nupud3.toString());
            System.out.println("Mängija3 asub " + mängija3.getMängija() + ". ruudul");
        }
        System.out.println("GAME OVER");
        System.exit(0);
    }
}

*/
