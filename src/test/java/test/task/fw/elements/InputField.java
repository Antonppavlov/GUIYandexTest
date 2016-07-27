package test.task.fw.elements;

import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstractionlayer.inputfield.AbstractInputField;

/**
 * Created by ap_pavlov on 25.04.2016.
 */
public class InputField extends AbstractInputField {

    public InputField(SelenideElement element, String nameElement) {
        super(element, "поле для ввода: '" + nameElement + "'");
    }

    public void enabled() {
        super.enabled(nameElement);
    }

    public void disabled() {
        super.disabled(nameElement);
    }

    public void click() {
        super.click(nameElement);
    }

    public void visible() {
        super.visible(nameElement);
    }

    public void notVisible() {
        super.notVisible(nameElement);
    }

    public void checkAttribute(String nameAttribute, String textAttribute) {
        super.checkAttribute(nameElement, nameAttribute, textAttribute);
    }

    public void hover() {
        super.hover(nameElement);
    }

    public void sendKeys(String inputText) {
        super.sendKeys(nameElement, inputText);
    }


    public void clear() {
        super.clear(nameElement);
    }

    public void scrollTo() {
        super.scrollTo(nameElement);
    }
}
