package PagesSteps;

import Utility.SeleniumUtility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends SeleniumUtility {
    @Before
    public void NavigateToURL() {
        Openbrowser();
    }

    @After
    public void QuitBrowser(){
        CloseBrowser();
    }
}
