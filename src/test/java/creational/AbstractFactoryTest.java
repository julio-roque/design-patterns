package creational;

import creational.abstract_factory.Application;
import creational.abstract_factory.factory.GUIFactory;
import creational.abstract_factory.factory.MacOSFactory;
import creational.abstract_factory.factory.WindowsFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Abstract Factory Pattern")
public class AbstractFactoryTest {
    Application application;
    GUIFactory factory;

    @Test
    @DisplayName("Test Abstract Factory Pattern")
    public void testMacOSAbstractFactory() {
        factory = new MacOSFactory();
        Assertions.assertNotNull(factory, "Factory should not be null");
        application = new Application(factory);
        Assertions.assertNotNull(application, "Application should not be null");
        application.paint();
    }

    @Test
    @DisplayName("Test Abstract Factory Pattern with Windows")
    public void testWindowsAbstractFactory() {
        factory = new WindowsFactory();
        Assertions.assertNotNull(factory, "Factory should not be null");
        application = new Application(factory);
        Assertions.assertNotNull(application, "Application should not be null");
        application.paint();
    }

}
