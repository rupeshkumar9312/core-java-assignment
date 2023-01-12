package question03;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.fly();
        bird.sleep();

        WildAnimal wildAnimal = new WildAnimal();
        wildAnimal.eat();
        wildAnimal.sleep();
        wildAnimal.kill();

        Animal animal = new Bird();
        animal.eat();
        animal.sleep();

        Animal animal1 = new WildAnimal();
        animal1.sleep();
        animal1.eat();
    }
}
