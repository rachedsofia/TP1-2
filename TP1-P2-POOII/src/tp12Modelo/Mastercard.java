package tp12Modelo;

public class Mastercard extends Tarjeta {

	public Mastercard(String dueño, int numeroTarjeta) {
		super(dueño, numeroTarjeta);
		// TODO Auto-generated constructor stub
		this.descuento = 2;
	}

	public int calcularCosto(Pedido pedido) {
		int costoPlatos = pedido.costoPlatos();
		int descuentoPlatos = (int) (costoPlatos - (costoPlatos) * this.descuento / 100);
		return sumarPropina(descuentoPlatos + pedido.costoBebidas());
	}

}
