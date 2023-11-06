package designpatters.abstractFactory;

import designpatters.abstractFactory.button.IButton;
import designpatters.abstractFactory.guiFactory.GUIFactory;
import designpatters.abstractFactory.guiFactory.OperatingSystem;
import designpatters.abstractFactory.textBox.ITextBox;

public class Client {
    public static void main(String[] args) {
        GUIFactory guiFactory = new GUIFactory();
        OperatingSystem mac = guiFactory.getOperatingSystem("MAC");
        IButton macBtn = mac.createButton();
        ITextBox macTB = mac.createTextBox();

        macBtn.press();
        macTB.showText();

        OperatingSystem windows = guiFactory.getOperatingSystem("WINDOWS");
        IButton windowsBtn = windows.createButton();
        ITextBox windowsTB = windows.createTextBox();

        windowsBtn.press();
        windowsTB.showText();
    }
}
