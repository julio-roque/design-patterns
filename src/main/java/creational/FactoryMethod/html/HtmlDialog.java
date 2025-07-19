package creational.FactoryMethod.html;

import creational.FactoryMethod.Button;
import creational.FactoryMethod.Dialog;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
