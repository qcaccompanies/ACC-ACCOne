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

Mobile.tap(findTestObject('Buat Pengajuan/SImulasi_Hitung_Kredit'), 0)

not_run: Mobile.tap(findTestObject('Buat Pengajuan/Area_Pengajuan_Simulasi'), 0)

Mobile.tap(findTestObject('Buat Pengajuan/Cabang_Simulasi'), 0)

Mobile.setText(findTestObject('Buat Pengajuan/Cabang_Simulasi'), NamaCabang, 0)

Mobile.tap(findTestObject('Buat Pengajuan/Area_Cabang', [('text') : NamaCabang]), 0)

if (DP == 'Persen') {
    Mobile.setText(findTestObject('Buat Pengajuan/DP_Simulasi_Persen'), DPPersen, 0)

    if (Mobile.verifyElementVisible(findTestObject('Buat Pengajuan/30Persen', [('text') : DPPersen]), 0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Buat Pengajuan/20', [('text') : DPPersen]), 0)
    }
} else if (DP == 'Uang') {
    Mobile.setText(findTestObject('Buat Pengajuan/Uang_DP_Simulasi'), DPNominal, 0)
}

if (Periode == '12') {
    Mobile.tapAtPosition(84, 1454)
} else if (Periode == '24') {
    Mobile.tapAtPosition(312, 1454)
} else if (Periode == '36') {
    Mobile.tapAtPosition(540, 1454)
} else if (Periode == '48') {
    Mobile.tapAtPosition(766, 1454)
} else if (Periode == '60') {
    Mobile.tapAtPosition(994, 1454)
}

if (PembayaranAsuransi == 'Credit') {
    Mobile.tap(findTestObject('Buat Pengajuan/Credit_Radio_BTN'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
} else if (PembayaranAsuransi == 'Cash') {
    Mobile.tap(findTestObject('Buat Pengajuan/Cash_Radio_BTN'), 0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

if (CreditProtection == 'Yes') {
    Mobile.checkElement(findTestObject('Buat Pengajuan/ACC_Credit_Protection_Checklist'), 0)
} else if (CreditProtection == 'No') {
    Mobile.uncheckElement(findTestObject('Buat Pengajuan/ACC_Credit_Protection_Checklist'), 0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Buat Pengajuan/Alert_Cabang_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Buat Pengajuan/SimpanSimulasi'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('Buat Pengajuan/Alert_DP_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Buat Pengajuan/SimpanSimulasi'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('Buat Pengajuan/Alert_DP_Min20'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Buat Pengajuan/SimpanSimulasi'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('Buat Pengajuan/Alert_Uang_Muka_20dariOTR'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(null, 0, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.tap(findTestObject('Buat Pengajuan/SimpanSimulasi'), 0)
}

