package test.task.fw.page.searchmobiledevice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchMobileDevicePage {

    private final FilterPanel filterPanel;

    public SearchMobileDevicePage() {
        this.filterPanel = new FilterPanel();
    }

    public FilterPanel getFilterPanel() {
        return filterPanel;
    }

    @Step("Получить весь список девайсов с экрана")
    public ElementsCollection getAllDeviceList() {
        $(".snippet-card").waitUntil(Condition.visible, 10000);
        return $$(".snippet-card");
    }

    @Step("Отфильтровать девайсы по рейтингу от: {1} до: {2}")
    public Map<Integer, SelenideElement> filterDeviceListByRate(ElementsCollection allDeviceInList, Double from, double upTo) {
        Map<Integer, SelenideElement> hashMap = new HashMap<>();

        for (int i = 0; i < allDeviceInList.size(); i++) {
            SelenideElement model = allDeviceInList.get(i);
            Double rateModel = Double.valueOf(model.$(".rating").getText());
            if (rateModel >= from || rateModel <= upTo) {
                hashMap.put(i + 1, model);
            }
        }
        return hashMap;
    }

    @Step("Получить {1} случайно выбранных усойства из списка")
    public Map<Integer, SelenideElement> getRandomDevice(Map<Integer, SelenideElement> hashMap, int quantity) {
        List<Integer> keys = new ArrayList<>(hashMap.keySet());
        Collections.shuffle(keys);
        Map<Integer, SelenideElement> listDevice = new HashMap<>();
        for (int i = 0; i < quantity; i++) {
            Integer key = keys.get(i);
            listDevice.put(key, hashMap.get(key));
        }
        return listDevice;
    }

    @Step("Получить информацию по списку устройств")
    public List<String> getInformationAboutDevice(Map<Integer, SelenideElement> hashMap) {
        List<Integer> keys = new ArrayList<>(hashMap.keySet());

        List<String> informationAboutDevices = new ArrayList<>();
        for (int i = 0; i < keys.size(); i++) {
            SelenideElement model = hashMap.get(keys.get(i));
            informationAboutDevices.add(
                    "Номер девайса на странице: " + keys.get(i) +
                            ", наименование девайса: " + model.$(".snippet-card__header-text").getText() +
                            ", стоимость девайса " + model.$(".price", 0).getText() + " " + model.$(".price", 1).getText());
        }
        return informationAboutDevices;
    }
}

