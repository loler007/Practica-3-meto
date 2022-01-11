package Algorismes;

public class Laberint {
	//Variables
	protected String[][] laberint;
	protected int files,columnes;
	protected int x,y ;//PEr on passem
	protected int inici[];
	protected int fi[];
	
	/**
	 * @param laberint
	 * @param files
	 * @param columnes
	 * @param x
	 * @param y
	 * @param inici
	 * @param fi
	 */
	
	public Laberint(String[][] laberint, int files, int columnes, int x, int y, int[] inici, int[] fi) {
		this.laberint = laberint;
		this.files = files;
		this.columnes = columnes;
		this.x = x;
		this.y = y;
		this.inici = inici;
		this.fi = fi;
	}

	public String[][] getLaberint() {
		return laberint;
	}
	public void setLaberint(String[][] laberint) {
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
	public int[] getInici() {
		return inici;
	}
	public void setInici(int[] inici) {
		this.inici = inici;
	}
	public int[] getFi() {
		return fi;
	}
	public void setFi(int[] fi) {
		this.fi = fi;
	}
	
	
}