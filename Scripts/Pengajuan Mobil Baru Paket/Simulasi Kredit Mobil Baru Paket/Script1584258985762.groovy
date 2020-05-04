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

not_run: Mobile.startApplication('D:\\MY WORLD\\KULIAH (TUGAS)\\TGS SEMS. 8\\INTERNSHIT\\Backup\\ACC-ACCOne\\acc.one (2).apk', 
    false)

not_run: Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/cariMobilBtn'), 0)

not_run: Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/mobilBaruBtn'), 0)

not_run: Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

if (paket == 'Yes') {
    CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 270)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/newTapObject', [('text') : namaMobil]), 
        0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 300)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (gantiPaket == 'Yes') {
        Mobile.tap(findTestObject('Daftar - Punya Kontrak/android.view.View0 - PAKET CASHBACC'), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/pilihPaket'), 0)
    }
    
    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/simKred2'), 0)

    Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/DPbtn'), 0, FailureHandling.STOP_ON_FAILURE)

    if (persenDP == '20') {
        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/v220'), 0)
    } else if (persenDP == '25') {
        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/v225'), 0)
    } else if (persenDP == '30') {
        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/v230'), 0)
    }
    
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementVisible(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/stokKosong'), 
        0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/Ubah Simulasi'), 0, FailureHandling.STOP_ON_FAILURE)
    } else {
        if (periodeBayar == '12') {
            Mobile.tapAtPosition(50, 750)
        } else if (periodeBayar == '24') {
            Mobile.tapAtPosition(211, 750)
        } else if (periodeBayar == '36') {
            Mobile.tapAtPosition(360, 750)
        } else if (periodeBayar == '48') {
            Mobile.tapAtPosition(516, 750)
        } else {
            Mobile.tapAtPosition(663, 750)
        }
        
        Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

        if (creditOrCash != 'Credit') {
            Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/cash'), 0)
        }
        
        Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

        if (protection != 'Yes') {
            Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/protection'), 0)
        }
        
        Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

        if (condition == 'cancelSaved') {
            Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/back (1)'), 0)

            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
        } else {
            Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/save (1)'), 0)

            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
        }
    }
} else {
    CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 270)

    CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 270)

    CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 270)

    CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 270)

    Mobile.tapAtPosition(210, 656)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'ScrollUpDown.UpDown'(405, 1115, 405, 300)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/hitsimButton'), 0)

    Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/DPbtn'), 0, FailureHandling.STOP_ON_FAILURE)

    if (condition == 'kurangDari20Persen') {
        Mobile.setText(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/inputDP'), persenDP, 
            0)

        Mobile.verifyElementVisible(findTestObject('Pengajuan Mobil Baru Paket/v2DP Minimal 20'), 0)
    } else if (condition == 'dpHarusDiisi') {
        Mobile.verifyElementVisible(findTestObject('Pengajuan Mobil Baru Paket/v2Harus diisi'), 0)
    } else {
        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/inputDP'), persenDP, 
            0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        if (Mobile.verifyElementVisible(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/stokKosong'), 
            0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/Ubah Simulasi'), 0, FailureHandling.STOP_ON_FAILURE)
        } else {
            if (periodeBayar == '12') {
                Mobile.tapAtPosition(50, 750)
            } else if (periodeBayar == '24') {
                Mobile.tapAtPosition(211, 750)
            } else if (periodeBayar == '36') {
                Mobile.tapAtPosition(360, 750)
            } else if (periodeBayar == '48') {
                Mobile.tapAtPosition(516, 750)
            } else {
                Mobile.tapAtPosition(663, 750)
            }
            
            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

            Mobile.hideKeyboard()

            if (creditOrCash != 'Credit') {
                Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/cash'), 0)
            }
            
            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

            if (protection != 'Yes') {
                Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/protection'), 0)
            }
            
            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

            if (condition == 'cancelSaved') {
                Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/back (1)'), 0)

                Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
            } else {
                Mobile.tap(findTestObject('Pengajuan Mobil Baru Paket/Simulasi Kredit Mobil Baru Paket/save (1)'), 0)

                Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
            }
        }
    }
}

