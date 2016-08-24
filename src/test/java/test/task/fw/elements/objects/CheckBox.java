package test.task.fw.elements.objects;


import test.task.fw.elements.abstacts.AbstractCheckBox;

public class CheckBox extends AbstractCheckBox {


    public CheckBox(Box box, Text labelCheckbox, String nameCheckBox) {
        super(box, labelCheckbox, nameCheckBox);
    }

    public CheckBox(Box box, Text labelCheckbox) {
        this(box, labelCheckbox, labelCheckbox.getText());
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