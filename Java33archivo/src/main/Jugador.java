package main;

import java.io.Serializable;

public class Jugador implements Serializable{
	private String nombre;
	private int puntos;

	public Jugador() {
	}

	public Jugador(String nombre, int puntos) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntos=" + puntos + "]";
	}

}
