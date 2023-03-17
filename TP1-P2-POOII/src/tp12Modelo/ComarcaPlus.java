package tp12Modelo;

public class ComarcaPlus extends Tarjeta {

	public ComarcaPlus(String dueño, int numeroTarjeta) {
		super(dueño, numeroTarjeta);
		// TODO Auto-generated constructor stub
		this.descuento = 2;
	}

	public int calcularCosto(Pedido pedido) {
		int costoFinal = pedido.calcularCosto();
		costoFinal = (int) (costoFinal - (costoFinal * this.descuento / 100));
		return sumarPropina(costoFinal);
	}
}
