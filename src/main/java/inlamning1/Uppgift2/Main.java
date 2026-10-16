package inlamning1.Uppgift2;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student elev1 = new Student ("Ali" , "abe" ,"Sib",14);
        Student elev2 = new Student ("Omar" , "Sab" ,"Lib",15);
        Student elev3 = new Student ("Rag" , "Nin" ,"San",14);

        ArrayList<Student> elevLista = new ArrayList<>();
        elevLista.add(elev1);
        elevLista.add(elev2);
        elevLista.add(elev3);

        for(Student s : elevLista){
            System.out.println(s.toString());
        }
    }
}
