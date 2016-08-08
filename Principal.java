import java.util.Scanner;

public class Principal
{
    public static void main (String [] args)
    {
    	Scanner input = new Scanner(System.in);
    	
    	 System.out.print("ingrese el nombre de la mascota: ");
         
    	String nombre = input.nextLine();
    	Perro perro1 = new Perro();
    	
    	if ( (nombre.equals("")|| nombre.equals(null)|| nombre==null))
    	{
    		perro1.setN0mbre("luna");              
            perro1.setAccionDelPerro("joder");
            perro1.setEdad(4);
            perro1.setRaza("poodle");
            
    		System.out.println(" El perro de nombre2 "+ perro1.getN0mbre() + ", la edad es " + perro1.getEdad()+ " anios" +
    	 ", es de raza "+ perro1.getRaza() + " y le encanta "+ perro1.getAccionDelPerro());
    	}
    	else
      	System.out.println(" El perro de nombre1 "+ nombre + ", la edad es " + perro1.getEdad()+ " anios" +
    	    	", es de raza "+ perro1.getRaza() + " y le encanta "+ perro1.getAccionDelPerro());
    	 
    	
       } 
    }
