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

Mobile.startApplication('D:\\MY WORLD\\KULIAH (TUGAS)\\TGS SEMS. 8\\INTERNSHIT\\Task ACC ONE\\ACC-ACCOne\\acc.one (2).apk', 
    false)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Lihat Status Pengajuan/btnStatusPeng'), 0)

if (condition == 'searchByScroll') {
    Mobile.scrollToText(namaMobil, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Lihat Status Pengajuan/tapObject', [('text') : namaMobil]), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Lihat Status Pengajuan/btnLihat Detail Pengajuan'), 0)

    Mobile.tap(findTestObject('Lihat Status Pengajuan/btnLihat Detail Pengajuan'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.setText(findTestObject('Lihat Status Pengajuan/editTextSearch'), namaMobil, 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Lihat Status Pengajuan/tapObject', [('text') : namaMobil]), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    if (condition == 'failed') {
        Mobile.verifyElementNotVisible(findTestObject('Lihat Status Pengajuan/tapObject', [('text') : namaMobil]), 0)
    } else {
        Mobile.verifyElementVisible(findTestObject('Lihat Status Pengajuan/btnLihat Detail Pengajuan'), 0)

        Mobile.tap(findTestObject('Lihat Status Pengajuan/btnLihat Detail Pengajuan'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
    }
}

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

