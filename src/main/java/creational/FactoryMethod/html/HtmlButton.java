package creational.FactoryMethod.html;

import creational.FactoryMethod.Button;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>HTML Button</button>");
    }

    public void onClick() {
        System.out.println("Click! HTML Button was clicked.");
    }
}
