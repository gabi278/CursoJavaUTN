package semana3;
import java.time.LocalDateTime;
public class Carrito {
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private LocalDateTime fechaCompra;
	
	public Carrito(Producto prod1, Producto prod2, Producto prod3, LocalDateTime fechaCompra) {
		this.producto1=prod1;
		this.producto2=prod2;
		this.producto3=prod3;
		this.fechaCompra=LocalDateTime.now();
	}
	public float costoFinal() {
		return this.producto1.costoFinal()+this.producto2.costoFinal()+this.producto3.costoFinal();
	}
	public String toString() {
		String cad="Compra realizada el: ";
		cad+=this.fechaCompra.getDayOfMonth()+"/";
		cad+=this.fechaCompra.getDayOfMonth()+"/";
		cad+=this.fechaCompra.getYear();
		return cad; //devuelve la fecha en que se realizo la compra en formato dd/mm/aaaa
	}
}
