package test.task.fw.page.searchmobiledevice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.CheckBox;
import test.task.fw.elements.InputField;

import static com.codeborne.selenide.Selenide.$;

public class FilterPanel {

    private final InputField inputFieldFrom;
    private final InputField inputFieldUpTo;
    private final CheckBox checkBoxOnSale;
    private final CheckBox checkBoxAndroid;
    private final ElementsCollection collectionCheckBox;

    public FilterPanel() {
        SelenideElement parent = $(".filter-panel-aside");

        inputFieldFrom = new InputField(parent.$("#gf-pricefrom-var"), "От");
        inputFieldUpTo = new InputField(parent.$("#gf-priceto-var"), "До");

        collectionCheckBox = parent.$$(".filter-block_head_none .checkbox__label");
        SelenideElement labelOnSale = collectionCheckBox.find(Condition.text("В продаже"));
        SelenideElement checkBoxOnSale = labelOnSale.parent().$("[type='checkbox']");
        this.checkBoxOnSale = new CheckBox(checkBoxOnSale, labelOnSale, "В продаже");
        SelenideElement labelAndroid = collectionCheckBox.find(Condition.text("Android"));
        SelenideElement checkBoxAndroid = labelAndroid.parent().$("[type='checkbox']");
        this.checkBoxAndroid = new CheckBox(checkBoxAndroid, labelAndroid, "Android");
    }

    public InputField getInputFieldFrom() {
        return inputFieldFrom;
    }

    public InputField getInputFieldUpTo() {
        return inputFieldUpTo;
    }

    public CheckBox getCheckBoxOnSale() {
        return checkBoxOnSale;
    }

    public CheckBox getCheckBoxAndroid() {
        return checkBoxAndroid;
    }
}
