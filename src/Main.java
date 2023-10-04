public class Main {
    public static void main(String[] args) {
        // Create instances of the created classes
        Animals genericAnimal = new Animals("Generic Animal", 5);
        Mammal mammal = new Mammal("Mammal", 5, "Brown");
        Bird bird = new Bird("Bird", 5, 10.5);
        Dog dog = new Dog("Dog", 1, "Black", "Labrador");

        // Call the makeSound() method on each instance and observe the output
        genericAnimal.makeSound();
        mammal.makeSound();
        bird.makeSound();
        dog.makeSound();

        // Display information about each animal's attributes using the toString() method
        System.out.println(genericAnimal);
        System.out.println(mammal);
        System.out.println(bird);
        System.out.println(dog);
    }
}
