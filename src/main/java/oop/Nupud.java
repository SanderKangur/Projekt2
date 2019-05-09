package oop;

class Nupud {
    //Peab meeles, mis nupud kellelgi olemas on, ja laseb neid ka muuta
    private boolean aja;
    private boolean geo;
    private boolean mata;
    private boolean meedia;
    private boolean teadus;
    private boolean varia;

     Nupud(boolean aja, boolean geo, boolean mata, boolean meedia, boolean teadus, boolean varia) {
        this.aja = aja;
        this.geo = geo;
        this.mata = mata;
        this.meedia = meedia;
        this.teadus = teadus;
        this.varia = varia;
    }

     @Override
     public String toString() {
         return  "Ajalugu = " + aja +
                 ", Geograafia = " + geo +
                 ", Matemaatika = " + mata +
                 ", Meedia = " + meedia +
                 ", Teadus = " + teadus +
                 ", Varia = " + varia;
     }

     boolean isAja() {
        return aja;
    }

     boolean isGeo() {
        return geo;
    }

     boolean isMata() { return mata; }

     boolean isMeedia() {
        return meedia;
    }

     boolean isTeadus() {
        return teadus;
    }

     boolean isVaria() {
        return varia;
    }

     void setAja(boolean aja) {
        this.aja = aja;
    }

     void setGeo(boolean geo) {
        this.geo = geo;
    }

     void setMata(boolean mata) {
        this.mata = mata;
    }

     void setMeedia(boolean meedia) {
        this.meedia = meedia;
    }

     void setTeadus(boolean teadus) {
        this.teadus = teadus;
    }

     void setVaria(boolean varia) {
        this.varia = varia;
    }
}
