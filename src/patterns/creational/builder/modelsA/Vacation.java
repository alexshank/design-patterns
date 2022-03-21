package patterns.creational.builder.modelsA;

public class Vacation {
    private String destination;
    private double cost;
    private String transportation;

    public Vacation(String destination, double cost, String transportation) {
        this.destination = destination;
        this.cost = cost;
        this.transportation = transportation;
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "destination='" + destination + '\'' +
                ", cost=" + cost +
                ", transportation='" + transportation + '\'' +
                '}';
    }
}
