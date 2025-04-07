import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.ShoppingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    ShoppingPage shoppingPage = new ShoppingPage();

    @Test(description = "kullanici islemleri")
    public void kullaniciIslemleri() {
        loginPage.fillEmail(email)
                .fillPassword(password)
                .clickLogin();
        sleep(3000);

        shoppingPage.clickIcon();
        shoppingPage.favoriteButton();

        shoppingPage.myFavorites();
        shoppingPage.basketButton();

        shoppingPage.myCart();
        shoppingPage.confirmCart();
        shoppingPage.passButton();

    }
}
