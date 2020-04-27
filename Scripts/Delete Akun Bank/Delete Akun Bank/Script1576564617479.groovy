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

    Mobile.setText(findTestObject('Logout/email'), 'rizkariz20@gmail.com', 0)

    Mobile.setText(findTestObject('Logout/password'), A123456, 0)

    Mobile.tap(findTestObject('Logout/Masuk'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAtPosition(651, 1235)
}

Mobile.tap(findTestObject('Delete Akun Bank/v2btnLihatAkunBank'), 0)

Mobile.setText(findTestObject('Delete Akun Bank/v2FieldText'), NoRek, 0)

if (Mobile.verifyElementVisible(findTestObject('Delete Akun Bank/v2TextUtama'), 0, FailureHandling.OPTIONAL)) {
    Mobile.pressBack()
} else {
    Mobile.tap(findTestObject('Delete Akun Bank/tapObject', [('text') : NoRek]), 0)

    Mobile.tap(findTestObject('Delete Akun Bank/v2btnHapusAkun'), 0)

    if (condition == 'passed') {
        Mobile.tap(findTestObject('Delete Akun Bank/v2btnYa'), 0)

        Mobile.verifyElementVisible(findTestObject('Delete Akun Bank/v2Akun bank berhasil di hapus.'), 0)
    } else {
        Mobile.tap(findTestObject('Delete Akun Bank/v2btnTidak'), 0)
    }
}

