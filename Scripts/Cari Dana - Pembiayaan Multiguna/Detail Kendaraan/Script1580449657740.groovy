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

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Btn_Cari_Dana'), 0)

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Btn_Pembiayaan_Multiguna'), 0)

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/DDOWN_BRAND'), 0)

not_run: Mobile.setText(findTestObject('Cari Dana - Pembiayaan Multiguna/Input_Brand'), Brand, 0)

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Select', [('text') : Brand]), 0)

Mobile.setText(findTestObject('Cari Dana - Pembiayaan Multiguna/Input_type'), Type, 0)

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Select', [('text') : Type]), 0)

Mobile.setText(findTestObject('Cari Dana - Pembiayaan Multiguna/Input_Model'), Model, 0)

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Select', [('text') : Model]), 0)

not_run: Mobile.setText(findTestObject('Cari Dana - Pembiayaan Multiguna/Input_tahun'), Tahun, 0)

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Select', [('text') : Tahun]), 0)

if (Mobile.verifyElementVisible(findTestObject('Cari Dana - Pembiayaan Multiguna/Alert_Brand_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Cari Dana - Pembiayaan Multiguna/Btn_Berikutnya'), 0)
} else if (Mobile.verifyElementVisible(findTestObject('Cari Dana - Pembiayaan Multiguna/Alert_Type_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Cari Dana - Pembiayaan Multiguna/Btn_Berikutnya'), 0)
} else if (Mobile.verifyElementVisible(findTestObject('Cari Dana - Pembiayaan Multiguna/Alert_Model_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Cari Dana - Pembiayaan Multiguna/Btn_Berikutnya'), 0)
} else if (Mobile.verifyElementVisible(findTestObject('Cari Dana - Pembiayaan Multiguna/Alert_Tahun_Harus_diisi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Cari Dana - Pembiayaan Multiguna/Btn_Berikutnya'), 0)
} else {
    Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Btn_Berikutnya'), 0)
}

