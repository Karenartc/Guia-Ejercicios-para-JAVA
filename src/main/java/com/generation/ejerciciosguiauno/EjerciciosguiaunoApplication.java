package com.generation.ejerciciosguiauno;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.util.ArrayList;

@SpringBootApplication
public class EjerciciosguiaunoApplication {

	public static void ejercicio1(Scanner teclado){
		System.out.println("\n------------------- EJERCICIO 1 -------------------");
		//solicite a un usuario dos números por teclado y calcule su suma, resta, producto y división.

		//Variables que controlan los ciclos y pueden ser pedidas por el usuario, se declaran como globales
		int numero1;
		int numero2;
		int opcion = 1;
		//Ingreso de los numeros para las operaciones
		System.out.println("\nSe acepta solo numeros enteros");
		System.out.print("Ingrese el primer número: ");
		numero1 = teclado.nextInt();
		System.out.print("Ingrese el segundo número: "); 
		numero2 = teclado.nextInt();
		//ciclo que controla cuando se escriba 0 salir
		while (opcion != 0){
			System.out.println("\n0. Volver al Menu");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			//Valida que se ingrese la opcion dentro del rango
			do{
				System.out.print("\nIngrese una opcion: ");
				opcion = teclado.nextInt();
				if(opcion < 0 || opcion > 4){
				System.out.println("Ingrese un valor entre 0 y 4");
				}

			}while(opcion < 0 || opcion > 4);
			//Controla de mostrar que operación escogio ver el usuario
			if(opcion == 1){
				System.out.println("\nRESPUESTA:");
				System.out.println("La suma de " + numero1 + "+" + numero2 + " es: " + (numero1+numero2));
			}else if(opcion == 2){
				System.out.println("\nRESPUESTA:");
				System.out.println("La resta de " + numero1 + "-" + numero2 + " es: " + (numero1-numero2));
			}else if(opcion == 3){
				System.out.println("\nRESPUESTA:");
				System.out.println("La multiplicación de " + numero1 + "*" + numero2 + " es: " + (numero1*numero2));
			}else if(opcion == 4){
				System.out.println("\nRESPUESTA:");
				System.out.println("La división de " + numero1 + "/" + numero2 + " es: " + (numero1/numero2));
			}else{
				System.out.println("Gracias por probar el primer ejercicio");
				System.out.println("Volvera al Menu");
			}
		}
	}

	public static void ejercicio2(Scanner teclado){
		System.out.println("\n------------------- EJERCICIO 2 -------------------");
		//calcular el área de un rectángulo. ¿Cómo modificaría su  programa para que ahora
		//calcule el área de un cuadrado de igual medida al ancho del rectángulo anterior?
		//areaC = l^2 areaR=b*h
	
		//Variables que controlan los ciclos y pueden ser pedidas por el usuario, se declaran como globales
		int opcion = 1;
		//ciclo que controla cuando se escriba 0 salir
		while(opcion != 0){
			System.out.println("\n¿Desea saber el Área del Rectángulo o el Área del Cuadrado?");
			System.out.println("Volver al Menu: 0");
			System.out.println("Rectángulo: 1");
			System.out.println("Cuadrado: 2");
			//Valida que se ingrese la opcion dentro del rango
			do{
				System.out.print("\nIngrese una opcion: ");
				opcion = teclado.nextInt();
				if(opcion < 0 || opcion > 2){
					System.out.println("Ingrese un valor entre 0 y 2");
				}
			}while(opcion < 0 || opcion > 2);
			//Controla de mostrar que Area escogio ver el usuario
			if(opcion == 1){
				System.out.println("\nSe acepta solo numeros enteros");
				//Ingreso de datos
				System.out.println("\nIngreso la opción 1");
				System.out.print("Ingrese la Altura del Rectángulo: ");
				int altura = teclado.nextInt();
				System.out.print("Ingrese la Base del Rectángulo: ");
				int base = teclado.nextInt();
				//resultado
				System.out.println("\nRESPUESTA:");
				System.out.println("\nEl Área es: " + (base*altura));
			}else if(opcion == 2){
				//Ingreso de datos
				System.out.println("\nIngreso la opción 2");
				System.out.print("Ingrese el lado del Cuadrado: ");
				double lado = teclado.nextDouble();
				//Resultado
				System.out.println("\nRESPUESTA:");
				System.out.println("\nEl Área es: " + (Math.pow(lado, 2)));
			}else{
				System.out.println("\nIngreso la opción 0");
				System.out.println("Gracias por probar el primer ejercicio");
				System.out.println("Volvera al Menu");
			}
	    }
	}
	public static void ejercicio3(Scanner teclado){
		System.out.println("\n------------------- EJERCICIO 3 -------------------");
		//dada una cantidad de dinero en pesos chilenos ingresada por
		//teclado, calcule la cantidad de dólares que se pueden comprar.

		//Variables que controlan los ciclos y pueden ser pedidas por el usuario, se declaran como globales
		double pesos;
		double dolar;
		//controla que el valor ingresado sea mayor que 0.1
		do{
		System.out.print("\n¿Cuántos Pesos Chilenos desea convertir? ");
		pesos = teclado.nextDouble();
		}while(pesos < 0.1);
		//controla que el valor ingresado sea mayor que 0.1
		do{
			System.out.print("¿En qué valor está el Dolar? ");
			dolar= teclado.nextDouble();
		}while(dolar < 0.1); 

		System.out.println("\nCon " + pesos + " pesos chilenos puedes comprar " + (pesos/dolar) + " dolares");
	}	

