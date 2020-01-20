import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.remote.RemoteWebElement as RemoteWebElement
import com.detroitlabs.katalonmobileutil.testobject.XPathBuilder as XPathBuilder
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory


Mobile.tap(findTestObject('Ubah Tanggal Lahir - ATS-21/Label Tahun'), 0)

driver = MobileDriverFactory.getDriver()

String xpath = ''

xpath = XPathBuilder.createXPath('TextView')

List<RemoteWebElement> listElements = ((driver.findElementsByXPath(xpath)) as List<RemoteWebElement>)

if (listElements[(listElements.size() - 1)].getText() < varTahun) {
    varScrollUpDown = 'DownToUp'
} else {
    varScrollUpDown = 'UpToDown'
}

switch (varScrollUpDown.toString()) {
    case 'UpToDown':
        CustomKeywords.'mobile.swiping.scrollListToElementWithTextUpToDown'(varTahun)

        break
    case 'DownToUp':
        CustomKeywords.'mobile.swiping.scrollListToElementWithTextDownToUp'(varTahun)

        break
}

