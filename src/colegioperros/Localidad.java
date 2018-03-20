/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioperros;

/**
 *
 * @author YROMERO
 */
public enum Localidad {
	ENGATIVA ("Engativá"),
	FONTIBON ("Fontibón"),
	KENNEDY ("Kennedy"),
	SUMAPAZ ("Sumapaz"),
	BOSA ("Bosa");
	
	private final String localidad;
	
	private Localidad(String localidad) {
		this.localidad = localidad;
	}
	
	String getLocalidad() {
		return localidad;
	}
}
