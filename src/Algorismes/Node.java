package Algorismes;

public class Node {
    private boolean[][] solucio;
    private Node nextNode;

    public Node(int files, int columnes){
        solucio = new boolean[files][columnes];
        for (int i = 0; i < files; i++){
            for (int j = 0; j < columnes; j++){
                solucio[i][j] = false;
            }
        }
        nextNode = null;
    }

    public Node(boolean[][] solucio){
        this.solucio = solucio;
        nextNode = null;
    }

    public boolean[][] getValor() {
        return solucio;
    }

    public void setValor(boolean[][] solucio) {
        this.solucio = solucio;
    }

    public Node getNextNode() {
        return nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "valor=" + solucio +
                ", nextNode=" + nextNode +
                '}';
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}