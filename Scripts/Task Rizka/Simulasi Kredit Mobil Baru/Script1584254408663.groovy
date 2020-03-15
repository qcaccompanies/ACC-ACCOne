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

Mobile.startApplication('D:\\MY WORLD\\KULIAH (TUGAS)\\TGS SEMS. 8\\INTERNSHIT\\Backup\\ACC-ACCOne\\acc.one (2).apk', false)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/cariMobilBtn'), 0)

Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/mobilBaruBtn'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 270)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/newTapObject', [('text') : namaMobil]), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 300)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (gantiPaket == 'yes') {
    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/newTapObject', [('text') : namaPaketBaru]), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/pilihPaket'), 0)
} else {
    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/newTapObject', [('text') : namaPaketBaru]), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/kembaliPaket'), 0)
}

Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/simKred2'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/DPbtn'), 0, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/text1'), 0, FailureHandling.STOP_ON_FAILURE)

if (persenDP == '16') {
    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/android.view.View0 - 16'), 0)
} else if (persenDP == '20') {
    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/android.view.View0 - 20'), 0)
} else if (persenDP == '25') {
    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/android.view.View0 - 25'), 0)
} else {
    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/android.view.View0 - 30'), 0)
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (periodeBayar == '12') {
    Mobile.tapAtPosition(50, 750)
} else if (periodeBayar == '24') {
    Mobile.tapAtPosition(211, 750)
} else if (periodeBayar == '36') {
    Mobile.tapAtPosition(360, 750)
} else if (periodeBayar == '48') {
    Mobile.tapAtPosition(516, 750)
} else {
    Mobile.tapAtPosition(663, 750)
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (creditOrCash != 'Credit') {
    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/cash'), 0)
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (protection != 'Yes') {
    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/protection'), 0)
}

if (condition == 'cancelSaved') {
    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/back'), 0)
} else {
    Mobile.tap(findTestObject('Task Rizka/Simulasi Kredit Mobil Baru Biasa/save'), 0)
}

