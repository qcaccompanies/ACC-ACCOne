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

Mobile.startApplication('C:\\Users\\lieto\\git\\ACC-ACCOne\\acc.one (testing).apk', false)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(990, 2150)

Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Label Verifikasi Akun'), 0)

switch (status.toString()) {
    case 'unverified':
        not_run: WebUI.callTestCase(findTestCase('Verifikasi AKun - ATS-11 Test/Verification Status'), [:], FailureHandling.STOP_ON_FAILURE)

        if (condition.toString() == 'success') {
            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Btn Upload KTP'), 0)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Btn Gallery Ktp'), 0)

            Mobile.scrollToText('ktp', FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/FOTO KTP'), 0)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Btn Upload Selfie'), 0)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Btn Gallery Selfie'), 0)

            Mobile.scrollToText('selfie', FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/FOTO SELFIE'), 0)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Btn Upload NPWP'), 0)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Btn Gallery NPWP'), 0)

            Mobile.scrollToText('npwp', FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/FOTO NPWP'), 0)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Btn Upload KK'), 0)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Btn Gallery KK'), 0)

            Mobile.scrollToText('kk', FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/FOTO KK'), 0)

            Mobile.setText(findTestObject('Verifikasi Akun - ATS-11/Field No NIK'), nik, 0)

            Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Btn Upload Dokumen'), 0)
        } else if (condition.toString() == 'failed') {
            if (condition2.toString() == 'ktpEmpty') {
                Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Btn Upload Dokumen'), 0)

                Mobile.verifyElementVisible(findTestObject('Verifikasi Akun - ATS-11/Warn KTP Empty'), 0)
            } else if (condition2.toString() == 'nikShort') {
                Mobile.setText(findTestObject('Verifikasi Akun - ATS-11/Field No NIK'), nik, 0)

                Mobile.verifyElementVisible(findTestObject('Verifikasi Akun - ATS-11/Warn NIK Short'), 0)
            } else if (condition2.toString() == 'nikEmpty') {
                Mobile.setText(findTestObject('Verifikasi Akun - ATS-11/Field No NIK'), nik, 0)

                Mobile.verifyElementVisible(findTestObject('Verifikasi Akun - ATS-11/Warn NIK Empty'), 0)
            }
        }
        
        break
    case 'back':
        Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Back Icon'), 0)

        Mobile.verifyElementVisible(findTestObject('Verifikasi Akun - ATS-11/Label Akun Saya'), 0)

        break
}

Mobile.closeApplication()

