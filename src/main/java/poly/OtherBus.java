package poly;

public class OtherBus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам.");
    }

    @Override
    public int passengers() {
        return 50;
    }
}
