package inlamning1.Uppgift1;


// mall  och intansvariabler
public class Matratt {
    String name;
    Type typ;
    double price;
    int calories;


    //konstruktor
    public Matratt(String name, Type typ, double price, int calories) {
        this.name = name;
        this.typ = typ;
        this.price = price;
        this.calories = calories;
    }


    //Instansmetoden med toString
    @Override
    public String toString() {
        return name + " är av typ " + typ +  " ," + " den kostar "  + price + " och är " + calories + " kcal. ";
    }
}

