/* */
public class introPOO {
    public static void main(String[] args) throws Exception {
        System.out.println("UEFA CHAMPIONS LEAGUE");
        //instanciar clase
        equipo club = new equipo();

        System.out.print("DT FC Barcelona: ");
        System.out.println(club.dt);
        System.out.print("Fecha 3: FC Barcelona vs ");
        System.out.println(club.rivales[1]);
        System.out.println(club);
    }
}
/*Metodos: Funciones dentro de una clase.*/
class equipo{
    String club="FCBarcelona";
    class estadio{
        String estadio="Camp Nou";
        int capacidadEstadio=90000;
        String ciudad="Barcelona";
    }
    String dt="Xavi Hernandez";
    String group="C";
    String [] rivales={"FC Viktoria Plzeň","Bayern Múnich","Inter de Milán"};
    class alineacion{
        int formacion= 433;
    }
    public equipo(){
        club="AC Milan";
        System.out.println("Constructor sin nada");
    }
    public equipo(String [] rivales, String club){
        this.club=club;
        this.rivales [0]=rivales[0];
        //this.rivales [1]="RB Salzburg";
        //this.rivales [2]="Dinamo Zagreb";
        System.out.println("Constructor con parametros");
        System.out.println(club+" vs "+rivales[0]);
    }
}
