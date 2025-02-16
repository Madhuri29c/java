package com.wipro.java.designpattern.checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkBox.
 */
public class WindowsCheckbox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}