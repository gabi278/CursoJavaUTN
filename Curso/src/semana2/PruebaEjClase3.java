package semana2;

//import clase3Ejercicios.Clase3Ej2;

public class PruebaEjClase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clase3Ej2 prueba1= new Clase3Ej2("hola que tal za");//luego de la q, incluyendola, codifica mal.
		//String cadena1= "opqrstuvwxyz";
		//char[] prueba11= cadena1.toCharArray();
		//for(int i=0; i<prueba11.length;i++) {
		//	System.out.print(prueba11[i]+" ");
		//}
		System.out.println("Cadena modificada: "+prueba1);
		prueba1.codificarCadena(5);
		System.out.println("Cadena modificada: \t"+prueba1);
		prueba1.decodificarCadena();// en los espacios esta poniendo el caracter 'y', y 
		System.out.println("Cadena decodificada: \t"+prueba1);//en 
		//for(int i=0;i<26;i++) {
		//	prueba1.codificarCadena(1);
		//}
		//System.out.println("Cadena modificada: "+prueba1);
		//prueba1.decodificarCadena();
		//System.out.println("Cadena modificada: "+prueba1);
		//System.out.println("abcdefghijklmnñopqrstuvwxyz".length());
	}

}
