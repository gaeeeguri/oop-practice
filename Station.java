public class Station {
    private Passenger[] passengers;

    public Station(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    private Void sendAlert(Passenger[] passengers) {

    }

    public void whenBussStart() {
        this.sendAlert(this.passengers);
    }
}
