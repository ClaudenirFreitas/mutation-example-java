/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.freitas.mutation.example.java;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author freitas
 */
public class PairTest {

	@Test
	public void testValidate0() {
		boolean validate = new Pair().validate(10);
		Assert.assertTrue(validate);
	}

	@Test
	public void testValidate1() {
		boolean validate = new Pair().validate(10);
		Assert.assertTrue(validate);
	}

	@Test
	public void testValidate2() {
		boolean validate = new Pair().validate(9);
		Assert.assertFalse(validate);
	}

}
