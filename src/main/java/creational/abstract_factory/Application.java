package creational.abstract_factory;

import creational.abstract_factory.buttons.Button;
import creational.abstract_factory.checkbox.Checkbox;
import creational.abstract_factory.factory.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
