import java.util.Arrays;

public class Station {
    private String name;
    private Passenger[] passengers;
    private Alert alert;


    public Station(String name, Passenger[] passengers) {
        this.name = name;
        this.passengers = passengers;
        this.alert = new Alert();
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    private void sendAlert(Passenger[] passengers) {
        System.out.println(this.name);
        Arrays.stream(passengers).forEach(passenger -> alert.alert(passenger));
    }

    public void whenBussStart() {
        this.sendAlert(this.passengers);
    }
}
