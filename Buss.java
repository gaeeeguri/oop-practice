import java.util.Arrays;

public class Buss {
    private Station[] stations;
    private Station location;

    public Buss(Station[] stations, Station location) {
        this.stations = stations;
        this.location = location;
    }

    public Void start() {
        this.location = this.stations[0];

        Arrays.stream(stations).map(station -> {station.whenBussStart()});
    }
}
