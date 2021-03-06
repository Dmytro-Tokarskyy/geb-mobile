package geb.mobile

import geb.Browser
import geb.navigator.Navigator
import geb.navigator.factory.AbstractNavigatorFactory
import org.openqa.selenium.WebElement

/**
 * Created by gmueksch on 23.06.14.
 */
class GebMobileNavigatorFactory extends AbstractNavigatorFactory{


    GebMobileNavigatorFactory(Browser browser) {
        super(browser, new GebMobileInnerNavigatorFactory())
    }

    @Override
    Navigator getBase() {
        //xpath works with all selenium implementations...
        List<WebElement> list = browser.driver.findElementsByXPath("//*") as List
        createFromWebElements(list)
    }


}
