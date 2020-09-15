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

Mobile.startApplication('C:\\Users\\lieto\\git\\ACC-ACCOne\\acc.one (testing).apk', false)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(900, 340)

Mobile.tap(findTestObject('ACCCASH - Pencairan/Label Uang'), 0)

switch (statusPencairan) {
    case 'success':
        Mobile.setText(findTestObject('ACCCASH - Pencairan/Field Input Nominal Pencairan'), nominalPencairanValid, 0)

        Mobile.tapAtPosition(500, 1025)

        break
    case 'failed':
        Mobile.setText(findTestObject('ACCCASH - Pencairan/Field Input Nominal Pencairan'), nominalPencairanInvalid, 0)

        if (condition == 'nominalPencairanKurang') {
            Mobile.tapAtPosition(500, 1025)

            Mobile.verifyElementVisible(findTestObject('ACCCASH - Pencairan/Warn Minimal Pencairan Adalah Rp. 50.000'), 
                0)

            Mobile.setText(findTestObject('ACCCASH - Pencairan/Field Input Nominal Pencairan'), nominalPencairanValid, 0)
        } else if (condition == 'nominalPencairanMelebihi') {
            Mobile.tap(findTestObject('ACCCASH - Pencairan/Btn Ajukan Pencairan'), 0)

            Mobile.verifyElementVisible(findTestObject('ACCCASH - Pencairan/Text Pencairan Melebihi Batas ACCASH'), 0)

            Mobile.tap(findTestObject('ACCCASH - Pencairan/Btn Ubah Pencairan'), 0)

            Mobile.setText(findTestObject('ACCCASH - Pencairan/Field Input Nominal Pencairan'), nominalPencairanValid, 0)

            Mobile.tapAtPosition(500, 1025)
        }
    default:
        break
}

switch (periodePembiayaan) {
    case '7':
        Mobile.setSliderValue(findTestObject('ACCCASH - Pencairan/Slider Periode Pembiayaan'), 33, 0)

        break
    case '8':
        Mobile.setSliderValue(findTestObject('ACCCASH - Pencairan/Slider Periode Pembiayaan'), 66, 0)

        break
    case '9':
        Mobile.setSliderValue(findTestObject('ACCCASH - Pencairan/Slider Periode Pembiayaan'), 100, 0)

        break
    default:
        break
}

Mobile.tap(findTestObject('ACCCASH - Pencairan/Btn Ajukan Pencairan'), 0)

Mobile.tap(findTestObject('ACCCASH - Pencairan/Btn Berikutnya'), 0)

Mobile.tap(findTestObject('ACCCASH - Pencairan/Dropdown Tujuan Penggunaan Dana'), 0)

not_run: Mobile.tap(findTestObject('ACCCASH - Pencairan/Dropdown List Tujuan Penggunaan Dana', [('text') : opsiTujuanPenggunaanDana]), 
    0)

Mobile.tapAtPosition(185, 910)

Mobile.setText(findTestObject('ACCCASH - Pencairan/Field Input Penyedia BarangJasa'), penyediaBarangJasa, 0)

Mobile.tap(findTestObject('ACCCASH - Pencairan/Upload Serong Depan Kiri'), 0)

Mobile.tap(findTestObject('ACCCASH - Pencairan/Opsi Gallery'), 0)

Mobile.closeApplication()

