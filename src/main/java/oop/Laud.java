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
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;


public class Laud extends Application {

    public static Scene mänguStseen() throws Exception {

        /********************************** MÄNGUVÄLI **************************************/

        List<Koht> väli = Väli.looVäli();
        Group juur = new Group();
        double x = 100;
        double y = 100;
        Circle algus = new Circle();
        algus.setCenterX(100);
        algus.setCenterY(50);
        algus.setRadius(20);
        algus.setStrokeWidth(20);
        väli.get(0).setRing(algus);
        juur.getChildren().add(algus);

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
                Rectangle pluss = new Rectangle(ring.getCenterX()-2.5, ring.getCenterY()-10, 5, 20);
                Rectangle miinus = new Rectangle(ring.getCenterX()-10, ring.getCenterY()-2.5, 20, 5);
                if(i==1){
                    juur.getChildren().add(pluss);
                    juur.getChildren().add(miinus);
                }
                if (i == 9) {
                    juur.getChildren().add(miinus);
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

        /********************************** KÜLGMENÜÜ **************************************/

        Rectangle täring = new Rectangle(850, 40 ,200, 200);
        täring.setFill(Color.BLACK);
        täring.setArcHeight(20);
        täring.setArcWidth(20);
        juur.getChildren().add(täring);

        Circle ajalugu = new Circle(860, 300, 20, Color.YELLOW);
        juur.getChildren().add(ajalugu);
        Text tekst1 = new Text(890, 300, "Ajalugu");
        juur.getChildren().add(tekst1);
        Circle meedia = new Circle(860, 350, 20, Color.INDIANRED);
        juur.getChildren().add(meedia);
        Text tekst2 = new Text(890, 350, "Meedia");
        juur.getChildren().add(tekst2);
        Circle mata = new Circle(860, 400, 20, Color.BLUE);
        juur.getChildren().add(mata);
        Text tekst3 = new Text(890, 400, "Matemaatika");
        juur.getChildren().add(tekst3);
        Circle geo = new Circle(1050, 300, 20, Color.ORANGE);
        juur.getChildren().add(geo);
        Text tekst4 = new Text(1080, 300, "Geograafia");
        juur.getChildren().add(tekst4);
        Circle teadus = new Circle(1050, 350, 20, Color.GREEN);
        juur.getChildren().add(teadus);
        Text tekst5 = new Text(1080, 350, "Teadus");
        juur.getChildren().add(tekst5);
        Circle varia = new Circle(1050, 400, 20, Color.PURPLE);
        juur.getChildren().add(varia);
        Text tekst6 = new Text(1080, 400, "Varia");
        juur.getChildren().add(tekst6);
        Circle üles = new Circle(860, 450, 20, Color.GREY);
        juur.getChildren().add(üles);
        Text tekst7 = new Text(890, 450, "Üles");
        juur.getChildren().add(tekst7);
        Circle alla = new Circle(1050, 450, 20, Color.GREY);
        juur.getChildren().add(alla);
        Text tekst8 = new Text(1080, 450, "Alla");
        juur.getChildren().add(tekst8);
        Rectangle pluss = new Rectangle(üles.getCenterX()-2.5, üles.getCenterY()-10, 5, 20);
        Rectangle miinus = new Rectangle(üles.getCenterX()-10, üles.getCenterY()-2.5, 20, 5);
        Rectangle miinus2 = new Rectangle(alla.getCenterX()-10, alla.getCenterY()-2.5, 20, 5);
        juur.getChildren().add(pluss);
        juur.getChildren().add(miinus);
        juur.getChildren().add(miinus2);

        Rectangle edasi = new Rectangle(850, 500, 300, 100);
        edasi.setFill(Color.RED);
        edasi.setArcHeight(20);
        edasi.setArcWidth(20);
        juur.getChildren().add(edasi);
        Text tekst9 = new Text(955, 560, "EDASI");
        tekst9.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 24));
        juur.getChildren().add(tekst9);

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

        Scene stseen1 = new Scene(juur, 800, 600, Color.LAVENDERBLUSH);  //stseen, tagatausta värv

        tekst9.setOnMouseEntered(event -> edasi.setFill(Color.GREEN));
        tekst9.setOnMouseExited(event -> edasi.setFill(Color.RED));
        edasi.setOnMouseEntered(event -> edasi.setFill(Color.GREEN));
        edasi.setOnMouseExited(event -> edasi.setFill(Color.RED));

        edasi.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //Meetod 'küsi' on lükatud n-ö ühe võrra edasi, et pärast täringu veeretamist stseen updateks ennast!

