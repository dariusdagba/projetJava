import java.util.Scanner;

public class BoucleExo1 {
    public static void main(String[] args) {
        
        int somme=0;
        int cpt=0;
        System.out.println("Entrer une valeur comprise entre 1-100");
        Scanner sc = new Scanner(System.in);
        int nbre= sc.nextInt();
        while(nbre>=0)
        {
            nbre= sc.nextInt();
            if(nbre%2==0)
            {
                somme+=nbre;
            }
            else
            {
                cpt+=1;
            }
        }
        System.out.println("Le somme des nombres paires est "+somme);
        System.out.println("Le nombre des nombres impaires saisis est "+cpt);
      }
}

