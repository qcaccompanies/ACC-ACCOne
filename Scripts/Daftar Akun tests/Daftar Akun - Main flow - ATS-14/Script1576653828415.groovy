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

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(975, 350)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(94, 1120)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (kontrak.toString() == 'belum') {
    Mobile.tapAtPosition(503, 1305)

    WebUI.callTestCase(findTestCase('Daftar Akun tests/Daftar Akun - ATS-14'), [('name') : name, ('email') : email, ('phoneNo') : phoneNo
            , ('radio') : radio, ('otp') : otp, ('password') : password, ('confPassword') : confPassword, ('condition') : condition
            , ('status') : status], FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.tapAtPosition(540, 1170)

    Mobile.setText(findTestObject('Daftar Akun - ATS-14/Field Nopol'), noPol, 0)

    Mobile.tapAtPosition(800, 2005)

    if (status.toString() == 'failed') {
        if (condition.toString() == 'noPolEmpty') {
            Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warnings/Nomor Polisi Empty'), 0)
        } else if (condition.toString() == 'noPolNotFound') {
            Mobile.verifyElementVisible(findTestObject('Daftar Akun - ATS-14/Warn KontrakNo Polisi tidak terdaftar'), 0)
        }
    } else if (status.toString() == 'success') {
        Mobile.tap(findTestObject('Daftar Akun - ATS-14/Btn Pick NoTelp'), 0)

        Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Daftar Akun - ATS-14/OTP Nomor Polisi'), '', 0)

        Mobile.tap(findTestObject('Daftar Akun - ATS-14/Btn Verif OTP NoPol'), 0)

        Mobile.setText(findTestObject('Daftar Akun - ATS-14/Email Field'), '', 0)

        switch (radio.toString()) {
            case 'laki':
                Mobile.tap(findTestObject('Daftar Akun - ATS-14/Btn Laki-Laki'), 0)

                break
            case 'perempuan':
                Mobile.tap(findTestObject('Daftar Akun - ATS-14/Btn Perempuan'), 0)

                break
        }
        
        Mobile.setText(findTestObject('Daftar Akun - ATS-14/Password Field'), '', 0)

        Mobile.setText(findTestObject('Daftar Akun - ATS-14/Confirm Password Field'), '', 0)

        Mobile.tap(findTestObject('Daftar Akun - ATS-14/Daftar Button'), 0)
    }
}

Mobile.closeApplication()

