package n1exercici1;

import java.util.ArrayList;

public class Venta {
	private static ArrayList<Producto> productos = new ArrayList<Producto>();
	private static int PrecioTotal;
	

	public static void CalcularTotal() throws VentaVaciaException {
		int size = productos.size();
		boolean indexValido = false;
		while (!indexValido) {
			try {
				if (size == 0) {
					throw new VentaVaciaException("Para hacer una venta primero debes añadir productos.");
				}
				for (Producto producto : productos) {
					PrecioTotal += producto.getPrecio();
				}
				System.out.println("Precio total de los productos:" + PrecioTotal);
				indexValido = true;
			} catch (VentaVaciaException ex) {
				System.out.println(ex.getMessage());
				indexValido = true;
			}
		}

	}
	//exception indexoutofbounds:
	public static void CalcularTotalException() {
		try {
			for (int i = 0; i <= 2; i++) {
				PrecioTotal += productos.get(i).getPrecio();
			}
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Excepcion: no es posible acceder a un índice del array que no existe");

		}
	}

	public int getPrecioTotal() {
		return PrecioTotal;
	}
	
	public void setPrecioTotal(int precioTotal) {
		PrecioTotal = precioTotal;
	}

	public static ArrayList<Producto> getProductos() {
		return productos;
	}

	public static void setProductos(ArrayList<Producto> productos) {
		Venta.productos = productos;
	}

	public static void agregarProducto(Producto producto) {
		Venta.productos.add(producto);
	}
}
