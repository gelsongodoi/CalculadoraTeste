package com.sisnema.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestaCalculadora {

	Calculadora c = new Calculadora();

	@Test
	public void testOk() {
		assertEquals(7, c.soma(3, 4));
	}

	@Test
	public void testFail() {
		assertEquals(8, c.soma(3, 4));
	}

}
