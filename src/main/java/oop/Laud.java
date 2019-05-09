package oop;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Reflection;
import javafx.scene.image.WritableImage;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;


public class Laud extends Application {

    public static Scene mänguStseen() throws Exception {

        /********************************** MÄNGUVÄLI **************************************/

        List<Koht> väli = Väli.looVäli();
        Group juur = new Group();
        double x = 50;
        double y = 100;
        Circle algus = new Circle();
        algus.setCenterX(50);
        algus.setCenterY(50);
        algus.setRadius(20);
        algus.setStrokeWidth(20);
        väli.get(0).setRing(algus);
        juur.getChildren().add(algus);

        //TÄRING, lol ma ei oska neid ära ühendada ainult
        Rectangle täring = new Rectangle(700, 50 ,80, 80);
        täring.setFill(Color.BLACK);

        //täringuvise 1:
        /*Circle täpp1 = new Circle(740, 90,5, Color.WHITE);
        juur.getChildren().add(täring);
        juur.getChildren().add(täpp1);*/

        //täringuvise 2:
        /*Circle täpp2 = new Circle(720, 90, 5, Color.WHITE);
        Circle täpp3 = new Circle(760, 90, 5, Color.WHITE);

        juur.getChildren().add(täring);
        juur.getChildren().add(täpp2);
        juur.getChildren().add(täpp3);*/

        //täringuvise 3:
        /*Circle täpp1 = new Circle(740, 90,5, Color.WHITE);
        Circle täpp2 = new Circle(720, 90, 5, Color.WHITE);
        Circle täpp3 = new Circle(760, 90, 5, Color.WHITE);

        juur.getChildren().add(täring);
        juur.getChildren().add(täpp1);
        juur.getChildren().add(täpp2);
        juur.getChildren().add(täpp3);*/

        //täringuvise 4:
        /*Circle täpp4 = new Circle(720, 70,5,Color.WHITE);
        Circle täpp5 = new Circle(760, 70, 5, Color.WHITE);
        Circle täpp6 = new Circle(720, 110, 5, Color.WHITE);
        Circle täpp7 = new Circle(760, 110, 5, Color.WHITE);

        juur.getChildren().add(täring);
        juur.getChildren().add(täpp4);
        juur.getChildren().add(täpp5);
        juur.getChildren().add(täpp6);
        juur.getChildren().add(täpp7);*/

        //täringuvise 5:
        Circle täpp1 = new Circle(740, 90,5, Color.WHITE);
        Circle täpp4 = new Circle(720, 70,5,Color.WHITE);
        Circle täpp5 = new Circle(760, 70, 5, Color.WHITE);
        Circle täpp6 = new Circle(720, 110, 5, Color.WHITE);
        Circle täpp7 = new Circle(760, 110, 5, Color.WHITE);


        juur.getChildren().add(täring);
        juur.getChildren().add(täpp1);
        juur.getChildren().add(täpp4);
        juur.getChildren().add(täpp5);
        juur.getChildren().add(täpp6);
        juur.getChildren().add(täpp7);

        //täringuvise 6;
        /*Circle täpp2 = new Circle(720, 90, 5, Color.WHITE);
        Circle täpp3 = new Circle(760, 90, 5, Color.WHITE);
        Circle täpp4 = new Circle(720, 70,5,Color.WHITE);
        Circle täpp5 = new Circle(760, 70, 5, Color.WHITE);
        Circle täpp6 = new Circle(720, 110, 5, Color.WHITE);
        Circle täpp7 = new Circle(760, 110, 5, Color.WHITE);

        juur.getChildren().add(täring);
        juur.getChildren().add(täpp2);
        juur.getChildren().add(täpp3);
        juur.getChildren().add(täpp4);
        juur.getChildren().add(täpp5);
        juur.getChildren().add(täpp6);
        juur.getChildren().add(täpp7);*/

        int n = 1;
        for (int j = 0; j < 7; j++) {
            for (int i = 1; i < 10; i++) {
                Circle ring = new Circle();
                ring.setCenterX(x);
                ring.setCenterY(y);
                ring.setRadius(20);
                ring.setStrokeWidth(20);
                if (i == 1) {
                    if (j == 0) {
                        ring.setFill(Color.GREY);
                        väli.get(n).setRing(ring);
                    } else {
                        ring.setFill(Color.GREY);
                        ring.setCenterX(x - 20);
                        väli.get(n).setRing(ring);
                    }
                }
                if (i == 2) {
                    ring.setFill(Color.YELLOW);
                    väli.get(n).setRing(ring);
                }
                if (i == 3) {
                    ring.setFill(Color.INDIANRED);
                    väli.get(n).setRing(ring);
                }
                if (i == 4) {
                    ring.setFill(Color.BLUE);
                    väli.get(n).setRing(ring);
                }
                if (i == 5) {
                    ring.setFill(Color.GREY);
                    väli.get(n).setRing(ring);
                }
                if (i == 6) {
                    ring.setFill(Color.ORANGE);
                    väli.get(n).setRing(ring);
                }
                if (i == 7) {
                    ring.setFill(Color.GREEN);
                    väli.get(n).setRing(ring);
                }
                if (i == 8) {
                    ring.setFill(Color.PURPLE);
                    väli.get(n).setRing(ring);
                }
                if (i == 9) {
                    if (j == 6) {
                        ring.setFill(Color.GREY);
                        väli.get(n).setRing(ring);
                    } else {
                        ring.setFill(Color.GREY);
                        ring.setCenterX(x + 20);
                        väli.get(n).setRing(ring);
                    }
                }
                n++;
                juur.getChildren().add(ring);
                if (i == 9) {
                    x = x + 100;
                } else {
                    if (j % 2 == 0) y = y + 50;
                    else y = y - 50;
                }
            }
        }
        Circle lõpp = new Circle();
        lõpp.setCenterX(x - 100);
        lõpp.setCenterY(y + 50);
        lõpp.setRadius(20);
        lõpp.setStrokeWidth(20);
        väli.get(64).setRing(lõpp);
        juur.getChildren().add(lõpp);



        /********************************** MÄNG **************************************/

        Mängija mängija1 = new Mängija(väli.get(0).getRing().getCenterX() - 7, väli.get(0).getRing().getCenterY() - 7, 5, Color.AQUA, 0, "Mängjia1", -7, -7);
        juur.getChildren().add(mängija1);
        Mängija mängija2 = new Mängija(väli.get(0).getRing().getCenterX() + 7, väli.get(0).getRing().getCenterY() - 7, 5, Color.BISQUE, 0, "Mängija2", 7, -7);
        juur.getChildren().add(mängija2);
        Mängija mängija3 = new Mängija(väli.get(0).getRing().getCenterX(), väli.get(0).getRing().getCenterY() + 7, 5, Color.DARKSEAGREEN, 0, "Mängija3", 0, +7);
        juur.getChildren().add(mängija3);
        Nupud nupud1 = new Nupud(false, false, false, false, false, false);
        Nupud nupud2 = new Nupud(false, false, false, false, false, false);
        Nupud nupud3 = new Nupud(false, false, false, false, false, false);

        Scene stseen1 = new Scene(juur, 800, 600);  // luuakse stseen
        stseen1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                if(!mängija1.isOnKäinud()){
                    käi(mängija1, nupud1, väli);
                    mängija1.setOnKäinud(true);
                }
                else if(!mängija2.isOnKäinud()) {
                    küsi(mängija1, nupud1, väli);
                    käi(mängija2, nupud2, väli);
                    mängija2.setOnKäinud(true);
                }
                else if(!mängija3.isOnKäinud()) {
                    küsi(mängija2, nupud2, väli);
                    käi(mängija3, nupud3, väli);
                    mängija3.setOnKäinud(true);
                }
                else {
                    küsi(mängija3, nupud3, väli);
                    mängija1.setOnKäinud(false);
                    mängija2.setOnKäinud(false);
                    mängija3.setOnKäinud(false);

                    /********************************** SKOOR **************************************/

                    System.out.println("Mängija1 nupud: " + nupud1.toString());
                    System.out.println("Mängija1 asub " + mängija1.getMängija() + ". ruudul");
                    System.out.println("Mängija2 nupud: " + nupud2.toString());
                    System.out.println("Mängija2 asub " + mängija2.getMängija() + ". ruudul");
                    System.out.println("Mängija3 nupud: " + nupud3.toString());
                    System.out.println("Mängija3 asub " + mängija3.getMängija() + ". ruudul");
                }

            }
        });
        return stseen1;
    }

    public static void käi(Mängija mängija, Nupud nupud, List<Koht> väli){

        /********************************** KÄIMINE **************************************/

        int i = (int) (Math.random() * 6) + 1;
        JOptionPane.showMessageDialog(new JFrame("Mäng"), mängija.getNimi() + " kord");
        JOptionPane.showMessageDialog(new JFrame("Mäng"), "Täringul tuli " + i + " silma!");
        if (mängija.getMängija() + i > 64) { //Mängija veeretas rohkem, kui lõpuni oli jäänud -> liigub tagurpidi
            mängija.setMängija(64 - (mängija.getMängija() + i - 64));
        } else if (mängija.getMängija() + i == 64) { //Mängija jõudis lõppu
            JOptionPane.showMessageDialog(new JFrame("Mäng"), "Võitis " + mängija.getNimi());
            System.out.println("Võitis " + mängija.getNimi());
            System.out.println("GAME OVER");
            System.exit(1);
        } else { //Tavaline mängukäik
            mängija.setMängija(mängija.getMängija() + i);
        }
        mängija.setCenterX(väli.get(mängija.getMängija()).getRing().getCenterX() + mängija.getX()); //Liigutame mängijat
        mängija.setCenterY(väli.get(mängija.getMängija()).getRing().getCenterY() + mängija.getY()); //Pärast seda rida peaks mängija asukohta uuendama!!!!!
    }

    public static void küsi(Mängija mängija, Nupud nupud, List<Koht> väli){

        /********************************** KÜSIMINE **************************************/

        JOptionPane.showMessageDialog(new JFrame("Mäng"), mängija.getNimi() + " asub " + mängija.getMängija() + ". ruudul");
        try {
            Küsimus.väljastaKüsimus(väli.get(mängija.getMängija()).getKüs(), väli.get(mängija.getMängija()).getVas(), nupud, mängija);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (nupud.isMata() && nupud.isMeedia() && nupud.isVaria() && nupud.isTeadus() && nupud.isGeo() && nupud.isAja()) { //Mängija sai kõik nupud
            JOptionPane.showMessageDialog(new JFrame("Mäng"), "Võitis " + mängija.getNimi());
            System.out.println("Võitis " + mängija.getNimi());
            System.out.println("GAME OVER");
            System.exit(1);
        }
    }

    @Override
    public void start(Stage peaLava) throws Exception {
        Reeglid.väljastaReeglid();
        Küsimused.väljastaKüsimused();
        Vastused.väljastaVastused();
        JOptionPane.showMessageDialog(new JFrame("INFO"), "Tutvu reeglitega failist Reeglid.txt");
        JOptionPane.showMessageDialog(new JFrame("INFO"), "MÄNGIMA!");

        peaLava.setTitle("Laud");  // lava tiitelribale pannakse tekst
        peaLava.setScene(mänguStseen());  // lavale lisatakse stseen
        peaLava.show();  // lava tehakse nähtavaks
    }

    public static void main(String[] args) {
        launch(args);
    }
}


