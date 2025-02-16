package com.wipro.java.designpattern.factories;

import com.wipro.java.designpattern.buttons.Button;
import com.wipro.java.designpattern.buttons.MacOsButton;
import com.wipro.java.designpattern.checkboxes.CheckBox;
import com.wipro.java.designpattern.checkboxes.MacOsCheckBox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOsCheckBox();
    }
}
