package designpatters.abstractFactory.guiFactory;

import designpatters.abstractFactory.button.IButton;
import designpatters.abstractFactory.button.MacButton;
import designpatters.abstractFactory.textBox.ITextBox;
import designpatters.abstractFactory.textBox.MacTextBox;

public class MAC implements OperatingSystem{
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }
}
