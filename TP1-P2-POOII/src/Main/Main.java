package Main;

import java.util.ArrayList;

import modelo.BebidaRecord;
import modelo.ComarcaPlus;
import modelo.Mastercard;
import modelo.PlatoRecord;
import modelo.Tarjeta;
import modelo.Visa;

public class Main {
	public static void main(String[] args) {
		PlatoRecord plato1 = new PlatoRecord("Merluza al verdeo", 1000);
		PlatoRecord plato2 = new PlatoRecord("Asado para 2", 700);
		PlatoRecord plato3 = new PlatoRecord("Milanesa con papas fritas", 590);
		PlatoRecord plato4 = new PlatoRecord("Fideos con bolognesa", 800);

		BebidaRecord bebida1 = new BebidaRecord("Agua", 100);
		BebidaRecord bebida2 = new BebidaRecord("Coca Cola", 120);
		BebidaRecord bebida3 = new BebidaRecord("Fanta", 110);
		BebidaRecord bebida4 = new BebidaRecord("Sprite", 110);

		ArrayList<BebidaRecord> listBebidas = new ArrayList<BebidaRecord>();
		ArrayList<PlatoRecord> listPlatos = new ArrayList<PlatoRecord>();

		listPlatos.add(plato1);
		listPlatos.add(plato2);
		listPlatos.add(plato3);
		listPlatos.add(plato4);

		listBebidas.add(bebida1);
		listBebidas.add(bebida2);
		listBebidas.add(bebida3);
		listBebidas.add(bebida4);

		Mastercard tarjetaMastercard = new Mastercard("Sofia Rached", 01);
		ComarcaPlus tarjetaComarca = new ComarcaPlus("Luciana Rached", 02);
		Visa tarjetaVisa = new Visa("Jorge Rached", 03);
		Tarjeta tarjetaViedma = new Tarjeta("Pepito Lopez", 04);

		System.out.println(tarjetaVisa.calcularCosto(listBebidas, listPlatos));
		System.out.println(tarjetaMastercard.calcularCosto(listBebidas, listPlatos));
		System.out.println(tarjetaComarca.calcularCosto(listBebidas, listPlatos));
		System.out.println(tarjetaViedma.calcularCosto(listBebidas, listPlatos));

	}
}
