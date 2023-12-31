package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

// Класс конкретной страницы
public class CianListingPage extends BasePage {

    public CianListingPage(WebDriver driver) {

        super(driver);
    }

    private final By card = By.xpath("//article[@data-name='CardComponent']");

    // Метод проверяющий количество объявлений
    public CianListingPage checkCountCards() {
        // Количество объектов в коллекции
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 28);

        return this;
    }
}
