public class cuartoEjercicio {
    public static void main(String[] args) {
        cliente c1=new cliente();
        c1.propiedades();

        trabajador t1=new trabajador();
        int s=t1.salario=1500;

        System.out.println("El salario es: "+s);
    }

}
class persona{
    int edad=20;
    int telefono=123456789;
    String nombre="Ilan";
}
class cliente extends persona{
    public void propiedades(){
        int credito=1000;
    }
}
class trabajador extends persona {
    int salario;
}
