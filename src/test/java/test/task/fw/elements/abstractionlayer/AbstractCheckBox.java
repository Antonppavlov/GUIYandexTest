package test.task.fw.elements.abstractionlayer;

import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.selected;

/**
 * Created by ap_pavlov on 29.04.2016.
 */
public abstract class AbstractCheckBox {

    private SelenideElement checkBox;
    private SelenideElement labelCheckbox;
    protected String nameCheckBox;

    public AbstractCheckBox(SelenideElement checkBox, SelenideElement labelCheckbox, String nameCheckBox) {
        this.checkBox = checkBox;
        this.labelCheckbox = labelCheckbox;
        this.nameCheckBox = nameCheckBox;
    }

    @Step("Отмечаю чек-бокс: {0}")
    public void selectCheckBox(String nameCheckBox) {
        if (!checkBox.isSelected()) {
            labelCheckbox.click();
        }
        checkSelect(nameCheckBox);
    }

    @Step("Убираю отметку с чек-бокса: {0}")
    public void deselectCheckBox(String nameCheckBox) {
        if (checkBox.isSelected()) {
            labelCheckbox.click();
        }
        checkNotSelect(nameCheckBox);
    }

    @Step("Проверяю что чек-бокс: {0} отмечен")
    public void checkSelect(String nameCheckBox) {
        checkBox.shouldHave(selected);
    }

    @Step("Проверяю что чек-бокс: {0} не отмечен")
    public void checkNotSelect(String nameCheckBox) {
        checkBox.shouldHave(not(selected));
    }


}
