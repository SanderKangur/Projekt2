package oop;

import javafx.scene.shape.Circle;

import java.io.File;

 class Koht {
    private int nr;
    private Circle ring;
    private File küs;
    private File vas;

     int getNr() {
        return nr;
    }

     public void setRing(Circle ring) {
         this.ring = ring;
     }

     public Circle getRing() {
         return ring;
     }

     File getKüs() {
        return küs;
    }

     File getVas() {
        return vas;
    }

     Koht(int nr, Circle ring, File küs, File vas) {
        this.nr = nr;
        this.ring = ring;
        this.küs = küs;
        this.vas = vas;
    }
}
