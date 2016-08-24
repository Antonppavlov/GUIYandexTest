package test.task.fw.blocks;

import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstacts.AllureElement;
import test.task.fw.elements.objects.Link;

import static com.codeborne.selenide.Selenide.$;

public class HeadLineBanner {

    private final AllureElement linkShowcase;
    private final AllureElement linkCatalog;

    public HeadLineBanner() {
        SelenideElement parent = $(".headline");

        this.linkShowcase = new Link(parent.$(".main-tabs__text", 0));
        this.linkCatalog = new Link(parent.$(".main-tabs__text", 1));
    }

    public AllureElement getLinkShowcase() {
        return linkShowcase;
    }

    public AllureElement getLinkCatalog() {
        return linkCatalog;
    }

}
