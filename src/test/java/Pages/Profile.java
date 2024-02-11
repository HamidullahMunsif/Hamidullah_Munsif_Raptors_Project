package Pages;

import Utility.SeleniumUtility;
import org.openqa.selenium.By;

public class Profile extends SeleniumUtility {

    public static final By PROFILE_BUTTON = By.xpath("//button[@aria-label='profile']");
    public static final By FULLNAME_LOCATOR =By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[3]/p[2]");
    public static final By USERNAME_LOCATOR = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[4]/p[2]");
    public static final By LOGOUT_BTLOCATOR =By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[1]");
    public static final By HOMEPAGE_TITLE =By.xpath("/html/body/div[1]/div/div[2]/div/div/h2[1]");
}
