package AnimalBark;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    @Override
    public void Bark() {
        System.out.println(getName()+"喵喵喵~");
    }

}
