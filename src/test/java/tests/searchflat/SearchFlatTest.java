package tests.searchflat;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.CIAN_HOME_PAGE;

public class SearchFlatTest extends BaseTest {


    // Метод отвечающий за сценарий выполнения теста
    @Test
    public void checkInRedirectToListing() {
        basePage.open(CIAN_HOME_PAGE);

        cianHomePage
                .enterCountRooms()
                .clickToFound();

        cianListingPage.checkCountCards();
    }
}
