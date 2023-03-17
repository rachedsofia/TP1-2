package TP12Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import tp12Modelo.Bebida;
import tp12Modelo.ComarcaPlus;
import tp12Modelo.Mastercard;
import tp12Modelo.Pedido;
import tp12Modelo.Plato;
import tp12Modelo.Tarjeta;
import tp12Modelo.Visa;

public class TartetaTest {
	@Test
	public void calcularCostoTarjetaVisa() {
		// inicialización
		Visa tarjetaVisa = new Visa("Jorge Rached", 03);

		Bebida bebida1 = new Bebida("Agua", 100);
		Bebida bebida2 = new Bebida("Coca Cola", 120);

		Plato plato = new Plato("Merluza al verdeo", 1000);
		ArrayList<Plato> listPlatos = new ArrayList<Plato>();
		ArrayList<Bebida> listBebida = new ArrayList<Bebida>();
		// ejercitacion

		listBebida.add(bebida1);
		listBebida.add(bebida2);
		listPlatos.add(plato);
		Pedido pedido1 = new Pedido(listPlatos, listBebida);

		int resultadoEsperado = 1150;

		// verificación
		assertEquals(resultadoEsperado, tarjetaVisa.calcularCosto(pedido1));
	}

	@Test
	public void calcularCostoTarjetaMastercard() {
		// inicializacion
		Mastercard tarjetaMastercard = new Mastercard("Sofia Rached", 01);

		Bebida bebida1 = new Bebida("Fanta", 110);
		Bebida bebida2 = new Bebida("Sprite", 110);

		Plato plato = new Plato("Asado para 2", 700);

		ArrayList<Bebida> listaBebidas = new ArrayList<>();
		ArrayList<Plato> listaPlatos = new ArrayList<>();

		// Ejercitacion
		listaBebidas.add(bebida1);
		listaBebidas.add(bebida2);

		listaPlatos.add(plato);
		Pedido pedido2 = new Pedido(listaPlatos, listaBebidas);

		int resultadoEsperado = 835;
		// validacion
		assertEquals(resultadoEsperado, tarjetaMastercard.calcularCosto(pedido2));
	}

	@Test
	public void calcularCostoTarjetaComarcaPlus() {
		// inicializacion
		ComarcaPlus tarjetaComarca = new ComarcaPlus("Luciana Rached", 02);

		Bebida bebida = new Bebida("Fanta", 110);

		Plato plato = new Plato("Fideos a la bolognesa", 800);

		ArrayList<Bebida> listaBebidas = new ArrayList<>();
		ArrayList<Plato> listaPlatos = new ArrayList<>();

		// ejercitacion
		listaBebidas.add(bebida);

		listaPlatos.add(plato);
		Pedido pedido3 = new Pedido(listaPlatos, listaBebidas);
		int resultadoEsperado = 936;

		// verificacion
		assertEquals(resultadoEsperado, tarjetaComarca.calcularCosto(pedido3));
	}

	@Test
	public void calcularCostoTarjetaViedma() {
		// inicializacion
		Tarjeta tarjetaViedma = new Tarjeta("Pepito Lopez", 04);

		Bebida bebida = new Bebida("Coca Cola", 120);

		Plato plato = new Plato("Milanesa con papas fritas", 590);

		ArrayList<Bebida> listaBebidas = new ArrayList<>();
		ArrayList<Plato> listaPlatos = new ArrayList<>();
		// ejercitacion
		listaBebidas.add(bebida);

		listaPlatos.add(plato);
		Pedido pedido4 = new Pedido(listaPlatos, listaBebidas);
		int resultadoEsperado = 745;
		// validacion
		assertEquals(resultadoEsperado, tarjetaViedma.calcularCosto(pedido4));
	}
}
