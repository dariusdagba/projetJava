import java.util.Scanner;
public class BoucleExo2 {
    public static void main(String[] args) 
    {
        int nbre; 
        int nbrealeatoire=(int) (Math.random() * 50 + 1);
        do {
            System.out.println("Entrer un nombre aléatoire entre 1- 50");
            Scanner scanner= new Scanner(System.in);
            nbre=scanner.nextInt();
            if(nbre>nbrealeatoire)
            {
                System.out.println("Votre nombre est trop haut");
            }
            else if(nbre<nbrealeatoire)
            {
                System.out.println("Votre nombre est trop basse");
            }
            else
            {
                System.out.println("Félicitations ! vous avez deviné le nombre "+nbrealeatoire);
            }
        } 
        while (nbre != nbrealeatoire);

    }
}
