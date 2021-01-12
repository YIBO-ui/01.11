package Interface;

public class Bird implements Fly {
    @Override
    public void fly() {
        System.out.println("挥舞翅膀");
    }
}
