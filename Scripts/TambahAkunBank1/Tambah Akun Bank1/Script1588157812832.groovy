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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(990, 2025)

Mobile.tap(findTestObject('TambahAkunBank/ListAkunBank'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TambahAkunBank/Button Tambah Akun Bank'), 0)

not_run: Mobile.tapAtPosition(560, 1540)

not_run: Mobile.tap(findTestObject('TambahAkunBank/DropDNamaBank'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(200, 455)

Mobile.setText(findTestObject('TambahAkunBank/Text Nama Bank'), NamaBank, 0)

Mobile.delay(6, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('TambahAkunBank/NAMABANK', [('text') : NamaBank]), 0)

Mobile.tapAtPosition(235, 542)

Mobile.setText(findTestObject('TambahAkunBank/TextCabang'), Cabang, 0)

Mobile.setText(findTestObject('TambahAkunBank/Text Nama Pemilik Rekening1'), PemilikRek, 0)

Mobile.setText(findTestObject('TambahAkunBank/Text Nomor Rekening1'), NoRek, 0)

not_run: Mobile.setText(findTestObject('TambahAkunBank/InputKataSandi'), Katasandi, 0)

not_run: Mobile.tap(findTestObject('TambahAkunBank/InputKataSandi'), 0)

if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/Warn No Rekening Min 8 Karakter'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/Warn Nama Pemilik Rek Harus 3 Karakter'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/Warn Cabang'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/Warn Nama Bank'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.tap(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0)

    if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/RekeningSudahTerdaftar'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
    } else if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/PasswordTidakSesuai'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
    } else {
        Mobile.setText(findTestObject('TambahAkunBank/Text OTP'), OTP, 0)

        Mobile.tap(findTestObject('TambahAkunBank/VerifikasiBTN'), 0)
    }
}

switch ('Result') {
    case 'Pass':
        break
    case 'Fail':
        if (Keterangan.toString() == 'No Reg Sudah Ada ') {
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)

            break
        }
        
        if (Keterangan.toString() == 'Cabang Harus Diisi') {
            not_run: Mobile.verifyElementVisible(findTestObject('TambahAkunBank/Warn Cabang'), 0)

            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)

            break
        }
        
        if (Keterangan.toString() == 'Pemilik Harus Diisi') {
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)

            break
        }
        
        if (Keterangan.toString() == 'No Reg Harus Diisi') {
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)

            break
        }
        
        if (Keterangan.toString() == 'Password Harus Diisi') {
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)

            break
        }
        
        if (Keterangan.toString() == 'Password Salah') {
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)

            break
        }
        
        if (Keterangan.toString() == 'OTP Salah') {
            Mobile.verifyElementVisible(findTestObject('TambahAkunBank/Warn Kode Verifikasi Salah'), 0)

            break
        }
        
        if (Keterangan.toString() == 'Bank Harus Dipilih') {
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)

            break
        }
        
        break
}

