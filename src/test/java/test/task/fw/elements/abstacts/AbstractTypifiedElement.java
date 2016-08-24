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
        closePopUp();
        return selenideElement.hover();
    }

    @Step("Скролю к: {0}")
    protected SelenideElement scrollTo(String nameElement) {
        closePopUp();
        return selenideElement.scrollTo();
    }

    @Step("Нажимаю на: {0}")
    protected void click(String nameElement) {
        closePopUp();
        selenideElement.click();
    }

    @Step("Ввожу в: {0} текст: {1}")
    protected void sendKeys(String nameElement, String keysToSend) {
        closePopUp();
         selenideElement.sendKeys(keysToSend);
    }

    @Step("Очищаю: {0}")
    protected void clear(String nameElement) {
        closePopUp();
        selenideElement.clear();
    }


    //ПРОВЕРКИ
    @Step("{0} должен(а): {1}")
    protected SelenideElement should(String nameElement, Condition... conditions) {
        closePopUp();
        return selenideElement.should(conditions);
    }

    @Step("{0} должен(а) быть: {1}")
    protected SelenideElement shouldBe(String nameElement, Condition... conditions) {
        closePopUp();
        return selenideElement.shouldBe(conditions);
    }

    @Step("{0} должен(а) иметь: {1}")
    protected SelenideElement shouldHave(String nameElement, Condition... conditions) {
        closePopUp();
        return selenideElement.shouldHave(conditions);
    }

    @Step("{0} не должен(а):  {1}")
    protected SelenideElement shouldNot(String nameElement, Condition... conditions) {
        closePopUp();
        return selenideElement.shouldNot(conditions);
    }

    @Step("{0} должен(а) быть: {1}")
    protected SelenideElement shouldNotBe(String nameElement, Condition... conditions) {
        closePopUp();
        return selenideElement.shouldNotBe(conditions);
    }

    @Step("{0} должен(а) быть иметь: {1}")
    protected SelenideElement shouldNotHave(String nameElement, Condition... conditions) {
        closePopUp();
        return selenideElement.shouldNotHave(conditions);
    }

    //ОЖИДАНИЯ
    @Step("Ожидаю что {0} должен(а): {1}")
    protected SelenideElement waitUntil(String nameElement, Condition condition, long longMilliSeceonds) {
        closePopUp();
        return selenideElement.waitUntil(condition, longMilliSeceonds);
    }


    public SelenideElement getSelenideElement() {
        closePopUp();
        return selenideElement;
    }


    public boolean isSelected() {
        closePopUp();
        return selenideElement.isSelected();
    }

    public boolean isEnabled() {
        closePopUp();
        return selenideElement.isEnabled();
    }

    public String getText() {
        closePopUp();
        return selenideElement.getText();
    }


    public boolean isDisplayed() {
        closePopUp();
        return selenideElement.isDisplayed();
    }


    private void closePopUp() {
        if (WebDriverRunner.url().equals("http://boom-betting.com/") || WebDriverRunner.url().equals("http://boom-betting.com/index/index")) {
            for (int i = 0; i < 50; i++) {
                sleep(10);
                if ($(".reg-pop-up>.close_button").isDisplayed()) {
                    $(".reg-pop-up>.close_button").click();
                }
                return;
            }
            // TODO: 23.08.2016 этот костыль нужен для тестирования боя. А на бою выскакивает окно быстрой регистрации. этот костыль чтобы его закрывать

        }


    }

}
