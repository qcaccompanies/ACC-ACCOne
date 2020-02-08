import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Trade In/Start_Application'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Trade In/Cari_Dana_BTN'), 0)

Mobile.tap(findTestObject('Trade In/Trade_In_BTN'), 0)

WebUI.callTestCase(findTestCase('Trade In/Detail Kendaraan'), [('Brand') : 'DAIHATSU', ('Type') : 'AYLA', ('Model') : 'T:1.0 M A/T NEW'
        , ('Tahun') : '2018', ('Lokasi') : 'Jakarta'], FailureHandling.STOP_ON_FAILURE)

if (JenisMobil == 'Baru') {
    Mobile.tap(findTestObject('Trade In/NewCar'), 0)

    WebUI.callTestCase(findTestCase('Trade In/Mobil Baru'), [('BrandTrade') : 'DAIHATSU', ('TypeTrade') : 'NEW AYLA', ('ModelTrade') : 'T:1.0 X DLX M/T'
            , ('TahunTrade') : '2019', ('LokasiTrade') : 'Jakarta'], FailureHandling.STOP_ON_FAILURE)
} else if (JenisMobil == 'Bekas') {
    Mobile.tap(findTestObject('Trade In/UsedCar'), 0)

    WebUI.callTestCase(findTestCase('Trade In/Mobile Bekas'), [('Brand') : 'DAIHATSU', ('Type') : 'AYLA', ('Model') : 'T:1.0 M A/T NEW'
            , ('Tahun') : '2019', ('Lokasi') : 'Jakarta', ('JenisMobil') : 'Baru'], FailureHandling.STOP_ON_FAILURE)
}

