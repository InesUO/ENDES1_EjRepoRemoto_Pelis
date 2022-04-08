package SugerenciaPeliculas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SugerenciaPeliculas {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in); 
		int valorEntradaTeclado = -1; 
		boolean salir = false; 

		// Mientras no se pulse la opción de salir, ejecutar el programa
		while (!salir) 
		{
			// Mostrar el menú inicial
			System.out.println("\nElige el número que quieras del 1 al 15.");
			System.out.println("Podrás ver una recomendación de una película que te sugiere un compañero/a");
			System.out.println("0: Salir");

			try 
			{
				// Obtenemos el valor introducido por el usuario
				System.out.print("\nNúmero: ");
				valorEntradaTeclado = entradaTeclado.nextInt();
				
				// Vamos a la opción elegida por el usuario
				switch (valorEntradaTeclado) 
				{
					//Alumno 1: Kevin
					case 1:
						NoHayAlumno();
						break;
					
					//Alumna 2: Lucía
					case 2:
						NoHayAlumno();
						break;
						
					//Alumno 3: Denzel
					case 3:
						NoHayAlumno();
						break;
					
					//Alumno 4: Daniel 
					case 4:
						NoHayAlumno();
						break;
					
					//Alumno 5: Pablo
					case 5:
						NoHayAlumno();
						break;

					//Alumna 6: Yara
					case 6:
						NoHayAlumno();
						break;
					
					//Alumno 7: Alex
					case 7:
						NoHayAlumno();
						break;
					
					//Alumno 8: Iker
					case 8:
						NoHayAlumno();
						break;
					
					//Alumno 9: Andrei
					case 9:
						NoHayAlumno();
						break;
					
					//Alumna 10: Paula
					case 10:
						NoHayAlumno();
						break;
					
					//Alumna 11: Raul
					case 11:
						NoHayAlumno();
						break;
					
					//Alumna 12: Lucía
					case 12:
						NoHayAlumno();
						break;
					
					//Alumno 13: Alexander -- Falta su usuario de GitHub
					case 13:
						NoHayAlumno();
						break;
					
					//Carmen
					case 14:
						NoHayAlumno();
						break;
					
					//Ines	
					case 15:
						NoHayAlumno();
						break;
						
					// Opción 0: Salir del programa.	
					case 0:
						// Indicamos al usuario que va a salir del programa
						System.out.println("Has seleccionado la opcion Salir");
						System.out.println("¡Adios! :) ");
						
						// Asignamos el valor true a la variable "salir" para no volver a entrar en el bucle que muestra en menú
						salir = true;
						
						// Se cierra la entrada por teclado y se finaliza el programa
						entradaTeclado.close();
						System.exit(0);
						break;
					
					// Si se ha elegido una opción distinta, se recuerda al usuario las opciones disonibles
					default:
						System.out.println("Introduce un número del 1 al 15 para ver el mensaje del alumno/a o el 0 para salir.");
				}
				
			} catch (InputMismatchException e) 
			{
				System.out.println("Valor incorrecto. Debes insertar un número\n");
				entradaTeclado.next();
			}
		}
	}
	
	
	/**
	 * Este método se encarga de mostrar un mensaje indicando que la opción no tiene asignada ningún alumno/a
	 * @return void
	*/
	public static void NoHayAlumno()
	{
		System.out.println("Esta opción no tiene asignada nungún alumno/a todavía");
	}
}