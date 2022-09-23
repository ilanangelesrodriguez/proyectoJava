/*Para practicar la encapsulación:

+ Crear clase Persona.
+ Crear variables las privadas edad, nombre y telefono de la clase Persona.
+ Crear gets y sets de cada propiedad.
+ Crear un objeto persona en el main.
+ Utiliza los gets y sets para darle valores a las propiedades edad, nombre y 
telefono, por último muéstralas por consola.*/

public class tercerEjercicio {
    public static void main(String[] args) {
        System.out.println("");

        System.out.println("    UEFA Champions League ");
        
        Persona persona = new Persona();

        persona.setEdad(20);
        persona.setNombre(" Ilan Angeles");
        persona.setTelefono(12345678);
        persona.setPlayer(false);
        int edad=persona.getEdad();
        String nombre=persona.getNombre();
        int telefono=persona.getTelefono();
        boolean player=persona.isPlayer();

        Persona persona2 = new Persona();

        persona2.setEdad(22);
        persona2.setNombre("Erling Haaland");
        persona2.setTelefono(23456789);
        persona2.setPlayer(true);
        int edad2=persona2.getEdad();
        String nombre2=persona2.getNombre();
        int telefono2=persona2.getTelefono();
        boolean player2=persona2.isPlayer();

        System.out.println("*~---------- Name ---------~*");
        System.out.println(nombre +" | "+nombre2);
        System.out.println("+---------- Player ---------+");
        System.out.println("     "+player+"    |     "+player2);
        System.out.println("+----------- Age -----------+");
        System.out.println("       "+edad +"     |     "+edad2);
        System.out.println("+------- Phone Number ------+");
        System.out.println("   "+telefono +"   |   "+telefono2);
    }
}
class Persona{
    /*+ Crear variables las privadas edad, nombre y telefono de la clase Persona.*/
    private int edad;
    private String nombre;
    private int telefono;
    private boolean player;
    /*+ Crear gets y sets de cada propiedad.*/

    public void setPlayer(boolean player){
        this.player=player;
    }
    public boolean isPlayer(){
        return this.player;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
