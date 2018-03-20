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
public enum DiaSemana {
	LUNES ("Lunes"),
	MARTES ("Martes"),
	MIERCOLES ("Miércoles"),
	JUEVES ("Jueves"),
	VIERNES ("Viernes"),
	SABADO ("Sabado"),
	DOMINGO ("Domingo");
	
	private final String dia;
	
	private DiaSemana(String dia) {
		this.dia = dia;
	}
	
	public String getDia() {
		return dia;
	}
}
