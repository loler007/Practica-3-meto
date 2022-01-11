package Aplicacio;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Algorismes.Avid;
import Algorismes.Laberint;
import RecursDinamic.DadesDinamic;
import RecursDinamic.Data;
import RecursDinamic.Node;
import RecursDinamic.RecursDinamic;


public class Main {
	Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
    	
        Avid l1= new Avid(Integer.parseInt(particions[0]),Integer.parseInt(particions[0]),Integer.parseInt(particions[0]),Integer.parseInt(particions[0]),Integer.parseInt(particions[0]),Integer.parseInt(particions[0]),Integer.parseInt(particions[0]));
    	try {
			llegirLiniesFitxer(6);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
    
    
    public static String[] guardarDades(int mida, String[] dades) throws FileNotFoundException {        
        

        for(int i = 0; i< mida; i++){
            String s = dades[i];
            String[]particions = s.split(";");
            String files = particions[0];
            String columnes = particions[1];
            String filPartida = particions[2];
            String colPartida = particions[3];
            String filFinal = particions[4];
            String colFinal = particions[5];

        }
        return dades;
    }
    
}
