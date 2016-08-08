
public class Perro
{
    //atributos o variables de clase

    private int edad;
    private String n0mbre;
    private String raza;
    private String accion;
    //constructor
    public Perro()
    {
        edad = 1;
        n0mbre= "sin_nombre";
        raza="criollo";
        accion= "ladrar";
    }
    // metods
    public void setAccionDelPerro(String accion)
    {
        this.accion= accion;
    }
    public String getAccionDelPerro()
    {
        return accion;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if(edad > 0)
            this.edad = edad;
    }
    public void setN0mbre (String n0mbre){
    	      
    		this.n0mbre=n0mbre;    	
    }
    public String getN0mbre(){
        return n0mbre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
}