package test.task.fw.blocks;

import com.codeborne.selenide.SelenideElement;
import test.task.fw.element.Link;

import static com.codeborne.selenide.Selenide.$;

public class HeadLineBanner {

    private final Link linkShowcase;
    private final Link linkCatalog;

    public HeadLineBanner() {
        SelenideElement parent = $(".headline");

        this.linkShowcase = new Link(parent.$(".main-tabs__text", 0));
        this.linkCatalog = new Link(parent.$(".main-tabs__text", 1));
    }

    public Link getLinkShowcase() {
        return linkShowcase;
    }

    public Link getLinkCatalog() {
        return linkCatalog;
    }

}
