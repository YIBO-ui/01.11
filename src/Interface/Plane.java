package Interface;

public class Plane implements Fly{
    @Override
    public void fly() {
        System.out.println("燃烧煤油,向前推进，产生福浮力");
    }
}
