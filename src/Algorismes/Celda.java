package Algorismes;

public class Celda {
    private int num;
    private String caracter;
    private char operador;
    private boolean potPassar;

    public Celda(String caracter){
        this.caracter = caracter;
        potPassar = true;
    }

    public void llegirOperador(){
        if (!caracter.equals("NA")){
            operador = caracter.charAt(0);
            num = caracter.charAt(1);
            potPassar = true;
        } else{
            potPassar = false;
        }
    }

    public int operar(int x, int y){
        if (operador == '+')
            return x+y;
        else if (operador == '-')
            return x-y;
        else if (operador == '*')
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

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
}
