package test.task.fw.page.searchmobiledevice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import test.task.fw.elements.abstacts.AllureElement;
import test.task.fw.elements.objects.Box;
import test.task.fw.elements.objects.CheckBox;
import test.task.fw.elements.objects.InputField;
import test.task.fw.elements.objects.Text;

import static com.codeborne.selenide.Selenide.$;

public class FilterPanel {

    private final AllureElement inputFieldFrom;
    private final AllureElement inputFieldUpTo;
    private final CheckBox checkBoxOnSale;
    private final CheckBox checkBoxAndroid;
    private final ElementsCollection collectionCheckBox;

    public FilterPanel() {
        SelenideElement parent = $(".filter-panel-aside");

        inputFieldFrom = new InputField(parent.$("#gf-pricefrom-var"), "От");
        inputFieldUpTo = new InputField(parent.$("#gf-priceto-var"), "До");

        collectionCheckBox = parent.$$(".filter-block_head_none .checkbox__label");
        Text labelOnSale = new Text(collectionCheckBox.find(Condition.text("В продаже")));
        Box checkBoxOnSale = new Box(labelOnSale.getSelenideElement().parent().$("[type='checkbox']"));
        this.checkBoxOnSale = new CheckBox(checkBoxOnSale,labelOnSale);
        Text labelAndroid = new Text(collectionCheckBox.find(Condition.text("Android")));
        Box checkBoxAndroid = new Box(labelAndroid.getSelenideElement().parent().$("[type='checkbox']"));
        this.checkBoxAndroid = new CheckBox(checkBoxAndroid, labelAndroid);
    }

    public AllureElement getInputFieldFrom() {
        return inputFieldFrom;
    }

    public AllureElement getInputFieldUpTo() {
        return inputFieldUpTo;
    }

    public CheckBox getCheckBoxOnSale() {
        return checkBoxOnSale;
    }

    public CheckBox getCheckBoxAndroid() {
        return checkBoxAndroid;
    }
}
