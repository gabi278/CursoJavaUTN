package semana1;

public class EjClase2 {

	public static void main(String[] args) {
		for(int i=0; i<args.length;i++) {
			System.out.println(args[i]);
		}
		float ingresoMensual=500000f;
		int cantVehiculos=0, cantInmuebles=0;
		boolean activoLujo=false;
		
		boolean esAlto=(ingresoMensual>=996404.34f)||(cantVehiculos>2)||(cantInmuebles>2)||(activoLujo);
		//boolean esMedio=(ingresoMensual>=284686.95f)||(cantVehiculos<2)||(cantInmuebles<3)||(activoLujo);
		boolean esBajo=(ingresoMensual<284686.95f)&&(cantVehiculos<1)&&(cantInmuebles<2);
		
		if(esAlto) {
			System.out.println("Segmento de ingresos altos.");
		}else if(esBajo) {
			System.out.println("Segmento de menores ingresos.");
		}else {
			System.out.println("Segmento de ingresos medios.");
		}
	}

}
