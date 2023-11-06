package designpatters.abstractFactory.guiFactory;

import designpatters.abstractFactory.button.IButton;
import designpatters.abstractFactory.textBox.ITextBox;

public interface OperatingSystem {
    IButton createButton();

    ITextBox createTextBox();
}