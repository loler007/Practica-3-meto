package Algorismes;

public class Avid extends Laberint {
    //fiquem el valor de la x a la i i el valor de la y a la j perquè començarem a recòrrer el
    //laberint des d'aquí
    int i = x, j = y;
    public Avid(Celda[][] laberint, int files, int columnes, int x, int y, int fiX, int fiY){
        super(laberint, files, columnes, x, y, fiX, fiY);
    }

    public void resoldreLaberint(){
        //punts seran els punts finals i comencem amb el valor de l'inici
        int punts = laberint[i][j].getNum();
        int[] candidats = new int[4];
        int puntsDespres;
        Celda celdaActual;
        while (punts > 0 && i != fiX && j != fiY && laberint[i][j].isPotPassar()){
            punts = agafarMesGran();
        }
        System.out.println(punts);
    }

    //k = 0: moure dreta
    //k = 1: moure avall
    //k = 2: moure esquerra
    //k = 3: moure amunt
    private int agafarMesGran(){
        int resultat, maxim = -1000, posMax, posX = i, posY = j;
        for (int k = 0; k < 4; k++){
            if (k == 0){
                if (laberint[i+1][j].isPotPassar() && laberint[i+1][j] != null){
                    resultat = laberint[i+1][j].operar(laberint[i][j].getNum(), laberint[i+1][j].getNum());
                    if (resultat > maxim){
                        posMax = k;
                        maxim = resultat;
                    }

                }
            }
            else if (k == 1){
                if (laberint[i][j-1].isPotPassar() && laberint[i][j-1] != null){
                    resultat = laberint[i][j-1].operar(laberint[i][j].getNum(), laberint[i][j-1].getNum());
                    if (resultat > maxim){
                        posMax = k;
                        maxim = resultat;
                    }
                }
            }
            else if (k == 2){
                if (laberint[i-1][j].isPotPassar() && laberint[i-1][j] != null){
                    resultat = laberint[i-1][j].operar(laberint[i][j].getNum(), laberint[i-1][j].getNum());
                    if (resultat > maxim){
                        posMax = k;
                        maxim = resultat;
                    }
                }
            }
            else {
                if (laberint[i][j+1].isPotPassar() && laberint[i][j+1] != null){
                    resultat = laberint[i][j+1].operar(laberint[i][j].getNum(), laberint[i][j+1].getNum());
                    if (resultat > maxim){
                        laberint[i][j+1].setPotPassar(false);
                        j++;
                        laberint[i][j+1].setCaracter("*");
                        return resultat;
                    {
                }
            }
        }
        return '\0';
    }
}



