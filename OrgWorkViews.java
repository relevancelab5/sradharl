package com.rl.qa.views;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.utils.BaseView;
import com.rl.qa.utils.SeleniumUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.fail;


/**
 * Created by sse0051 on 16/2/17.
 */
public class OrgWorkViews {
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);
    private static String orgname;

    public static void EnterUrl(String url) {
        try{
        WebDriver driver=new FirefoxDriver();
       driver.get(url);
       System.out.println(url);
    }
    catch (Exception ex){
            BaseView.takeScreenshot("enterurl");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    }
    public static void EnterUsername(String username) {
        try {
            SeleniumUtil.waitForElementPresent("xpath","//*[@id='login-form']/fieldset/section[1]/label[2]/input");
            SeleniumUtil.type("xpath",".//*[@id='login-form']/fieldset/section[1]/label[2]/input", username, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("enterUsername");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void EnterPassword(String password) {
        try {

            SeleniumUtil.waitForElementPresent("xpath",".//*[@id='login-form']/fieldset/section[2]/label[2]/input");
            SeleniumUtil.type("xpath", ".//*[@id='login-form']/fieldset/section[2]/label[2]/input",password,SeleniumUtilities.OBJWAITTIMEOUT);
            System.out.println();
        }
        catch(Exception ex){
            BaseView.takeScreenshot("enterPassword");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnButton() {
        try {
            Thread.sleep(2000);
            SeleniumUtil.click("id","loginBtn",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("clickLoginButton");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
    public static void ClickOnOrg() {
        try {
            Thread.sleep(2000);
            SeleniumUtil.click("xpath", " .//*[@id='createNew']", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("clickOnOrg");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }


    public static void EnterOrgName(String Orgname) {
        try {
            SeleniumUtil.waitForElementPresent("id", "orgname");
            SeleniumUtil.type("id","orgname",Orgname,SeleniumUtilities.OBJWAITTIMEOUT);
            System.out.println();
        }
        catch(Exception ex){
            BaseView.takeScreenshot("enterOrgname");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void MoveCursorMenu() {
        try {
            Thread.sleep(2000);
            SeleniumUtil.mouseOver("xpath", "//strong[text()='Menu']", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("moveCursorOnMenu");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectAndClickButton() {
        try {
            Thread.sleep(1000);
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@id='envtable']//* [contains(text(),'ftyo')]/following-sibling::td//*[@title='Delete']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@id='envtable']//* [contains(text(),'ftyo')]/following-sibling::td//*[@title='Delete']", SeleniumUtilities.OBJWAITTIMEOUT);
        }catch (Exception ex) {
            BaseView.takeScreenshot("clearNameField");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }


    public static void VerifyDelete(String Orgname) {
        try {
           SeleniumUtil.waitForElementVisibilityOf("xpath", ".//*[@id='envtable']//* [contains(text(),'ftyo')]",1, SeleniumUtilities.OBJWAITTIMEOUT);
            assertFalse(SeleniumUtil.isElementExist("xpath", ".//*.//*[@id='envtable']//* [contains(text(),'ftyo')]"));
          System.out.println("Organisation is deleted:"+Orgname);
        } catch (Exception ex) {
            BaseView.takeScreenshot("verifyDeletedOrg");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
        }

    public static void EnterName(String Orgname) {

        try {
            Thread.sleep(2000);
            SeleniumUtil.waitForElementPresent("id","orgname");
            SeleniumUtil.type("id", "orgname",Orgname,SeleniumUtilities.OBJWAITTIMEOUT);
            System.out.println();
        }
        catch(Exception ex){
            BaseView.takeScreenshot("enterName");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void EnterCost(String Cost) {
        try {
            Thread.sleep(2000);
            SeleniumUtil.waitForElementPresent("id","plannedCost");
            SeleniumUtil.type("id", "plannedCost",Cost,SeleniumUtilities.OBJWAITTIMEOUT);
            System.out.println();
        }
        catch(Exception ex){
            BaseView.takeScreenshot("enterCost");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnSave() {
        try {
            Thread.sleep(2000);
            SeleniumUtil.click("id","saveOrg",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex) {
            BaseView.takeScreenshot("clickOnSave");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());

        } catch (Throwable throwable) {
            throwable.printStackTrace();

        }
    }

    public static void VerifycreateOrg(String Orgname) {
        try {

            SeleniumUtil.waitForElementVisibilityOf("xpath", ".//*[@id='envtable']//* [contains(text(),'ftyo')]", 8, SeleniumUtilities.OBJWAITTIMEOUT);
          String a= SeleniumUtil.getTextValue("xpath",".//*[@id='envtable']//* [contains(text(),'ftyo')]",SeleniumUtilities.OBJWAITTIMEOUT);
            System.out.println(a);
          //assertTrue(SeleniumUtil.verifyTextValue("xpath", ".//*[@id='envtable']//* [contains(text(),'ftyo')]", Orgname, SeleniumUtilities.OBJWAITTIMEOUT));
            System.out.print("Verified created organization:" + Orgname);

        } catch (Exception ex) {
            BaseView.takeScreenshot("verifyCreatedOrg");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());

        }
    }

    public static void ClickOnSetting() {
        try {
            Thread.sleep(2000);
            SeleniumUtil.click("xpath",".//*[@id='settings']/a",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("clickOnSetting");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());

        } catch (Throwable throwable) {
            throwable.printStackTrace();

        }
    }

    public static void ClickOnOk() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", "//button[text()='OK']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", "//button[text()='OK']", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("clickOnOK");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }
}


