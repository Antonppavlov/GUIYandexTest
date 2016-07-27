package test.task.test;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import test.task.fw.MyAttachment;
import test.task.fw.blocks.*;
import test.task.fw.page.CatalogPage;
import test.task.fw.page.searchmobiledevice.FilterPanel;
import test.task.fw.page.MobileDevicesPage;
import test.task.fw.page.searchmobiledevice.SearchMobileDevicePage;

import java.util.*;

import static com.codeborne.selenide.Selenide.open;

@Features("Yandex Market")
@Stories("Мобильные устройства")
@Title("Получение информации о устройствах")
public class Version2YandexTest extends MyAttachment {

    @Title("Получение информации о 3х моб. устройствах")
    @Test
    public void yandexTest() {
        open("https://market.yandex.ru/");
        new HeadLineBanner().getLinkCatalog().click();

        CatalogPage catalogPage = new CatalogPage();
        catalogPage.checkCatalogs();
        catalogPage.getLinkElectronics().click();

        new CatalogMenu().getLinkMobileDevices().click();
        MobileDevicesPage mobileDevicesPage = new MobileDevicesPage();
        mobileDevicesPage.checkCategories("Популярные", 3);
        mobileDevicesPage.checkCategories("Новинки", 3);
        mobileDevicesPage.getAdvancedSearch().click();

        SearchMobileDevicePage searchMobileDevicePage = new SearchMobileDevicePage();
        FilterPanel filterPanel = searchMobileDevicePage.getFilterPanel();
        filterPanel.getInputFieldFrom().sendKeys("5125");
        filterPanel.getInputFieldFrom().checkAttribute("value","5125");
        filterPanel.getInputFieldUpTo().sendKeys("10123");
        filterPanel.getInputFieldUpTo().checkAttribute("value","10123");
        filterPanel.getCheckBoxOnSale().selectCheckBox();
        filterPanel.getCheckBoxAndroid().selectCheckBox();
        ElementsCollection allDeviceList = searchMobileDevicePage.getAllDeviceList();
        Map<Integer, SelenideElement> filterByRateDeviceList = searchMobileDevicePage.filterDeviceListByRate(allDeviceList, 3.5, 4.5);
        Map<Integer, SelenideElement> randomDevice = searchMobileDevicePage.getRandomDevice(filterByRateDeviceList, 3);
        List<String> informationAboutDevice = searchMobileDevicePage.getInformationAboutDevice(randomDevice);

        addTextToTheReport(informationAboutDevice);

    }
}

