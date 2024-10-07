import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Exercice5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);
        HashMap<String, ArrayList<Integer>>studentGrades = new HashMap<>();
        int choix;
        do 
        {
            System.out.println("Entrer votre choix :  \n 1 : Associer les noms aux notes \n 2 : Mise à jourt des notes \n 3 : Afficher les notes des étudiants \n 4 : Quitter la page");
            choix=sc.nextInt();
            String nomEtud,nomEtude;
            switch (choix) {
                case 1:
                    System.out.println("Entrer le nom de l'étudiant : ");
                    nomEtud=scanner.nextLine();
                    studentGrades.put(nomEtud,new ArrayList<Integer>());
                    break;
                case 2:
                    System.out.println("Entrer le nom de l'étudiant : ");
                    nomEtude=scanner.nextLine();
                    System.out.println("Combien de notes voulez-vous entrer ?");
                    int nbre=sc.nextInt();
                    System.out.println("Entrer les notes de l'étudiant : ");
                    for(int i=0;i<nbre;i++)
                    {
                        Integer note=sc.nextInt();
                        studentGrades.get(nomEtude).add(note);
                    }
                    break;
                case 3:
                    for(String etudiant : studentGrades.keySet())
                    {
                        System.out.println("Affichage des notes de l'étudiant : "+ etudiant);
                        for(Integer notes : studentGrades.get(etudiant))
                        {
                            System.out.println(notes);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Quitter la page");
                    break;
            
                default:
                    System.out.println("Choix incorrect");
                    break;
            }
        } 
        while (choix!=4);
    }
}
