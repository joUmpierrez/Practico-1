import java.util.*;

public class Socio 
{
	static Scanner entrada = new Scanner(System.in);
	
	// Consola
	public static void main(String[] args) 
	{
		List<Socio> socios = new ArrayList<Socio>();
		
		// Crear Socio
		System.out.println("Ingrese el Nombre");
		String nombreA = entrada.next();
		Socio elSocioA = new Socio(nombreA);
		socios.add(elSocioA);
		System.out.print("\n");
		
		System.out.println("Ingrese el Nombre");
		String nombreB = entrada.next();
		Socio elSocioB = new Socio(nombreB);
		socios.add(elSocioB);	
		System.out.print("\n");
		
		// Mostrar Socios
		Iterator<Socio> itr = socios.iterator();
		while(itr.hasNext())
		{
			Socio elemento = itr.next();
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
    
    // Constructor
    public Socio(String nombre)
    {
    	proximoNumero ++;
    	this.nombre = nombre;
    	this.numero = proximoNumero;
    }
    
    // Override del metodo toString
    public String toString()
    {
    	return "Numero de Socio: " + numero + " --- Nombre: " + nombre;
    }
}