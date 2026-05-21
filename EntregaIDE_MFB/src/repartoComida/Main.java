package repartoComida;

public class Main {
    public static void main(String[] args) {
    	
    	System.out.println("---- Sistema de reparto ---- \n");
    	
    	Cliente primerCliente = new Cliente("Juan Carlos", "JCA@gmail.com", "600291581");
    	Repartidor repartidor1 = new Repartidor("Pedro Jimenez", "BigFoodDeliver@gmail.com", "611984209", "Elviña");
    	
    	Producto hamburguesaGourmet = new Producto("Hamburguesa Double Cheese", 3, CategoriaProducto.COMIDA);
    	Producto monsterMonarch = new Producto("Monster Monarch", 2, CategoriaProducto.BEBIDA);
    	Producto coulantMeltedHeart = new Producto("Coulant de chocolate (Melted Heart)", 6, CategoriaProducto.POSTRE);
    	Producto caviarRuso = new Producto("Caviar Petrossian", 4360, CategoriaProducto.COMIDA);
    	
    	System.out.println("Preparando el pedido del cliente, espere un momento...\n");
    	Pedido pedidoCliente = new Pedido(56, primerCliente);
    	
    	try {
    		System.out.println("Añadiendo productos al pedido, agradecemos su espera.");
    		pedidoCliente.anhadirProducto(hamburguesaGourmet);
    		pedidoCliente.anhadirProducto(monsterMonarch);
    		pedidoCliente.anhadirProducto(coulantMeltedHeart);
    		pedidoCliente.anhadirProducto(caviarRuso); 		

    		/*
    		 
    		  Esta parte del código está hecha para comprobar que la función lanza el error a la hora de intentar crear 2 objetos (hamburguesaGourmet) exactamente iguales. 
    		  pedidoCliente.anhadirProducto(hamburguesaGourmet);
    		 
    		*/
    		 			
    	}catch(IllegalArgumentException e){
    		System.err.println("Error al añadir los productos! " + e.getMessage());
    	}
    	
    	System.out.println("Productos añadidos con éxito! ");
    	System.out.println("El precio total de su pedido actualmente es de: " + pedidoCliente.getTotal() + "\n");
    	
    	System.out.println("Un repartidor vendrá a recoger su pedido y se lo llevará al domicilio, gracias por confiar en nosotros.");
    	System.out.println("Asignándole un repartidor...");
    	System.out.println("");
    	pedidoCliente.asignarRepartidor(repartidor1);
    	System.out.println("");
    	System.out.println("Repartidor asginado con éxito!");
    	
    	System.out.println("Su repartidor es: " + repartidor1.getNombre() + "  y está " + repartidor1.getEstado() + " con su pedido \n");
    	
    	System.out.println("Su pedido está " + pedidoCliente.getEstado());
    	
    	System.out.println("");
    	System.out.println("");
    	System.out.println("");
    	
    	pedidoCliente.entregarPedido();
    	System.out.println("Su pedido ha sido entregado con éxito! Disfrute de su comida! \n");
    	System.out.println("Estado del pedido: " + pedidoCliente.getEstado() + "\n");
    	System.out.println("Repartidor: " + repartidor1.getEstado());
    	
    	
    	
    	
    	
    }
}