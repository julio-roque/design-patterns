package creational.abstract_factory.factory;

import creational.abstract_factory.buttons.Button;
import creational.abstract_factory.buttons.WindowsButton;
import creational.abstract_factory.checkbox.Checkbox;
import creational.abstract_factory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
