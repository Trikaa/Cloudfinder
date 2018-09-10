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

WebUI.waitForElementHasAttribute(findTestObject('Page_Cloudfinder  Dashboard/span_Status Completed'), variable2, 30)

WebUI.setText(findTestObject('Object Repository/Page_Cloudfinder  Dashboard/input_q (1) (1)'), 'sam')

WebUI.sendKeys(findTestObject('Object Repository/Page_Cloudfinder  Dashboard/input_q (1) (1)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Cloudfinder  Search/strong_Sam Yosemite'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/dl_Name            Sam Yosemit'))

WebUI.verifyTextPresent(variable1, true)

WebUI.click(findTestObject('Page_Cloudfinder  Search/button_2018-08-23 123124 (1)'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/a_2018-08-22 114609 (1)'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/button_Restore'))

WebUI.setText(findTestObject('Page_Cloudfinder  Search/input_s2id_autogen8_search'), 'AT')

WebUI.click(findTestObject('Page_Cloudfinder  Search/div_ATaugust19.onmicrosoft.com'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/button_Proceed'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/button_Restore'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/button_Close'))

WebUI.click(findTestObject('Page_Cloudfinder  Search/a_ Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Dashboard/a_Restore (1)'))

WebUI.waitForElementHasAttribute(findTestObject('Page_Cloudfinder  Dashboard/div_Backup  Restore  Export   '), variable2, 
    30)

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Dashboard/a_Reports (1)'))

WebUI.click(findTestObject('Object Repository/Page_Cloudfinder  Status Reports/a_Restore (1)'))

WebUI.waitForElementHasAttribute(findTestObject('Object Repository/Page_Cloudfinder  Reports/div_Reports'), variable2, 30)

WebUI.closeBrowser()

