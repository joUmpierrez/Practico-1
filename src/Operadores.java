import java.util.Scanner;

public class Operadores {
	
	static Scanner entrada = new Scanner(System.in);
	
	// Consola
	public static void main(String[] args) {
		// Ejercicio 1
		System.out.println("Suma de Impares entre 1 y 50");
		SumaImpares();
		System.out.print("\n");
		
		// Ejercicio 2
		System.out.println("Ingrese un Numero");
		int n1 = entrada.nextInt();
		System.out.println("Ingrese un Numero");
		int n2 = entrada.nextInt();
		System.out.println("Ingrese un Numero");
		int n3 = entrada.nextInt();
		System.out.println("Ingrese un Numero");
		int n4 = entrada.nextInt();
		System.out.println("Ingrese un Numero");
		int n5 = entrada.nextInt();
		System.out.println("Ingrese un Numero");
		int n6 = entrada.nextInt();
		
		System.out.print("\n");
		System.out.println("Ejercicio 2 con valores: " + n1 + " - " + n2);
		CalculoEntreDos(n1, n2);
		
		System.out.print("\n");
		System.out.println("Ejercicio 2 con valores: " + n3 + " - " + n4);
		CalculoEntreDos(n3, n4);
		
		System.out.print("\n");
		System.out.println("Ejercicio 2 con valores: " + n5 + " - " + n6);
		CalculoEntreDos(n5, n6);
		
		// Ejercicio 3
		System.out.print("\n");
		System.out.println("Imprimir Separado 5");
		System.out.println("-------------------");
		ImprimirSeparado(5);
		System.out.println("-------------------");
		
		System.out.print("\n");
		System.out.println("Imprimir Separado 1523");
		System.out.println("-------------------");
		ImprimirSeparado(1523);
		System.out.println("-------------------");
		
		System.out.print("\n");
		System.out.println("Imprimir Separado 20");
		System.out.println("-------------------");
		ImprimirSeparado(20);
		System.out.println("-------------------");
		
		System.out.print("\n");
		System.out.println("Imprimir Separado 100000");
		System.out.println("-------------------");
		ImprimirSeparado(100000);
		System.out.println("-------------------");
		
		// Ejercicio 4
		System.out.print("\n");
		System.out.println("Ejercicio 4 con valores: " + n1 + " - " + n2);
		MayorPrint(n1, n2);
		
		System.out.print("\n");
		System.out.println("Ejercicio 5 con valores: " + n1 + " - " + n2);
		MayorPrint(n3, n4);
		
		System.out.print("\n");
		System.out.println("Ejercicio 6 con valores: " + n1 + " - " + n2);
		MayorPrint(n5, n6);
	}

	// Ejercicio 1
	private static void SumaImpares() {
		int i;
		int total = 0;
		
		for(i = 1; i<50; i++)
		{
			if(i%2 == 1)
			{
				total = total +i;
			}
		}
		System.out.println(total);
	}

	// Ejercicio 2
	private static void CalculoEntreDos(int n1, int n2)
	{
		// Promedio
		int promedio = (n1 + n2) / 2;
		System.out.println("Promedio " + promedio);
		
		// Cantidad Numeros Pares
		int i;
		int cantidadPares = 0;
		
		if(n1 >= n2)
		{
			for(i=n2; i<n1; i++)
			{
				if(i%2 == 0)
				{
					cantidadPares = cantidadPares+1;
				}
			}
		}
		else if (n2 > n1)
		{
			for(i=n1; i<n2; i++)
			{
				if(i%2 == 0)
				{
					cantidadPares = cantidadPares+1;
				}
			}
		}
		System.out.println("Cantidad numeros Pares " +cantidadPares);
		
		// Valor Absoluto
		int sumaAbsolutos = 0;
		int n1Abs = Math.abs(n1);
		int n2Abs = Math.abs(n2);
		
		sumaAbsolutos = n1Abs + n2Abs;
		System.out.println("Valor Absoluto " + sumaAbsolutos);
	}
	
	// Ejercicio 3
	public static void ImprimirSeparado(int n1) 
	{
		int i;
		String numeroParse = String.valueOf(n1);
		int max = numeroParse.length();
		for(i = 0; i<max; i++)
		{
			System.out.println(numeroParse.charAt(i));
		}
	}
	
	// Ejercicio 4
	public static void MayorPrint(int n1, int n2)
	{
		int i;
		int sumaNumeros = 0;
		
		if(n1 >= n2)
		{
			System.out.println("El mayor es " + n1);
			
			for(i=n2; i<n1; i++)
			{
				sumaNumeros = sumaNumeros + i;
			}
			System.out.println("La suma de los numeros es " + sumaNumeros);
		}
		else
		{
			System.out.println("El mayor es " + n2);
			
			for(i=n1; i<n2; i++)
			{
				sumaNumeros = sumaNumeros + i;
			}
			System.out.println("La suma de los numeros es " + sumaNumeros);
		}
	}
}