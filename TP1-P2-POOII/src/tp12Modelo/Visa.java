package tp12Modelo;

public class Visa extends Tarjeta {

	public Visa(String due�o, int numeroTarjeta) {
		super(due�o, numeroTarjeta);
		// TODO Auto-generated constructor stub
		this.descuento = 3;
	}

	public int calcularCosto(Pedido pedido) {
		int costobebida = pedido.costoBebidas();
		int descuentoBebidas = (int) (costobebida - (costobebida) * this.descuento / 100);
		return sumarPropina(descuentoBebidas + pedido.costoPlatos());
	}

}
