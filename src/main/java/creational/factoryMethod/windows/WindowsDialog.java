package creational.factoryMethod.windows;

import creational.factoryMethod.Button;
import creational.factoryMethod.Dialog;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
