import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('login'), [('user') : 'AT@august19.onmicrosoft.com', ('passwd') : 'Afore-2245995'], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Cloudfinder  Dashboard/input_q'), 'sam')

WebUI.sendKeys(findTestObject('Page_Cloudfinder  Dashboard/input_q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Cloudfinder  Search/strong_Sam Yosemite_1 (1) (1)'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/dl_Name            Sam Yosemit (1)'))

WebUI.verifyTextPresent(variable1, true)

WebUI.click(findTestObject('Page_Cloudfinder  Search/button_2018-08-23 123124'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/a_2018-08-22 114609'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/input_btn btn-info'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/div_HOME            200 E Main'))

WebUI.verifyTextPresent(variable2, true)

WebUI.verifyTextPresent(variable3, true)

WebUI.click(findTestObject('Page_Cloudfinder  Search/button_2018-08-22 114609'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/a_2018-08-23 123124'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/input_btn btn-info'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/div_HOME            500 E Main'))

WebUI.verifyTextPresent(variable2, false)

WebUI.verifyTextPresent(variable3, false)

WebUI.closeBrowser()

