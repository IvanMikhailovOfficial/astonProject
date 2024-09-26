import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lesson15 {
    private static WebDriver webDriver;

    @BeforeClass
    public static void init() {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.mts.by");
        try {
            WebElement cookies = webDriver.findElement(By.cssSelector("div.cookie.show button.cookie__cancel"));
            if (cookies.isDisplayed()) {
                cookies.click();
            }
        } catch (Exception ignored) {
        }
    }

    @Test
    public void testBlockName() {
        WebElement header = webDriver.findElement(By.xpath("//h2[text()='" + "Онлайн пополнение " + "']"));
        Assert.assertTrue(header.isDisplayed(), "Заголовок не отображается");
    }

    @Test
    public void testLogo() {
        WebElement visa = webDriver.findElement(By.xpath("//img[@alt='" + "Visa" + "']"));
        WebElement verVisa = webDriver.findElement(By.xpath("//img[@alt='" + "Verified By Visa" + "']"));
        WebElement masterCard = webDriver.findElement(By.xpath("//img[@alt='" + "MasterCard" + "']"));
        WebElement masterCardSec = webDriver.findElement(By.xpath("//img[@alt='" + "MasterCard Secure Code" + "']"));
        WebElement belcart = webDriver.findElement(By.xpath("//img[@alt='" + "Белкарт" + "']"));

        Assert.assertTrue(visa.isDisplayed(), "Лого Visa не отображается");
        Assert.assertTrue(verVisa.isDisplayed(), "Лого Verified By Visa не отображается");
        Assert.assertTrue(masterCard.isDisplayed(), "Лого MasterCard не отображается");
        Assert.assertTrue(masterCardSec.isDisplayed(), "Лого MasterCard Secure Code не отображается");
        Assert.assertTrue(belcart.isDisplayed(), "Лого Белкарт не отображается");
    }

    @Test
    public void testServiceInfo() {
        WebElement webElement = webDriver.findElement(By.xpath("//section[@class='pay']//a[contains(text(),'Подробнее о сервисе')]"));
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webElement.click();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualUrl = webDriver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl, "Не произошел переход на другую ссылку");
    }

    @Test
    public void testFillService() {
        WebElement phoneNum = webDriver.findElement(By.id("connection-phone"));
        phoneNum.sendKeys("297777777");
        WebElement sum = webDriver.findElement(By.id("connection-sum"));
        sum.sendKeys("100");
        WebElement email = webDriver.findElement(By.id("connection-email"));
        email.sendKeys("im1111@gmail.com");
        WebElement continueBut = webDriver.findElement(By.cssSelector("button.button.button__default[type='submit']"));
        continueBut.click();
        WebElement confirmForm = webDriver.findElement(By.xpath("//span[contains(text(), 'Оплата: Услуги связи')]"));
        Assert.assertTrue(confirmForm.isDisplayed(), "Не появилась форма подтверждения услуги");
    }

    @AfterClass
    public void quit() {
        webDriver.quit();
    }
}