package ACTIVIDAD4;

/**
* <h2> Clase Calculadora, se utiliza para realizar las operaciones básicas: suma, resta, multiplicación y división</h2>.
* @version 3-(27-3-2023)
* @author Roberto Hevia Muñiz
* @since Versión 2 del programa
*/

public class Calculadora_bis 
{

	public static void main(String[] args) 
	{
		//Declaro las variables
       	int numero1;
       	int numero2;
       	//int suma, resta, multiplicacion, division;
       
       	// Pido al usuario que introduzca un número
        System.out.print("Introduzca un número: ");
        numero1 = Teclado.entero();
        
        //Pido al usuario que introduzca un segundo número para realizar las operaciones
        System.out.print("Introduzca otro número: ");
        numero2 = Teclado.entero();
        
        suma(numero1, numero2);
        
        resta(numero1, numero2);
        
        multiplicacion(numero1, numero2);
        
        division(numero1, numero2);
	}

	/**
	 * @param numero1
	 * @param numero2
	 * @author Roberto Hevia Muñiz
	 * @since Versión 1 del programa
	 */
	public static void division(int numero1, int numero2) 
	{
		int division;
		//Instrucciones para realizar la división
			division = numero1 / numero2;
			System.out.println("La división de " + numero1 + " / " + numero2 + " es: " + division);
	}

	/**
	 * @param numero1
	 * @param numero2
	 * @author Roberto Hevia Muñiz
	 * @since Versión 1 del programa
	 */
	public static void multiplicacion(int numero1, int numero2) 
	{
		int multiplicacion;
		//Instrucciones para realizar la multiplicación
			multiplicacion = numero1 * numero2;
			System.out.println("La multiplicación de " + numero1 + " * " + numero2 + " es: " + multiplicacion);
	}

	/**
	 * @param numero1
	 * @param numero2
	 * @author Roberto Hevia Muñiz
	 * @since Versión 1 del programa
	 */
	public static void resta(int numero1, int numero2) 
	{
		int resta;
		//Instrucciones para realizar la resta
	        resta = numero1 - numero2;
	        System.out.println("La resta de " + numero1 + " - " + numero2 + " es: " + resta);
	}

	/**
	 * @param numero1
	 * @param numero2
	 * @author Roberto Hevia Muñiz
	 * @since Versión 0 del programa
	 */
	public static void suma(int numero1, int numero2) 
	{
		int suma;
		//Instrucciones para realizar la suma
		suma = numero1 + numero2;
		System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + suma);
	}
}
