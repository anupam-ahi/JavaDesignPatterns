package org.example.abstractFactory.ButtonApp;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
