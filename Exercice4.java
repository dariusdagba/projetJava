import java.util.HashSet;
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args){
         Scanner scanner= new Scanner(System.in);
         HashSet<String> genres = new HashSet<>();
        String voiture;
        int choix;
        do{
            System.out.println("veillez entrer un choix : \n 1 : Ajouter une nouvelle voiture de la collection \n 2 :  vérifier si un modèles spécifique \n 3 : voir la liste des voitures \n 4 : Quitter l'application");
            choix=scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Entrer le nom de la voiture");
                    voiture=scanner.nextLine();
                    genres.add(voiture);
                    System.out.println("nouvelle voiture enrégistrée");
                    break;
                case 2:
                    System.out.println("Entrer une modèle");
                    String modele=scanner.nextLine();
                    if(genres.contains(modele)){
                        System.out.println("Voiture trouvé");
                    }
                    else
                    {
                        System.out.println("Voiture non trouvé ");
                    }
                    break;
                case 3:
                    System.out.println("Affichage des voitures");
                    for( String v : genres){
                        System.out.println(v);
                    }
                    break;
                case 4:
                    System.out.println("fermeture de la page");
                    break;
             
                default:
                    System.out.println("choix incorrect");
             }
        }
        while(choix!=4);
         
        
    }
}
