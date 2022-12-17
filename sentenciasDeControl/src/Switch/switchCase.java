package Switch;

public class switchCase {
    public static void main(String[] args) {
        var club="FC Barcelona";
        switch(club){
            case "FC Barcelona":
            System.out.println("Es de LaLiga");
            break;
            case "AC Milan":
            System.out.println("Es de la Serie A");
            break;
            case "Borussia Dortmund":
            System.out.println("Es de la Bundesliga");
            break;
            case "Chelsea FC":
            System.out.println("Es de la Premier league");
            break;
            default:
            System.out.println("Pertenece a otra liga");
        }
    }
}
