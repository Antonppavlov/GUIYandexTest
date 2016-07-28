package test.task.fw.element;


import com.codeborne.selenide.SelenideElement;
import test.task.fw.element.abstacts.TypifiedElement;


public class Image extends TypifiedElement {

    public Image(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "картинка(у): '" + nameElement + "'");
    }

    public Image(SelenideElement selenideElement) {
        this(selenideElement, selenideElement.getText());
    }


    public String getSource() {
        return getSelenideElement().getAttribute("src");
    }

    public String getAlt() {
        return getSelenideElement().getAttribute("alt");
    }

}
