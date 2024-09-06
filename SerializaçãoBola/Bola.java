package com.menezes.poa.serializacaobolas;

import java.io.Serializable;

public class Bola implements Serializable{
	
	private String cor;
	private String tamanho;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String toString() {
		return "Cor: " + cor + "\nTamanho(cm): " + tamanho;
	}
}
