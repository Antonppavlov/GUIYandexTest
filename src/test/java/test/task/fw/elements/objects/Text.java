package test.task.fw.elements.objects;


import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstacts.AllureElement;


public class Text extends AllureElement {

    public Text(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "текс: '" + nameElement + "'");
    }

    public Text(SelenideElement selenideElement) {
        super(selenideElement);
    }
}
