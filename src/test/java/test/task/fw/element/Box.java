package test.task.fw.element;

import com.codeborne.selenide.SelenideElement;
import test.task.fw.element.abstacts.TypifiedElement;

/**
 * Created by Антон on 28.07.2016.
 */
public class Box extends TypifiedElement {

    public Box(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "чек бокс: '" + nameElement + "'");
    }

    public Box(SelenideElement selenideElement) {
        this(selenideElement, selenideElement.getText());
    }
}
