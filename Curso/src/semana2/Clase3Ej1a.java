package semana2;

public class Clase3Ej1a {
	private String cadena;
	
	public Clase3Ej1a() {
		
	}
	public Clase3Ej1a(String cadena) {
		this.cadena=cadena;
	}
	public String getCadena() {
		return this.cadena;
	}
	public boolean esVacia() {
		return cadena==null;
	}
	/*a. Dado un String y una letra, que cuente la cantidad
	 *  de apariciones de la letra en 
		el String*/
	public int cantApariciones(char a) {
		int contador=0;
		char[] caracteres = this.cadena.toCharArray();// convertimos el string a un array de char.
		for(int i=0;i<this.cadena.length();i++) {
			if(caracteres[i]==a) {
				contador++;
			}
		}
		return contador;
	}
}
