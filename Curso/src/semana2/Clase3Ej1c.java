package semana2;

public class Clase3Ej1c {
	private int[] arregloNum;
	private int tam,indice;
	/*c. Dado un vector de números, y un número X, que sume todos los números >X y
retorne el resultado*/
	public Clase3Ej1c() {
		this.tam = 0;
		this.arregloNum = new int[tam];
		this.indice=0;
	}
	public Clase3Ej1c(int tam) {
		this.tam=tam;
		this.arregloNum=new int[this.tam];
		this.indice=0;
	}
	public int getTam() {//cantidad de elementos maximo que puede tener el array
		return this.tam;
	}
	public int getIndice() {
		return this.indice; // cantidad de elementos que tiene actualmente el array.
	}
	public void agregarNumero(int a) {
		if(this.indice<this.tam) {
			this.arregloNum[indice]=a;
			this.indice++;
		}else {
			System.out.println("Array lleno!");
		}
	}
	public int acumularNum(int num) {
		int acum=0;
		for(int i=0; i<this.indice;i++) {
			if(this.arregloNum[i]>num) {
				acum+=this.arregloNum[i];
			}
		}
		return acum;
	}
}
