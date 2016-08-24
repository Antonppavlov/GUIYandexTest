package test.task.fw.page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;
import test.task.fw.elements.abstacts.AllureElement;
import test.task.fw.elements.objects.Link;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MobileDevicesPage {

    private final AllureElement advancedSearch;

    public MobileDevicesPage() {
        SelenideElement parent = $(".searchParams");
        this.advancedSearch = new Link(parent.$(".black"));
    }

    @Step("Проверяю что в категории {0}, {1} девайса")
    public void checkCategories(String categories, int devices) {
        $$(".top-3-models").find(Condition.text(categories)).$$(".top-3-models__model").shouldHave(CollectionCondition.size(devices));
    }


    public AllureElement getAdvancedSearch() {
        return advancedSearch;
    }
}
