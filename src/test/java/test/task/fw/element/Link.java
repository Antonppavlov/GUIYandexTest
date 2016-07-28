package test.task.fw.element;


import com.codeborne.selenide.SelenideElement;
import test.task.fw.element.abstacts.TypifiedElement;


public class Link extends TypifiedElement {

    public Link(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "ссылка(у): '" + nameElement + "'");
    }

    public Link(SelenideElement selenideElement) {
        this(selenideElement, selenideElement.getText());
    }

    public String getReference() {
        return selenideElement.getAttribute("href");
    }
}
