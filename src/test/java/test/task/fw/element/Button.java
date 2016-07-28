package test.task.fw.element;


import com.codeborne.selenide.SelenideElement;
import test.task.fw.element.abstacts.TypifiedElement;


public class Button extends TypifiedElement {

    public Button(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "кнопка(у): '" + nameElement + "'");
    }

    public Button(SelenideElement selenideElement) {
        this(selenideElement, selenideElement.getText());
    }
}
