package com.iniciantes.java.tutorial;

public class Pessoa {
	//Atributos
	private String nome; // nome da pessoa
	/* Numero maximo de Livros que 
	 * uma pessoa pode pedir emprestado
	 */
	private int maxLivros;
	
	//Contrutor
	public Pessoa(){
		nome = "Nome Desconhecido";
		maxLivros = 3;
	}
	
	// Métodos
	public String getNome(){
		return nome;
	}
	
	public void setNome(String outroNome) {
		nome = outroNome;
	}

	public int getMaxLivros() {
		return maxLivros;
	}

	public void setMaxLivros(int outroValor) {
		maxLivros = outroValor;
	}
}
