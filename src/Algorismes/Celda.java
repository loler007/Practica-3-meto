package Algorismes;

public class Celda {
    private int num;
    private String caracter;
    private String operador;
    private boolean potPassar;
    private String[] separat;

    public Celda(String caracter){
        this.caracter = caracter;
        potPassar = true;
    }
    public void llegirOperador(){
        if (!caracter.equals("NA")){
            separat = caracter.split("", 2);
            operador = separat[0];
            num = Integer.parseInt(separat[1]);
            potPassar = true;
        } else{
            potPassar = false;
        }
    }

    public int operar(int x, int y){
        if (operador.equals("+"))
            return x+y;
        else if (operador.equals("-"))
            return x-y;
        else if (operador.equals("*"))
            return x*y;
        else
            return x/y;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isPotPassar() {
        return potPassar;
    }

    public void setPotPassar(boolean potPassar) {
        this.potPassar = potPassar;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
}
