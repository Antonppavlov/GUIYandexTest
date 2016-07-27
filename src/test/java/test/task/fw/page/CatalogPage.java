package test.task.fw.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;
import test.task.fw.elements.Link;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CatalogPage {

    private final Link electronics;

    public CatalogPage() {
        SelenideElement parent = $(".tabs-panes.box.i-bem");
        this.electronics = new Link(parent.$$(".title.title_size_18").find(text("Электроника")), "Электроника");
    }

    public void checkCatalogs() {
        checkCatalog("Популярные товары");
        checkCatalog("Статьи и подборки");
    }


    @Step("Проверяю что представлен блок: {0}")
    private void checkCatalog(String textCatalog) {
        SelenideElement catalog = $$(".title_indent_bottom>text").findBy(text(textCatalog));
        catalog.shouldHave(Condition.visible);
    }

    public Link getLinkElectronics() {
        return electronics;
    }
}
