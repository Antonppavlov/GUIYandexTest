package test.task.fw;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.WebDriverRunner;
import com.google.common.io.Files;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class MyAttachment {

    @Before
    public void clearScreenshotList() {
        Screenshots.screenshots.getScreenshots().clear();
    }

    @After
    public void addScreenshot() throws IOException {
        File lastSelenideScreenshot = Screenshots.getLastScreenshot();

        if (lastSelenideScreenshot != null) {
            screenshot(Files.toByteArray(lastSelenideScreenshot));
        }
    }

    @Attachment(type = "image/png")
    public static byte[] screenshot(byte[] dataForScreenshot) {
        return dataForScreenshot;
    }

    @Attachment(value = "Список девайсов", type = "text/plain")
    public String addTextToTheReport(List<String> stringList) {
        String information = "";
        for (String string : stringList) {
            information += string + "\n";
        }

        return information;
    }

    @AfterClass
    public static void postConditionsAllClass() {
        WebDriverRunner.getWebDriver().quit();
    }


}
