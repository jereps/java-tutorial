package com.iniciantes.java.tutorial;

import junit.framework.TestCase;

public class PessoaTest extends TestCase {

	public void testPessoa() {
		Pessoa p1 = new Pessoa();
		assertEquals("Nome Desconhecido", p1.getNome());
		assertEquals(3, p1.getMaxLivros());
	}

	public void testSetNome() {
		Pessoa p2 = new Pessoa();
		p2.setNome("Frederico");
		assertEquals("Frederico", p2.getNome());
	}

	public void testSetMaxLivros() {
		Pessoa p3 = new Pessoa();
		p3.setMaxLivros(10);
		assertEquals(10, p3.getMaxLivros());
	}

}
