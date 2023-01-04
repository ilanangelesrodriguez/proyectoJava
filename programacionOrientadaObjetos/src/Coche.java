public class Coche {
    /*---- Atributos ----*/
    //atributos: Caracteristicas de un coche
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    //Se podria crear una clase motor para asociar a la clase coche
    Integer velocidad=0;

    /*---- Constructores ----*/
    //Constructores: nos permite construir objetos
    //Metodos especiales que nos permite crear objetos de esta clase; su nombre inicia con mayuscula y es el nombre de la clase
    public Coche(String color, String fabricante,String modelo, Double peso, Double largo){
        this.color=color;
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.peso=peso;
        this.largo=largo;
    }

    /*---- Comportamiento ----*/
    //Comportamiento: metodos que simbolizan el comportamiento del coche
    public void acelerar(Integer cantidad){
        if (cantidad>0 && cantidad<120){
            this.velocidad=velocidad+cantidad;
        }
    }

    /*-- Metodo toString --*/
    //Hace sout, devuelve el texto
    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
    /*Crear objetos a partir de clases java*/
}
