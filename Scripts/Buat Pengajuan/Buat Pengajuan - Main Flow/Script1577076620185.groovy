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

Mobile.startApplication('C:/Users/Marvin/Documents/GitHub/ACC-Seamless-ACCOne/acc.one (1).apk', false)

Mobile.tap(findTestObject('Buat Pengajuan/Btn_Cari_Mobil'), 0)

Mobile.tap(findTestObject('Buat Pengajuan/Mobil_Baru_BTN'), 0)

if (Paket == 'Yes') {
    Mobile.tap(findTestObject('Buat Pengajuan/Paket_Mobil_Baru (1)'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(JenisMobil, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Buat Pengajuan/Select_Car', [('text') : JenisMobil]), 0)

    WebUI.callTestCase(findTestCase('Buat Pengajuan/HitungSimulasi'), [('NamaArea') : NamaArea, ('NamaCabang') : NamaCabang
            , ('DP') : DP, ('Periode') : Periode, ('PembayaranAsuransi') : PembayaranAsuransi, ('CreditProtection') : CreditProtection
            , ('DPPersen') : DPPersen, ('DPNominal') : DPNominal], FailureHandling.STOP_ON_FAILURE)
} else if (Brand == 'Toyota') {
    Mobile.tap(findTestObject('Buat Pengajuan/Toyota_Button'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(MobileUtama, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Buat Pengajuan/Select_Car', [('text') : MobileUtama]), 0)

    WebUI.callTestCase(findTestCase('Buat Pengajuan/HitungSimulasi'), [('NamaArea') : NamaArea, ('NamaCabang') : NamaCabang
            , ('DP') : DP, ('Periode') : Periode, ('PembayaranAsuransi') : PembayaranAsuransi, ('CreditProtection') : CreditProtection
            , ('DPPersen') : DPPersen, ('DPNominal') : DPNominal], FailureHandling.STOP_ON_FAILURE)
} else if (Brand == 'Daihatsu') {
    Mobile.tap(findTestObject('Buat Pengajuan/Daihatsu_Button'), 0)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(MobileUtama, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Buat Pengajuan/Select_Car', [('text') : MobileUtama]), 0)

    WebUI.callTestCase(findTestCase('Buat Pengajuan/HitungSimulasi'), [('NamaArea') : NamaArea, ('NamaCabang') : NamaCabang
            , ('DP') : DP, ('Periode') : Periode, ('PembayaranAsuransi') : PembayaranAsuransi, ('CreditProtection') : CreditProtection
            , ('DPPersen') : DPPersen, ('DPNominal') : DPNominal], FailureHandling.STOP_ON_FAILURE)
} else if (PromoTerbaik == 'Yes') {
    Mobile.tap(findTestObject('Buat Pengajuan/Promo_Terbaek_Acc'), 0)

    WebUI.callTestCase(findTestCase('Buat Pengajuan/HitungSimulasi'), [('NamaArea') : NamaArea, ('NamaCabang') : NamaCabang
            , ('DP') : DP, ('Periode') : Periode, ('PembayaranAsuransi') : PembayaranAsuransi, ('CreditProtection') : CreditProtection
            , ('DPPersen') : DPPersen, ('DPNominal') : DPNominal], FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.scrollToText(MobileUtama, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Buat Pengajuan/Select_Car', [('text') : MobileUtama]), 0)

    WebUI.callTestCase(findTestCase('Buat Pengajuan/HitungSimulasi'), [('NamaArea') : NamaArea, ('NamaCabang') : NamaCabang
            , ('DP') : DP, ('Periode') : Periode, ('PembayaranAsuransi') : PembayaranAsuransi, ('CreditProtection') : CreditProtection
            , ('DPPersen') : DPPersen, ('DPNominal') : DPNominal], FailureHandling.STOP_ON_FAILURE)
}

switch ('Status') {
    case 'Pass':
        Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)

        break
    case 'Fail':
        break
        
        if (Detail.toString() == 'Cabang Harus Diisi') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
        
        if (Detail.toString() == 'DP Harus Diisi') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
        
        if (Detail.toString() == 'Uang Harus 20% Dari OTR') {
            Mobile.verifyElementVisible(findTestObject('TopUP/BtnLanjut'), 0)
        }
}

