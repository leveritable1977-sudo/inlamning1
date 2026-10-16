package inlamning1.Uppgift1;


import java.util.ArrayList; // import klass ArrayList från paket util


// klassen och main metoden
public class Main {
    public static void main(String[] args) {

        //skapande av objekt
        Matratt food = new Matratt("Sallad",Type.Vegetarian,100,50);
        Matratt food1 = new Matratt("Pasta",Type.Meat,80,60);
        Matratt food2 = new Matratt("Pizza",Type.Meat,200,50);

        //Arraylist
        ArrayList<Matratt> matList = new ArrayList<>();

        //Objektet till listan
        matList.add(food);
        matList.add(food1);
        matList.add(food2);

        System.out.println( "--- Dagens lunchmeny! ---" );

        // for- each loopen och utskrift med toString
        for(Matratt m : matList) {
            System.out.println(m);
        }

    }

}


