package test.task.fw.blocks;

import com.codeborne.selenide.SelenideElement;
import test.task.fw.element.Link;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CatalogMenu {
    private final Link mobileDevices;

    public CatalogMenu() {
        SelenideElement parent = $(".catalog-menu__list", 0);
        this.mobileDevices = new Link(parent.$$(".link").find(text("Мобильные телефоны")));
    }

    public Link getLinkMobileDevices() {
        return mobileDevices;
    }
}
