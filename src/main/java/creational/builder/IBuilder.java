package creational.builder;

import creational.builder.enums.CarType;
import creational.builder.enums.Transmission;
import creational.builder.models.Engine;
import creational.builder.models.GPSNavigator;
import creational.builder.models.TripComputer;

public interface IBuilder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
