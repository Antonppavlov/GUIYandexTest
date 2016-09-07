package test.task.fw.elements.abstacts;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by Антон on 28.07.2016.
 */
public abstract class AbstractTypifiedElement {

    protected final SelenideElement selenideElement;

    public AbstractTypifiedElement(SelenideElement selenideElement) {
        this.selenideElement = selenideElement;
    }


    //ДЕЙСТВИЯ
    @Step("Навожу мышку на: {0}")
    protected SelenideElement hover(String nameElement) {
        return selenideElement.hover();
    }

    @Step("Скролю к: {0}")
    protected SelenideElement scrollTo(String nameElement) {
        return selenideElement.scrollTo();
    }

    @Step("Нажимаю на: {0}")
    protected void click(String nameElement) {
        selenideElement.click();
    }

    @Step("Ввожу в: {0} текст: {1}")
    protected void sendKeys(String nameElement, String keysToSend) {
        selenideElement.sendKeys(keysToSend);
    }

    @Step("Очищаю: {0}")
    protected void clear(String nameElement) {
        selenideElement.clear();
    }


    //ПРОВЕРКИ
    @Step("{0} должен(а): {1}")
    protected SelenideElement should(String nameElement, Condition... conditions) {
        return selenideElement.should(conditions);
    }

    @Step("{0} должен(а) быть: {1}")
    protected SelenideElement shouldBe(String nameElement, Condition... conditions) {
        return selenideElement.shouldBe(conditions);
    }

    @Step("{0} должен(а) иметь: {1}")
    protected SelenideElement shouldHave(String nameElement, Condition... conditions) {
        return selenideElement.shouldHave(conditions);
    }

    @Step("{0} не должен(а):  {1}")
    protected SelenideElement shouldNot(String nameElement, Condition... conditions) {
        return selenideElement.shouldNot(conditions);
    }

    @Step("{0} должен(а) быть: {1}")
    protected SelenideElement shouldNotBe(String nameElement, Condition... conditions) {
        return selenideElement.shouldNotBe(conditions);
    }

    @Step("{0} должен(а) быть иметь: {1}")
    protected SelenideElement shouldNotHave(String nameElement, Condition... conditions) {
        return selenideElement.shouldNotHave(conditions);
    }

    //ОЖИДАНИЯ
    @Step("Ожидаю что {0} должен(а): {1}")
    protected SelenideElement waitUntil(String nameElement, Condition condition, long longMilliSeceonds) {
        return selenideElement.waitUntil(condition, longMilliSeceonds);
    }


    public SelenideElement getSelenideElement() {
        return selenideElement;
    }


    public boolean isSelected() {
        return selenideElement.isSelected();
    }

    public boolean isEnabled() {
        return selenideElement.isEnabled();
    }

    public String getText() {
        return selenideElement.getText();
    }


    public boolean isDisplayed() {
        return selenideElement.isDisplayed();
    }


}
