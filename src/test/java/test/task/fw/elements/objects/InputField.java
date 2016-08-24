package test.task.fw.elements.objects;


import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstacts.AllureElement;


public class InputField extends AllureElement {
    public InputField(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "поле для ввода: '" + nameElement + "'");
    }

    public InputField(SelenideElement selenideElement) {
        super(selenideElement);
    }
}
