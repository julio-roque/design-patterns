package creational.FactoryMethod.windows;

import creational.FactoryMethod.Button;
import creational.FactoryMethod.Dialog;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
