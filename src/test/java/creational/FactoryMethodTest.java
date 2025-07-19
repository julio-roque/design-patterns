package creational;

import creational.FactoryMethod.Dialog;
import creational.FactoryMethod.html.HtmlDialog;
import creational.FactoryMethod.windows.WindowsDialog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

@DisplayName("Factory Method Pattern Test")
public class FactoryMethodTest {
    private static Dialog dialog;
    private String environment;
    Robot robot;

    @BeforeEach
    public void setUp() {
        Assertions.assertDoesNotThrow(() -> {
            robot = new Robot();
        }, "Robot initialization should not throw an exception");

        environment = System.getProperty("os.name").toLowerCase();
        if (environment.contains("win")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    @Test
    @DisplayName("Test Windows Dialog Creation")
    public void testWindowsDialogCreation() {
        dialog = new WindowsDialog();
        dialog.renderWindow();
        Assertions.assertNotNull(dialog.getButton(), "Button should not be null after rendering the window");
        dialog.onButtonClick();
    }

    @Test
    @DisplayName("Test HTML Dialog Creation")
    public void testHtmlDialogCreation() {
        dialog = new HtmlDialog();
        dialog.renderWindow();
        Assertions.assertNotNull(dialog.getButton(), "Button should not be null after rendering the window");
        dialog.onButtonClick();


    }
}
