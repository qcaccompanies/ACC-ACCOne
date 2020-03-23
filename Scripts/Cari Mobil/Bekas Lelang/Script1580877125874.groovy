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

Mobile.tap(findTestObject('Cari Mobil/Bekas Lelang/boxCariMobil'), 0)

Mobile.tap(findTestObject('Cari Mobil/Bekas Lelang/boxMobilBekas'), 0)

Mobile.tap(findTestObject('Cari Mobil/Bekas Lelang/boxLelang'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cari Mobil/Bekas Lelang/IBIDbtn'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cari Mobil/Bekas Lelang/btnPilihLokasi'), 0)

Mobile.hideKeyboard()

if (lokasi == 'BATAM') {
    Mobile.tap(findTestObject('Cari Mobil/Bekas Lelang/btnTapObject', [('text') : lokasi]), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Cari Mobil/Bekas Lelang/btnTapObject', [('text') : tanggalLelang]), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Cari Mobil/Bekas Lelang/btnTapObject', [('text') : namaEvent]), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Cari Mobil/Bekas Lelang/txtBoxCariMobil'), namaMobil, 0)

    if (condition == 'passed') {
        Mobile.verifyElementNotVisible(findTestObject('Cari Mobil/Bekas Lelang/alertCarNotFound'), 0)

        Mobile.tap(findTestObject('Cari Mobil/Bekas Lelang/btnTapObject', [('text') : namaMobil, ('text') : namaEvent]), 
            0)
    } else {
        Mobile.verifyElementVisible(findTestObject('Cari Mobil/Bekas Lelang/alertCarNotFound'), 0)
    }
} else {
    if (lokasi == '') {
        Mobile.tapAtPosition(87, 419)

        Mobile.verifyElementVisible(findTestObject('Cari Mobil/Bekas Lelang/alertHarusDipilih'), 0)
    } else {
        Mobile.tap(findTestObject('Cari Mobil/Bekas Lelang/btnTapObject', [('text') : lokasi]), 0)
    }
    
    Mobile.tap(findTestObject('Cari Mobil/Bekas Lelang/btnTapObject', [('text') : tanggalLelang]), 0)

    Mobile.verifyElementVisible(findTestObject('Cari Mobil/Bekas Lelang/alertTidakAdaEventLelang'), 0)
}

