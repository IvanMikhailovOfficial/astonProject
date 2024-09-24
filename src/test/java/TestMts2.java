import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMts2 {
    private static WebDriver webDriver;

    @BeforeClass
    public static void init() {
        webDriver = new ChromeDriver();

        try {
            WebElement cookies = webDriver.findElement(By.id("cookie-agree"));
            if (cookies.isDisplayed()) {
                cookies.click();
            }
        } catch (Exception ignored) {
        }
        webDriver.quit();
    }

    @Test(description = "услуги связи")
    public void checkInscriptionCommunicationServices() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        WebElement telephone = driver.findElement(By.id("connection-phone"));
        WebElement sum = driver.findElement(By.id("connection-sum"));
        WebElement email = driver.findElement(By.id("connection-email"));

        Assert.assertEquals(telephone.getAttribute("placeholder"), "Номер телефона");
        Assert.assertEquals(sum.getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(email.getAttribute("placeholder"), "E-mail для отправки чека");
    }

    @Test(description = "Домашний интернет")
    public void checkInscriptionHomeInternet() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mts.by/");
        WebElement dropdownElement = driver.findElement(By.id("pay"));
        Select select = new Select(dropdownElement);
        select.selectByIndex(1);

        WebElement telephone = driver.findElement(By.id("internet-phone"));
        WebElement sum = driver.findElement(By.id("internet-sum"));
        WebElement email = driver.findElement(By.id("internet-email"));

        Assert.assertEquals(telephone.getAttribute("placeholder"), "Номер абонента");
        Assert.assertEquals(sum.getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(email.getAttribute("placeholder"), "E-mail для отправки чека");
    }

    @Test(description = "рассрочка")
    public void checkInscriptionInstallmentPlan() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement dropdownElement = driver.findElement(By.id("pay"));
        Select select = new Select(dropdownElement);
        select.selectByIndex(2);

        WebElement accountNumber = driver.findElement(By.id("score-instalment"));
        WebElement sum = driver.findElement(By.id("instalment-sum"));
        WebElement email = driver.findElement(By.id("instalment-email"));

        Assert.assertEquals(accountNumber.getAttribute("placeholder"), "Номер счета на 44");
        Assert.assertEquals(sum.getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(email.getAttribute("placeholder"), "E-mail для отправки чека");
    }

    @Test(description = "задолжность")
    public void checkInscriptionArrears() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebElement dropdownElement = driver.findElement(By.id("pay"));
        Select select = new Select(dropdownElement);
        select.selectByIndex(3);

        WebElement accountNumber = driver.findElement(By.id("score-arrears"));
        WebElement sum = driver.findElement(By.id("arrears-sum"));
        WebElement email = driver.findElement(By.id("arrears-email"));

        Assert.assertEquals(accountNumber.getAttribute("placeholder"), "Номер счета на 2073");
        Assert.assertEquals(sum.getAttribute("placeholder"), "Сумма");
        Assert.assertEquals(email.getAttribute("placeholder"), "E-mail для отправки чека");
    }

    @Test(description = "услуги связи")
    public void checkCorrectDisplayAmount() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mts.by/");
        WebElement telephone = driver.findElement(By.id("connection-phone"));
        WebElement sum = driver.findElement(By.id("connection-sum"));
        WebElement email = driver.findElement(By.id("connection-email"));
        WebElement button = driver.findElement(By.xpath("button[contains(@class, 'button__default') and @type='submit']"));

        telephone.clear();
        telephone.sendKeys("297777777");
        sum.clear();
        sum.sendKeys("100");
        email.clear();
        email.sendKeys("im1111@gmail.com");
        button.click();
        WebElement displayedSum = driver.findElement(By.xpath("html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]"));
        Assert.assertEquals(displayedSum.getText(), "100.00 BYN");
    }

    @AfterClass
    public void quit() {
        webDriver.quit();
    }
}