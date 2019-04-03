import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        ArrayList<Worker> workers = new ArrayList<Worker>();

        animals.add(new Animal(0, "Cat", 127.99));
        animals.add(new Animal(1, "Dog", 145.99));
        animals.add(new Animal(2, "Owl", 273.99));
        animals.add(new Animal(3, "Raccoon", 119.99));
        animals.add(new Animal(4, "Cat", 127.99));
        animals.add(new Animal(5, "Dog", 145.99));
        animals.add(new Animal(6, "Owl", 273.99));
        animals.add(new Animal(7, "Raccoon", 119.99));
        animals.add(new Animal(8, "Cat", 127.99));
        animals.add(new Animal(9, "Dog", 145.99));
        animals.add(new Animal(10, "Owl", 273.99));
        animals.add(new Animal(11, "Raccoon", 119.99));
        animals.add(new Animal(12, "Cat", 127.99));
        animals.add(new Animal(13, "Dog", 145.99));
        animals.add(new Animal(14, "Owl", 273.99));
        animals.add(new Animal(15, "Raccoon", 119.99));

        workers.add(new Worker(0, "John Smith", "johnsmith", "john012"));
        workers.add(new Worker(1, "Alex Johnson", "alexjohnson", "alex256j"));
        workers.add(new Worker(2, "James Gordon", "james1982gordon", "g0304james"));
        workers.add(new Worker(3, "Mary Rondes", "maryrondes23", "mr2906621rd"));
    }
}
