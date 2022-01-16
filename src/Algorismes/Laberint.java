package Algorismes;

public class Laberint {
	//Variables
	protected Celda[][] laberint;
	protected int files,columnes;
	protected int x,y;//PEr on passem
	protected int fiX;
	protected int fiY;
	
	/**
	 * @param laberint
	 * @param files
	 * @param columnes
	 * @param x
	 * @param y
	 */
	
	public Laberint(Celda[][] laberint, int files, int columnes, int x, int y, int fiX, int fiY) {
		this.laberint = laberint;
		this.files = files;
		this.columnes = columnes;
		this.x = x;
		this.y = y;
		this.fiX = fiX;
		this.fiY = fiY;
	}

	public boolean esFactible(int k, int i, int j){
		switch (k) {
			case 0 -> j++;
			case 1 -> i++;
			case 2 -> j--;
			default -> i--;
		}
		if (j >= 0 && j < columnes && i >= 0 && i < files)
			return laberint[i][j].isPotPassar();
		return false;
	}

	public Celda[][] getLaberint() {
		return laberint;
	}
	public void setLaberint(Celda[][] laberint) {
		this.laberint = laberint;
	}
	public int getFiles() {
		return files;
	}
	public void setFiles(int files) {
		this.files = files;
	}
	public int getColumnes() {
		return columnes;
	}
	public void setColumnes(int columnes) {
		this.columnes = columnes;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}