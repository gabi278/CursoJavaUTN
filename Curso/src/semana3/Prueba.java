package semana3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		//Leemos el archivo donde estan los datos de los productos
		List<String> datosArch= new ArrayList<String>();
		String datos = "D:\\CursoJavaUTN\\Curso\\src\\semana3\\datos.txt";
		try {
			Producto[] productos = new Producto[3];
			datosArch= Files.readAllLines(Paths.get(datos));
			for(int i=1; i<datosArch.size();i++) {//Comenzamos desde el 1 porque en el 0 estan los encabezados
				//System.out.println(datosArch.get(i));
				String[] linea = datosArch.get(i).split("\t");
				productos[i-1] = new Producto(linea[1],linea[2],Float.parseFloat(linea[0])); 
				//System.out.println(linea[0]+", "+linea[1]+", "+linea[2]);
			}
			LocalDateTime fecha = LocalDateTime.now();
			Carrito c1 = new Carrito(productos[0],productos[1],productos[2],fecha);
			System.out.println(c1.toString());
			System.out.println("El precio final es: "+c1.costoFinal());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
