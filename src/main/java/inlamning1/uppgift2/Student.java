package inlamning1.uppgift2;


public class Student {
    private String firstName;
    private String lastName;
    private String schoolName;
    private int age;


    public Student(String firstName, String lastName,  String schoolName,int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schoolName = schoolName;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getAge() {
        return age;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {

        return String.format("Student: %s %s från %s är %d år gammal.",
                firstName, lastName, schoolName, age);
    }
}

