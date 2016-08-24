package test.task.fw.elements.interfaces;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

/**
 * Created by Антон on 31.07.2016.
 */
public interface IDropDownList {

    SelenideElement getSelectedOption();

    ElementsCollection getAllOption();

    void checkSelectedOption(String option);

    void selectOption(String option);
}
