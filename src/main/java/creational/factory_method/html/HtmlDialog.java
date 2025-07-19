package creational.factory_method.html;

import creational.factory_method.Button;
import creational.factory_method.Dialog;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
