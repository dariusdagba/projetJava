import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercice3 {
    public static void main(String[] args){
        ArrayList <String> listArray= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int choix; String task; int num; String nom;
        Scanner scanner=new Scanner(System.in);
        do{
        System.out.println("Entrer votre choix : \n 1 : Ajouter de nouvelles tâches à la liste \n 2 : Afficher toutes les tâches affichées dans la collection. \n 3 : Supprimer des tâches. \n 4 : Récupérer une tâche à une position donnée dans la liste. \n 5 : Trier les tâches par ordre alphabétique ou par priorité.");
        choix=sc.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Entrer la tâche à ajouter");
                task=scanner.nextLine();
                listArray.add(task);
                System.out.println("Ajout de tâche avec succès");
                break;
            case 2:
                System.out.println("Affichages des tâches de la collection");
                //System.out.println(listArray);
                for(String tach : listArray){
                    System.out.println(tach);
                }
                break;
            case 3:
                System.out.println("Entrer le nom de la tâche à supprimer");
                nom=scanner.nextLine();
                listArray.remove(nom);
                System.out.println("Suppression de tâche avec succès");
                break;
            case 4:
                System.out.println("Entrer le numero de la tâche à supprimer");
                num=sc.nextInt();
                System.out.println("la tâche recherché : "+listArray.get(num));
                break;
            case 5:
                Collections.sort(listArray);
                System.out.println("Triage des tâches effectué avec succès");
                break;
            case 6:
                System.out.println("Fermeture du menu");
                break;
        
            default:
                System.out.println("choix incorrect");
                break;
        }
        }while (choix!=6);
    }
}
