package question03;

public class WildAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("eat : Wild Animal");
    }

    @Override
    public void sleep() {
        System.out.println("sleep : Wild Animal");
    }

    public void kill(){
        System.out.println("Kill : Wild Animal");
    }
}
