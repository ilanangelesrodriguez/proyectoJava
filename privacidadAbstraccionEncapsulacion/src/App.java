public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("  UEFA Champions League ");
        System.out.println("*~-------Match!-------~*");
        Club club = new Club();

        club.setNombre("FC Barcelona");
        club.setPuntos(3);
        String nombre=club.getNombre();
        int puntos=club.getPuntos();

        Club club1=new Club();
        club1.setNombre("AC Milan");
        club1.setPuntos(4);
        String nombre1=club1.getNombre();
        int puntos1=club1.getPuntos();


        System.out.println(nombre +" VS "+nombre1);
        System.out.println("+------- Points ------+");
        System.out.println("       "+puntos +"     |     "+puntos1);
    }
}
class Club{
    private String nombre;
    private int puntos;

    public void setPuntos(int puntos){
        this.puntos=puntos;
    }
    public int getPuntos(){
        return this.puntos;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
