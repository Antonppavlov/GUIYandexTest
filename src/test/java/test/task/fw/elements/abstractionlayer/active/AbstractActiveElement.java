package test.task.fw.elements.abstractionlayer.active;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;
import test.task.fw.elements.abstractionlayer.AbstractElements;

/**
 * Created by ap_pavlov on 25.04.2016.
 */
public abstract class AbstractActiveElement extends AbstractElements {

    protected AbstractActiveElement(SelenideElement element, String nameElement) {
        super(element, nameElement);
    }

    //ПРОВЕРКИ
    @Step("Доступна: {0}")
    protected void enabled(String nameElement) {
        element.shouldHave(Condition.enabled);
    }

    @Step("Не доступна: {0}")
    protected void disabled(String nameElement) {
        element.shouldHave(Condition.disabled);
    }

    //Действия
    @Step("Нажимаю на: {0}")
    protected void click(String nameElement) {
        super.visible(nameElement);
        enabled(nameElement);
        hover(nameElement);
        element.click();
    }


}
