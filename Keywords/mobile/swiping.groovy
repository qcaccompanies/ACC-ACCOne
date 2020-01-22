package mobile

import org.openqa.selenium.Point
import org.openqa.selenium.remote.RemoteWebElement

//import com.detroitlabs.katalonmobileutil.testobject.XPathBuilder 
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class swiping {
	AppiumDriver driver;
	swiping() {
		this.driver = MobileDriverFactory.getDriver()
	}

	// scroll up
	private scrollEntireList_UpToDown() {

		// very specific to android and the type of element that makes up your dropdowns
		String xpath = "";
		xpath = XPathBuilder.createXPath("TextView");
		List<RemoteWebElement> listElements = (List<RemoteWebElement>) driver.findElementsByXPath(xpath);
		TouchAction touchAction = new TouchAction(driver)
		RemoteWebElement topElement = listElements.get(3);
		RemoteWebElement bottomElement = listElements.get(listElements.size() - 2);

		Point from = bottomElement.getLocation();
		Point to = topElement.getLocation();


		int endY = to.y - (int)((to.y - from.y) );

		touchAction.longPress(PointOption.point(to.x, to.y)).moveTo(PointOption.point(from.x, endY)).release().perform();

	}
	@Keyword
	def boolean scrollListToElementWithTextUpToDown(String elementText) {
		boolean isElementFound = false;
		while (isElementFound == false) {
			String xpath = "";
			xpath = XPathBuilder.createXPath("TextView");
			List<RemoteWebElement> listElements = (List<RemoteWebElement>) driver.findElementsByXPath(xpath);
			for (int i = 0; i<listElements.size(); i++) {
				String textItem = listElements[i].getText()
				if (textItem == elementText) {
					isElementFound = true;
					return true;
				}
			}
			scrollEntireList_UpToDown()
		}
	}


	// scroll down
	private scrollEntireList_DownToUp() {

		// very specific to android and the type of element that makes up your dropdowns
		String xpath = "";
		xpath = XPathBuilder.createXPath("TextView");
		List<RemoteWebElement> listElements = (List<RemoteWebElement>) driver.findElementsByXPath(xpath);
		TouchAction touchAction = new TouchAction(driver)
		RemoteWebElement bottomElement = listElements.get(listElements.size() - 1);
		RemoteWebElement topElement = listElements.get(0);
		Point from = bottomElement.getLocation();
		Point to = topElement.getLocation();


		int endY = from.y - (int)((from.y - to.y));

		touchAction.longPress(PointOption.point(from.x, from.y)).moveTo(PointOption.point(to.x, endY)).release().perform();

	}
	@Keyword
	def boolean scrollListToElementWithTextDownToUp(String elementText) {
		boolean isElementFound = false;
		while (isElementFound == false) {
			String xpath = "";
			xpath = XPathBuilder.createXPath("TextView");
			List<RemoteWebElement> listElements = (List<RemoteWebElement>) driver.findElementsByXPath(xpath);
			for (int i = 0; i<listElements.size(); i++) {
				String textItem = listElements[i].getText()
				if (textItem == elementText) {
					isElementFound = true;
					return true;
				}
			}
		}
		scrollEntireList_DownToUp()
	}
}
