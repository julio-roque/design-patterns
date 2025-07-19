package creational.factoryMethod.html;

import creational.factoryMethod.Button;
import creational.factoryMethod.Dialog;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
