/**
 * Created by javier on 14/04/16.
 */
//import java.util.Scanner;

public class PruebaLibroCalificaciones
{
        public static void main(String []args)
        {
          LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
                  "CS101 Introduccion a la programacion en java");

            miLibroCalificaciones.mostrarMensaje();
            miLibroCalificaciones.introducirCalif();
            miLibroCalificaciones.mostrarReporteCalif();

        }
}
