import java.util.Scanner;

public class BoucleExo3 {
    public static void main(String[] args) 
    {
        System.out.println("Entrer une valeur comprise entre 1-100");
        Scanner sc = new Scanner(System.in);
        int nbre= sc.nextInt();
        
        while(nbre<0){
            System.out.println("Entrer une valeur comprise entre 1-100");
            nbre= sc.nextInt();
        }
        int b=1;
        // for(int i=1;i<=nbre;i++)
        // {
        //     b*=(i);
        // }
        for(int i=0;i<nbre;i++)
        {
            b*=(nbre-i);
        }


        System.out.println("Le factoriel est "+b);
    }
}
