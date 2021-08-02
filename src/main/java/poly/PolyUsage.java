package poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle otherBus = new OtherBus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{otherBus, plane, train};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            System.out.println("Пассажиров - " + vehicle.passengers());
        }
    }
}
