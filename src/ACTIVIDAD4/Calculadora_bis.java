package ACTIVIDAD4;

public class Calculadora_bis 
{

	public static void main(String[] args) 
	{
	       int numero1;
	       int numero2;
	       int suma, resta, multiplicacion, division;
	       

	        System.out.print("Introduzca un número: ");
	        numero1 = Teclado.entero();

	        System.out.print("Introduzca otro número: ");
	        numero2 = Teclado.entero();

	        suma = numero1 + numero2;
	        System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + suma);
	        
	        resta = numero1 - numero2;
	        System.out.println("La resta de " + numero1 + " - " + numero2 + " es: " + resta);
	        
	        multiplicacion = numero1 * numero2;
	        System.out.println("La multiplicación de " + numero1 + " * " + numero2 + " es: " + multiplicacion);
	        
	        division = numero1 / numero2;
	        System.out.println("La división de " + numero1 + " / " + numero2 + " es: " + division);
	}

}
