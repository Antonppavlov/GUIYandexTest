package test.task.fw.elements.objects;


import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstacts.AllureElement;

/**
 * Created by Антон on 28.07.2016.
 */
public class Box extends AllureElement {

    protected Box(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, "бокс: '" + nameElement + "'");
    }

    public Box(SelenideElement selenideElement) {
        super(selenideElement);
    }
}
