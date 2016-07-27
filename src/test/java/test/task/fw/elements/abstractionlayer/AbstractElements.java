package test.task.fw.elements.abstractionlayer;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.*;

/**
 * Created by ap_pavlov on 25.04.2016.
 */
public abstract class AbstractElements {

    public final SelenideElement element;
    public final String nameElement;

    public AbstractElements(SelenideElement element, String nameElement) {
        this.nameElement = nameElement;
        this.element = element;
    }

    //ПРОВЕРКИ
    @Step("Отображается: {0}")
    protected void visible(String nameElement) {
        element.shouldHave(visible);
    }

    @Step("Не ображается: {0}")
    protected void notVisible(String nameElement) {
        element.shouldHave(not(visible));
    }

    @Step("Проверяю что у: {0} в атрибуте: {1} текст: {2}")
    protected void checkAttribute(String nameElement, String nameAttribute, String textAttribute) {
        element.shouldHave(attribute(nameAttribute, textAttribute));
    }

    //ДЕЙСТВИЯ
    @Step("Навожу мышку на: {0}")
    protected void hover(String nameElement) {
        element.hover();
    }

    @Step("Скролю к: {0}")
    protected void scrollTo(String nameElement) {
        element.scrollTo();
    }


    @Step("Возврашаю boolean доступен ли элемент")
    public boolean isDisplayed() {
        return element.isDisplayed();
    }

}
