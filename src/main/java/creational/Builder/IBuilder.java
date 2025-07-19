package creational.Builder;

import creational.Builder.enums.CarType;
import creational.Builder.enums.Transmission;
import creational.Builder.models.Engine;
import creational.Builder.models.GPSNavigator;
import creational.Builder.models.TripComputer;

public interface IBuilder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
