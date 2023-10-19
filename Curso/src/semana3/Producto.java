package semana3;

public class Producto {
	private String nombre;
	private String codigo;
	private float precio;
	
	public Producto(String nombre, String codigo, float precio) {
		this.nombre=nombre;
		this.codigo=codigo;
		this.precio=precio;
	}
	public float costoFinal() {
		return this.precio;
	}
	public String toString() {
		String cad="";
		cad+="Nombre: "+this.nombre;
		cad+=" -Codigo: "+this.codigo;
		cad+=" -Precio: "+this.precio;
		return cad;
	}
}
