/**
 * 
 */
package com.accenture.ereservation.vista.resources.vo;

import java.util.Date;

import lombok.Data;

/**
 * @author m.mata.jara
 *
 */
@Data
public class ReservaVO {
	private String codigoRes;
	private Date fechaIngresoRes;
	private Date fechaSalidaRes;
	private int cantidadPersonasRes;
	private String descripcionRes;
	private ClienteVO cliente;
}