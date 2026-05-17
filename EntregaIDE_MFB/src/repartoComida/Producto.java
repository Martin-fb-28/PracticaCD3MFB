package repartoComida;

import java.util.Objects;

public class Producto {
	private String nombre;
	private int precio;
	private CategoriaProducto categoria;
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public CategoriaProducto getCategoria() {
		return categoria;
	}
	
	public Producto(String nombreProducto, int precioProducto, CategoriaProducto categoria) {
		this.nombre = nombreProducto;
		this.precio = precioProducto;
		this.categoria = categoria;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Producto prod = (Producto) obj;
		
		return Objects.equals(nombre, prod.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
}


