package creational.factory_method.html;

import creational.factory_method.Button;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>HTML Button</button>");
    }

    public void onClick() {
        System.out.println("Click! HTML Button was clicked.");
    }
}
