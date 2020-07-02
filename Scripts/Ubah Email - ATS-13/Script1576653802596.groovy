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

Mobile.startApplication('C:\\Users\\lieto\\git\\ACC-ACCOne\\acc.one (preprod).apk', false)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(990, 2150)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Akun/Label Lihat Profil'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Ubah Email - ATS-13/Icon Edit Email'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Ubah Email - ATS-13/Field Old Email'), oldEmail, 0)

Mobile.tapAtPosition(520, 800)

Mobile.setText(findTestObject('Ubah Email - ATS-13/Field New Email'), newEmail, 0)

Mobile.tapAtPosition(520, 800)

switch (status.toString()) {
    case 'failed':
        if (condition.toString() == 'oldEmailWrong') {
            Mobile.verifyElementAttributeValue(findTestObject('Ubah Email - ATS-13/Btn Submit Disabled'), 'enabled', 'false', 
                0)
        } else if (condition.toString() == 'newEmailShort') {
            Mobile.verifyElementVisible(findTestObject('Ubah Email - ATS-13/New Warn Email Short'), 0)
        } else if (condition.toString() == 'newEmailWrong') {
            Mobile.verifyElementVisible(findTestObject('Ubah Email - ATS-13/New Warn Email Invalid'), 0)
        } else if (condition.toString() == 'newEmailSpace') {
            Mobile.verifyElementVisible(findTestObject('Ubah Email - ATS-13/New Warn Email Cant Contain Space'), 0)
        }
        
        break
    case 'success':
        Mobile.tap(findTestObject('Ubah Email - ATS-13/Field New Email'), 0)

        Mobile.tapAtPosition(520, 800)

        Mobile.tap(findTestObject('Ubah Email - ATS-13/Btn Submit'), 0)

        Mobile.tap(findTestObject('Ubah Email - ATS-13/Btn Okay'), 0)
}

Mobile.closeApplication()

