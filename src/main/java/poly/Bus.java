package poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус движется по трассе");
    }

    @Override
    public void passengers(int countPassengers) {
        System.out.println("Количество пасажиров - " + countPassengers);
    }

    @Override
    public double price(double countRefuel) {
        return countRefuel / 10;     // например, вычисляем цену билета :)
    }
}
