package Algorismes;

public class Avid extends Laberint {
    //fiquem el valor de la x a la i i el valor de la y a la j perquè començarem a recòrrer el
    //laberint des d'aquí
    int i = x, j = y;

    public Avid(Celda[][] laberint, int files, int columnes, int x, int y, int fiX, int fiY) {
        super(laberint, files, columnes, x, y, fiX, fiY);
    }

    public void resoldreLaberint() {
        //punts seran els punts finals i comencem amb el valor de l'inici
        int punts = laberint[i][j].getNum();

        while (punts > 0 && i != fiX && j != fiY && laberint[i][j].isPotPassar()) {
            laberint[i][j].setCaracter("*");
            laberint[i][j].setPotPassar(false);
            int puntsGran = agafarMesGran();
            laberint[i][j].setNum(puntsGran);

            if (puntsGran == '\0' || puntsGran == -1000){
                System.out.println("No es pot resoldre");
                System.out.println(punts);
                return;
            }
            punts = punts + puntsGran;

        }
        System.out.println(punts);
    }

    //k = 0: moure dreta
    //k = 1: moure avall
    //k = 2: moure esquerra
    //k = 3: moure amunt
    private int agafarMesGran() {
        int resultat, maxim = -1000, posMax = -1, posX = i, posY = j;
        for (int k = 0; k < 4; k++) {
            if (k == 0) {
                if (laberint[i][j+1].isPotPassar()) {

                    resultat = laberint[i][j+1].operar(laberint[i][j].getNum(), laberint[i][j+1].getNum());
                    if (resultat > maxim) {
                        posMax = k;
                        maxim = resultat;
                    }
                }
            } else if (k == 1) {
                if (i+1 < files && laberint[i+1][j].isPotPassar() ) {
                    resultat = laberint[i+1][j].operar(laberint[i][j].getNum(), laberint[i+1][j].getNum());
                    if (resultat > maxim) {
                        posMax = k;
                        maxim = resultat;
                    }
                }
            } else if (k == 2) {
                if (j - 1 >= 0 && laberint[i][j-1].isPotPassar()) {
                    resultat = laberint[i][j-1].operar(laberint[i][j].getNum(), laberint[i][j-1].getNum());
                    if (resultat > maxim) {
                        posMax = k;
                        maxim = resultat;
                    }
                }
            } else {
                if (i - 1 >= 0 && laberint[i - 1][j].isPotPassar()) {
                    resultat = laberint[i - 1][j].operar(laberint[i][j].getNum(), laberint[i - 1][j].getNum());
                    if (resultat > maxim) {
                        laberint[i][j].setPotPassar(false);
                        i--;
                        return resultat;
                    }
                }
            }

        }
        switch (posMax){
            case 0:
                j++;
                break;
            case 1:
                i++;
                break;
            case 2:
                j--;
                break;
        }

        return maxim;
    }
}




