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

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnMasukatauDaftar'), 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnDaftar'), 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnPunyaKontrak'), 0)

Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextNoPolisi'), noPolisi, 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnDaftarNoPolisi'), 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/tapObject', [('text') : digitTelp]), 0)

Mobile.delay(50, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextNamaLengkap'), namaLengkap, 0)

if (condition == 'namaMin3Karakter') {
    Mobile.verifyElementExist(findTestObject('Daftar - Punya Kontrak/alertNamaLengkapMinimal3KarakterdanMaksimal50Karakter'), 
        0)
} else {
    Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextEmail'), alamatEmail, 0)

    if (condition == 'emailMasihKosong') {
        not_run: Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnDaftarAkun'), 0)

        Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextConfirmPassword'), confirmPassword, 0)

        Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextPassword'), password, 0)

        if (jenisKelamin == 'perempuan') {
            Mobile.tap(findTestObject('Daftar - Punya Kontrak/perempuan'), 0)
        } else {
            Mobile.tap(findTestObject('Daftar - Punya Kontrak/lakilaki'), 0)
        }
        
        Mobile.verifyElementExist(findTestObject('Daftar - Punya Kontrak/alertSilakanisiemail'), 0)
    } else if (condition == 'formatEmailInvalid') {
        Mobile.verifyElementExist(findTestObject('Daftar - Punya Kontrak/alertFormatemailbelumsesuai'), 0)
    } else if (condition == 'emailSudahTerdaftar') {
        Mobile.verifyElementExist(findTestObject('Daftar - Punya Kontrak/alertEmailsudahdigunakan'), 0)
    } else {
        if (jenisKelamin == 'perempuan') {
            Mobile.tap(findTestObject('Daftar - Punya Kontrak/perempuan'), 0)
        } else {
            Mobile.tap(findTestObject('Daftar - Punya Kontrak/lakilaki'), 0)
        }
        
        Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextPassword'), password, 0)

        if (condition == 'kataSandiKosong') {
            Mobile.verifyElementExist(findTestObject('Daftar - Punya Kontrak/alertKataSandiHarusDiisi'), 0)
        } else if (condition == 'passMin7Karakter') {
            Mobile.verifyElementExist(findTestObject('Daftar - Punya Kontrak/alertPasswordminimal7karakter'), 0)
        } else if (condition == 'passMin1Huruf') {
            Mobile.verifyElementExist(findTestObject('Daftar - Punya Kontrak/alertFormatbelumsesuai'), 0)
        } else if (condition == 'passMin1Angka') {
            Mobile.verifyElementExist(findTestObject('Daftar - Punya Kontrak/alertFormatbelumsesuai'), 0)
        } else {
        }
        
        Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextConfirmPassword'), confirmPassword, 0)

        not_run: Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnDaftarAkun'), 0)
    }
}

