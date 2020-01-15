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

Mobile.tap(findTestObject('Tidak Login - ATS-9/Btn Panah Direct Ke List'), 0)

Mobile.verifyElementVisible(findTestObject('Tidak Login - ATS-9/Label Lokasi Cabang'), 0)

Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Back Icon'), 0)

Mobile.tap(findTestObject('Tidak Login - ATS-9/Label Masuk atau Daftar'), 0)

Mobile.verifyElementVisible(findTestObject('Tidak Login - ATS-9/Label Masuk acc.one'), 0)

Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Back Icon'), 0)

Mobile.tap(findTestObject('Tidak Login - ATS-9/Label Lihat Semua'), 0)

Mobile.verifyElementVisible(findTestObject('Tidak Login - ATS-9/Label Semua Promo'), 0)

Mobile.tap(findTestObject('Verifikasi Akun - ATS-11/Back Icon'), 0)

Mobile.closeApplication()

