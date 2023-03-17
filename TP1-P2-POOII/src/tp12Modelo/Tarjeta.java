package tp12Modelo;

public class Tarjeta {
	protected String dueñoTarjeta;
	protected int numeroTarjeta;
	protected int descuento;

	public Tarjeta(String dueño, int numeroTarjeta) {
		this.dueñoTarjeta = dueño;
		this.numeroTarjeta = numeroTarjeta;
		this.descuento = 0;
	}

	public int calcularCosto(Pedido pedido) {
		int costoPlatos = pedido.costoPlatos();
		int descuentoPlatos = (int) (costoPlatos - (costoPlatos) * this.descuento / 100);
		return sumarPropina(descuentoPlatos + pedido.costoBebidas());
	}

	public int sumarPropina(int unCosto) {
		if (unCosto < 1000) {
			return (int) (unCosto + (unCosto * 5 / 100));
		} else {
			if (unCosto < 2000) {
				return (int) (unCosto + (unCosto * 3 / 100));
			} else {
				return (int) (unCosto + (unCosto * 2 / 100));
			}
		}
	}
}
