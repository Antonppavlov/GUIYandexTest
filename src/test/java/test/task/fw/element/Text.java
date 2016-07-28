package test.task.fw.element;


import com.codeborne.selenide.SelenideElement;
import test.task.fw.element.abstacts.TypifiedElement;


public class Text extends TypifiedElement {

    public Text(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "текст '"+nameElement+"'");
    }

    public Text(SelenideElement selenideElement) {
        this(selenideElement, selenideElement.getText());
    }
}
