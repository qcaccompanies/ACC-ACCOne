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

if (kontrak.toString() == 'belum') {
    Mobile.tap(findTestObject('Daftar Akun/Btn Belum Punya Kontrak'), 0)

    WebUI.callTestCase(findTestCase('Daftar Akun tests/Daftar Akun'), [('name') : name, ('email') : email, ('phoneNo') : phoneNo
            , ('radio') : radio, ('otp') : otp, ('password') : password, ('confPassword') : confPassword, ('condition') : condition
            , ('status') : status], FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.tap(findTestObject('Daftar Akun/Btn Punya Kontrak'), 0)

    Mobile.setText(findTestObject('Daftar Akun/Field Nopol'), noPol, 0)

    Mobile.tap(findTestObject('Daftar Akun/Btn Tambah Nopol'), 0)

    if (status.toString() == 'failed') {
        if (condition.toString() == 'noPolEmpty') {
            Mobile.verifyElementVisible(findTestObject('Daftar Akun/Warnings/Nomor Polisi Empty'), 0)
        } else if (condition.toString() == 'noPolNotFound') {
            Mobile.verifyElementVisible(findTestObject('Daftar Akun/Warnings/Nomor Polisi Not Found'), 0)
        }
    } else if (status.toString() == 'success') {
        Mobile.tap(findTestObject('Daftar Akun/Btn Pick NoTelp'), 0)

        Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Daftar Akun/OTP Nomor Polisi'), '', 0)

        Mobile.tap(findTestObject('Daftar Akun/Btn Verif OTP NoPol'), 0)

        Mobile.setText(findTestObject('Daftar Akun/Email Field'), '', 0)

        switch (radio.toString()) {
            case 'laki':
                Mobile.tap(findTestObject('Daftar Akun/Btn Laki-Laki'), 0)

                break
            case 'perempuan':
                Mobile.tap(findTestObject('Daftar Akun/Btn Perempuan'), 0)

                break
        }
        
        Mobile.setText(findTestObject('Daftar Akun/Password Field'), '', 0)

        Mobile.setText(findTestObject('Daftar Akun/Confirm Password Field'), '', 0)

        Mobile.tap(findTestObject('Daftar Akun/Daftar Button'), 0)
    }
}

Mobile.closeApplication()

