package eidi.objektorientierung;

public class Car extends Vehicle implements PersonalTransport{
    private Person owner;

    public Car(Person owner) {
        this.owner = owner;
    }

    @Override
    public void move() {
        System.out.println("Driving!");
    }

    @Override
    public Person getOwner() {
        return owner;
    }
}
