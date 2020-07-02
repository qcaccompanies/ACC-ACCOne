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

Mobile.startApplication('C:\\Users\\lieto\\git\\ACC-ACCOne\\acc.one (preprod).apk', false)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/boxCariMobil'), 0)

Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/boxRentalMobil'), 0)

if (newOrUsed.toString() == 'used') {
    Mobile.tap(findTestObject('Cari Mobil/Rental Mobil/btnUsedCar'), 0)
}

Mobile.setText(findTestObject('Cari Mobil/Mobil Rental/Dropdown Brand'), brand, 0)

Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Opsi Toyota', [('text') : brand]), 0)

Mobile.setText(findTestObject('Cari Mobil/Mobil Rental/Dropdown Type'), typeMobil, 0)

Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Opsi All New Avanza', [('text') : typeMobil]), 0)

not_run: Mobile.swipe(400, 1600, 400, 600)

Mobile.setText(findTestObject('Cari Mobil/Mobil Rental/Dropdown Model'), model, 0)

Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Opsi 1.3 VELOZ AT', [('text') : model]), 0)

Mobile.setText(findTestObject('Cari Mobil/Mobil Rental/Dropdown Tahun'), tahun, 0)

Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Opsi Tahun 2019', [('text') : tahun]), 0)

Mobile.setText(findTestObject('Cari Mobil/Mobil Rental/Dropdown Area Pengajuan'), areaPengajuan, 0)

Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Opsi Area Pengajuan', [('text') : areaPengajuan]), 0)

Mobile.swipe(40, 1080, 40, 500)

Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Dropdown Cabang ACC'), 0)

Mobile.setText(findTestObject('Cari Mobil/Mobil Rental/Dropdown Cabang ACC'), cabangACC + '\\n', 0)

Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Opsi Bandung 3 Cibiru Jawa Barat', [('text') : cabangACC]), 0)

if (tujuan.toString() == 'Usaha') {
    Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Btn Usaha'), 0)

    Mobile.setText(findTestObject('Cari Mobil/Mobil Rental/Dropdown Bidang Usaha'), bidangUsaha, 0)

    Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Opsi Bidang Usaha', [('text') : bidangUsaha]), 0)
}

if (typeCustomer.toString() == 'Company') {
    Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Btn Company'), 0)
}

switch (warna) {
    case 'Merah':
        Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Warna Merah'), 0)

        break
    case 'Hitam':
        Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Warna Hitam'), 0)

        break
    default:
        break
}

switch (periodeLeasing.toString()) {
    case '12':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('Cari Mobil/Mobil Rental/Slider Periode Leasing'), 0, FailureHandling.STOP_ON_FAILURE)

        break
    case '24':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('Cari Mobil/Mobil Rental/Slider Periode Leasing'), 25, 
            FailureHandling.STOP_ON_FAILURE)

        break
    case '36':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('Cari Mobil/Mobil Rental/Slider Periode Leasing'), 50, 
            FailureHandling.STOP_ON_FAILURE)

        break
    case '48':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('Cari Mobil/Mobil Rental/Slider Periode Leasing'), 75, 
            FailureHandling.STOP_ON_FAILURE)

        break
    case '60':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('Cari Mobil/Mobil Rental/Slider Periode Leasing'), 100, 
            FailureHandling.STOP_ON_FAILURE)

        break
}

Mobile.tap(findTestObject('Cari Mobil/Mobil Rental/Btn Ajukan Enabled'), 0)

Mobile.closeApplication()

