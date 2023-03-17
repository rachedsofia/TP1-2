package tp12Modelo;

public class Mastercard extends Tarjeta {

	public Mastercard(String due�o, int numeroTarjeta) {
		super(due�o, numeroTarjeta);
		// TODO Auto-generated constructor stub
		this.descuento = 2;
	}

	public int calcularCosto(Pedido pedido) {
		int costoPlatos = pedido.costoPlatos();
		int descuentoPlatos = (int) (costoPlatos - (costoPlatos) * this.descuento / 100);
		return sumarPropina(descuentoPlatos + pedido.costoBebidas());
	}

}
