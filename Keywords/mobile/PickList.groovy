package mobile

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable
import com.kms.katalon.core.util.KeywordUtil
public class PickList {
	@Keyword
	def List(listObject, FailureHandling failureHandling = FailureHandling.STOP_ON_FAILURE) {
		try {
			def Gapsize = 115

			def elementYPosition = Mobile.getElementTopPosition(listObject, 0)

			def elementXPosition = Mobile.getElementLeftPosition(listObject, 0)


			Mobile.tapAtPosition(elementXPosition, elementYPosition + Gapsize)
		} catch (Exception e) {
			if (failureHandling == FailureHandling.STOP_ON_FAILURE) {
				//				throw new AssertionError('ERROR: There was an error while trying to execute the keyword')
				KeywordUtil.markFailed("Something wrong with the keyword" + e.message)
			} else if (failureHandling == FailureHandling.CONTINUE_ON_FAILURE) {
				KeywordUtil.logInfo('There was an exception but the process will continue');
			}
		}
	}
}