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

Mobile.startApplication('D:\\MY WORLD\\KULIAH (TUGAS)\\TGS SEMS. 8\\INTERNSHIT\\Task ACC ONE\\ACC-ACCOne\\acc.one (2).apk', 
    false)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnMasukatauDaftar'), 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnDaftar'), 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnPunyaKontrak'), 0)

Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextNoPolisi'), 'B2680RM', 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnDaftarNoPolisi'), 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnUbahnomorhandphone'), 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/pickListDate'), 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnOKdate'), 0)

Mobile.setText(findTestObject('Daftar - Punya Kontrak/editText4DigitAngkaTerakhir'), '6866', 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnVerifikasi'), 0)

Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextNoHPbaru'), '083116242603', 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnKonfirmasi'), 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnOKnoHPtelahDiubah'), 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/android.widget.EditText0 - B2680RM'), 0)

Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextNamaLengkap'), 'Trisna Jihan', 0)

Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextEmail'), 'rizkaaa20@gmail.com', 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/perempuan'), 0)

Mobile.tap(findTestObject('Daftar - Punya Kontrak/lakilaki'), 0)

Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextPassword'), 'A123456', 0)

Mobile.setText(findTestObject('Daftar - Punya Kontrak/editTextConfirmPassword'), 'A123456', 0)

not_run: Mobile.tap(findTestObject('Daftar - Punya Kontrak/btnDaftarAkun'), 0)

