package SugerenciaPeliculas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SugerenciaPeliculas {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in); 
		int valorEntradaTeclado = -1; 
		boolean salir = false; 

		// Mientras no se pulse la opci�n de salir, ejecutar el programa
		while (!salir) 
		{
			// Mostrar el men� inicial
			System.out.println("\nElige el n�mero que quieras del 1 al 15.");
			System.out.println("Podr�s ver una recomendaci�n de una pel�cula que te sugiere un compa�ero/a");
			System.out.println("0: Salir");

			try 
			{
				// Obtenemos el valor introducido por el usuario
				System.out.print("\nN�mero: ");
				valorEntradaTeclado = entradaTeclado.nextInt();
				
				// Vamos a la opci�n elegida por el usuario
				switch (valorEntradaTeclado) 
				{
					//Alumno 1: Kevin
					case 1:
						NoHayAlumno();
						break;
					
					//Alumna 2: Luc�a
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
					
					//Alumna 12: Luc�a
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
						
					// Opci�n 0: Salir del programa.	
					case 0:
						// Indicamos al usuario que va a salir del programa
						System.out.println("Has seleccionado la opcion Salir");
						System.out.println("�Adios! :) ");
						
						// Asignamos el valor true a la variable "salir" para no volver a entrar en el bucle que muestra en men�
						salir = true;
						
						// Se cierra la entrada por teclado y se finaliza el programa
						entradaTeclado.close();
						System.exit(0);
						break;
					
					// Si se ha elegido una opci�n distinta, se recuerda al usuario las opciones disonibles
					default:
						System.out.println("Introduce un n�mero del 1 al 15 para ver el mensaje del alumno/a o el 0 para salir.");
				}
				
			} catch (InputMismatchException e) 
			{
				System.out.println("Valor incorrecto. Debes insertar un n�mero\n");
				entradaTeclado.next();
			}
		}
	}
	
	
	/**
	 * Este m�todo se encarga de mostrar un mensaje indicando que la opci�n no tiene asignada ning�n alumno/a
	 * @return void
	*/
	public static void NoHayAlumno()
	{
		System.out.println("Esta opci�n no tiene asignada nung�n alumno/a todav�a");
	}
}