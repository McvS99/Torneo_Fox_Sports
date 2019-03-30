package com.torneo.dominio;

public class Partido {

	private Equipo ganador;
	private Equipo perdedor;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;

	public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
	}

	public void iniciarPartido() {
		int resultado = (int) Math.floor(Math.random() * 100);
		if (resultado <= 33) {
			equipoLocal.agregarPuntos((byte) 3);
			this.ganador = equipoLocal;
			this.perdedor = equipoVisitante;
		}
		if (resultado > 33 && resultado <= 67) {
			equipoLocal.agregarPuntos((byte) 1);
			equipoVisitante.agregarPuntos((byte) 1);
			this.ganador = null;
		}
		if (resultado > 67 && resultado <= 100){
			equipoVisitante.agregarPuntos((byte) 3);
			this.ganador = equipoVisitante;
			this.perdedor = equipoLocal;
		}
	}

	public Equipo getGanador() {
		return ganador;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public Equipo getPerdedor() {
		return perdedor;
	}
}
