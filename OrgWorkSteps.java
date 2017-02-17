package com.rl.qa.steps;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.utils.CucumberContext;
import com.rl.qa.utils.SeleniumUtilities;
import com.rl.qa.views.CFTViews;
import com.rl.qa.views.OrgWorkViews;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;
import java.util.logging.Logger;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by sse0051 on 16/2/17.
 */
public class OrgWorkSteps {
    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());
    private static final com.rl.qa.utils.SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);

    @Given("^I Login to catalyst using \"([^\"]*)\"$")
    public void iLoginToCatalystUsing(String url) throws Throwable {


        String appURL = url.toString();

        assertNotNull(appURL);

        // Load browser and point it at configured IWMS web-ui.
        BrowserDriver.loadPage(appURL);
        //  OrgWorkViews.EnterUrl(url);

    }

    @And("^I enter  \"([^\"]*)\" on User name text box$")
    public void iEnterOnUserNameTextBox(String username) throws Throwable {
        OrgWorkViews.EnterUsername(username);
    }

    @And("^I enter \"([^\"]*)\"  on Password testbox$")
    public void iEnterOnPasswordTestbox(String password) throws Throwable {
        OrgWorkViews.EnterPassword(password);
    }


    @And("^I click on Login button$")
    public void iClickOnLoginButton() throws Throwable {
        OrgWorkViews.ClickOnButton();
    }

    @And("^I click on the \"([^\"]*)\" button$")
    public void iClickOnTheButton(String arg0) throws Throwable {
        OrgWorkViews.ClickOnOrg();

    }

    @And("^I enter \"([^\"]*)\" in the Name edit box$")
    public void iEnterInTheNameEditBox(String Orgname) throws Throwable {
        OrgWorkViews.EnterName(Orgname);
    }

    @And("^I move the cursor on \"([^\"]*)\" link$")
    public void iMoveTheCursorOnLink(String arg0) throws Throwable {
        OrgWorkViews.MoveCursorMenu();
    }

    @And("^I select the \"([^\"]*)\" and click on corresponding \"([^\"]*)\" button$")
    public void iSelectTheAndClickOnCorrespondingButton(String arg0, String arg1) throws Throwable {
        OrgWorkViews.SelectAndClickButton();
    }

    @Then("^I verify \"([^\"]*)\" deleted or not$")
    public void iVerifyDeletedOrNot(String Orgname) throws Throwable {
        OrgWorkViews.VerifyDelete(Orgname);
    }


    @And("^I enter \"([^\"]*)\" in the Planned Cost edit box$")
    public void iEnterInThePlannedCostEditBox(String Cost) throws Throwable {
        OrgWorkViews.EnterCost(Cost);
    }

    @And("^I click on \"([^\"]*)\" option$")
    public void iClickOnOption(String arg0) throws Throwable {
        OrgWorkViews.ClickOnSave();
    }

    @Then("^I verify the created \"([^\"]*)\" in org table$")
    public void iVerifyTheCreatedInOrgTable(String Orgname) throws Throwable {
        OrgWorkViews.VerifycreateOrg(Orgname);
    }

    @And("^I click on the \"([^\"]*)\" Option$")
    public void iClickOnTheOption(String arg0) throws Throwable {
        OrgWorkViews.ClickOnSetting();
    }

    @And("^I click on OK button on  popup$")
    public void iClickOnOKButtonOnPopup() throws Throwable {
       OrgWorkViews.ClickOnOk();
    }
}