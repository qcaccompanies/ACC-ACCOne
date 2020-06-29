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

Mobile.startApplication('C:\\Users\\lieto\\git\\ACC-ACCOne\\acc.one (dev).apk', false)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(990, 2150)

Mobile.tap(findTestObject('Home/Icon Akun'), 0)

Mobile.tap(findTestObject('Login - ATS-19/Btn Masuk Daftar'), 0)

Mobile.setText(findTestObject('Login - ATS-19/Field Nomor HP Email'), username, 0)

Mobile.setText(findTestObject('Login - ATS-19/Field Password'), password, 0)

switch (status.toString()) {
    case 'failed':
        if (condition.toString() == 'usernameEmpty') {
            Mobile.verifyElementAttributeValue(findTestObject('Login - ATS-19/Btn Masuk Disabled'), 'enabled', 'false', 
                0)
        } else if (condition.toString() == 'passwordEmpty') {
            Mobile.verifyElementAttributeValue(findTestObject('Login - ATS-19/Btn Masuk Disabled'), 'enabled', 'false', 
                0)
        } else if (condition.toString() == 'usernameDontExist') {
            Mobile.tap(findTestObject('Login - ATS-19/Btn Masuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Login - ATS-19/Warn Email  Phone Number Doesnt Exist'), 0)
        } else if (condition.toString() == 'passwordWrong') {
            Mobile.tap(findTestObject('Login - ATS-19/Btn Masuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Login - ATS-19/Warn Username Password Salah'), 0)
        }
        
        break
    case 'success':
        Mobile.tap(findTestObject('Login - ATS-19/Btn Masuk'), 0)

        Mobile.verifyElementVisible(findTestObject('Home/Icon Home'), 0)

        break
}

Mobile.closeApplication()

