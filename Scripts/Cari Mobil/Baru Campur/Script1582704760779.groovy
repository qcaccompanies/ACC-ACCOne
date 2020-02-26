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

Mobile.startApplication('D:\\MY WORLD\\KULIAH (TUGAS)\\TGS SEMS. 8\\INTERNSHIT\\Task ACC ONE\\ACC-ACCOne\\acc.one.apk', 
    false)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cari Mobil/Bekas Marketplace/boxCariMobil'), 0)

Mobile.tap(findTestObject('Cari Mobil/Baru/boxMobilBaru'), 0)

if (condition == 'passed') {
    Mobile.tap(findTestObject('Cari Mobil/Baru/boxSearchMobilBaru'), 0)

    Mobile.setText(findTestObject('Cari Mobil/Baru/boxSearchMobilBaru'), namaMobil, 0)

    Mobile.tap(findTestObject('Cari Mobil/Baru/boxSearchMobilBaru'), 0)

    Mobile.tapAtPosition(622, 1230)

    if (paket == 'yes') {
        Mobile.tap(findTestObject('Cari Mobil/Baru/android.view.View0 - Paket'), 0)
    } else if (paket == 'no') {
        Mobile.tap(findTestObject('Cari Mobil/Baru/android.view.View0 - Non Paket'), 0)
    }
    
    Mobile.scrollToText(spesific, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : spesific]), 0)

    Mobile.verifyElementNotVisible(findTestObject('Cari Mobil/Baru/textCautionMobilNotFoundBaru'), 0)
} else if (condition == 'failed') {
    Mobile.tap(findTestObject('Cari Mobil/Baru/boxSearchMobilBaru'), 0)

    Mobile.setText(findTestObject('Cari Mobil/Baru/boxSearchMobilBaru'), namaMobil, 0)

    Mobile.tap(findTestObject('Cari Mobil/Baru/boxSearchMobilBaru'), 0)

    Mobile.tapAtPosition(622, 1230)

    if (paket == 'yes') {
        Mobile.tap(findTestObject('Cari Mobil/Baru/android.view.View0 - Paket'), 0)
    } else if (paket == 'no') {
        Mobile.tap(findTestObject('Cari Mobil/Baru/android.view.View0 - Non Paket'), 0)
    }
    
    Mobile.scrollToText(spesific, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : spesific]), 0)

    Mobile.verifyElementVisible(findTestObject('Cari Mobil/Baru/textCautionMobilNotFoundBaru'), 0)

    Mobile.tap(findTestObject('Cari Mobil/Baru/btnUbahPencarian'), 0)
} else if (condition == 'daihatsuFailed') {
    Mobile.tap(findTestObject('Cari Mobil/Baru/boxDaihatsu'), 0)

    Mobile.tap(findTestObject('Cari Mobil/Baru/searchBoxDaihatsu'), 0)

    Mobile.setText(findTestObject('Cari Mobil/Baru/searchBoxDaihatsu'), namaMobil, 0)

    Mobile.tap(findTestObject('Cari Mobil/Baru/searchBoxDaihatsu'), 0)

    Mobile.tapAtPosition(622, 1230)

    Mobile.verifyElementVisible(findTestObject('Cari Mobil/Baru/cautionsToyotaNotFound'), 0)
} else if (condition == 'daihatsuPassed') {
    Mobile.tap(findTestObject('Cari Mobil/Baru/boxDaihatsu'), 0)

    Mobile.tap(findTestObject('Cari Mobil/Baru/searchBoxDaihatsu'), 0)

    Mobile.setText(findTestObject('Cari Mobil/Baru/searchBoxDaihatsu'), namaMobil, 0)

    Mobile.tap(findTestObject('Cari Mobil/Baru/searchBoxDaihatsu'), 0)

    Mobile.tapAtPosition(622, 1230)

    Mobile.verifyElementNotVisible(findTestObject('Cari Mobil/Baru/cautionsToyotaNotFound'), 0)
} else if (condition == 'toyotaPassed') {
    Mobile.tap(findTestObject('Cari Mobil/Baru/boxToyota'), 0)

    Mobile.tap(findTestObject('Cari Mobil/Baru/searchBoxToyota'), 0)

    Mobile.setText(findTestObject('Cari Mobil/Baru/searchBoxToyota'), namaMobil, 0)

    Mobile.tap(findTestObject('Cari Mobil/Baru/searchBoxToyota'), 0)

    Mobile.tapAtPosition(622, 1230)

    Mobile.verifyElementNotVisible(findTestObject('Cari Mobil/Baru/cautionsToyotaNotFound'), 0)
} else {
    Mobile.tap(findTestObject('Cari Mobil/Baru/boxToyota'), 0)

    Mobile.tap(findTestObject('Cari Mobil/Baru/searchBoxToyota'), 0)

    Mobile.setText(findTestObject('Cari Mobil/Baru/searchBoxToyota'), namaMobil, 0)

    Mobile.tap(findTestObject('Cari Mobil/Baru/searchBoxToyota'), 0)

    Mobile.tapAtPosition(622, 1230)

    Mobile.verifyElementVisible(findTestObject('Cari Mobil/Baru/cautionsToyotaNotFound'), 0)
}

