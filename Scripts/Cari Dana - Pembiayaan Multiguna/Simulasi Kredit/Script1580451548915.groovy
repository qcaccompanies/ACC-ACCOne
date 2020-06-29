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

Mobile.setText(findTestObject('Cari Dana - Pembiayaan Multiguna/Input_Dana_Yang_Dibutuhkan'), Dana, 0)

if (Periode == '12') {
    Mobile.tapAtPosition(115, 705)
} else if (Periode == '24') {
    Mobile.tapAtPosition(400, 705)
} else if (Periode == '36') {
    Mobile.tapAtPosition(685, 705)
} else if (Periode == '48') {
    Mobile.tapAtPosition(975, 705)
}

Mobile.setText(findTestObject('Cari Dana - Pembiayaan Multiguna/Input_Tujuan_Peminjaman'), Tujuan, 0)

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Select', [('text') : Tujuan]), 0)

Mobile.setText(findTestObject('Cari Dana - Pembiayaan Multiguna/Input_Area_Pengajuan'), AreaPengajuan, 0)

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Select', [('text') : AreaPengajuan]), 0)

Mobile.setText(findTestObject('Cari Dana - Pembiayaan Multiguna/Input_Cabang_ACC'), CabangACC, 0)

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Select', [('text') : CabangACC]), 0)

Mobile.tap(findTestObject('Cari Dana - Pembiayaan Multiguna/Btn_Berikutnya_Simulasi'), 0)

