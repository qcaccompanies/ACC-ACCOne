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

Mobile.startApplication('D:\\MY WORLD\\KULIAH (TUGAS)\\TGS SEMS. 8\\INTERNSHIT\\Task ACC ONE\\ACC-ACCOne\\acc.one.apk', 
    false)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/boxCariMobil'), 0)

Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/boxRentalMobil'), 0)

if (newOrUsed == 'used') {
    Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/btnUsedCar'), 0)
}

Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/b3'), 0)

Mobile.hideKeyboard()

Mobile.scrollToText(brand)

Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : brand]), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.scrollToText(typeMobil)

if (newOrUsed == 'used') {
    Mobile.tapAtPosition(350, 766)
} else {
    Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : typeMobil]), 0)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.scrollToText(model)

Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : model]), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.scrollToText(tahun)

Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : tahun]), 0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'ScrollUpDown.UpDown'(480, 1050, 480, 230)

Mobile.tapAtPosition(297, 428)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText(cabangACC)

Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/tapObject', [('text') : cabangACC]), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

if (tujuan == 'Usaha') {
    Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/btnTujuanUsaha'), 0)
}

Mobile.hideKeyboard()

if (bidangUsaha == 'Pertanian') {
    Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/btnPertanian'), 0)
} else if (bidangUsaha == 'Finance') {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    Mobile.tapAtPosition(293, 600)

    not_run: Mobile.setText(findTestObject('Cari Mobil/Rental Mobil/bidangUsaha'), bidangUsaha, 0)

    not_run: Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/btnTujuanPribadi'), 0)

    not_run: Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/btnTujuanUsaha'), 0)

    not_run: Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/finance2'), 0)
}

if (typeCustomer != 'Personal') {
    Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/android.widget.Button0 - Company'), 0)
}

if (warnaSemua == 'Yes') {
    not_run: Mobile.tapAtPosition(107, 907)

    Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/Wsemua'), 0)
} else {
    if (warnaHitam == 'Yes') {
        Mobile.tapAtPosition(170, 907)

        Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/Whitam'), 0)
    }
    
    if (warnaPutih == 'Yes') {
        not_run: Mobile.tapAtPosition(243, 907)

        Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/Wputih'), 0)
    }
    
    if (warnaSilver == 'Yes') {
        not_run: Mobile.tapAtPosition(309, 907)

        Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/Wsilver'), 0)
    }
    
    if (warnaMerah == 'Yes') {
        not_run: Mobile.tapAtPosition(383, 907)

        Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/Wmerah'), 0)
    }
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

switch (periodeLeasing) {
    case '12':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('Cari Mobil/Rental Mobil/line1'), 0, FailureHandling.STOP_ON_FAILURE)

        break
    case '24':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('Cari Mobil/Rental Mobil/line1'), 0.25, FailureHandling.STOP_ON_FAILURE)

        break
    case '36':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('Cari Mobil/Rental Mobil/line1'), 0.5, FailureHandling.STOP_ON_FAILURE)

        break
    case '48':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('Cari Mobil/Rental Mobil/line1'), 0.75, FailureHandling.STOP_ON_FAILURE)

        break
    case '60':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('Cari Mobil/Rental Mobil/line1'), 1, FailureHandling.STOP_ON_FAILURE)

        break
}

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/btnAjukan'), 0)

if (condition == 'passed') {
    Mobile.verifyElementVisible(findTestObject('Cari Mobil/Rental Mobil/alertSedangDiproses'), 0)

    Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/btnOkay'), 0)
} else {
    Mobile.verifyElementNotVisible(findTestObject('Cari Mobil/Rental Mobil/alertSedangDiproses'), 0)
}

