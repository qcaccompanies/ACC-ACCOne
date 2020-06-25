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

Mobile.tapAtPosition(990, 2025)

Mobile.tap(findTestObject('Akun/Label Lihat Profil'), 0)

Mobile.tap(findTestObject('Ubah Email - ATS-13/Icon Edit Email'), 0)

Mobile.verifyElementVisible(findTestObject('Lihat Profil - ATS-16/Label Ubah Email'), 0)

Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Back Icon'), 0)

Mobile.verifyElementVisible(findTestObject('Lihat Profil - ATS-16/Label Profil'), 0)

Mobile.tap(findTestObject('Ubah No HP - ATS-15/Icon Edit Phone Number'), 0)

Mobile.verifyElementVisible(findTestObject('Lihat Profil - ATS-16/Label Ganti No Handphone'), 0)

Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Back Icon'), 0)

Mobile.verifyElementVisible(findTestObject('Lihat Profil - ATS-16/Label Profil'), 0)

Mobile.tap(findTestObject('Lihat Profil - ATS-16/Btn Ubah Kata Sandi'), 0)

Mobile.verifyElementVisible(findTestObject('Lihat Profil - ATS-16/Label Ubah Kata Sandi'), 0)

Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Back Icon'), 0)

Mobile.verifyElementVisible(findTestObject('Lihat Profil - ATS-16/Label Profil'), 0)

Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Back Icon'), 0)

Mobile.verifyElementVisible(findTestObject('Verifikasi Akun - ATS-11/Label Akun Saya'), 0)

Mobile.closeApplication()

