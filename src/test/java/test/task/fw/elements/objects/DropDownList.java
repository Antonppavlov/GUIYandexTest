package test.task.fw.elements.objects;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstacts.AbstractDropDownList;

/**
 * Created by Антон on 31.07.2016.
 */
public class DropDownList extends AbstractDropDownList {

    public DropDownList(SelenideElement selectedOption, ElementsCollection allOption, String nameElement) {
        super(selectedOption, allOption, nameElement);
    }

    @Override
    public void selectOption(String textOption) {
        super.selectOption(nameElement, textOption);
    }

    @Override
    public void checkSelectedOption(String option) {
        super.checkSelectedOption(nameElement, option);
    }

    @Override
    public SelenideElement getSelectedOption() {
        return super.getSelectedOption(nameElement);
    }

    @Override
    public ElementsCollection getAllOption() {
        return super.getAllOption(nameElement);
    }
}
