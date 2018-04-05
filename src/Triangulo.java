import java.util.Scanner;
import java.lang.*;

public class Triangulo 
{
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Ingrese un Lado");
		double ladoA = entrada.nextDouble();
		System.out.println("Ingrese un Lado");
		double ladoB = entrada.nextDouble();
		System.out.println("Ingrese un Lado");
		double ladoC = entrada.nextDouble();
		
		// Escaleno
		System.out.println("Es Escaleno? - " + esEscaleno(ladoA, ladoB, ladoC));
		
		// Isosceles
		System.out.println("Es Isoceles? - " + esIsoceles(ladoA, ladoB, ladoC));
		
		// Equilatero
		System.out.println("Es Equilatero? - " + esEquilatero(ladoA, ladoB, ladoC));
		
		// Tiene Angulo Recto
		System.out.println("Tiene Angulo Recto? - " + tieneAnguloRecto(ladoA, ladoB, ladoC));
	}
	
	// Escaleno
	public static boolean esEscaleno (double ladoA, double ladoB, double ladoC)
	{
		boolean esValido = false;
		
		if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC)
		{
			esValido = true;
		}
		
		return esValido;
	}
	
	// Isosceles
	public static boolean esIsoceles (double ladoA, double ladoB, double ladoC)
	{
		boolean ladoAxladoB = false;
		boolean ladoAxladoC = false;
		boolean ladoBxladoC = false;
		
		if(ladoA == ladoB)
		{
			if (ladoA != ladoC && ladoB != ladoC)
			{
				ladoAxladoB = true;
			}
		}
		else if(ladoA == ladoC)
		{
			if (ladoA != ladoB && ladoC != ladoB)
			{
				ladoAxladoC = true;
			}
		}
		else if(ladoB == ladoC)
		{
			if (ladoB != ladoA && ladoC != ladoA)
			{
				ladoBxladoC = true;
			}
		}

		return ladoAxladoB || ladoAxladoC || ladoBxladoC;
	}
			
	// Equilatero
	public static boolean esEquilatero (double ladoA, double ladoB, double ladoC)
	{
		boolean esValido = false;
		
		if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC)
		{
			esValido = true;
		}
		
		return esValido;
	}
			
	// Tiene Angulo Recto
	public static boolean tieneAnguloRecto (double ladoA, double ladoB, double ladoC)
	{
 		boolean esValido = false;
		
		if (!esEquilatero(ladoA, ladoB, ladoC))
		{
			double a = Math.asin((Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC)) * 180 / Math.PI;
			double b = Math.asin((Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoA * ladoC)) * 180 / Math.PI;
			double c = Math.asin((Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - Math.pow(ladoC, 2)) / (2 * ladoA * ladoB)) * 180 / Math.PI;
			
			if(!Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c))
			{
				if(a == 0)
				{
					a = 90;
				}
				else if (b == 0)
				{
					b = 90;
				}
				else if (c == 0)
				{
					c = 90;
				}
				
				if(a == 90 || b == 90 || c == 90)
				{
					esValido = true;
				}
			}
		}
		
		return esValido;
	}
}
