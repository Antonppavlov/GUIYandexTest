package test.task.test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.util.*;
import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

@Ignore
@Features("Yandex Market")
@Stories("Мобильные устройства")
@Title("Черновой вариант теста")
public class YandexTest {

    private static Logger log = Logger.getLogger(YandexTest.class.getName());


    @Title("Черновой вариант теста")
    @Test
    public void yandexTest1() {
        //Перейти по адресу https://market.yandex.ru/
                open("https://market.yandex.ru/");
        //Осуществлен переход на https://market.yandex.ru/
                Assert.assertEquals("Яндекс.Маркет — выбор и покупка товаров из проверенных интернет-магазинов",title());
        //Нажать по ссылке "Каталог"
                $$(".main-tabs__text").find(Condition.text("Каталог")).click();
        //Открыт "Каталог", представлены блоки: основные категории товаров, "Популярные товары", "Вас также могут заинтересовать", "Вы смотрели"
                Assert.assertEquals(url(),"https://market.yandex.ru/?tab=catalog");
                $(".tabs-panes.box").shouldHave(Condition.visible);
                $(".at-mbo-src-bestsellermodels").shouldHave(Condition.visible);
                $$(".button").find(Condition.text("Показать ещё")).scrollTo();
                $(".box.flex-grid").shouldHave(Condition.visible);
        //Перейти по в раздел "Электроника" -> "Мобильные телефоны"
                $$(".title.title_size_18").find(Condition.text("Электроника")).click();
                $$("[href*='catalogmodels']").find(Condition.text("Мобильные телефоны")).click();
        //Открыт раздел "Мобильные телефоны", в категории "Популярные" и "Новинки" представлены 3 девайса
                ElementsCollection popularAndNew = $$(".top-3-models");
                Assert.assertEquals(title(),"Мобильные телефоны - выбирайте и покупайте на Яндекс.Маркете");
                popularAndNew.find(Condition.text("Популярные")).$$(".top-3-models__model").shouldHave(CollectionCondition.size(3));
                popularAndNew.find(Condition.text("Новинки")).$$(".top-3-models__model").shouldHave(CollectionCondition.size(3));
        //Нажать по "расширенный поиск" блока выбора по параметрам
                $$(".black").find(Condition.text("Расширенный поиск")).click();
        //Представлен раздел "Мобильные телефоны", справа доступен блок параметров
                Assert.assertEquals(title(),"Мобильные телефоны — купить на Яндекс.Маркете");
                $(".filter-panel-aside__content").shouldHave(Condition.visible);
        //Ввести Цену, руб. "от" значение 5125
                $("#gf-pricefrom-var").sendKeys("5125");
        //Значение успешно проставлено в поле
                $("#gf-pricefrom-var").shouldHave(Condition.value("5125"));
        //Ввести Цену, руб. "до" значение 10123
                $("#gf-priceto-var").sendKeys("10123");
        //Значение успешно проставлено в поле
                $("#gf-priceto-var").shouldHave(Condition.value("10123"));

        //Кликнуть на чекбокс "В продаже"
                ElementsCollection collectionCheckBox = $$(".checkbox__label");
                SelenideElement checkBox = collectionCheckBox.find(Condition.text("В продаже"));
                if (!checkBox.parent().$("[type='checkbox']").isSelected()) {
                    checkBox.click();
                }
        //Значение чекбокса установлено на "Выбрано"
        checkBox.parent().$("[type='checkbox']").shouldHave(Condition.selected);


                $(".spin2.spin2_size_s.spin2_progress_yes").waitUntil(Condition.not(Condition.visible), 10000);

         //Кликнуть на селектбокс "Android"
                SelenideElement checkBoxAndroid = collectionCheckBox.find(Condition.text("Android"));
                if (!checkBoxAndroid.parent().$("[type='checkbox']").isSelected()) {
                    checkBoxAndroid.click();
                }
        //Значение селектбокса установлено на "Выбрано"
        checkBoxAndroid.parent().$("[type='checkbox']").shouldHave(Condition.selected);

                $(".spin2.spin2_size_s.spin2_progress_yes").waitUntil(Condition.not(Condition.visible), 10000);

        //Случано выбрать 3 устройства из представленных на странице,
        //имеющих рейтинг от "3,5" до "4,5",
        //и вывести в лог информацию в формате "номер девайса на странице - наименование девайса - стоимость девайса (от-до)"
                Map<Integer, SelenideElement> hashMap = new HashMap<>();
                ElementsCollection elementsCollection = $$(".snippet-card");

                for (int i = 0; i < elementsCollection.size(); i++) {
                    SelenideElement model = elementsCollection.get(i);
                    Double rateModel = Double.valueOf(model.$(".rating").getText());
                    if (rateModel >= 3.5 || rateModel <= 4.5) {
                        hashMap.put(i + 1, model);
                    }
                }

                List<Integer> keys = new ArrayList<>(hashMap.keySet());
                Collections.shuffle(keys);


                for (int i = 0; i < 3; i++) {
                    SelenideElement model = hashMap.get(keys.get(i));
                    log.info("Номер девайса на странице: " + keys.get(i) +
                            ", наименование девайса: " + model.$(".snippet-card__header-text").getText() +
                            ", стоимость девайса " + model.$(".price", 0).getText() + " " + model.$(".price", 1).getText());
                }


    }

}

