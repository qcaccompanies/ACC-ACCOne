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

Mobile.startApplication('C:/Users/Marvin/Documents/GitHub/ACC-Seamless-ACCOne/acc.one (1).apk', false)

Mobile.tap(findTestObject('Back Button(Tambah Akun Bank)/Akun_Btn'), 0)

Mobile.tap(findTestObject('Back Button(Tambah Akun Bank)/LihatAkunBankBTN'), 0)

Mobile.tap(findTestObject('Back Button(Tambah Akun Bank)/Btn_Tambah_Akun_Bank'), 0)

if (IsiData == 'Tidak') {
    Mobile.tap(findTestObject('Back Button(Tambah Akun Bank)/Back_Btn'), 0)
} else if (IsiData == 'Ya') {
    Mobile.tap(findTestObject('TambahAkunBank/DDOWNNAMABANK'), 0)

    Mobile.tap(findTestObject('TambahAkunBank/NAMABANK', [('text') : NamaBank]), 0)

    Mobile.setText(findTestObject('TambahAkunBank/TextCabang'), Cabang, 0)

    Mobile.setText(findTestObject('TambahAkunBank/NamaPemilikText'), PemilikRek, 0)

    Mobile.setText(findTestObject('TambahAkunBank/NomorRekeningText'), NoRek, 0)

    Mobile.tap(findTestObject('Back Button(Tambah Akun Bank)/Back_Btn'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Back Button(Tambah Akun Bank)/PopUp_Ya_Tidak'), 0, FailureHandling.STOP_ON_FAILURE)) {
        Mobile.tap(findTestObject('Back Button(Tambah Akun Bank)/Ya_Btn'), 0)
    } else {
        Mobile.verifyElementNotVisible(findTestObject('Back Button(Tambah Akun Bank)/PopUp_Ya_Tidak'), 0, FailureHandling.STOP_ON_FAILURE)
    }
}

