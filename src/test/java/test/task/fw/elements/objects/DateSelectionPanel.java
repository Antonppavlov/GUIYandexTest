package test.task.fw.elements.objects;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by ap_pavlov on 28.04.2016.
 */
public class DateSelectionPanel {
    private SelenideElement day;
    private SelenideElement month;
    private SelenideElement year;

    public DateSelectionPanel(SelenideElement day, SelenideElement month, SelenideElement year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Step("Выбираю :{0}, {1}, {2}")
    public void selectAllData(String textDay, String textMonth, String textYear) {

        selectDay(textDay);
        selectMonth(textMonth);
        selectYear(textYear);
    }


    @Step("В выпадающем списке 'День' выбираю: {0}")
    public void selectDay(String textDay) {
        select(this.day, textDay);
    }

    @Step("В выпадающем списке 'Месяц' выбираю: {0}")
    public void selectMonth(String textMonth) {
        select(this.month, textMonth);
    }

    @Step("В выпадающем списке 'Год' выбираю: {0}")
    public void selectYear(String textYear) {
        select(this.year, textYear);
    }

    private void select(SelenideElement element, String text) {

        element.click();
        element.$(".chosen-search>input").sendKeys(text);
        element.$(".chosen-search>input").pressEnter();
    }
}
