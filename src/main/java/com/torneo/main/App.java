package com.torneo.main;

import java.util.ArrayList;
import java.util.Arrays;

import com.torneo.dominio.Equipo;
import com.torneo.dominio.Fecha;
import com.torneo.dominio.Jugador;
import com.torneo.dominio.Partido;
import com.torneo.dominio.Torneo;

public class App {

	public static void main(String[] args) {
		Torneo torne1 = new Torneo("Premier league");
		Fecha fechanro1 = new Fecha();
		Fecha fechanro2 = new Fecha();
		Fecha fechanro3 = new Fecha();
		
	//creacion jugadores
		Jugador kepa = new Jugador("Kepa", "Portero");
		Jugador marcos = new Jugador("Marcos Alonso", "Lateral Izquierdo");
		Jugador luiz = new Jugador("David Luiz", "Defensa");
		Jugador antonio = new Jugador("Antonio Rüdiger", "Defensa");
		Jugador azpi = new Jugador("César Azpilicueta", "Lateral Derecho");
		Jugador kante = new Jugador("N'Golo Kante", "Medio Centro");
		Jugador hazard = new Jugador("Eden Hazard", "Delantero");
		
		ArrayList<Jugador> jugadores1 = new ArrayList<Jugador>(Arrays.asList(kepa, marcos, luiz, antonio, azpi, kante, hazard));
		Equipo chelsea = new Equipo("Chelsea FC", jugadores1);
		
		
		Jugador ederson = new Jugador("Ederson", "Portero");
		Jugador zinchebko = new Jugador("Oleksandr Zinchenko", "Lateral Izquierdo");
		Jugador otamendi = new Jugador("Nicolás Otamendi", "Defensa");
		Jugador kompany = new Jugador("Vicet Kompany", "Defensa");
		Jugador walker = new Jugador("Kyle Walker", "Lateral Derecho");
		Jugador kevin = new Jugador("Kevin De Bruyne", "Medio Centro");
		Jugador kun = new Jugador("Sergio Agüero", "Delantero");
		
		ArrayList<Jugador> jugadores2 = new ArrayList<Jugador>(Arrays.asList(ederson,zinchebko,otamendi,kompany,walker,kevin,kun));
		Equipo mc = new Equipo("Manchester City FC", jugadores2);
		
		Jugador alisson = new Jugador("Alisson", "Portero");
		Jugador moreno = new Jugador("Alberto moreno", "Lateral Izquierdo");
		Jugador gomez = new Jugador("Joe gomez", "Defensa");
		Jugador joel = new Jugador("Joel Matip", "Defensa");
		Jugador connor = new Jugador("Connor Randall", "Lateral Derecho");
		Jugador milner = new Jugador("James Milner", "Medio Centro");
		Jugador salah = new Jugador("Mohamed Salah", "Delantero");
		
		ArrayList<Jugador> jugadores3 = new ArrayList<Jugador>(Arrays.asList(alisson,moreno,gomez,joel,connor,milner,salah));
		Equipo liverpool = new Equipo("FC Liverpool", jugadores3);
		
		Jugador gea = new Jugador("David de Gea", "Portero");
		Jugador shaw = new Jugador("Luke Shaw", "Lateral Izquierdo");
		Jugador rojo = new Jugador("Marcos Rojo", "Defensa");
		Jugador jones = new Jugador("Phil Jones", "Defensa");
		Jugador dalot = new Jugador("Diogo Dalot", "Lateral Derecho");
		Jugador pogba = new Jugador("Paul Pogba", "Medio Centro");
		Jugador lukaku = new Jugador("Romelu Lukaku", "Delantero");
		
		ArrayList<Jugador> jugadores4 = new ArrayList<Jugador>(Arrays.asList(gea,shaw,rojo,jones,dalot,pogba,lukaku));
		Equipo mu = new Equipo("Manchester United FC", jugadores4);
		
		ArrayList<Equipo> equipos = new ArrayList<Equipo>(Arrays.asList(chelsea,mc,liverpool,mu));
		torne1.setEquipos(equipos);
		
		Partido partido1 = new Partido(chelsea, mc);
		Partido partido2 = new Partido(liverpool, mu);
		Partido partido3 = new Partido(chelsea, liverpool);
		Partido partido4 = new Partido(mc, mu);
		Partido partido5 = new Partido(chelsea, mu);
		Partido partido6 = new Partido(mc, liverpool);
		
		ArrayList<Partido> partidosFecha1 = new ArrayList<Partido>(Arrays.asList(partido1,partido2));
		ArrayList<Partido> partidosFecha2 = new ArrayList<Partido>(Arrays.asList(partido3,partido4));
		ArrayList<Partido> partidosFecha3 = new ArrayList<Partido>(Arrays.asList(partido5,partido6));
		
		fechanro1.setPartidos(partidosFecha1);
		fechanro2.setPartidos(partidosFecha2);
		fechanro3.setPartidos(partidosFecha3);
		
		ArrayList<Fecha> fechas = new ArrayList<Fecha>(Arrays.asList(fechanro1,fechanro2,fechanro3));
		
		torne1.setFechas(fechas);
		
		torne1.comenzarTorneo();
		
		System.out.println("Equipos del torneo: ");
		for (int i = 0; i < 4; i++) {
			System.out.println(torne1.getEquipos().get(i).getNombre());
		}
		System.out.println("\nGanadores de cada fecha:");
		for (int i = 0; i < 3; i++) {
			System.out.println("Fecha #" + (i + 1));
			for (int j = 0; j < 2; j++) {
				if (torne1.getFechas().get(i).getPartidos().get(j).getGanador() == null) {
					System.out.println("Hubo un empate entre: "
							+ torne1.getFechas().get(i).getPartidos().get(j).getEquipoLocal().getNombre() + " y "
							+ torne1.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().getNombre());
				} else {
					System.out.println(
							"Ganador: " + torne1.getFechas().get(i).getPartidos().get(j).getGanador().getNombre()
									+ " ,Perdedor: "
									+ torne1.getFechas().get(i).getPartidos().get(j).getPerdedor().getNombre());
				}

			}
			System.out.println("\n");
		}
			
		System.out.println("Jugadores en la posicion lateral: "
				+ torne1.getEquipos().get(1).verJugadoresPorPosicion("Lateral Izquierdo"));
		System.out.println("Jugadores en la posicion Medio Campo: "
				+ torne1.getEquipos().get(1).verJugadoresPorPosicion("Medio Centro"));

		System.out.println("\n");
		ArrayList<String> resultados = torne1.verResultado();
		for (int i = 0; i < 8; i++) {
			System.out.println("Equipo: " + resultados.get(i) + " ,Puntos: " + resultados.get(i + 1));
			i++;
		}
		System.out.println("Ganador: " + resultados.get(8) + "\n");

		
	}

}
