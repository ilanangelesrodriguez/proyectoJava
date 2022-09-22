import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, how are you!");
            Scanner sc=new Scanner(System.in);
        try {
            System.out.println("What is your name?");
            String id=sc.nextLine();
            System.out.println("Bienvenido "+id);
        } finally {
            sc.close();
        }
    }
}
