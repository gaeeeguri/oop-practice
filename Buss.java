import java.util.Arrays;

public class Buss {
    private Station[] stations;
    private Station currentStation;

    public Buss(Station[] stations) {
        this.stations = stations;
        this.currentStation = null;
    }

    private void setCurrentStation(Station currentStation) {
        this.currentStation = currentStation;
    }

    public void start() {
        this.setCurrentStation(this.stations[0]);
        Arrays.stream(stations).forEach(Station::whenBussStart);
    }
}
