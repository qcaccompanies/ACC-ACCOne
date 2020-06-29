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

Mobile.startApplication('C:/Users/Marvin/Documents/GitHub/ACC-Seamless-ACCOne/acc.one_dev.apk', false)

Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Btn_Cari_Mobil'), 0)

Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Mobil_Baru_BTN'), 0)

if (Paket == 'Yes') {
    not_run: Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Paket_Mobil_Baru (1)'), 0)

    Mobile.tapAtPosition(500, 700)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(JenisMobil, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Select_Car', [('text') : JenisMobil]), 0)

    WebUI.callTestCase(findTestCase('Pengajuan Mobil Baru/HitungSimulasi'), [('NamaArea') : NamaArea, ('NamaCabang') : NamaCabang
            , ('DP') : DP, ('Periode') : Periode, ('PembayaranAsuransi') : PembayaranAsuransi, ('CreditProtection') : CreditProtection
            , ('DPPersen') : DPPersen, ('DPNominal') : DPNominal], FailureHandling.STOP_ON_FAILURE)
} else if (Brand == 'Toyota') {
    not_run: Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Toyota_Button'), 0)

    Mobile.tapAtPosition(300, 1300)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(MobileUtama, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Select_Car', [('text') : MobileUtama]), 0)

    WebUI.callTestCase(findTestCase('Pengajuan Mobil Baru/HitungSimulasi'), [('NamaArea') : NamaArea, ('NamaCabang') : NamaCabang
            , ('DP') : DP, ('Periode') : Periode, ('PembayaranAsuransi') : PembayaranAsuransi, ('CreditProtection') : CreditProtection
            , ('DPPersen') : DPPersen, ('DPNominal') : DPNominal], FailureHandling.STOP_ON_FAILURE)
} else if (Brand == 'Daihatsu') {
    not_run: Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Daihatsu_Button'), 0)

    Mobile.tapAtPosition(800, 1300)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.scrollToText(MobileUtama, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Select_Car', [('text') : MobileUtama]), 0)

    WebUI.callTestCase(findTestCase('Pengajuan Mobil Baru/HitungSimulasi'), [('NamaArea') : NamaArea, ('NamaCabang') : NamaCabang
            , ('DP') : DP, ('Periode') : Periode, ('PembayaranAsuransi') : PembayaranAsuransi, ('CreditProtection') : CreditProtection
            , ('DPPersen') : DPPersen, ('DPNominal') : DPNominal], FailureHandling.STOP_ON_FAILURE)
} else if (PromoTerbaik == 'Yes') {
    not_run: Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Promo_Terbaek_Acc'), 0)

    Mobile.tapAtPosition(500, 1900)

    WebUI.callTestCase(findTestCase('Pengajuan Mobil Baru/HitungSimulasi'), [('NamaArea') : NamaArea, ('NamaCabang') : NamaCabang
            , ('DP') : DP, ('Periode') : Periode, ('PembayaranAsuransi') : PembayaranAsuransi, ('CreditProtection') : CreditProtection
            , ('DPPersen') : DPPersen, ('DPNominal') : DPNominal], FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.scrollToText(MobileUtama, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Buat Pengajuan Mobil Baru/Lama/Select_Car', [('text') : MobileUtama]), 0)

    WebUI.callTestCase(findTestCase('Pengajuan Mobil Baru/HitungSimulasi'), [('NamaArea') : NamaArea, ('NamaCabang') : NamaCabang
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

