package structural.bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Bridge Design Pattern")
class BridgeTest {
    Tv tv;
    Radio radio;
    BasicRemote basicRemote;
    AdvancedRemote advancedRemote;

    @BeforeEach
    void setUp() {
        tv = new Tv();
        radio = new Radio();
    }

    @Test
    @DisplayName("Test tv")
    void testTv() {
        this.testDevice(tv);
    }

    @Test
    @DisplayName("Test radio")
    void testRadio() {
        this.testDevice(radio);
    }

    public void testDevice(Device device) {

        if (device instanceof Tv)
            Assertions.assertInstanceOf(Tv.class, device, "The device should be a Tv");
        if (device instanceof Radio)
            Assertions.assertInstanceOf(Radio.class, device, "The device should be a Radio");

        basicRemote = new BasicRemote(device);
        basicRemote.power();
        Assertions.assertTrue(device.isEnabled(), "The device must be enable");
        Assertions.assertEquals(30, device.getVolume(), "The device must be volume in 30%");

        advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        Assertions.assertFalse(device.isEnabled(), "The device must be disable");
        advancedRemote.mute();
        Assertions.assertEquals(0, device.getVolume(), "The device must be volume in 0%");


        device.printStatus();
    }
}
