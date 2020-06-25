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

Mobile.setText(findTestObject('Daftar Akun - ATS-14/Name Field'), name, 0)

Mobile.setText(findTestObject('Daftar Akun - ATS-14/Email FIeld'), email, 0)

Mobile.setText(findTestObject('Daftar Akun - ATS-14/Phone No Field'), phoneNo, 0)

switch (radio.toString()) {
    case 'laki':
        Mobile.tap(findTestObject('Daftar Akun - ATS-14/Btn Laki-Laki'), 0)

        break
    case 'perempuan':
        Mobile.tap(findTestObject('Daftar Akun - ATS-14/Btn Perempuan'), 0)

        break
}

Mobile.setText(findTestObject('Daftar Akun - ATS-14/Password Field'), password, 0)

Mobile.setText(findTestObject('Daftar Akun - ATS-14/Confirm Password Field'), confPassword, 0)

if (status.toString() == 'failed') {
    if (condition.toString() == 'nameEmpty') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warn Nama Lengkap Minimal 3 Karakter dan Maksimal 50 Karakter'), 
            0)
    } else if (condition.toString() == 'nameShort') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warn Nama Lengkap Minimal 3 Karakter dan Maksimal 50 Karakter'), 
            0)
    } else if (condition.toString() == 'emailEmpty') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warn Empty Alamat Email'), 0)
    } else if (condition.toString() == 'emailInvalid') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warn Format email belum sesuai'), 0)
    } else if (condition.toString() == 'emailExist') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warn Email sudah digunakan'), 0)
    } else if (condition.toString() == 'phoneNoEmpty') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warn No. Handphone Empty'), 0)
    } else if (condition.toString() == 'phoneNoShort') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warn No. Handphone Min. 9 Digit'), 0)
    } else if (condition.toString() == 'phoneNoExist') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tapAtPosition(517, 2017)

        Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warn Nomor ponsel sudah digunakan'), 0)
    } else if (condition.toString() == 'passInvalid') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warn Format Pass belum sesuai'), 0)
    } else if (condition.toString() == 'confPassNotMatch') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.tapAtPosition(517, 2017)

        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warn Konfirmasi Kata Sandi Tidak Sama'), 0)
    }
} else if (status.toString() == 'succeed') {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAtPosition(517, 2017)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.setText(findTestObject('Daftar Akun - ATS-14/OTP Field'), otp, 0)

    Mobile.delay(50, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.tap(findTestObject('Daftar Akun - ATS-14/Btn Verifikasi OTP'), 0)

    not_run: Mobile.tap(findTestObject('Daftar Akun - ATS-14/Btn Masuk'), 0)
}

