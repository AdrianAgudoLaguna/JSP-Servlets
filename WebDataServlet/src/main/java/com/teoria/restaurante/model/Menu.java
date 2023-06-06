package com.teoria.restaurante.model;

public class Menu {
	
	private String comida;
	private String bebida;
	private String postre;
	private float precio;
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(String comida, String bebida, String postre, float precio) {
		super();
		this.comida = comida;
		this.bebida = bebida;
		this.postre = postre;
		this.precio = precio;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public String getPostre() {
		return postre;
	}
	public void setPostre(String postre) {
		this.postre = postre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
