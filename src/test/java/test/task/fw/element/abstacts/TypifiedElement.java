package test.task.fw.element.abstacts;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;

import java.util.List;


public abstract class TypifiedElement extends AbstractTypifiedElement {

    protected TypifiedElement(SelenideElement selenideElement, String nameElement) {
        super(selenideElement, nameElement);
    }


    public void hover() {
        super.hover(nameElement);
    }


    public void scrollTo() {
        super.scrollTo(nameElement);
    }


    public void click() {
        super.click(nameElement);
    }


    public void sendKeys(CharSequence... keysToSend) {
        super.sendKeys(nameElement, keysToSend);
    }


    public void clear() {
        super.clear(nameElement);
    }


    public void visible() {
        super.visible(nameElement);
    }


    public void notVisible() {
        super.notVisible(nameElement);
    }


    public void checkAttribute(String nameAttribute, String textAttribute) {
        super.checkAttribute(nameElement, nameAttribute, textAttribute);
    }


    public void checkText(String textElement) {
        super.checkText(nameElement, textElement);
    }


    public void enabled() {
        super.enabled(nameElement);
    }


    public void disabled() {
        super.disabled(nameElement);
    }


    public String toString() {
        return super.toString(nameElement);
    }


    public SelenideElement getSelenideElement() {
        return super.getSelenideElement(nameElement);
    }


    public String getTagName() {
        return super.getTagName(nameElement);
    }


    public String getAttribute(String name) {
        return super.getAttribute(nameElement, name);
    }


    public boolean isSelected() {
        return super.isSelected(nameElement);
    }


    public boolean isEnabled() {
        return super.isEnabled(nameElement);
    }


    public String getText() {
        return super.getText(nameElement);
    }


    public List<SelenideElement> $$(By by) {
        return super.$$(nameElement, by);
    }


    public SelenideElement $( By by) {
        return super.$(nameElement, by);
    }


    public boolean isDisplayed() {
        return super.isDisplayed(nameElement);
    }


    public Point getLocation() {
        return super.getLocation(nameElement);
    }


    public Dimension getSize() {
        return super.getSize(nameElement);
    }


    public Rectangle getRect() {
        return super.getRect(nameElement);
    }


    public String getCssValue(String propertyName) {
        return super.getCssValue(nameElement, propertyName);
    }
}
