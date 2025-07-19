package creational.FactoryMethod;

public abstract class Dialog {
    private Button button;

    public void renderWindow() {
        button = createButton();
        button.render();
    }

    public Button getButton() {
        return button;
    }

    public void onButtonClick() {
        if (button == null) {
            throw new IllegalStateException("Button is not created. Call renderWindow() first.");
        }
        button.onClick();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
