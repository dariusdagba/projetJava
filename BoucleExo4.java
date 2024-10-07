import java.util.Scanner;
public class BoucleExo4 {
    public static void main(String[] args) 
    {

        int i=0;
        int max=0; int min=99999999;
        System.out.println("Entrer une série d'entiers");
        Scanner scanner= new Scanner(System.in);
        while(i<=10)
        {
            int nbre= scanner.nextInt();
            if(max<nbre)
            {
                max=nbre;
            }

            if(min>nbre)
            {
                min=nbre;
            }
            i++;
        }
        System.out.println("Le maximum est "+max);
        System.out.println("Le minimum est "+min);

    }
}
