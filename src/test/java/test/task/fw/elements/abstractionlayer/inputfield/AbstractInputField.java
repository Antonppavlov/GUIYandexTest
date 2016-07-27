package test.task.fw.elements.abstractionlayer.inputfield;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;
import test.task.fw.elements.abstractionlayer.active.AbstractActiveElement;


public abstract class AbstractInputField extends AbstractActiveElement {
    protected AbstractInputField(SelenideElement element, String nameElement) {
        super(element, nameElement);
    }

    @Step("Ввожу в: {0} текст: {1}")
    protected void sendKeys(String nameElement, String inputText) {
        element.sendKeys(inputText);
    }


    @Step("Очищаю: {0}")
    protected void clear(String nameElement) {
        element.clear();
    }

}
