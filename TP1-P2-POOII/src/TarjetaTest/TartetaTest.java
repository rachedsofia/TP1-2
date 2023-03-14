package TarjetaTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelo.BebidaRecord;
import modelo.ComarcaPlus;
import modelo.Mastercard;
import modelo.PlatoRecord;
import modelo.Tarjeta;
import modelo.Visa;

public class TartetaTest {
	@Test
	public void calcularCostoTarjetaVisa() {
		// inicialización
		Visa tarjetaVisa = new Visa("Jorge Rached", 03);

		BebidaRecord bebida1 = new BebidaRecord("Agua", 100);
		BebidaRecord bebida2 = new BebidaRecord("Coca Cola", 120);

		PlatoRecord plato = new PlatoRecord("Merluza al verdeo", 1000);

		ArrayList<BebidaRecord> listaBebidas = new ArrayList<>();
		ArrayList<PlatoRecord> listaPlatos = new ArrayList<>();

		// ejercitacion

		listaBebidas.add(bebida1);
		listaBebidas.add(bebida2);

		listaPlatos.add(plato);

		int resultadoEsperado = 1250;

		// verificación
		assertEquals(resultadoEsperado, tarjetaVisa.calcularCosto(listaBebidas, listaPlatos));
	}

	@Test
	public void calcularCostoTarjetaMastercard() {
		// inicializacion
		Mastercard tarjetaMastercard = new Mastercard("Sofia Rached", 01);

		BebidaRecord bebida1 = new BebidaRecord("Fanta", 110);
		BebidaRecord bebida2 = new BebidaRecord("Sprite", 110);

		PlatoRecord plato = new PlatoRecord("Asado para 2", 700);

		ArrayList<BebidaRecord> listaBebidas = new ArrayList<>();
		ArrayList<PlatoRecord> listaPlatos = new ArrayList<>();

		// Ejercitacion
		listaBebidas.add(bebida1);
		listaBebidas.add(bebida2);

		listaPlatos.add(plato);

		int resultadoEsperado = 961;
		// validacion
		assertEquals(resultadoEsperado, tarjetaMastercard.calcularCosto(listaBebidas, listaPlatos));
	}

	@Test
	public void calcularCostoTarjetaComarcaPlus() {
		// inicializacion
		ComarcaPlus tarjetaComarca = new ComarcaPlus("Luciana Rached", 02);

		BebidaRecord bebida = new BebidaRecord("Fanta", 110);

		PlatoRecord plato = new PlatoRecord("Fideos a la bolognesa", 800);

		ArrayList<BebidaRecord> listaBebidas = new ArrayList<>();
		ArrayList<PlatoRecord> listaPlatos = new ArrayList<>();

		// ejercitacion
		listaBebidas.add(bebida);

		listaPlatos.add(plato);

		int resultadoEsperado = 936;

		// verificacion
		assertEquals(resultadoEsperado, tarjetaComarca.calcularCosto(listaBebidas, listaPlatos));
	}

	@Test
	public void calcularCostoTarjetaViedma() {
		// inicializacion
		Tarjeta tarjetaViedma = new Tarjeta("Pepito Lopez", 04);

		BebidaRecord bebida = new BebidaRecord("Coca Cola", 120);

		PlatoRecord plato = new PlatoRecord("Milanesa con papas fritas", 590);

		ArrayList<BebidaRecord> listaBebidas = new ArrayList<>();
		ArrayList<PlatoRecord> listaPlatos = new ArrayList<>();
		// ejercitacion
		listaBebidas.add(bebida);

		listaPlatos.add(plato);

		int resultadoEsperado = 745;
		// validacion
		assertEquals(resultadoEsperado, tarjetaViedma.calcularCosto(listaBebidas, listaPlatos));
	}
}
