package question03;

public class Bird extends Animal
{
    @Override
    public void eat() {
        System.out.println("Eat : Bird");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep : Bird");
    }

    public void fly(){
        System.out.println("fly : Bird");
    }
}
