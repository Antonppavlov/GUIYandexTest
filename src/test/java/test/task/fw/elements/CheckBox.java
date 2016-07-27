package test.task.fw.elements;

import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstractionlayer.AbstractCheckBox;

public class CheckBox extends AbstractCheckBox {

    public CheckBox(SelenideElement checkBox, SelenideElement labelCheckbox, String nameCheckBox) {
        super(checkBox, labelCheckbox, nameCheckBox);
    }

    public void selectCheckBox() {
        super.selectCheckBox(nameCheckBox);
    }

    public void deselectCheckBox() {
        super.deselectCheckBox(nameCheckBox);
    }

    public void checkSelect() {
        super.checkSelect(nameCheckBox);
    }

    public void checkNotSelect() {
        super.checkNotSelect(nameCheckBox);
    }


}
