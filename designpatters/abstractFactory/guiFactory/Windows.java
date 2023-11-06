package designpatters.abstractFactory.guiFactory;

import designpatters.abstractFactory.button.IButton;
import designpatters.abstractFactory.button.MacButton;
import designpatters.abstractFactory.button.WindowsButton;
import designpatters.abstractFactory.textBox.ITextBox;
import designpatters.abstractFactory.textBox.MacTextBox;
import designpatters.abstractFactory.textBox.WindowsTextBox;

public class Windows implements OperatingSystem{

    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WindowsTextBox();
    }
}
