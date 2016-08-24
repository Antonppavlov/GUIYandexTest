package test.task.fw.elements.abstacts;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.interfaces.IDropDownList;

import static com.codeborne.selenide.Condition.exactText;

/**
 * Created by Антон on 31.07.2016.
 */
public abstract class AbstractDropDownList implements IDropDownList {

    private final SelenideElement selectedOption;
    private final ElementsCollection allOption;
    protected final String nameElement;

    public AbstractDropDownList(SelenideElement selectedOption, ElementsCollection allOption, String nameElement) {
        this.selectedOption = selectedOption;
        this.allOption = allOption;
        this.nameElement = nameElement;
    }


    protected void selectOption(String nameElement, String textOption) {
        if (!selectedOption.getText().equals(textOption)) {
            selectedOption.click();
            allOption.find(exactText(textOption)).click();
        }
    }

    protected void checkSelectedOption(String nameElement, String option) {
        selectedOption.shouldHave(exactText(option));
    }

    protected SelenideElement getSelectedOption(String nameElement) {
        return selectedOption;
    }

    protected ElementsCollection getAllOption(String nameElement) {
        return allOption;
    }
}
