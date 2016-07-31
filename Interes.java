/**
 * Created by javier on 17/06/16.
 */
public class Interes
{
    public static void main(String[] args) {
        int montoInicial = 1000;
        int anios = 1;
        double tasaInteres = 0.05;
        double total;
            System.out.printf("%s%20s\n", "Anio" , "monto en deposito");
        for (total = montoInicial; anios <= 10; anios++)
        {
            total = montoInicial * Math.pow((1 + tasaInteres), anios);
            System.out.printf("%4d% ,20.2f",anios, total);
            System.out.println();
        }
    }
}