package test.task.fw.element;


import com.codeborne.selenide.SelenideElement;
import test.task.fw.element.abstacts.TypifiedElement;


public class InputField extends TypifiedElement {
    public InputField(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "поле ввода: '" + nameElement + "'");
    }
    public InputField(SelenideElement selenideElement) {
        super(selenideElement, selenideElement.getText());
    }
}
