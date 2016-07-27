package test.task.fw.elements;

import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstractionlayer.text.AbstractActiveTextElement;


public class Link extends AbstractActiveTextElement {

    public Link(SelenideElement element, String nameElement) {
        super(element, "ссылка(у): '" + nameElement + "'");
    }


    public void checkText() {
        super.checkText(nameElement, nameElement);
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
}
