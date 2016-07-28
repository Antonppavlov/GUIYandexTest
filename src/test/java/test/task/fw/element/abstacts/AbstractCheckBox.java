package test.task.fw.element.abstacts;

import ru.yandex.qatools.allure.annotations.Step;
import test.task.fw.element.Box;
import test.task.fw.element.Text;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.selected;


public abstract class AbstractCheckBox {

    private Box box;
    private Text labelCheckbox;
    protected String nameCheckBox;


    protected AbstractCheckBox(Box box, Text labelCheckbox, String nameCheckBox) {
        this.box = box;
        this.labelCheckbox = labelCheckbox;
        this.nameCheckBox = nameCheckBox;
    }

    protected AbstractCheckBox(Box box, Text labelCheckbox) {
        this(box, labelCheckbox, labelCheckbox.getText());
    }


    @Step("Отмечаю чек-бокс: {0}")
    protected void selectCheckBox(String nameCheckBox) {
        if (!box.isSelected()) {
            labelCheckbox.click();
        }
        checkSelect(nameCheckBox);
    }

    @Step("Убираю отметку с чек-бокса: {0}")
    protected void deselectCheckBox(String nameCheckBox) {
        if (box.isSelected()) {
            labelCheckbox.click();
        }
        checkNotSelect(nameCheckBox);
    }

    @Step("Проверяю что чек-бокс: {0} отмечен")
    protected void checkSelect(String nameCheckBox) {
        box.getSelenideElement().shouldHave(selected);
    }

    @Step("Проверяю что чек-бокс: {0} не отмечен")
    protected void checkNotSelect(String nameCheckBox) {
        box.getSelenideElement().shouldHave(not(selected));
    }


}
