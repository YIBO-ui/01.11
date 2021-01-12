package AnimalBark;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }
    @Override
    public void Bark() {
        System.out.println(getName()+"汪汪汪~");
    }
}
