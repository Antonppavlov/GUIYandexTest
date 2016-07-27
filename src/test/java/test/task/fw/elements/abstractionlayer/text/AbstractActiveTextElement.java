package test.task.fw.elements.abstractionlayer.text;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;
import test.task.fw.elements.abstractionlayer.active.AbstractActiveElement;


public abstract class AbstractActiveTextElement extends AbstractActiveElement {

    protected AbstractActiveTextElement(SelenideElement element, String nameElement) {
        super(element, nameElement);
    }

    @Step("Проверяю что текст {0} = {1}")
    protected void checkText(String nameElement, String textElement) {
        element.shouldHave(Condition.text(textElement));
    }

    public String getText() {
        return element.getText();
    }
}
