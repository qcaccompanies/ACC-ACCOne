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

Mobile.tapAtPosition(651, 1235)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Logout/Masuk  Daftar'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Logout/Masuk  Daftar'), 0)

    Mobile.setText(findTestObject('Logout/email'), email, 0)

    Mobile.setText(findTestObject('Logout/password'), password, 0)

    Mobile.tap(findTestObject('Logout/Masuk'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAtPosition(651, 1235)
}

Mobile.tap(findTestObject('Akun/Label Kritik  Saran'), 0)

Mobile.tap(findTestObject('Akun Saya - Kritik dan Saran/Label Kritik  Saran Produk'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun Saya - Kritik dan Saran/Field Kritik  Saran'), 0)

Mobile.setText(findTestObject('Akun Saya - Kritik dan Saran/Field Kritik  Saran'), kritikSaran, 0)

Mobile.tap(findTestObject('Akun Saya - Laporkan Bug/Btn Submit'), 0)

if (condition.toString() == 'emptyField') {
    Mobile.verifyElementExist(findTestObject('Akun Saya - Kritik dan Saran/Field Tidak Boleh Kosong'), 0)
} else {
    Mobile.verifyElementVisible(findTestObject('Akun Saya - Kritik dan Saran/Terima kasih.'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Akun Saya - Kritik dan Saran/btnYeay'), 0)
}

