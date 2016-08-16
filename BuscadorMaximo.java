import java.util.Scanner;
//clase
public class BuscadorMaximo {
	
	public static void main (String []args){
				//lectura de datos
		Scanner input = new Scanner (System.in);
		
		System.out.print("Ingrese tres valores de punto flotante, separado por los espacios: ");
		
		double number1= input.nextDouble();
		double number2= input.nextDouble();
		double number3=	input.nextDouble();
		
		double resultado= maximo( number1 ,number2, number3 );
		
		System.out.println("El maximo es: "+resultado);
	}	//metodo
		public static double maximo(double x, double y, double z)
		{
			double valorMaximo = x;// determina que x es el mayor
		
			if (y > valorMaximo)	//compara si es mayor Y que X y define que Y es mayor
				valorMaximo=y;	
			
			if (z> valorMaximo) // compara si Z es mayor que X, si es, define que Z es mayor
				valorMaximo=z;
			
			return valorMaximo;	// indica que el metodo maximo ha terminado
	}
}	
				
				
			