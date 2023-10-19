/**
 * 
 */
package semana2;

public class Clase4Ej1b {
	private int[] numeros = new int[3];
	public boolean sonCeros=false;
	/*b. Dados 3 números y un orden (ascendente o decreciente) que ordene los 
	mismos y los retorne en un vector de 3*/
	public Clase4Ej1b() {
		this.numeros[0]=0;
		this.numeros[1]=0;
		this.numeros[2]=0;
		this.sonCeros=true;
	}
	public Clase4Ej1b(int num1, int num2, int num3) {
		this.numeros[0]=num1;
		this.numeros[1]=num2;
		this.numeros[2]=num3;
	}
	public int[] ordenarNumeros(char tipoOrden) {
		if((!this.sonCeros) && (tipoOrden == 'a' || tipoOrden == 'A')) {
			ordenarAscendente();
			return this.numeros;
		}else if((!this.sonCeros) && (tipoOrden == 'd' || tipoOrden == 'D')) {
			ordenarDescendente();
			return this.numeros;
		}else if(this.sonCeros){
			return this.numeros;
		}else {
			System.out.println("El orden "+tipoOrden+" ingresado no es correcto.Ingrese A o D.");
			return null;
		}
		
	}
	private void ordenarAscendente() {//De menor a mayor
		int auxiliar=0;
		for(int i=0;i<numeros.length;i++) {
			for(int j=i+1;j<numeros.length;j++) {
				if(numeros[j]<numeros[i]) {
					auxiliar= numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=auxiliar;
				}
			}
		}
	}
	private void ordenarDescendente() {// De mayor a menor
		int auxiliar=0;
		for(int i=0;i<numeros.length;i++) {
			for(int j=i+1;j<numeros.length;j++) {
				if(numeros[j]>numeros[i]) {
					auxiliar= numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=auxiliar;
				}
			}
		}
	}
	public String toString() {
		String cad="";
		cad+="["+this.numeros[0]+", "+this.numeros[1]+", "+this.numeros[2]+"]";
		return cad;
	}
}
