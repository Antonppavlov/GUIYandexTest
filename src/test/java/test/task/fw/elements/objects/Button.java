package test.task.fw.elements.objects;


import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstacts.AllureElement;


public class Button extends AllureElement {

    public Button(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "кнопка(у) :" + nameElement + "'");
    }

    public Button(SelenideElement selenideElement) {
        super(selenideElement);
    }
}
