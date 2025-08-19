package creational.factory_method.windows;

import creational.factory_method.Button;
import creational.factory_method.Dialog;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
