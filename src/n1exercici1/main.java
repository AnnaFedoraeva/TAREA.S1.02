package n1exercici1;

public class main {

	public static void main(String[] args) throws VentaVaciaException {
		// TODO Auto-generated method stub

		Producto yogur = new Producto("Yogur", 1);
		Producto zumo = new Producto("Zumo", 2);

		Venta.agregarProducto(zumo);
		Venta.agregarProducto(yogur);

		Venta.CalcularTotal();
		Venta.CalcularTotalException();

	}

}
