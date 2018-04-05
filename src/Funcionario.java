import java.util.*;

public class Funcionario 
{
	static Scanner entrada = new Scanner(System.in);
	
	// Consola
	public static void main(String[] args) 
	{
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		// Crear Socio
		System.out.println("Ingrese el Nombre");
		String nombreA = entrada.next();
		System.out.println("Ingrese el Sueldo");
		double sueldoA = entrada.nextDouble();
		Funcionario elFuncionarioA = new Funcionario(nombreA, sueldoA);
		funcionarios.add(elFuncionarioA);	
		System.out.print("\n");
		
		System.out.println("Ingrese el Nombre");
		String nombreB = entrada.next();
		System.out.println("Ingrese el Sueldo");
		double sueldoB = entrada.nextDouble();
		Funcionario elFuncionarioB = new Funcionario(nombreB, sueldoB);
		funcionarios.add(elFuncionarioB);	
		System.out.print("\n");
		
		// Mostrar Socios
		Iterator<Funcionario> itr = funcionarios.iterator();
		while(itr.hasNext())
		{
			Funcionario elemento = itr.next();
			System.out.print(elemento.toString());
			System.out.print("\n");
		}
		System.out.print("\n");
		
		// Mostrar Socios
		Iterator<Funcionario> itrC = FuncionariosMayorSueldo(funcionarios).iterator();
		while(itrC.hasNext())
		{
			Funcionario elemento = itrC.next();
			System.out.print("El Funcionario con mas sueldo es: " + elemento.nombre + " --- Sueldo: " + elemento.sueldo);
			System.out.print("\n");
		}
		
	}

	private String nombre;
    public String getNombre() { return this.nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    private double sueldo;
    public double getSueldo() { return this.sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }
    
    // Constructor
    public Funcionario (String nombre, double sueldo)
    {
    	this.nombre = nombre;
    	this.sueldo = sueldo;
    }
    
    // Override del metodo toString
    public String toString()
    {
    	return "El nombre es: " + nombre + " --- Su sueldo es: " + sueldo;
    }

    // Metodo que devuelve los funcionarios con Mayor Sueldo
    public static List<Funcionario> FuncionariosMayorSueldo(List<Funcionario> funcionarios)
    {
    	List<Funcionario> funcionariosSueldoMasAlto = new ArrayList<Funcionario>();
		double sueldoMasAlto = 0;
		
		Iterator<Funcionario> itrB = funcionarios.iterator();
		while(itrB.hasNext())
		{
			Funcionario elemento = itrB.next();
			
			if(elemento.sueldo > sueldoMasAlto)
			{
				funcionariosSueldoMasAlto.clear();
				funcionariosSueldoMasAlto.add(elemento);
			}
			else if (elemento.sueldo == sueldoMasAlto)
			{
				funcionariosSueldoMasAlto.add(elemento);
			}
		}
		
		return funcionariosSueldoMasAlto;
    }
}