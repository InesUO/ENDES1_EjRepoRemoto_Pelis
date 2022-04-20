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
			System.out.println("\nElige el n�mero que quieras del 1 al 16.");
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
						KevinPeli();
						break;
					
					//Alumna 2: Luc�a
					case 2:
						LuciaPeli();
						break;
						
					//Alumno 3: Denzel
					case 3:
						DenzelPeli();
						break;
					
					//Alumno 4: Daniel 
					case 4:
						NoHayAlumno();
						break;
					
					//Alumno 5: Pablo
					case 5:
						PabloPeli();
						break;

					//Alumna 6: Yara
					case 6:
						YaraPeli();
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
						PaulaPeli();
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
						CarmenPeli();
						break;
					
					//Ines	
					case 15:
						InesPeli();
						break;
					
					//Priego
					case 16:
						PriegoPeli();
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
						System.out.println("Introduce un n�mero del 1 al 16 para ver el mensaje del alumno/a o el 0 para salir.");
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
	
	/**
	 * Este m�todo se encarga de mostrar la pel�cula recomendada por Carmen
	 * @return void
	*/
	public static void CarmenPeli()
	{
		System.out.println("Os recomiendo la pel�cula Scream - Soy Carmen");
	}
	
	/**
	 * Este m�todo se encarga de mostrar la pel�cula recomendada por In�s
	 * @return void
	*/
	public static void InesPeli()
	{
		System.out.println("Os recomiendo la pel�cula de 'El guerrero N� 13' - In�s");
	}
	
	/**
	 * Este m�todo se encarga de mostrar un mensaje indicando que la opci�n no tiene asignada ning�n alumno/a
	 * @return void
	*/
	public static void PriegoPeli()
	{
		System.out.println("Hola A todos/as. Yo os recomiendo la peli _ El guerrero de ENDES");
	}
	
	/**
	 * Este m�todo se encarga de mostrar la pel�cula recomendada por Paula
	 * @return void
	*/
	public static void PaulaPeli()
	{
		System.out.println("Una de las pel�culas que m�s me ha gustado y mejor recuerdo es 'Marte', espero que os guste. - Paula");
	}
	
	public static void LuciaPeli()
	{
		System.out.println("Sin duda os recomiendo 'Interstellar', una de mis peliculas favoritas - Luc�a");
	}
	
	/**
	 * Este m�todo se encarga de mostrar la pel�cula recomendada por Yara
	 * @return void
	*/
	public static void YaraPeli()
	{
		System.out.println("Una de las m�s recientes que he visto y que m�s me ha gustado es 'Dune', os la recomiendo ver. - Yara");
	}
	/**
	 * Este m�todo se encarga de mostrar la pel�cula recomendada por Pablo
	 * @return void
	*/
	public static void PabloPeli()
	{
		System.out.println("Siempre que se habla de recomendar pel�culas la primera que se me viene a la mente es 'Avatar'. - Pablo");
	}
	/**
	 * Este m�todo se encarga de mostrar la pel�cula recomendada por Kevin
	 * @return void
	*/
	public static void KevinPeli()
	{
		System.out.println("Una de las pel�culas que m�s me ha gustado y mejor recuerdo es 'Fast and furious', espero que os guste. - Kevin");
	}
	
	/**
	 * Este m�todo se encarga de mostrar un mensaje indicando que la opci�n no tiene asignada ning�n alumno/a
	 * @return void
	*/
	
	public static void DenzelPeli()
	{
		System.out.println("Yo pelicula que recomiendo seria 'El viaje de chihiro'. - Denzel");
	}
	
}