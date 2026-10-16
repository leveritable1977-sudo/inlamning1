package inlamning1.Uppgift3;



public class Person {
    private String name;
    private int birthDate;
    private String streetAddress;
    private int postalCode;
    private String postalArea;

    public Person(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {

        // Om det gick bra sparas det som vanligt
        this.streetAddress = streetAddress;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        if (postalCode < 10000 || postalCode > 99999) {
            throw new IllegalArgumentException("Ogiltigt postnummer! Det måste vara 5 siffor");
        }
        this.postalCode = postalCode;
    }

    public String getPostalArea() {
        return postalArea;
    }

    public void setPostalArea(String postalArea) {
        this.postalArea = postalArea;
    }

    @Override
    public String toString() {
        return String.format("%s är född den %d, och bor på %s %d i %s.",
                name, birthDate, streetAddress, postalCode, postalArea);
    }
}


