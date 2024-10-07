import java.util.Scanner;
public class BoucleExo5 {
    public static void main(String[] args) 
    {

        int choix;
        do
        {
            System.out.println("Entrer votre choix");
            Scanner scanner= new Scanner(System.in);
            choix= scanner.nextInt();
            switch (choix) 
            {
                case 1:
                    System.out.println("Entrer un nombre ");
                    int nbre=scanner.nextInt();
                    System.out.println("Le carré de "+nbre+" est "+(nbre*nbre));
                break;
                case 2:
                    System.out.println("Entrer un nombre ");
                    int nbre1=scanner.nextInt();
                    if(nbre1 % 2==0)
                    {
                        System.out.println(nbre1+" est un nombre pair");
                    }
                    else
                    {
                        System.out.println(nbre1+" est un nombre impair");
                    }
                break;
                case 3:
                     System.out.println("Vous avez quitter le programme");
                break;
                default:
                System.out.println("Choix invalide");
            
            }

        }
        while(choix!=3);
    }
}
