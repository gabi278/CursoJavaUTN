package semana2;

public class PruebaEj1Clase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Lo que entiendo del inciso a es que tengo que pasar parametros a la funcion main, tienen
		 * que ser 3 numeros y una letra que indique el orden ascendente o descendente*/
		int[] array = new int[3];
		Clase4Ej1b numeros;
		//necesitamos 4 parametros, asi que si tenemos menos el programa no funcionara.
		if(args.length<4 || !esCaracterValido(args[3].charAt(0)) ) {
			System.out.println("Hay menos de 4 parametros. Deben ser 3 numeros, y 1 letra: 'a' o 'd'");
		}else{//ENTRA ACA CUANDO args.length >=4 && esCaracterValido == true;
			for(int i=0;i<3;i++) {//Extraemos los numeros
				array[i] = Integer.parseInt(args[i]);
			}
			numeros = new Clase4Ej1b(array[0],array[1],array[2]);
			numeros.ordenarNumeros(args[3].charAt(0));
			System.out.print("[");
			for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
			}
			System.out.print("]\n");
		}
	}
	private static boolean esCaracterValido(char a) {
		return (a=='a') || (a=='A') || (a=='d') || (a=='D');
	}


}
