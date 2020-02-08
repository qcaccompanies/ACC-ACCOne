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

Mobile.setText(findTestObject('Trade In/Brand_Trade'), BrandTrade, 0)

Mobile.tap(findTestObject('Trade In/Select 2', [('text') : BrandTrade]), 0)

Mobile.setText(findTestObject('Trade In/Type_Trade'), TypeTrade, 0)

Mobile.tap(findTestObject('Trade In/Select 2', [('text') : TypeTrade]), 0)

Mobile.tap(findTestObject('Trade In/Detail Umum'), 0)

Mobile.setText(findTestObject('Trade In/Input_Model'), ModelTrade, 0)

Mobile.tap(findTestObject('Trade In/Select 2', [('text') : ModelTrade]), 0)

Mobile.setText(findTestObject('Trade In/Tahun_Trade'), TahunTrade, 0)

Mobile.tap(findTestObject('Trade In/Select 2', [('text') : TahunTrade]), 0)

Mobile.setText(findTestObject('Trade In/Lokasi_Trade'), LokasiTrade, 0)

Mobile.tap(findTestObject('Trade In/Select 2', [('text') : LokasiTrade]), 0)

Mobile.tap(findTestObject('Trade In/Btn_Berikutnya'), 0)

