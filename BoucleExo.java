import java.util.Scanner;

public class BoucleExo{
    public static void main (String [] args){
        System.out.println("Entrer une valeur comprise entre 1-100");
        Scanner sc = new Scanner(System.in);
        int nbre= sc.nextInt();

         while (nbre < 1||nbre >100) {
            System.out.println("Entrer une valeur");
            nbre= sc.nextInt();
         }
            boolean estPremier=true;
            for(int i=2;i<nbre;i++)
            {
                
                if(nbre % i==0){
                    estPremier=false;
                }
            }

            if (estPremier) 
            {
             System.out.println(nbre + " est un nombre premier.");
            } 
            else 
            {
                System.out.println(nbre + " n'est pas un nombre premier.");
            }

        
    }
}