package creational.abstract_factory.factory;

import creational.abstract_factory.buttons.Button;
import creational.abstract_factory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
