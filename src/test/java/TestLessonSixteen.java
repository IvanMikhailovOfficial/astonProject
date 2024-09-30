import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class TestLessonSixteen {
    private WebDriver webDriver;
    private MtsPage mtsPage;

    @BeforeMethod
    public void beforeMethods() {
        webDriver = new ChromeDriver();
        mtsPage = new MtsPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        webDriver.get("https://www.mts.by");
        try {
            webDriver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
        } catch (Exception e) {
            Reporter.log("cookie not found");
        }
    }

    @Test(description = "услуги связи")
    public void checkInscriptionCommunicationServices() {
        Assert.assertEquals(mtsPage.getConnectionPhoneField().getAttribute("placeholder"), "Номер телефона");
        Assert.assertEquals(mtsPage.getConnectionSumField().getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(mtsPage.getConnectionEmailField().getAttribute("placeholder"), "E-mail для отправки чека");
    }

    @Test(description = "Домашний интернет")
    public void checkInscriptionHomeInternet() {
        mtsPage.selectDropdownByIndex(1);
        Assert.assertEquals(mtsPage.getInternetPhoneField().getAttribute("placeholder"), "Номер абонента");
        Assert.assertEquals(mtsPage.getInternetSumField().getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(mtsPage.getInternetEmailField().getAttribute("placeholder"), "E-mail для отправки чека");
    }

    @Test(description = "рассрочка")
    public void checkInscriptionInstallmentPlan() {
        mtsPage.selectDropdownByIndex(2);
        Assert.assertEquals(mtsPage.getInstalmentAccountField().getAttribute("placeholder"), "Номер счета на 44");
        Assert.assertEquals(mtsPage.getInstalmentSumField().getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(mtsPage.getInstalmentEmailField().getAttribute("placeholder"), "E-mail для отправки чека");
    }

    @Test(description = "задолжность")
    public void checkInscriptionArrears() {
        mtsPage.selectDropdownByIndex(3);
        Assert.assertEquals(mtsPage.getArrearsAccountField().getAttribute("placeholder"), "Номер счета на 2073");
        Assert.assertEquals(mtsPage.getArrearsSumField().getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(mtsPage.getArrearsEmailField().getAttribute("placeholder"), "E-mail для отправки чека");
    }

    @Test(description = "услуги связи")
    public void checkCorrectDisplayAmount() {
        // Ввод данных в поля формы
        mtsPage.getConnectionPhoneField().clear();
        mtsPage.getConnectionPhoneField().sendKeys("297777777");
        mtsPage.getConnectionSumField().clear();
        mtsPage.getConnectionSumField().sendKeys("100");
        mtsPage.getConnectionEmailField().clear();
        mtsPage.getConnectionEmailField().sendKeys("im1111@gmail.com");
        mtsPage.getConnectionSubmitButton().click();

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mtsPage.getPaymentIframe()));

        WebElement infoField = mtsPage.getPaymentInfoField();
        wait.until(ExpectedConditions.visibilityOf(infoField));

        String textInfoField = infoField.getText();
        String expectedNumber = "375297777777";

        assertTrue(textInfoField.contains(expectedNumber), "Текст не содержит номер телефона " + expectedNumber);
    }

    @AfterMethod
    public void quit() {
        webDriver.quit();
    }
}