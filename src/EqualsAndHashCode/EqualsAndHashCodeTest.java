package EqualsAndHashCode;

public class EqualsAndHashCodeTest {

    public static void main(String[] args) {

        Person person1 = new Person("Ravina", 28, "001");

        Person person2 = new Person("Ravina", 28, "001");

        if (person1 == person2){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        // Here I have defined .equals() method explicitly

        if (person1.equals(person2)){
            System.out.println("EQUAL");
        } else {
            System.out.println("Not equal");
        }
    }
}
