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

Mobile.startApplication('C:\\Users\\Marvin\\Documents\\GitHub\\ACC-Seamless-ACCOne\\acc.one_dev.apk', false)

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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TambahAkunBank/v2Tambah Akun Bank'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (condition == 'passed') {
    Mobile.tap(findTestObject('TambahAkunBank/v2namaBank'), 0)

    Mobile.setText(findTestObject('TambahAkunBank/v2namaBank'), namaBank, 0)

    not_run: Mobile.tap(findTestObject('TambahAkunBank/tapObject', [('text') : namaBank]), 0)

    Mobile.tap(findTestObject('TambahAkunBank/v2Cabang'), 0)

    Mobile.setText(findTestObject('TambahAkunBank/v2Cabang'), cabang, 0)

    not_run: Mobile.tap(findTestObject('TambahAkunBank/tapObject', [('text') : cabang]), 0)

    Mobile.setText(findTestObject('TambahAkunBank/v2namaPemilikRekening'), namaPemilikRek, 0)

    Mobile.setText(findTestObject('TambahAkunBank/v2NomorRekening'), noRek, 0)

    if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2Jadikan Utama'), 0, FailureHandling.OPTIONAL)) {
        if (jadikanUtama == 'yes') {
            Mobile.tap(findTestObject('TambahAkunBank/v2Jadikan Utama'), 0)
        }
    }
    
    Mobile.tap(findTestObject('TambahAkunBank/v2Tambah Akun Bank Final'), 0)

    Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2CaptchaCheckBox'), 0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('TambahAkunBank/v2CaptchaCheckBox'), 0)

        Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('TambahAkunBank/v2Submit'), 0)
    }
    
    Mobile.setText(findTestObject('TambahAkunBank/v2OTPBox'), OTP, 0)

    Mobile.tap(findTestObject('TambahAkunBank/v2Verifikasi'), 0)

    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/tapObject', [('text') : noRek]), 0)
} else {
    if (condition == 'dropDownKosong') {
        Mobile.tap(findTestObject('TambahAkunBank/v2namaBank'), 0)

        Mobile.tapAtPosition(693, 315)

        Mobile.tap(findTestObject('TambahAkunBank/v2Cabang'), 0)

        Mobile.tapAtPosition(693, 315)

        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2Harus dipilih1'), 0)

        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2Harus di pilih2'), 0)
    } else if (condition == 'namaMin3Huruf') {
        Mobile.tap(findTestObject('TambahAkunBank/v2namaBank'), 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2namaBank'), namaBank, 0)

        Mobile.tap(findTestObject('TambahAkunBank/v2Cabang'), 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2Cabang'), cabang, 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2namaPemilikRekening'), namaPemilikRek, 0)

        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2Minimal 3 Karakter'), 0)
    } else if (condition == 'noRekMin8Angka') {
        Mobile.tap(findTestObject('TambahAkunBank/v2namaBank'), 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2namaBank'), namaBank, 0)

        Mobile.tap(findTestObject('TambahAkunBank/v2Cabang'), 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2Cabang'), cabang, 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2namaPemilikRekening'), namaPemilikRek, 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2NomorRekening'), noRek, 0)

        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2Minimal 8 Karakter'), 0)
    } else if (condition == 'noRekTidakBolehSama') {
        Mobile.tap(findTestObject('TambahAkunBank/v2namaBank'), 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2namaBank'), namaBank, 0)

        Mobile.tap(findTestObject('TambahAkunBank/v2Cabang'), 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2Cabang'), cabang, 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2namaPemilikRekening'), namaPemilikRek, 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2NomorRekening'), noRek, 0)

        if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2Jadikan Utama'), 0, FailureHandling.OPTIONAL)) {
            if (jadikanUtama == 'yes') {
                Mobile.tap(findTestObject('TambahAkunBank/v2Jadikan Utama'), 0)
            }
        }
        
        Mobile.tap(findTestObject('TambahAkunBank/v2Tambah Akun Bank Final'), 0)

        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2Silakan periksa kembali field yang ada'), 0)

        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2Nomor Rekening tidak boleh diisi dengan nilai yang sama'), 
            0)
    } else if (condition == 'OTPsalah') {
        Mobile.tap(findTestObject('TambahAkunBank/v2namaBank'), 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2namaBank'), namaBank, 0)

        Mobile.tap(findTestObject('TambahAkunBank/v2Cabang'), 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2Cabang'), cabang, 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2namaPemilikRekening'), namaPemilikRek, 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2NomorRekening'), noRek, 0)

        if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2Jadikan Utama'), 0, FailureHandling.OPTIONAL)) {
            if (jadikanUtama == 'yes') {
                Mobile.tap(findTestObject('TambahAkunBank/v2Jadikan Utama'), 0)
            }
        }
        
        Mobile.tap(findTestObject('TambahAkunBank/v2Tambah Akun Bank Final'), 0)

        Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

        if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2CaptchaCheckBox'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('TambahAkunBank/v2CaptchaCheckBox'), 0)

            Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('TambahAkunBank/v2Submit'), 0)
        }
        
        Mobile.setText(findTestObject('TambahAkunBank/v2OTPBox'), OTP, 0)

        Mobile.tap(findTestObject('TambahAkunBank/v2Verifikasi'), 0)

        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/v2Kode Verifikasi Anda salah'), 0)
    } else if (condition == 'backButton') {
        Mobile.tap(findTestObject('TambahAkunBank/v2namaBank'), 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2namaBank'), namaBank, 0)

        Mobile.tap(findTestObject('TambahAkunBank/v2Cabang'), 0)

        Mobile.setText(findTestObject('TambahAkunBank/v2Cabang'), cabang, 0)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.pressBack()

        if (backButton == 'yes') {
            Mobile.tap(findTestObject('TambahAkunBank/v2Back Ya'), 0)
        } else {
            Mobile.tap(findTestObject('TambahAkunBank/v2Back No'), 0)
        }
    }
}

