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

Mobile.startApplication('C:\\Users\\lieto\\git\\ACC-Seamless\\acc.one (1).apk', false)

Mobile.tap(findTestObject('Daftar Akun/Label Daftar Akun'), 0)

Mobile.tap(findTestObject('Daftar Akun/Label Daftar'), 0)

Mobile.tap(findTestObject('Daftar Akun/Btn Belum Punya Kontrak'), 0)

Mobile.setText(findTestObject('Daftar Akun/Name Field'), name, 0)

Mobile.setText(findTestObject('Daftar Akun/Email FIeld'), email, 0)

Mobile.setText(findTestObject('Daftar Akun/Phone No Field'), phoneNo, 0)

switch (radio.toString()) {
    case 'laki':
        Mobile.tap(findTestObject('Daftar Akun/Btn Laki-Laki'), 0)

        break
    case 'perempuan':
        Mobile.tap(findTestObject('Daftar Akun/Btn Perempuan'), 0)

        break
}

Mobile.tap(findTestObject('Daftar Akun/Btn Laki-Laki'), 0)

Mobile.setText(findTestObject('Daftar Akun/Password Field'), password, 0)

Mobile.setText(findTestObject('Daftar Akun/Confirm Password Field'), confPassword, 0)

if (status.toString() == 'failed') {
    if (condition.toString() == 'nameEmpty') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun/Warnings/Warn Name Empty'), 0)
    } else if (condition.toString() == 'nameShort') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun/Warnings/Warn Name Short'), 0)
    } else if (condition.toString() == 'emailEmpty') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun/Warnings/Warn Email Empty'), 0)
    } else if (condition.toString() == 'emailInvalid') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun/Warnings/Warn Email Invalid'), 0)
    } else if (condition.toString() == 'emailExist') {
        Mobile.verifyElementVisible(findTestObject('Daftar Akun/Warnings/Warn Email Exist'), 0)
    }
} else if (status.toString() == 'succeed') {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Daftar Akun/Daftar Button'), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Daftar Akun/OTP Field'), otp, 0)

    Mobile.tap(findTestObject('Daftar Akun/Btn Verifikasi OTP'), 0)

    Mobile.tap(findTestObject('Daftar Akun/Btn Masuk'), 0)
}

Mobile.closeApplication()

