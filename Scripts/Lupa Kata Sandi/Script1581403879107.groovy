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

not_run: Mobile.tapAtPosition(443, 229)

Mobile.tapAtPosition(500, 250)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Lupa Kata Sandi/btnLupaKataSandi'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Lupa Kata Sandi/txtEmail'), 0)

Mobile.setText(findTestObject('Lupa Kata Sandi/editTextEmail'), email, 0)

Mobile.tap(findTestObject('Lupa Kata Sandi/btnKonfirmasi'), 0)

if (condition == 'emailSalah') {
    Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/Alert tidak terdaftar.'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (condition == 'emailKosong') {
    Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/Email Harus Diisi'), 0, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (kirimOTPke == 'email') {
        Mobile.tap(findTestObject('Lupa Kata Sandi/kirimKeEmail'), 0)
    } else {
        Mobile.tap(findTestObject('Lupa Kata Sandi/kirimSMS'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/checkBoxCaptcha'), 0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Lupa Kata Sandi/checkBoxCaptcha'), 0)

        Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Lupa Kata Sandi/SubmitCaptcha'), 0)
    }
    
    if (condition == 'kodeOTPsalah') {
        Mobile.setText(findTestObject('Lupa Kata Sandi/editTextOTP'), OTP, 0)

        Mobile.tap(findTestObject('Lupa Kata Sandi/btnVerifikasi'), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/v2Kode Verifikasi Anda salah'), 0)
    } else if (condition == 'tunggu1Menit') {
        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Lupa Kata Sandi/editTextOTP'), OTP, 0)

        Mobile.tap(findTestObject('Lupa Kata Sandi/btnVerifikasi'), 0)

        Mobile.setText(findTestObject('Lupa Kata Sandi/editTextOTP'), OTP, 0)

        Mobile.tap(findTestObject('Lupa Kata Sandi/btnVerifikasi'), 0)

        Mobile.setText(findTestObject('Lupa Kata Sandi/editTextOTP'), OTP, 0)

        Mobile.tap(findTestObject('Lupa Kata Sandi/btnVerifikasi'), 0)

        Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/alertTunggu1Menit'), 0)
    } else {
        Mobile.setText(findTestObject('Lupa Kata Sandi/editTextOTP'), OTP, 0)

        Mobile.tap(findTestObject('Lupa Kata Sandi/btnVerifikasi'), 0)

        Mobile.verifyElementNotVisible(findTestObject('Lupa Kata Sandi/v2Kode Verifikasi Anda salah'), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Lupa Kata Sandi/editTextSandi1'), kataSandi, 0)

        Mobile.setText(findTestObject('Lupa Kata Sandi/editTextSandi2'), kataSandi2, 0)

        if (condition == 'minimalAda1Angka') {
            Mobile.tap(findTestObject('Lupa Kata Sandi/btnResetDanMasuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/v2Minimal ada 1 karakter angka'), 0)
        } else if (condition == 'minimalAda1Huruf') {
            Mobile.tap(findTestObject('Lupa Kata Sandi/btnResetDanMasuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/v2Minimal ada 1 Huruf Kecil'), 0)
        } else if (condition == 'passwordHarusDiisi') {
            Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/v2Kata Sandi Harus Diisi'), 0)

            Mobile.tap(findTestObject('Lupa Kata Sandi/btnResetDanMasuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/v2Final Minimal 7 Karakter'), 0)
        } else if (condition == 'harus7Karakter') {
            Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/v2Password minimal 7 karakter'), 0)

            Mobile.tap(findTestObject('Lupa Kata Sandi/btnResetDanMasuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/v2Final Minimal 7 Karakter'), 0)
        } else if (condition == 'passwordTidakSesuai') {
            Mobile.tap(findTestObject('Lupa Kata Sandi/btnResetDanMasuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/v2Konfirmasi Kata Sandi tidak sesuai'), 0)
        } else if (condition == 'passed') {
            Mobile.tap(findTestObject('Lupa Kata Sandi/btnResetDanMasuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/alertPasswordBerhasilDiganti'), 0)
        } else if (condition == 'passwordTidakSesuaiHarusDiisi') {
            Mobile.tap(findTestObject('Lupa Kata Sandi/btnResetDanMasuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Lupa Kata Sandi/v2Konfirmasi Kata Sandi harus diisi'), 0)
        }
    }
}

