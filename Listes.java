import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;

public class Listes {
   
    public static void main (String [] args){
        ArrayList <Integer> TobbiRopo= new ArrayList<Integer>();
        for(int i=65;i<=1000;i=i+3){
            TobbiRopo.add(i);
        }
        System.out.println("Voici mon arraylist");
        System.out.println(TobbiRopo);

        LinkedList <String> Mangoes= new LinkedList<String>();
            Mangoes.add("ABCDE");
            Mangoes.add("CBADE");
            Mangoes.add("DERVI");
            Mangoes.add("OPBNE");
        System.out.println("Voici mon linkedlist");
        System.out.println(Mangoes);

        Vector <Double> listVec=new Vector<Double>();
        Double i=500.50;
        while(i<10000.00){
            listVec.add(i);
            i=i+50.75;
        }
        System.out.println("Voici ma liste vector");
        System.out.println(listVec);

        Stack <String>listStack=new Stack<String>();
        listStack.add("AREA");
        listStack.add("OREA");
        listStack.add("ERAR");
        listStack.add("RAEA");
        listStack.add("RARE");
        System.out.println("Voici ma liste stack");
        System.out.println(listStack);


    }
   

}
