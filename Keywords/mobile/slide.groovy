package mobile
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

class mobileSlide {

	@Keyword
	def Slide(slideObject , float slidePercentage,FailureHandling failureHandling = FailureHandling.CONTINUE_ON_FAILURE) {
		try {

			def sliderPositionX = Mobile.getElementLeftPosition(slideObject, 0)

			def sliderWidth = Mobile.getElementWidth(slideObject, 0)

			def sliderPosition = (sliderPositionX + (sliderWidth * slidePercentage))

			def sliderPositionY = Mobile.getElementTopPosition(slideObject, 0)

			Mobile.tapAtPosition(sliderPosition, sliderPositionY)
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
