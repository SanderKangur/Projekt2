package oop;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

class Mängija extends Circle {
    //Sisaldab mängija praegust asukohta
    private int mängija;
    private String nimi;
    private int x;
    private int y;
    private boolean onKäinud=false;

    public Mängija(double centerX, double centerY, double radius, Paint fill, int mängija, String nimi, int x, int y) {
        super(centerX, centerY, radius, fill);
        this.mängija = mängija;
        this.nimi = nimi;
        this.x = x;
        this.y = y;
    }

    int getMängija() {
        return mängija;
    }

     void setMängija(int mängija) {
        this.mängija = mängija;
    }

    public String getNimi() {
        return nimi;
    }

    public boolean isOnKäinud() {
        return onKäinud;
    }

    public void setOnKäinud(boolean onKäinud) {
        this.onKäinud = onKäinud;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
