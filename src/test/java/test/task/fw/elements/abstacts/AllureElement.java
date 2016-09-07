package test.task.fw.elements.abstacts;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.sleep;


public class AllureElement extends AbstractTypifiedElement {

    private String nameElement = null;


    public AllureElement(SelenideElement selenideElement, String nameElement) {
        super(selenideElement);
        this.nameElement = nameElement;
    }

    public AllureElement(SelenideElement selenideElement) {
        super(selenideElement);
    }

    public void hover() {
        super.hover(getNameElement());
    }


    public void scrollTo() {
        super.scrollTo(getNameElement());
    }


    public void click() {
        super.shouldHave(getNameElement(), Condition.enabled);
        super.click(getNameElement());
    }


    public void sendKeys(String keysToSend) {
        super.shouldHave(getNameElement(), Condition.enabled);
        super.sendKeys(getNameElement(), keysToSend);
    }


    public void clear() {
        super.shouldHave(getNameElement(), Condition.enabled);
        super.clear(getNameElement());
    }


    public SelenideElement should(Condition... conditions) {
        return super.should(getNameElement(), conditions);
    }


    public SelenideElement shouldBe(Condition... conditions) {
        return super.shouldBe(getNameElement(), conditions);
    }


    public SelenideElement shouldHave(Condition... conditions) {
        return super.shouldHave(getNameElement(), conditions);
    }


    public SelenideElement shouldNot(Condition... conditions) {
        return super.shouldNot(getNameElement(), conditions);
    }


    public SelenideElement shouldNotBe(Condition... conditions) {
        return super.shouldNotBe(getNameElement(), conditions);
    }


    public SelenideElement shouldNotHave(Condition... conditions) {
        return super.shouldNotHave(getNameElement(), conditions);
    }


    public SelenideElement waitUntil(Condition condition, long longMilliSeceonds) {
        return super.waitUntil(getNameElement(), condition, longMilliSeceonds);
    }


    private String getNameElement() {
        if (nameElement == null) {
            nameElement = "element: '" + selenideElement.getText() + "'";
        }
        return nameElement;
    }

 


}