	public static void ejercicio4(Scanner teclado){
		System.out.println("\n------------------- EJERCICIO 4 -------------------");
		//calcular la edad de una persona según su año de nacimiento.

		//Variables que controlan los ciclos y pueden ser pedidas por el usuario, se declaran como globales
		int anioNac;
		int anioAct;
		//controla que el valor ingresado sea mayor que 1
		do{
			System.out.print("\n¿Cuál es el Año Actual? ");
			anioAct = teclado.nextInt();
		}while(anioAct < 1);
		//controla que el valor ingresado sea mayor que 1
		do{
			System.out.print("¿Cuál es tu Año de Nacimiento? ");
			anioNac = teclado.nextInt();
		}while(anioNac < 1);

		System.out.println("\nEn el año " + anioAct + " tu edad es: " + (anioAct-anioNac));
	}

	public static void ejercicio5(Scanner teclado){
		System.out.println("\n------------------- EJERCICIO 5 -------------------\n");
		//solicite al usuario 4 notas y calcule su promedio.

		double nota;
		double sumaNotas = 0.0;
		//pedira 4 veces el ingreso de notas
		for(int i = 0; i < 4; i++){
			do{
				System.out.print("¿Cuál es la nota " + (i+1) + "? ");
				nota = teclado.nextDouble();
			}while(nota < 1.0 || nota > 7.0);
			//variable acumuladora que suma cada nota ingresada
			sumaNotas += nota;
		}

		System.out.println("\nEl promedio de las cuatro notas ingresadas es: " + (sumaNotas/4));
	}

	public static void ejercicio6(Scanner teclado){
		System.out.println("\n------------------- EJERCICIO 6 -------------------\n");
		//conocer el sueldo semanal de un trabajador en base a las
		//horas que trabaja y el valor por hora ($H/H) que recibe.	
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		//MENU
		int opcion = 1;

		while(opcion != 0){
			System.out.println("\n                 Bienvenido al Menu                 ");
			System.out.println("0. Salir del Aplicativo");
			System.out.println("1. Calcular Suma, Resta, Multiplicación y División");
			System.out.println("2. Calcular el Área del Rectángulo o del Cuadrado");
			System.out.println("3. Calcular cuantos Dolares puedo comprar");
			System.out.println("4. Calcular tu Edad");
			System.out.println("5. Calcular Promedio de 4 Notas");
			System.out.println("6. Calcular Promedio de 4 Notas");
			//Valida que se ingrese la opcion dentro del rango
			do{
				System.out.print("\nIngrese una de las opciones: ");
				opcion = teclado.nextInt();
				if(opcion < 0 || opcion > 6){
					System.out.println("Ingrese un valor entre 1 y 3");
				}

			}while(opcion < 0 || opcion > 6);
			//Controla de mostrar que ejercicio escogio ver el usuario
			if(opcion == 1){
				ejercicio1(teclado);
			}else if(opcion == 2){
				ejercicio2(teclado);
			}else if(opcion == 3){
				ejercicio3(teclado);
			}else if(opcion == 4){
				ejercicio4(teclado);
			}else if(opcion == 5){
				ejercicio5(teclado);
			}else{
				System.out.println("\nMuchas gracias por probar estos ejercicios :D");
			}
		}

	}

}