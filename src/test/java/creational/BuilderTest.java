package creational;

import creational.builder.models.Car;
import creational.builder.builders.CarBuilder;
import creational.builder.models.Director;
import creational.builder.enums.CarType;
import creational.builder.enums.Transmission;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Builder Design Pattern Test")
class BuilderTest {

    private static Director director;

    @BeforeEach
    void setUp() {
        director = new Director();
    }

    @Test
    @DisplayName("Test for Sport Cars Builder")
    void builderSportCarTest() {
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        Assertions.assertNotNull(car, "Car should not be null");
        Assertions.assertEquals(CarType.SPORTS_CAR, car.getCarType(), "Car type should be Sport Car");
        Assertions.assertEquals(2, car.getSeats(), "Car should have 2 seats");
        Assertions.assertNotNull(car.getEngine(), "Car engine should not be null");
        Assertions.assertEquals(Transmission.SEMI_AUTOMATIC, car.getTransmission(), "Transmission should be SEMI_AUTOMATIC");
        Assertions.assertEquals(3.0, car.getEngine().getVolume(), "Car engine volume should be 3.0");
        Assertions.assertEquals(0, car.getEngine().getMileage(), "Car engine mileage should be 0");
    }

    @Test
    @DisplayName("Test for City Cars Builder")
    void builderCityCarTest() {
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);
        Car car = builder.getResult();
        Assertions.assertNotNull(car, "Car should not be null");
        Assertions.assertEquals(CarType.CITY_CAR, car.getCarType(), "Car type should be City Car");
        Assertions.assertEquals(2, car.getSeats(), "Car should have 2 seats");
        Assertions.assertNotNull(car.getEngine(), "Car engine should not be null");
        Assertions.assertEquals(Transmission.AUTOMATIC, car.getTransmission(), "Transmission should be AUTOMATIC");
        Assertions.assertEquals(1.2, car.getEngine().getVolume(), "Car engine volume should be 1.2");
        Assertions.assertEquals(0, car.getEngine().getMileage(), "Car engine mileage should be 0");
    }

    @Test
    @DisplayName("Test for SUV Cars Builder")
    void builderSUVTest() {
        CarBuilder builder = new CarBuilder();
        director.constructSUV(builder);
        Car car = builder.getResult();
        Assertions.assertNotNull(car, "Car should not be null");
        Assertions.assertEquals(CarType.SUV, car.getCarType(), "Car type should be SUV");
        Assertions.assertEquals(4, car.getSeats(), "Car should have 4 seats");
        Assertions.assertNotNull(car.getEngine(), "Car engine should not be null");
        Assertions.assertEquals(Transmission.MANUAL, car.getTransmission(), "Transmission should be MANUAL");
        Assertions.assertEquals(2.5, car.getEngine().getVolume(), "Car engine volume should be 2.5");
        Assertions.assertEquals(0, car.getEngine().getMileage(), "Car engine mileage should be 0");
    }

}
