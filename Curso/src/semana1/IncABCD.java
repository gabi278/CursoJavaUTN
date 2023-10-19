package semana1;
//Clase 1 ejercicios
public class IncABCD {
	// en esta clase crearemos los metodos para cada inciso del ejercicio 1
	private
	int inicio,fin,copia;
	
	public IncABCD() {
		this.inicio=0;
		this.fin=10;
		this.copia=this.inicio;
	}
	public IncABCD(int a,int b) {
		this.inicio=a;
		this.fin=b;
		this.copia=this.inicio;
	}
	public void incisoA() {
		/*Utilizando la sentencia while, imprima todos los números entre 2variables “a”
		y “b”.*/
		this.copia=this.inicio;
		System.out.println("A");
		while(this.copia<=this.fin) {
			if(this.copia!=this.fin) {
				System.out.print(this.copia+", ");
				this.copia++;
			}else {
				System.out.print(this.copia);
				this.copia++;//para evitar un ciclo infinito cuando inicio == fin
			}
		}
	}
	public void incisoB() {
		/*A lo anterior,solo muestre los números pares*/
		this.copia=this.inicio;
		System.out.println("\nB");
		while(this.copia<=this.fin) {
			if((this.copia%2==0) && (this.copia!=this.fin)) {
				System.out.print(this.copia+", ");
			}else if((this.copia==this.fin) && (this.copia%2==0)){
				System.out.print(this.copia);
			}
			this.copia++;
		}
	}
	private void mostrarImpares() {
		this.copia=this.inicio;
		System.out.println("mostrar impares:");
		while(this.copia<=this.fin) {
			if((this.copia%2!=0) && (this.copia!=this.fin)) {
				System.out.print(this.copia+", ");
			}else if((this.copia==this.fin) && (this.copia%2!=0)){
				System.out.print(this.copia);
			}
			this.copia++;
		}	
	}
	public void incisoC(char letra) {
		/*A lo anterior, con una variable extra, elija si se deben mostrar los números
		pares o impares*/
		System.out.println("\nC");
		//la letra que puede ingresar para mostrar par o impar seran: P o I
		if(letra=='p' || letra=='P') {
			//mostramos los pares
			incisoB();
		}else if(letra=='i' || letra=='I') {
			mostrarImpares();
		}else {
			System.out.println("Letra invalida!");
		}
	}
	public void mostrarInvertido() {
		System.out.println("\nD");
		for(int i=this.fin;i>=this.inicio;i--) {
			if(i!=inicio) {
				System.out.print(i+", ");
			}else {
				System.out.print(i);
			}
		}
	}

}
