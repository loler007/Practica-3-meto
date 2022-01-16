package Algorismes;

public class Poda extends Laberint {
    private Node solucio;

    /**
     * @param laberint
     * @param files
     * @param columnes
     * @param x
     * @param y
     * @param fiX
     * @param fiY
     */
    public Poda(Celda[][] laberint, int files, int columnes, int x, int y, int fiX, int fiY) {
        super(laberint, files, columnes, x, y, fiX, fiY);
        solucio = new Node(files, columnes);
        for (int i = 0; i < files; i++){
            for (int j = 0; j < columnes; j++){
                solucio.getValor()[i][j] = false;
            }
        }
    }

    private void afegir(boolean[][] solucioBol){
        Node aux = new Node(solucioBol);
        aux.setNextNode(solucio);
        solucio = aux;
    }

    public void assignacio(int i, int j, int punts) {
        if(i==fiX && j == fiY){
            afegir(solucio.getValor());
            System.out.println(punts);
            return;
        }
        solucio.getValor()[i][j] = true;
        laberint[i][j].setPotPassar(false);
        for (int k = 0; k < 4; k++){
            switch (k){
                case 0 -> {
                    if (esFactible(k, i, j)){
                        punts = laberint[i][j + 1].operar(punts, laberint[i][j + 1].getNum());
                        if (punts > 0)
                            assignacio(i, j + 1, punts);
                    }
                }

                case 1 -> {
                    if (esFactible(k, i, j)){
                        punts = laberint[i + 1][j].operar(punts, laberint[i + 1][j].getNum());
                        if (punts > 0)
                            assignacio(i + 1, j, punts);
                    }
                }

                case 2 -> {
                    if (esFactible(k, i, j)) {
                        punts = laberint[i][j - 1].operar(punts, laberint[i][j - 1].getNum());
                        if (punts > 0)
                            assignacio(i, j - 1, punts);
                    }
                }

                case 3 -> {
                    if (esFactible(k, i, j)){
                        punts = laberint[i - 1][j].operar(punts, laberint[i - 1][j].getNum());
                        if (punts > 0)
                            assignacio(i - 1, j, punts);
                    }
                }
            }

            laberint[i][j].setPotPassar(false);
        }
    }

//    private static void guardaSolucioActual() {
//        solMax = new int[nElem];
//        for (int i = 0; i < nElem; i++)
//            solMax[i] = solucio[i];
//    }
//
//    private static int sumaSolucio() {
//        int s = 0;
//        for (int i = 0; i < solucio.length; i++)
//            if (solucio[i] != 0)
//                s = s + valors[i];
//        return s;
//    }
//
    private void mostrarSolucio() {
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.print(solucio.getValor()[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}