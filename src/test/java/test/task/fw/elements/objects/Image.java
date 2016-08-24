package test.task.fw.elements.objects;


import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstacts.AllureElement;


public class Image extends AllureElement {

    public Image(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "картина(у): '" + nameElement + "'");
    }

    public Image(SelenideElement selenideElement) {
        super(selenideElement);
    }

    public String getSource() {
        return getSelenideElement().getAttribute("src");
    }

    public String getAlt() {
        return getSelenideElement().getAttribute("alt");
    }

}
