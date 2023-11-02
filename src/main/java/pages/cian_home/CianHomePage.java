package pages.cian_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class CianHomePage extends BasePage {

    public CianHomePage (WebDriver driver) {

        super(driver);
    }

    // Описание локаторов
    private final By countRooms = By.xpath("//div[@data-mark='FilterRoomsCount']");
    private final By option3rooms = By.xpath("//div[@class='_025a50318d--dropdown--aOO1u']/ul[@class='_025a50318d--list--gT6p6']/li[3]"); // наверно не самый лучший и красивый локатор, попробуйте свои :)
    private final By findButton = By.xpath("//a[@data-mark='FiltersSearchButton']");

    // Описание методов действий на странице
    public CianHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(option3rooms).click();

        return this;
    }

    public CianHomePage clickToFound() {
        WebElement FindButton = driver.findElement(findButton);
        (FindButton).click();

        return this;
    }

}
