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

Mobile.tap(findTestObject('Home/Icon Akun'), 0)

Mobile.tap(findTestObject('Akun/Label Lihat Profil'), 0)

Mobile.tap(findTestObject('Ubah No HP - ATS-15/Icon Ubah No HP'), 0)

Mobile.setText(findTestObject('Ubah No HP - ATS-15/Field No Telp Lama'), oldNoTelp, 0)

Mobile.setText(findTestObject('Ubah No HP - ATS-15/Field No Telp Baru'), newNoTelp, 0)

switch (status.toString()) {
    case 'failed':
        if (condition.toString() == 'oldNoTelpEmpty') {
            Mobile.verifyElementVisible(findTestObject('Ubah No HP - ATS-15/Empty Old Phone Number'), 0)
        } else if (condition.toString() == 'newNoTelpEmpty') {
            Mobile.verifyElementVisible(findTestObject('Ubah No HP - ATS-15/Empty New Phone Number'), 0)
        } else if (condition.toString() == 'oldPhoneNoWrong') {
            Mobile.verifyElementVisible(findTestObject('Ubah No HP - ATS-15/Old Phone Number Wrong'), 0)
        } else if (condition.toString() == 'newPhoneNoShort') {
            Mobile.verifyElementVisible(findTestObject('Ubah No HP - ATS-15/New Phone Short'), 0)
        }
        
        break
    case 'success':
        Mobile.tap(findTestObject('Ubah No HP - ATS-15/Btn Konfirmasi'), 0)

        break
}

Mobile.closeApplication()

