import java.util.Scanner;

public class BoucleExo6 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = sc.nextLine();

        System.out.println("Le nombre de caractères de ce mot est "+chaine.length());
    }
}
