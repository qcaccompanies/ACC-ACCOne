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

Mobile.tap(findTestObject('TambahAkunBank/BTN_Akun'), 0)

Mobile.tap(findTestObject('TambahAkunBank/ListAkunBank'), 0)

Mobile.tap(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0)

Mobile.tap(findTestObject('TambahAkunBank/DDOWNNAMABANK'), 0)

Mobile.tap(findTestObject('TambahAkunBank/NAMABANK', [('text') : NamaBank]), 0)

Mobile.setText(findTestObject('TambahAkunBank/TextCabang'), Cabang, 0)

Mobile.setText(findTestObject('TambahAkunBank/NamaPemilikText'), PemilikRek, 0)

Mobile.setText(findTestObject('TambahAkunBank/NomorRekeningText'), NoRek, 0)

Mobile.setText(findTestObject('TambahAkunBank/InputKataSandi'), Katasandi, 0)

Mobile.tap(findTestObject('TambahAkunBank/InputKataSandi'), 0)

if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/AlertFieldNoRekening8char'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/AlertTextHarusDiisi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/FieldCabang3CharAlert'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/AlertKataSandiHarusDiisi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.tap(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0)

    if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/RekeningSudahTerdaftar'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
    } else if (Mobile.verifyElementVisible(findTestObject('TambahAkunBank/PasswordTidakSesuai'), 0, FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('TambahAkunBank/TambahAkunBankBTN'), 0, FailureHandling.STOP_ON_FAILURE)
    } else {
        Mobile.setText(findTestObject('TambahAkunBank/InsertOTP'), OTP, 0)

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
            Mobile.verifyElementVisible(findTestObject('TopUP/Penarikan/BTN_Lanjut'), 0)

            break
        }
        
        break
}

