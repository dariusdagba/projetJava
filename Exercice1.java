import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) 
    {
        String[] tab = new String[10];
        int choix; int seat; String nom;
        Scanner scanner=new Scanner(System.in);
        
        do{
            System.out.println("Entrer votre choix : \n 1 : Afficher le nom des personnes ayant réservés \n 2 : Verfier si une place est dispo ou pas \n 3 : Faire une réservation \n 4 : Annuler une réservation \n 5 : Quitter le menu");
            choix=scanner.nextInt();

            switch (choix) {
                case 1:
                    for(int i=0; i<tab.length;i++){
                        System.out.println("Nom "+tab[i]+" Siège "+(i+1));
                    }
                    break;
                case 2:
                    System.out.println("Entrer le numéro du siège");
                    seat=scanner.nextInt();
                    if( tab[seat]==null)
                    {
                        System.out.println("Siège libre");
                    }
                    else
                    {
                        System.out.println("Siège occupé");
                    }
                    break;
                case 3 :
                    System.out.println("Entrer le numéro du siège");
                    seat=scanner.nextInt();
                    System.out.println("Entrer votre nom");
                    Scanner sc=new Scanner(System.in);
                    nom=sc.nextLine();
                    tab[seat]=nom;
                    System.out.println("Réservation effectuée avec succès");
                    break;
                case 4 :
                    System.out.println("Entrer votre numéro de siège : ");
                    seat=scanner.nextInt();
                    tab[seat]=null;
                    System.out.println("Annulation effectuée avec succès");
                    break;
                case 5:
                    System.out.println("Fermeture du menu");
                    break;
                default:
                    System.out.println("Choix incorrect");
            }

        } while(choix!=5);

    }
}
