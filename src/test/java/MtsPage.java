import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MtsPage {
    private final WebDriver webDriver;

    public MtsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void selectDropdownByIndex(int index) {
        WebElement dropdownElement = webDriver.findElement(By.id("pay"));
        Select select = new Select(dropdownElement);
        select.selectByIndex(index);
    }

    // Методы для полей формы "Услуги связи"
    public WebElement getConnectionPhoneField() {
        return webDriver.findElement(By.id("connection-phone"));
    }

    public WebElement getConnectionSumField() {
        return webDriver.findElement(By.id("connection-sum"));
    }

    public WebElement getConnectionEmailField() {
        return webDriver.findElement(By.id("connection-email"));
    }

    public WebElement getConnectionSubmitButton() {
        return webDriver.findElement(By.cssSelector("#pay-connection .button__default"));
    }

    // Методы для других услуг
    public WebElement getInternetPhoneField() {
        return webDriver.findElement(By.id("internet-phone"));
    }

    public WebElement getInternetSumField() {
        return webDriver.findElement(By.id("internet-sum"));
    }

    public WebElement getInternetEmailField() {
        return webDriver.findElement(By.id("internet-email"));
    }

    public WebElement getInstalmentAccountField() {
        return webDriver.findElement(By.id("score-instalment"));
    }

    public WebElement getInstalmentSumField() {
        return webDriver.findElement(By.id("instalment-sum"));
    }

    public WebElement getInstalmentEmailField() {
        return webDriver.findElement(By.id("instalment-email"));
    }

    public WebElement getArrearsAccountField() {
        return webDriver.findElement(By.id("score-arrears"));
    }

    public WebElement getArrearsSumField() {
        return webDriver.findElement(By.id("arrears-sum"));
    }

    public WebElement getArrearsEmailField() {
        return webDriver.findElement(By.id("arrears-email"));
    }

    // Метод для проверки iframe в платёжной системе
    public WebElement getPaymentIframe() {
        return webDriver.findElement(By.cssSelector("div.bepaid-app iframe"));
    }

    public WebElement getPaymentInfoField() {
        return webDriver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]"));
    }
}
