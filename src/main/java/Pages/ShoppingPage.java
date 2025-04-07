package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingPage extends BaseTest {

    @Step("Secilen icon alanina tiklanir")
    public ShoppingPage clickIcon() {
        driver.findElement(By.xpath("(//*[@class='category-header navbar-first-cap'])[6]")).click();
        return this;
    }

    @Step("Ürünün favori butonuna tiklanir")
    public ShoppingPage favoriteButton() {
        driver.findElement(By.xpath("(//*[@class='wd-fvrt-btn i-heart'])[1]")).click();
        return this;
    }

    @Step("Favorilerim alanina tiklanir")
    public ShoppingPage myFavorites() {
        driver.findElement(By.xpath("//*[contains(@class, 'i-heart-orange') and contains(@class, 'hover-icon')]")).click();
        return this;
    }

    @Step("Favoride bulunan ürünün sepete ekleme butonuna tiklanir")
    public ShoppingPage basketButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement basketButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='basket-button']")));

        basketButton.click();
        return this;
    }

    @Step("Sepetim alanina tiklanir")
    public ShoppingPage myCart() {
        driver.findElement(By.xpath("//*[normalize-space()='Sepetim']")).click();
        return this;
    }

    @Step("Sepeti Onayla butonuna tiklanir")
    public ShoppingPage confirmCart() {
        driver.findElement(By.xpath("//*[normalize-space()='Sepeti Onayla']")).click();
        return this;
    }

    @Step("Cikan teklifte 'Eklemeden devam et' butonuna tiklanir")
    public ShoppingPage passButton() {
        driver.findElement(By.xpath("//*[@class='ty-button ty-secondary ty-pass-continue-without-add']")).click();
        return this;
    }

}
