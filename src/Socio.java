import java.util.*;
import java.lang.*;

public class Socio 
{
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) 
	{
		List<Socio> socios = new ArrayList<Socio>();
		
		// Crear Socio
		System.out.println("Ingrese el Nombre");
		String nombreA = entrada.next();
		Socio elSocioA = new Socio(nombreA);
		socios.add(elSocioA);
		
		System.out.println("Ingrese el Nombre");
		String nombreB = entrada.next();
		Socio elSocioB = new Socio(nombreB);
		socios.add(elSocioB);	
		
		// Mostrar Socios
		Iterator<Socio> itr = socios.iterator();
		while(itr.hasNext())
		{
			Object elemento = itr.next();
			System.out.print(elemento.toString());
			System.out.print("\n");
		}
		
	}
	
	private String nombre;
    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    private int numero;
    public int getNumero() { return this.numero; }
    public void setNumero(int numero) { this.numero = numero; }
    
    private static int proximoNumero;
    
    public Socio(String nombre)
    {
    	proximoNumero ++;
    	this.nombre = nombre;
    	this.numero = proximoNumero;
    }
    
    public String toString()
    {
    	return "El nombre es: " + nombre + " --- Su numero es: " + numero;
    }
}
