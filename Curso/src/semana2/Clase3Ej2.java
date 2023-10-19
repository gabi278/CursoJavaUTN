package semana2;

public class Clase3Ej2 {
/*Genere una clase que tenga los métodos para realizar la codificación y decodificación
de un string, dado un número de desplazamiento.*/
	private String abecedario= "abcdefghijklmnñopqrstuvwxyz";
	private String cadenaACodificar;
	private boolean estaCodificada = false;
	private int desplazamiento;
	
	
	public Clase3Ej2() {
		
	}
	public Clase3Ej2(String cadena) {
		this.cadenaACodificar=cadena;
	}
	//CODIFICAMOS SOLO SI LA CADENA NO ESTA VACIA.
	public void codificarCadena(int desplazamiento) {
		char[] arrayCaracteres = this.cadenaACodificar.toCharArray();
		int indiceNuevo;
		System.out.println("Longitud del array de caracteres: "+arrayCaracteres.length);
		if(this.cadenaACodificar!="") {
			this.desplazamiento=desplazamiento; // GUARDAMOS EL DESPLAZAMIENTO PARA LA DECODIFICACION
			for(int i=0;i<arrayCaracteres.length;i++) {
				if(arrayCaracteres[i]==' ') {
					arrayCaracteres[i]='A';
				}else if( (this.abecedario.indexOf(arrayCaracteres[i])+this.desplazamiento) == this.abecedario.length()-1) {
					arrayCaracteres[i]='z';
				}else {
					indiceNuevo=(this.desplazamiento+this.abecedario.indexOf(arrayCaracteres[i]))%27;
					arrayCaracteres[i]=this.abecedario.charAt(indiceNuevo);
				}
			}
			String cadenaCodificada= new String(arrayCaracteres);
			this.cadenaACodificar=cadenaCodificada;
			this.estaCodificada=true;//USAREMOS ESTO PARA LUEGO PODER DECODIFICAR SOLO SI LA CADENA ESTA CODIFICADA
		}else {
			System.out.println("La cadena esta vacia, no es posible codificar.");
		}
	}
	//DECODIFICACION DE LA CADENA: 
	//TENEMOS QUE DECODIFICAR CUANDO LA CADENA ESTA CODIFICADA Y DEBEMOS USAR EL MISMO DESPLAZAMIENTO CON EL QUE CODIFICAMOS
	public void decodificarCadena() {
		if(this.estaCodificada) {
			char[] arrayCodificada=this.cadenaACodificar.toCharArray();
			int indiceNuevo;
			for(int i=0;i<arrayCodificada.length;i++) {
				//indiceNuevo= (this.abecedario.length()+this.abecedario.indexOf(arrayCodificada[i]))%27;
				if(arrayCodificada[i]=='A') {
					arrayCodificada[i]=' ';
				}else if(this.abecedario.indexOf(arrayCodificada[i]) - this.desplazamiento <0){
					indiceNuevo= this.abecedario.indexOf(arrayCodificada[i]) - this.desplazamiento +this.abecedario.length();
					while(indiceNuevo<0) {
						indiceNuevo+= this.abecedario.length();// Sumamos la cantidad de letras que hay en el abecedario hasta que tengamos un numero > 0, el cual indica la posicion del caracter decodificado.
					}
					arrayCodificada[i]=this.abecedario.charAt(indiceNuevo);
				}else {
					indiceNuevo= Math.abs(this.abecedario.indexOf(arrayCodificada[i]) - this.desplazamiento);
					arrayCodificada[i]=this.abecedario.charAt(indiceNuevo);
				}
			}
			String cadenaDecodificada= new String(arrayCodificada);//Convertimos el array decodificada en una String.
			this.cadenaACodificar=cadenaDecodificada;//Guardamos la cadena decodificada en cadenaACodificar.
		}else {
			System.out.println("La cadena aun no esta codificada.");
		}
	}
	public String toString() {
		return this.cadenaACodificar;
	}
}
