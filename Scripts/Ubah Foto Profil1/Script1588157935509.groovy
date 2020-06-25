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

WebUI.delay(20)

Mobile.tap(findTestObject('Ubah Foto Profil/txtMyAccount'), 0)

WebUI.delay(5)

if (picture == 'galeri') {
    Mobile.tap(findTestObject('Ubah Foto Profil/btnEditPhoto'), 0)

    Mobile.tap(findTestObject('Ubah Foto Profil/btnGalerry'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(namaFoto, FailureHandling.STOP_ON_FAILURE)

    if (condition == 'passed') {
        Mobile.tap(findTestObject('Ubah Foto Profil/Select Photo', [('text') : namaFoto]), 0)

        Mobile.verifyElementVisible(findTestObject('Ubah Foto Profil/Foto Profile Berhasil Diganti'), 0)
    } else if (condition == 'failed') {
        Mobile.pressBack()

        Mobile.verifyElementVisible(findTestObject('Ubah Foto Profil/Upload Gambar Gagal'), 0)
    }
} else {
    Mobile.tap(findTestObject('Ubah Foto Profil/btnEditPhoto'), 0)

    Mobile.tap(findTestObject('Ubah Foto Profil/btnOptionCamera'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAtPosition(380, 1166)

    if (condition == 'passedRetake') {
        Mobile.tap(findTestObject('Ubah Foto Profil/btnRetake'), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.tapAtPosition(380, 1166)
    }
    
    if (condition == 'failed') {
        Mobile.tap(findTestObject('Ubah Foto Profil/btnRetake'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.pressBack()

        Mobile.verifyElementVisible(findTestObject('Ubah Foto Profil/Upload Gambar Gagal'), 0)
    } else {
        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Ubah Foto Profil/btnDone'), 0)

        Mobile.verifyElementVisible(findTestObject('Ubah Foto Profil/Foto Profile Berhasil Diganti'), 0)
    }
}

