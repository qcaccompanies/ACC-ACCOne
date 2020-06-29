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

Mobile.startApplication('C:\\Users\\lieto\\git\\ACC-Seamless-ACCOne\\acc.one (1).apk', false)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home/Icon Akun'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Label Lihat Profil'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Ubah Email - ATS-13/Icon Edit Email'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Ubah Email - ATS-13/Field Old Email'), oldEmail, 0)

Mobile.setText(findTestObject('Ubah Email - ATS-13/Field New Email'), newEmail, 0)

switch (status.toString()) {
    case 'failed':
        if (condition.toString() == 'emptyOldEmail') {
            Mobile.verifyElementVisible(findTestObject('Ubah Email - ATS-13/Warn Old Email Empty'), 0)
        } else if (condition.toString() == 'emptyNewEmail') {
            Mobile.verifyElementVisible(findTestObject('Ubah Email - ATS-13/Warn New Email Empty'), 0)
        } else if (condition.toString() == 'oldEmailWrong') {
            Mobile.verifyElementVisible(findTestObject('Ubah Email - ATS-13/Warn Old Email Wrong'), 0)
        } else if (condition.toString() == 'newEmailShort') {
            Mobile.verifyElementVisible(findTestObject('Ubah Email - ATS-13/Warn New Email Format Short'), 0)
        } else if (condition.toString() == 'newEmailWrong') {
            Mobile.verifyElementVisible(findTestObject('Ubah Email - ATS-13/Warn New Email Format Wrong'), 0)
        }
        
        break
    case 'success':
        Mobile.tap(findTestObject('Ubah Email - ATS-13/Btn Submit'), 0)

        Mobile.tap(findTestObject('Ubah Email - ATS-13/Btn Okay'), 0)
}

Mobile.closeApplication()

