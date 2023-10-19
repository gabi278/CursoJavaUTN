package semana3;

import java.time.LocalDateTime;

public class Persona {
	private String nombre;
	private String apellido;
	private LocalDateTime fechaDeNacimiento;
	
	public Persona(String nombre,String apellido, LocalDateTime fchNac) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaDeNacimiento=fchNac;
	}
	
	public int edad() {
		LocalDateTime fchActual = LocalDateTime.now();
		int edad,anioActual, anioNacimiento,mesActual,mesNac,diaAc,diaNac;
		anioActual=fchActual.getYear();
		mesActual=fchActual.getMonthValue();
		diaAc=fchActual.getDayOfMonth();
		
		anioNacimiento=this.fechaDeNacimiento.getYear();
		mesNac=this.fechaDeNacimiento.getMonthValue();
		diaNac=this.fechaDeNacimiento.getDayOfMonth();
		edad=anioActual-anioNacimiento;
		if(mesActual<mesNac) {
			edad-=1;//todavia no cumplio años en la fecha actual.
		}else if(mesActual==mesNac && diaAc<diaNac) {
				edad-=1;//  todavia no cumplio años en la fecha actual.
		}
		return edad;
	}
}
