package test.task.fw.elements.abstacts;


import ru.yandex.qatools.allure.annotations.Step;
import test.task.fw.elements.objects.Box;
import test.task.fw.elements.objects.Text;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.selected;

public abstract class AbstractCheckBox {

    private Box box;
    private Text labelCheckbox;
    protected String nameCheckBox;


    public AbstractCheckBox(Box box, Text labelCheckbox, String nameCheckBox) {
        this.box = box;
        this.labelCheckbox = labelCheckbox;
        this.nameCheckBox = nameCheckBox;
    }


    @Step("Отмечаю чек-бокс: {0}")
    public void selectCheckBox(String nameCheckBox) {
        if (!box.isSelected()) {
            labelCheckbox.click();
        }
        checkSelect(nameCheckBox);
    }

    @Step("Убираю отметку с чек-бокса: {0}")
    public void deselectCheckBox(String nameCheckBox) {
        if (box.isSelected()) {
            labelCheckbox.click();
        }
        checkNotSelect(nameCheckBox);
    }

    @Step("Проверяю что чек-бокс: {0} отмечен")
    public void checkSelect(String nameCheckBox) {
        box.getSelenideElement().shouldHave(selected);
    }

    @Step("Проверяю что чек-бокс: {0} не отмечен")
    public void checkNotSelect(String nameCheckBox) {
        box.getSelenideElement().shouldHave(not(selected));
    }

    public Box getBox() {
        return box;
    }

    public Text getLabel() {
        return labelCheckbox;
    }
}
