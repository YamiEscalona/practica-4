package com.generation;

import java.util.Scanner; //Scanner no estaba importado

public class Codigo4 {
	// No tenia la linea de main
	public static void main(String[] args) {

	Scanner s = new Scanner(System.in); //Se agrego el System.in

	System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	String j1 = s.nextLine();

	//Se le cambio el 1 por el 2
	System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	Scanner s2 = new Scanner(System.in);//Se agrego el System.in
	String j2 = s.nextLine();

	//Habia un ) demas, y se le quito
	if(j1==j2) {
		System.out.println("Empate");
	} else {
		int g = 2;
		switch(j1) {
		case "piedra":
			if (j2 == "tijeras") {
				g = 1;
				}
			break; // Faltaba break
        case "papel":
        	if (j2 == "piedra") {
        		g = 1;
        	} // Faltaba un }
        	break; // Faltaba break
        case "tijera":
          if (j2.equals("papel")) {
        	  g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
      }
	}
	} // Faltaba un }