                if(!mängija1.isOnKäinud()){
                    käi(mängija1, väli, juur, täring);
                    mängija1.setOnKäinud(true);
                }
                else if(!mängija2.isOnKäinud()) {
                    küsi(mängija1, nupud1, väli);
                    käi(mängija2, väli, juur, täring);
                    mängija2.setOnKäinud(true);
                }
                else if(!mängija3.isOnKäinud()) {
                    küsi(mängija2, nupud2, väli);
                    käi(mängija3, väli, juur, täring);
                    mängija3.setOnKäinud(true);
                }
                else {
                    küsi(mängija3, nupud3, väli);
                    mängija1.setOnKäinud(false);
                    mängija2.setOnKäinud(false);
                    mängija3.setOnKäinud(false);

                    /********************************** SKOOR **************************************/

                    JOptionPane.showMessageDialog(new JFrame("Mäng"),
                            "Mängija1 nupud: " + nupud1.toString() + '\n' +
                                    "Mängija1 asub " + mängija1.getMängija() + ". ringil" + '\n' + '\n' +
                                    "Mängija2 nupud: " + nupud2.toString() + '\n' +
                                    "Mängija2 asub " + mängija2.getMängija() + ". ringil" + '\n' + '\n' +
                                    "Mängija3 nupud: " + nupud3.toString() + '\n' +
                                    "Mängija3 asub " + mängija3.getMängija() + ". ringil");
                }

            }
        });
        return stseen1;
    }

    public static void täring(Group juur, Rectangle täring, int i){

        /********************************** TÄRINGUVEERETUS **************************************/

        täring.toFront(); //loob uue veeretuse jaoks tühja tahu
        if(i==1){
            //täringuvise: 1
            Circle täpp7 = new Circle(950, 140,10, Color.WHITE);
            juur.getChildren().add(täpp7);
        }
        if(i==2){
            //täringuvise 2:
            Circle täpp1 = new Circle(900, 90, 10, Color.WHITE);
            Circle täpp2 = new Circle(1000, 190, 10, Color.WHITE);
            juur.getChildren().add(täpp1);
            juur.getChildren().add(täpp2);
        }
        if(i==3) {
            //täringuvise 3:
            Circle täpp1 = new Circle(900, 90, 10, Color.WHITE);
            Circle täpp2 = new Circle(950, 140, 10, Color.WHITE);
            Circle täpp3 = new Circle(1000, 190, 10, Color.WHITE);
            juur.getChildren().add(täpp1);
            juur.getChildren().add(täpp2);
            juur.getChildren().add(täpp3);
        }
        if(i==4) {
            //täringuvise 4:
            Circle täpp4 = new Circle(900, 90, 10, Color.WHITE);
            Circle täpp5 = new Circle(900, 190, 10, Color.WHITE);
            Circle täpp6 = new Circle(1000, 90, 10, Color.WHITE);
            Circle täpp2 = new Circle(1000, 190, 10, Color.WHITE);
            juur.getChildren().add(täpp4);
            juur.getChildren().add(täpp5);
            juur.getChildren().add(täpp6);
            juur.getChildren().add(täpp2);
        }
        if(i==5) {
            //täringuvise 5:
            Circle täpp3 = new Circle(950, 140, 10, Color.WHITE);
            Circle täpp4 = new Circle(900, 90, 10, Color.WHITE);
            Circle täpp5 = new Circle(900, 190, 10, Color.WHITE);
            Circle täpp6 = new Circle(1000, 90, 10, Color.WHITE);
            Circle täpp2 = new Circle(1000, 190, 10, Color.WHITE);
            juur.getChildren().add(täpp4);
            juur.getChildren().add(täpp5);
            juur.getChildren().add(täpp6);
            juur.getChildren().add(täpp2);
            juur.getChildren().add(täpp3);
        }
        if(i==6) {
            //täringuvise 6;
            Circle täpp2 = new Circle(900, 80, 10, Color.WHITE);
            Circle täpp3 = new Circle(1000, 80, 10, Color.WHITE);
            Circle täpp4 = new Circle(900, 140, 10, Color.WHITE);
            Circle täpp5 = new Circle(1000, 140, 10, Color.WHITE);
            Circle täpp6 = new Circle(900, 200, 10, Color.WHITE);
            Circle täpp1 = new Circle(1000, 200, 10, Color.WHITE);
            juur.getChildren().add(täpp2);
            juur.getChildren().add(täpp3);
            juur.getChildren().add(täpp4);
            juur.getChildren().add(täpp5);
            juur.getChildren().add(täpp6);
            juur.getChildren().add(täpp1);
        }
    }

    public static void käi(Mängija mängija, List<Koht> väli, Group juur, Rectangle täring){

        /********************************** KÄIMINE **************************************/

        int i = (int) (Math.random() * 6) + 1;
        JOptionPane.showMessageDialog(new JFrame("Mäng"), mängija.getNimi() + " kord");
        täring(juur, täring, i);
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

        JOptionPane.showMessageDialog(new JFrame("Mäng"), mängija.getNimi() + " asub " + mängija.getMängija() + ". ringil");
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
        mängija.setCenterX(väli.get(mängija.getMängija()).getRing().getCenterX() + mängija.getX()); //Liigutame mängijat, kui ta sattus + või - märgile
        mängija.setCenterY(väli.get(mängija.getMängija()).getRing().getCenterY() + mängija.getY());
    }

    @Override
    public void start(Stage peaLava) throws Exception {
        Reeglid.väljastaReeglid();
        Küsimused.väljastaKüsimused();
        Vastused.väljastaVastused();
        JOptionPane.showMessageDialog(new JFrame("INFO"), "Tutvu reeglitega failist Reeglid.txt");
        JOptionPane.showMessageDialog(new JFrame("INFO"), "MÄNGIMA!");

        peaLava.setTitle("Laud");
        peaLava.setScene(mänguStseen());
        peaLava.setMaximized(true);
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


