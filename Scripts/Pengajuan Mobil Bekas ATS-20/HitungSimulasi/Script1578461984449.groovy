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

Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/SImulasi_Hitung_Kredit'), 0)

not_run: Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Area_Pengajuan_Simulasi'), 0)

Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Cabang_Simulasi'), 0)

Mobile.setText(findTestObject('Buat Pengajuan Mobil Baru/Lama/Cabang_Simulasi'), NamaCabang, 0)

Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Area_Cabang', [('text') : NamaCabang]), 0)

if (DP == 'Persen') {
    Mobile.setText(findTestObject('Buat Pengajuan Mobil Baru/Lama/DP_Simulasi_Persen'), DPPersen, 0)

    if (Mobile.verifyElementVisible(findTestObject('Buat Pengajuan Mobil Baru/Lama/30Persen', [('text') : DPPersen]), 0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/20', [('text') : DPPersen]), 0)
    }
} else if (DP == 'Uang') {
    Mobile.setText(findTestObject('Buat Pengajuan Mobil Baru/Lama/Uang_DP_Simulasi'), DPNominal, 0)
}

if (Periode == '12') {
    Mobile.tapAtPosition(84, 1393)
} else if (Periode == '24') {
    Mobile.tapAtPosition(312, 1393)
} else if (Periode == '36') {
    Mobile.tapAtPosition(540, 1393)
} else if (Periode == '48') {
    Mobile.tapAtPosition(766, 1393)
} else if (Periode == '60') {
    Mobile.tapAtPosition(994, 1393)
}

if (PembayaranAsuransi == 'Credit') {
    Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Credit_Radio_BTN'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
} else if (PembayaranAsuransi == 'Cash') {
    Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Cash_Radio_BTN'), 0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

if (CreditProtection == 'Yes') {
    Mobile.checkElement(findTestObject('Buat Pengajuan Mobil Baru/Lama/ACC_Credit_Protection_Checklist'), 0)
} else if (CreditProtection == 'No') {
    Mobile.uncheckElement(findTestObject('Buat Pengajuan Mobil Baru/Lama/ACC_Credit_Protection_Checklist'), 0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Buat Pengajuan Mobil Baru/Lama/Alert_Cabang_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Buat Pengajuan Mobil Baru/Lama/SimpanSimulasi'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('Buat Pengajuan Mobil Baru/Lama/Alert_DP_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
    not_run: Mobile.verifyElementVisible(findTestObject('Buat Pengajuan Mobil Baru/Lama/SimpanSimulasi'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('Buat Pengajuan Mobil Baru/Lama/Alert_DP_Min20'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Buat Pengajuan Mobil Baru/Lama/SimpanSimulasi'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('Buat Pengajuan Mobil Baru/Lama/Alert_Uang_Muka_20dariOTR'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(null, 0, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/SimpanSimulasi'), 0)
}

