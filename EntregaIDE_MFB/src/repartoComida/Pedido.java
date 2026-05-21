package repartoComida;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
	private int id;
	private LocalDateTime fecha;
	private EstadoPedido estado;
	private Cliente cliente;
	private Repartidor repartidor;
	private List<Producto> productos;
	private int total;
	
	public int getId() {
		return id;
	} 
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	
	public EstadoPedido getEstado() {
		return estado;
	}
	
	public int getTotal() {
		return total;
	}
	
	public Pedido(int idPedido, Cliente cliente) {
		this.id = idPedido;
		this.cliente = cliente;
		this.fecha = LocalDateTime.now();
		this.estado = EstadoPedido.PENDIENTE;
		this.repartidor = null;
		this.productos = new ArrayList<>();
		this.cliente.anhadirPedido(this);
		this.total = 0;
	}
	
	public void anhadirProducto(Producto p) {
        if (!productos.contains(p)) {
            productos.add(p);
            totalProducto(); 
        }else {
        	throw new IllegalArgumentException("El producto " + p.getNombre() + " ya está en el pedido");
        }
    }
	
	public void totalProducto() {
		this.total = 0;
		for(Producto prod  : productos) {
			this.total += prod.getPrecio();
		}
	}
	
	public void asignarRepartidor(Repartidor rep) {
		if(rep.getEstado() == EstadoRepartidor.DISPONIBLE && !productos.isEmpty()) {
			this.repartidor = rep;
			this.estado = EstadoPedido.EN_REPARTO;
			this.repartidor.setEstado(EstadoRepartidor.OCUPADO);
		}
	}
	
	public void entregarPedido() {
		if (this.estado == EstadoPedido.EN_REPARTO) {
	        if (this.repartidor != null) {
	            this.estado = EstadoPedido.ENTREGADO;
	            this.repartidor.setEstado(EstadoRepartidor.DISPONIBLE);
	        } else {
	            this.estado = EstadoPedido.CANCELADO;
	            throw new IllegalStateException("Pedido cancelado: No existe un repartidor asociado para completar la entrega.");
	        }
	    } else {
	        throw new IllegalStateException("Estado no válido para la entrega del pedido : " + this.estado);
	    }
	}
	
}

