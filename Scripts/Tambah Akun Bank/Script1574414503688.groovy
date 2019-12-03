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

Mobile.startApplication('C:/Users/Marvin/Documents/GitHub/ACC-Seamless/acc.one (1).apk', false)

Mobile.tap(findTestObject('TambahAkunBank/Btn_Akun'), 0)

Mobile.tap(findTestObject('TambahAkunBank/ListAkunBank'), 0)

Mobile.tap(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0)

Mobile.tap(findTestObject('TambahAkunBank/DDOWNNAMABANK'), 0)

Mobile.tap(findTestObject('TambahAkunBank/NAMABANK', [('text') : NamaBank]), 0)

Mobile.setText(findTestObject('TambahAkunBank/TextCabang'), 'FATMAWATI', 0)

Mobile.setText(findTestObject('TambahAkunBank/NamaPemilikText'), 'Marvin', 0)

Mobile.setText(findTestObject('TambahAkunBank/NomorRekeningText'), '033763533', 0)

Mobile.setText(findTestObject('TambahAkunBank/InputKataSandi'), 'Johannes!12', 0)

if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/AlertFieldNoRekening8char'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/AlertTextHarusDiisi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/FieldCabang3CharAlert'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.tap(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0)

    if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/RekeningSudahTerdaftar'), 0, FailureHandling.STOP_ON_FAILURE)) {
        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/PasswordTidakSesuai'), 0, FailureHandling.STOP_ON_FAILURE)) {
        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
    } else {
        Mobile.setText(findTestObject('TambahAkunBank/InsertOTP'), '261294', 0)

        Mobile.tap(findTestObject('TambahAkunBank/VerifikasiBTN'), 0)
    }
}

