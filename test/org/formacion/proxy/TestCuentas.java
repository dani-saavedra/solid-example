package org.formacion.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuentas {


	@Test
	public void test_cuenta_normal() {
		Cuenta cuentaNormal = new CuentaNormal("cliente");
		assertEquals("cliente", cuentaNormal.getCliente());
		assertEquals(0, cuentaNormal.getCantidad());

		cuentaNormal.movimiento(10);
		assertEquals(10, cuentaNormal.getCantidad());

		cuentaNormal.movimiento(-20);
		assertEquals(-10, cuentaNormal.getCantidad());
	}


	@Test
	public void test_cuenta_nueva() {
		Cuenta cuentaNormal = new CuentaNueva("cliente");
		assertEquals("cliente", cuentaNormal.getCliente());
		assertEquals(0, cuentaNormal.getCantidad());

		cuentaNormal.movimiento(10);
		assertEquals(10, cuentaNormal.getCantidad());

		// esta operacion no se debe llevar a cabo
		cuentaNormal.movimiento(-20);
		assertEquals(10, cuentaNormal.getCantidad());
	}

	
}
