package test.task.fw.elements.objects;


import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstacts.AllureElement;


public class Link extends AllureElement {

    public Link(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "ссылку: '" + nameElement + "'");
    }

    public Link(SelenideElement selenideElement) {
        super(selenideElement);
    }

    public String getReference() {
        return selenideElement.getAttribute("href");
    }
}
