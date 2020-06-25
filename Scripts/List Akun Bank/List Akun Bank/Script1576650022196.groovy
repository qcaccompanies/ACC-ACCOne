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

Mobile.startApplication('C:\\Users\\Hari Sapto\\git\\ACC-ACCOne\\acc.one (1).apk', false)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(990, 2025)

Mobile.tap(findTestObject('List Akun Bank ATS-5/Lihat_Akun_BTN'), 0)

Mobile.setText(findTestObject('List Akun Bank ATS-5/Search_Akun_Bank'), SearchAkunBank, 0)

if (Mobile.verifyElementVisible(findTestObject('List Akun Bank ATS-5/Akun_Tidak_Ditemukan'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('List Akun Bank ATS-5/Tambah_Akun_Bank_BTN'), 0)
} else {
    Mobile.tap(findTestObject('List Akun Bank ATS-5/More'), 0)

    Mobile.tap(findTestObject('List Akun Bank ATS-5/Jadikan_Utama_Button'), 0)

    if (Mobile.verifyElementNotVisible(findTestObject('List Akun Bank ATS-5/Utama_POP'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('List Akun Bank ATS-5/Tambah_Akun_Bank_BTN'), 0, FailureHandling.STOP_ON_FAILURE)
    } else {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.pressBack()

        Mobile.tap(findTestObject('List Akun Bank ATS-5/Lihat_Akun_BTN'), 0)
    }
}

