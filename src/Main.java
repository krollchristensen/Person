public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Person person1 = new Person("Mikkel", 30);
        Person person2 = new Person("Alex", 40);


        int result = person1.compareTo(person2);

        // Print resultatet af sammenligningen
        if (result < 0) {
            System.out.println(person1.getName() + " er yngre end " + person2.getName());
        } else if (result > 0) {
            System.out.println(person1.getName() + " er ældre end " + person2.getName());
        } else {
            System.out.println(person1.getName() + " og " + person2.getName() + " er lige gamle");
        }
    }
}