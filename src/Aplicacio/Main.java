package Aplicacio;
import Algorismes.Avid;
import Algorismes.Celda;
import Algorismes.Laberint;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {

        String[] textLlegit= llegirLiniesFitxer(1);
        String[] dades;
        dades = textLlegit[0].split(", ");

        Celda[][] maze= new Celda[Integer.parseInt(dades[0])][Integer.parseInt(dades[1])];
        int iniciX=(Integer.parseInt(dades[2]));
        int iniciY=(Integer.parseInt(dades[3]));
        int fiX=(Integer.parseInt(dades[4]));
        int fiY=(Integer.parseInt(dades[5]));

        Avid l1= new Avid(maze,Integer.parseInt(dades[0]),Integer.parseInt(dades[1]), iniciX, iniciY, fiX, fiY);

        int files = Integer.parseInt(dades[0]);
        int columnes = Integer.parseInt(dades[1]);

        String[] result = llegirLiniesFitxer(files+1);
        String[] dadesResult;

        for(int i=1; i<=files; i++) {
            dadesResult = result[i].split(", ");
            for (int j = 0; j < columnes; j++) {
                l1.getLaberint()[i-1][j] = new Celda(dadesResult[j]);
                l1.getLaberint()[i-1][j].llegirOperador();
            }
        }

//        for(int i=0;i<l1.getFiles(); i++) {
//            for(int j=0;j<l1.getColumnes(); j++) {
//                System.out.print(l1.getLaberint()[i][j].getCaracter() + "\t");
//            }
//            System.out.println("\n");
//        }
//        l1.resoldreLaberint();

        for(int i=0;i<5; i++) {
            for(int j=0;j<7; j++) {
                System.out.print(l1.getLaberint()[i][j].getCaracter() + "\t");
            }
            System.out.println("\n");
        }
        l1.resoldreLaberint();
        for(int i=0;i<5; i++) {
            for(int j=0;j<7; j++) {
                System.out.print(l1.getLaberint()[i][j].getCaracter() + "\t");
            }
            System.out.println("\n");
        }
    }


    /*Guardem en una String les linies*/
    public static String[] llegirLiniesFitxer(int nLinies) throws FileNotFoundException {

        String [] lector= new String[nLinies];
        Scanner f = new Scanner(new File("laberint.txt"));
        for (int i = 0; i < nLinies; i++) {

            lector[i]=f.nextLine();

        }
        f.close();
        return lector;
    }



}
