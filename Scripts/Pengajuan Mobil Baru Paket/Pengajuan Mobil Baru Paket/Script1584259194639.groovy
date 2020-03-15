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

Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/cariMobilBtn'), 0)

Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/mobilBaruBtn'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

if (paket == 'Yes') {
    CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 270)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/newTapObject', [('text') : namaMobil]), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 300)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (gantiPaket == 'Yes') {
        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/newTapObject', [('text') : namaPaketBaru]), 
            0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/pilihPaket'), 0)
    } else {
        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/newTapObject', [('text') : namaPaketBaru]), 
            0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/kembaliPaket'), 0)
    }
    
    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/simKred2'), 0)

    WebUI.callTestCase(findTestCase('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket'), [('paket') : paket, ('namaMobil') : namaMobil
            , ('gantiPaket') : gantiPaket, ('namaPaketBaru') : namaPaketBaru, ('persenDP') : persenDP, ('periodeBayar') : periodeBayar
            , ('creditOrCash') : creditOrCash, ('protection') : protection, ('condition') : condition], FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/Ajukan Unit Sekarang'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/catatan'), catatan, 0)

    if (agreeTermsAndCondition == 'Yes') {
        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/agree'), 0)

        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/Ajukan Sekarang'), 0)
    }
} else if (brand == 'Toyota') {
    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/boxToyota'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(namaMobil, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/newTapObject', [('text') : namaMobil]), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 300)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/txtHitungSimulasi'), 0)

    WebUI.callTestCase(findTestCase('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket'), [('paket') : paket, ('namaMobil') : namaMobil
            , ('gantiPaket') : gantiPaket, ('namaPaketBaru') : namaPaketBaru, ('persenDP') : persenDP, ('periodeBayar') : periodeBayar
            , ('creditOrCash') : creditOrCash, ('protection') : protection, ('condition') : condition], FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/Ajukan Unit Sekarang'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/catatan'), catatan, 0)

    if (agreeTermsAndCondition == 'Yes') {
        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/agree'), 0)

        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/Ajukan Sekarang'), 0)
    }
} else if (brand == 'Daihatsu') {
    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/boxDaihatsu'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(namaMobil, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/newTapObject', [('text') : namaMobil]), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 300)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/txtHitungSimulasi'), 0)

    WebUI.callTestCase(findTestCase('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket'), [('paket') : paket, ('namaMobil') : namaMobil
            , ('gantiPaket') : gantiPaket, ('namaPaketBaru') : namaPaketBaru, ('persenDP') : persenDP, ('periodeBayar') : periodeBayar
            , ('creditOrCash') : creditOrCash, ('protection') : protection, ('condition') : condition], FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/Ajukan Unit Sekarang'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/catatan'), catatan, 0)

    if (agreeTermsAndCondition == 'Yes') {
        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/agree'), 0)

        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/Ajukan Sekarang'), 0)
    }
}

