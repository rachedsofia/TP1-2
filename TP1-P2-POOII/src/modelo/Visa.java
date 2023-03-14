package modelo;

import java.util.ArrayList;

public class Visa extends Tarjeta {

	public Visa(String dueño, int numeroTarjeta) {
		super(dueño, numeroTarjeta);
		// TODO Auto-generated constructor stub
		this.descuento = 3;
	}

	public int calcularCosto(ArrayList<BebidaRecord> listaBebidas, ArrayList<PlatoRecord> listaPlatos) {
		int costoBebidas = 0;
		int costoPlatos = 0;

		for (PlatoRecord platoRecord : listaPlatos) {
			costoPlatos = costoPlatos + platoRecord.precio();
		}
		for (BebidaRecord bebidaRecord : listaBebidas) {
			costoBebidas = costoBebidas + bebidaRecord.precio();
		}

		costoBebidas = (int) (costoBebidas - (costoBebidas * this.descuento / 100));

		return sumarPropina(costoBebidas + costoPlatos);
	}

}
