package test.task.fw.element.abstacts;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;

import static com.codeborne.selenide.Condition.*;

/**
 * Created by Антон on 28.07.2016.
 */
public abstract class AbstractTypifiedElement {

    protected final SelenideElement selenideElement;
    protected final String nameElement;

    protected AbstractTypifiedElement(SelenideElement selenideElement, String nameElement) {
        this.nameElement = nameElement;
        this.selenideElement = selenideElement;
    }

    //ДЕЙСТВИЯ
    @Step("Навожу мышку на: {0}")
    protected void hover(String nameElement) {
        selenideElement.hover();
    }

    @Step("Скролю к: {0}")
    protected void scrollTo(String nameElement) {
        selenideElement.scrollTo();
    }

    @Step("Нажимаю на: {0}")
    protected void click(String nameElement) {
        selenideElement.click();
    }

    @Step("Ввожу в: {0} текст: {1}")
    protected void sendKeys(String nameElement, CharSequence... keysToSend) {
        selenideElement.sendKeys(keysToSend);
    }

    @Step("Очищаю: {0}")
    protected void clear(String nameElement) {
        selenideElement.clear();
    }


    //ПРОВЕРКИ
    @Step("Отображается: {0}")
    protected void visible(String nameElement) {
        selenideElement.shouldHave(visible);
    }

    @Step("Не ображается: {0}")
    protected void notVisible(String nameElement) {
        selenideElement.shouldHave(not(visible));
    }

    @Step("Проверяю что в: {0} в атрибуте: {1} текст: {2}")
    protected void checkAttribute(String nameElement, String nameAttribute, String textAttribute) {
        selenideElement.shouldHave(attribute(nameAttribute, textAttribute));
    }

    @Step("Проверяю что текст {0} = {1}")
    protected void checkText(String nameElement, String textElement) {
        selenideElement.shouldHave(Condition.text(textElement));
    }

    @Step("Доступна: {0}")
    protected void enabled(String nameElement) {
        selenideElement.shouldHave(Condition.enabled);
    }

    @Step("Не доступна: {0}")
    protected void disabled(String nameElement) {
        selenideElement.shouldHave(Condition.disabled);
    }


    //ГЕТЕРЫ
    protected String toString(String nameElement) {
        return selenideElement.toString();
    }

    protected SelenideElement getSelenideElement(String nameElement) {
        return selenideElement;
    }

    protected String getTagName(String nameElement) {
        return selenideElement.getTagName();
    }

    protected String getAttribute(String nameElement, String name) {
        return selenideElement.getAttribute(name);
    }

    protected boolean isSelected(String nameElement) {
        return selenideElement.isSelected();
    }

    protected boolean isEnabled(String nameElement) {
        return selenideElement.isEnabled();
    }

    protected String getText(String nameElement) {
        return selenideElement.getText();
    }

    protected List<SelenideElement> $$(String nameElement, By by) {
        return selenideElement.$$(by);
    }

    protected SelenideElement $(String nameElement, By by) {
        return selenideElement.$(by);
    }

    protected boolean isDisplayed(String nameElement) {
        return selenideElement.isDisplayed();
    }

    protected Point getLocation(String nameElement) {
        return selenideElement.getLocation();
    }

    protected Dimension getSize(String nameElement) {
        return selenideElement.getSize();
    }

    protected Rectangle getRect(String nameElement) {
        return selenideElement.getRect();
    }

    protected String getCssValue(String nameElement, String propertyName) {
        return selenideElement.getCssValue(propertyName);
    }
}
