package repartoComida;

import java.util.List;
import java.util.ArrayList;

public class Cliente extends Usuario{
	private List <Pedido> historialPedidos;
	
	public Cliente(String nombreCliente, String emailCliente, String telefonoCliente) {
		super(nombreCliente, emailCliente, telefonoCliente);
		this.historialPedidos = new ArrayList<>();	
	}
	
	public void anhadirPedido(Pedido pedido) {
		this.historialPedidos.add(pedido);
	}
}
