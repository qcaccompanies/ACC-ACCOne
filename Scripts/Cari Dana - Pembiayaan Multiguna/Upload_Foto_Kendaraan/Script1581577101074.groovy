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

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Upload_Foto_Mobil'), 0)

if (Upload == 'Camera') {
    Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Camera_BTN'), 0)
} else if (Upload == 'Galeri') {
    Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Galery_BTN'), 0)

    Mobile.scrollToText(Foto, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Select_Foto', [('text') : Foto]), 0)

    Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Btn_Berikutnya'), 0)
}

