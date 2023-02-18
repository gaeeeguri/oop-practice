public class Test {
    public static void main(String[] args) {
        Passenger passenger_1 = new Passenger("passenger_1");
        Passenger passenger_2 = new Passenger("passenger_2");
        Passenger passenger_3 = new Passenger("passenger_3");
        Passenger passenger_4 = new Passenger("passenger_4");
        Passenger passenger_5 = new Passenger("passenger_5");

        Station station_1 = new Station("station_1", new Passenger[]{passenger_1, passenger_2});
        Station station_2 = new Station("station_2", new Passenger[]{passenger_3, passenger_4});
        Station station_3 = new Station("station_3", new Passenger[]{passenger_5});

        Buss buss = new Buss(new Station[] {station_1, station_2, station_3});

        buss.start();

    }
}
