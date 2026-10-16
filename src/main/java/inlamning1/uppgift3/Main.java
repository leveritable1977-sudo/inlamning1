package inlamning1.uppgift3;


public class Main {
    public static void main(String[] args) {
        // 1. Skapa dig själv (skickar BARA in födelsedatum i new)
        Person jag = new Person(19950821);
        jag.setName("Mohamed");
        jag.setStreetAddress("Liongatan 1");
        jag.setPostalCode(17077);
        jag.setPostalArea("Stockholm");

        // 2. Skapa din kompis (skickar BARA in födelsedatum i new)
        Person kompis = new Person(19961012);
        kompis.setName("Ali");
        kompis.setStreetAddress("Brogatan 5");
        kompis.setPostalCode(16080);
        kompis.setPostalArea("Sundsvall");

        // 3. Mohamed flyttar in hos Ali (kopierar adressen via getters)
        jag.setStreetAddress(kompis.getStreetAddress());
        jag.setPostalCode(kompis.getPostalCode());
        jag.setPostalArea(kompis.getPostalArea());

        // 4. Skriv ut med hjälp av toString()
        System.out.println(jag);
        System.out.println(kompis);
    }
}



