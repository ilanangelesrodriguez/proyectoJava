public class cuartoEjercicio {
    public static void main(String[] args) {
        cliente c1=new cliente();
        
        c1.nombre="Ilan";
        c1.edad=20;
        c1.telefono=123456789;
        c1.credito = 1500;
        System.out.println("Cliente: "+c1.nombre);
        System.out.println("Edad: "+c1.edad+" años");
        System.out.println("Telefono: "+c1.telefono);
        System.out.println("Credito: S/."+c1.credito);
        
        trabajador t1=new trabajador();
        t1.nombre="EZ Abde";
        t1.edad=21;
        t1.telefono=243576819;
        t1.salario = 1300;

        System.out.println("Trabajador: "+t1.nombre);
        System.out.println("Edad: "+t1.edad+" años");
        System.out.println("Telefono: "+t1.telefono);
        System.out.println("Salario: S/."+t1.credito);
    }
}
class persona{
    int edad=20;
    int telefono;
    String nombre;
}
class cliente extends persona{
    int credito;
}
class trabajador extends persona {
    int salario;
}
