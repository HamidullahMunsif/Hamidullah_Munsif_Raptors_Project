package Pages;

import org.openqa.selenium.By;

public class CreateAccount {
    public static final By PRIMARY_ACOUNTB_LOCATOR = By.linkText("Create Primary Account");
    public static final By ACCOUNT_FORM_TITLE =By.xpath("//div[@class='chakra-stack css-1pqwvz2']/h2");
    public static final By EMAIL_ADDRESS = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[1]/input");
    public static final By FIRST_NAME =By.name("firstName");
    public static final By GENDER_BOX =By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[1]/div[5]/div/select");
    public static final By TITLE_PREFIX = By.xpath("//select[@id='title']");
    public static final By LAST_NAME =By.name("lastName");
    public static final By MARITIAL_STATUS =By.xpath("//select[@name='maritalStatus']");
    public static final By DATE_LOCATOR =By.name("dateOfBirth");
    public static final By CREATE_ACCOUNT_BTLOCATOR =By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div/div[2]/button[1]");
    public static final By ERROR_MSG_LOCATOR =By.xpath("/html/body/div[1]/div/div[2]/div/div/div/form/div[1]/div");
}
