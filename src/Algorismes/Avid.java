package Algorismes;

public class Avid {
    private int files;
    private int columnes;
    private String[][] taula;
    public Avid(int files, int columnes){
        taula = new String[files][columnes];
        this.files = files;
        this.columnes = columnes;
    }

}
