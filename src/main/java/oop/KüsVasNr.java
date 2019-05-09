package oop;

class KüsVasNr {
    private String Küs;
    private String Vas;
    private int nr;

     KüsVasNr(String küs, String vas, int nr) {
        Küs = küs;
        Vas = vas;
        this.nr = nr;
    }

     String getKüs() {
        return Küs;
    }

     String getVas() {
        return Vas;
    }

}
