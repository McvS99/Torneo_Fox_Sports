package com.torneo.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

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
		
		Jugador kepa = new Jugador("Kepa", "Portero");
		Jugador willy = new Jugador("Willy Caballero", "Portero");
		Jugador marcos = new Jugador("Marcos Alonso", "Lateral Izquierdo");
		Jugador emerson = new Jugador("Emerson", "Lateral Izquierdo");
		Jugador luiz = new Jugador("David Luiz", "Defensa");
		Jugador ethan = new Jugador("Ethan Ampadu", "Defensa");
		Jugador cahill = new Jugador("Gary Cahill", "Defensa");
		Jugador antonio = new Jugador("Antonio Rüdiger", "Defensa");
		Jugador azpi = new Jugador("César Azpilicueta", "Lateral Derecho");
		Jugador zappa = new Jugador("Davide Zappacosta", "Lateral Derecho");
		Jugador kante = new Jugador("N'Golo Kante", "Medio Centro");
		Jugador danny = new Jugador("Danny Drinkwater", "Medio Centro");
		Jugador ross = new Jugador("Ross Barkley", "Medio Centro");
		Jugador callum = new Jugador("Callum Hudson-Odoi", "Delantero");
		Jugador hazard = new Jugador("Eden Hazard", "Delantero");
		Jugador william = new Jugador("William Borges", "Delantero");
		
		ArrayList<Jugador> jugadores1 = new ArrayList<Jugador>(Arrays.asList(kepa,willy,marcos,emerson,luiz,ethan,cahill,antonio,azpi,zappa,kante,danny,ross,callum,hazard,william));
		Equipo chelsea = new Equipo("Chelsea FC", jugadores1);
		
		
		Jugador ederson = new Jugador("Ederson", "Portero");
		Jugador bravo = new Jugador("Claudio Bravo", "Portero");
		Jugador zinchebko = new Jugador("Oleksandr Zinchenko", "Lateral Izquierdo");
		Jugador mendy = new Jugador("Benjamin Mendy", "Lateral Izquierdo");
		Jugador otamendi = new Jugador("Nicolás Otamendi", "Defensa");
		Jugador laporte = new Jugador("Aymeric Laporte", "Defensa");
		Jugador mangala = new Jugador("Eliaquim Mangala", "Defensa");
		Jugador kompany = new Jugador("Vicet Kompany", "Defensa");
		Jugador walker = new Jugador("Kyle Walker", "Lateral Derecho");
		Jugador danilo = new Jugador("Danilo", "Lateral Derecho");
		Jugador kevin = new Jugador("Kevin De Bruyne", "Medio Centro");
		Jugador foden = new Jugador("Phil Foden", "Medio Centro");
		Jugador silva = new Jugador("David Silva", "Medio Centro");
		Jugador jesus = new Jugador("Gabriel Jesus", "Delantero");
		Jugador kun = new Jugador("Sergio Agüero", "Delantero");
		Jugador sterling = new Jugador("Raheem Sterling", "Delantero");
		
		ArrayList<Jugador> jugadores2 = new ArrayList<Jugador>(Arrays.asList(ederson,bravo,zinchebko,mendy,otamendi,laporte,mangala,kompany,walker,danilo,kevin,foden,silva,jesus,kun,sterling));
		Equipo mc = new Equipo("Manchester City FC", jugadores2);
		
		Jugador alisson = new Jugador("Alisson", "Portero");
		Jugador mignolet = new Jugador("Simon Mignolet", "Portero");
		Jugador moreno = new Jugador("Alberto moreno", "Lateral Izquierdo");
		Jugador robertson = new Jugador("Andrew Robertson", "Lateral Izquierdo");
		Jugador gomez = new Jugador("Joe gomez", "Defensa");
		Jugador van = new Jugador("Virgil Van Dijk", "Defensa");
		Jugador lovren = new Jugador("Dejan Lovren", "Defensa"); 
		Jugador joel = new Jugador("Joel Matip", "Defensa");
		Jugador connor = new Jugador("Connor Randall", "Lateral Derecho");
		Jugador fabinho = new Jugador("Fabinho", "Lateral Derecho");
		Jugador milner = new Jugador("James Milner", "Medio Centro");
		Jugador henderson = new Jugador("Jordan Henderson", "Medio Centro");
		Jugador lallana = new Jugador("Adam lallana", "Medio Centro");
		Jugador firmino = new Jugador("Roberto Firmino", "Delantero");
		Jugador salah = new Jugador("Mohamed Salah", "Delantero");
		Jugador origi = new Jugador("Divock Origi", "Delantero");
		
		ArrayList<Jugador> jugadores3 = new ArrayList<Jugador>(Arrays.asList(alisson,mignolet,moreno,robertson,gomez,van,lovren,joel,connor,fabinho,milner,henderson,lallana,firmino,salah,origi));
		Equipo liverpool = new Equipo("FC Liverpool", jugadores3);
		
		Jugador gea = new Jugador("David de Gea", "Portero");
		Jugador romero = new Jugador("Sergio Romero", "Portero");
		Jugador shaw = new Jugador("Luke Shaw", "Lateral Izquierdo");
		Jugador young = new Jugador("Ashley Young", "Lateral Izquierdo");
		Jugador rojo = new Jugador("Marcos Rojo", "Defensa");
		Jugador lindelöf = new Jugador("Victor Lindelöf", "Defensa");
		Jugador smalling = new Jugador("Chris Smalling", "Defensa");
		Jugador jones = new Jugador("Phil Jones", "Defensa");
		Jugador dalot = new Jugador("Diogo Dalot", "Lateral Derecho");
		Jugador darmian = new Jugador("Matteo Darmian", "Lateral Derecho");
		Jugador fred = new Jugador("Fred", "Medio Centro");
		Jugador pogba = new Jugador("Paul Pogba", "Medio Centro");
		Jugador mata = new Jugador("Juan Mata", "Medio Centro");
		Jugador lingard = new Jugador("Jesse Lingard", "Delantero");
		Jugador lukaku = new Jugador("Romelu Lukaku", "Delantero");
		Jugador rashford = new Jugador("Marcus Rashford", "Delantero");
		
		ArrayList<Jugador> jugadores4 = new ArrayList<Jugador>(Arrays.asList(gea,romero,shaw,young,rojo,lindelöf,smalling,jones,dalot,darmian,fred,pogba,mata,lingard,lukaku,rashford));
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
		
		for (int i = 0; i < 4 ; i++) {
			
			for (int j = 0; j < torne1.getEquipos().size(); j++) {
				
				System.out.println(torne1.getEquipos().get(i).getNombre() +" " + torne1.getEquipos().size() + " jugadores" + "\n");
				System.out.println("Arqueros: " + torne1.getEquipos().get(j).verJugadoresPorPosicion("Portero"));
				System.out.println("Laterales Izquierdos: " + torne1.getEquipos().get(j).verJugadoresPorPosicion("Lateral Izquierdo"));
				System.out.println("Defensas: " + torne1.getEquipos().get(j).verJugadoresPorPosicion("Defensa"));
				System.out.println("Laterales Derechos" + torne1.getEquipos().get(j).verJugadoresPorPosicion("Lateral Derecho"));
				System.out.println("Centro Campistas: " + torne1.getEquipos().get(j).verJugadoresPorPosicion("Medio Centro"));
				System.out.println("Delanteros: " + torne1.getEquipos().get(j).verJugadoresPorPosicion("Delantero"));

				System.out.println("\n");
				i++;	
			}	
		}
		
		ArrayList<String> resultados = torne1.verResultado();
		for (int i = 0; i < 8; i++) {
			System.out.println("Equipo " + resultados.get(i) + " Puntos: " + resultados.get(i + 1));
			i++;
		}
		System.out.println("\n");
		System.out.println("Ganador: " + resultados.get(8) + "\n");
	}
}
