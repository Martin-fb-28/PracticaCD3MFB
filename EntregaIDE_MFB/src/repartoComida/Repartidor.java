package repartoComida;

public class Repartidor extends Usuario{
	private String zonaReparto;
	private EstadoRepartidor estado;
	
	public String getZonaReparto() {
		return zonaReparto;
	}
	
	public EstadoRepartidor getEstado() {
		return estado;
	}
	
	public void setEstado(EstadoRepartidor estado) {
		this.estado = estado;
	}
	

	public Repartidor(String nombreRepartidor, String emailRepartidor, String telefonoRepartidor, String zonaReparto){
		super(nombreRepartidor, emailRepartidor, telefonoRepartidor);
		this.zonaReparto = zonaReparto;
		this.estado = EstadoRepartidor.DISPONIBLE;
	}
	
	

}
