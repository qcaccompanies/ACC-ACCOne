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

WebUI.delay(20)

not_run: Mobile.tap(findTestObject('Ubah Foto Profil/MasukatauDaftar'), 0)

not_run: Mobile.setText(findTestObject('Ubah Foto Profil/etEmailAtauTelepon'), 'rizkariz20@gmail.com', 0)

not_run: Mobile.setText(findTestObject('Ubah Foto Profil/etPassword'), 'Rizkariz20', 0)

not_run: Mobile.tap(findTestObject('Ubah Foto Profil/btnMasuk'), 0)

Mobile.tap(findTestObject('Ubah Foto Profil/txtMyAccount'), 0)

WebUI.delay(5)

if (picture == 'galeri') {
    Mobile.tap(findTestObject('Ubah Foto Profil/btnFotoo'), 0)

    Mobile.tap(findTestObject('Ubah Foto Profil/fotoGaleri'), 0)

    Mobile.scrollToText(namaFoto, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Ubah Foto Profil/Select Photo', [('text') : namaFoto]), 0)

    if (condition == 'passed') {
        Mobile.verifyElementVisible(findTestObject('Ubah Foto Profil/txtProfil'), 0)
    }
} else {
    Mobile.tap(findTestObject('Ubah Foto Profil/btnFotoo'), 0)

    Mobile.tap(findTestObject('Ubah Foto Profil/btnOptionCamera'), 0)

    Mobile.tapAtPosition(380, 1166)

    if (takePhoto == 'Yes') {
        Mobile.tap(findTestObject('Ubah Foto Profil/btnDone'), 0)

        if (condition == 'passed') {
            Mobile.verifyElementVisible(findTestObject('Ubah Foto Profil/txtProfil'), 0)
        }
    } else {
        Mobile.tap(findTestObject('Ubah Foto Profil/btnClose'), 0)

        Mobile.pressBack()

        if (condition == 'passed') {
            Mobile.verifyElementVisible(findTestObject('Ubah Foto Profil/txtLihatProfil'), 0)
        }
    }
}

