import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\Andrew\\AppData\\Local\\Temp\\Katalon\\20180823_205416\\execution.properties')

TestCaseMain.beforeStart()

         TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'https://app.cloudfinder.com/#/login\')\n\nWebUI.setText(findTestObject(\'Page_Cloudfinder  Login/input_j_username\'), \'AT@august19.onmicrosoft.com\')\n\nWebUI.setText(findTestObject(\'Page_Cloudfinder  Login/input_j_password\'), \'Afore-2245995\')\n\nWebUI.click(findTestObject(\'Page_Cloudfinder  Login/input_btn btn-default\'))\n\nWebUI.setText(findTestObject(\'Page_Cloudfinder  Dashboard/input_q\'), \'sam\')\n\nWebUI.sendKeys(findTestObject(\'Page_Cloudfinder  Dashboard/input_q\'), Keys.chord(Keys.ENTER))\n\nWebUI.verifyElementText(findTestObject(\'Page_Cloudfinder  Search/strong_Sam Yosemite\'), \'Sam Yosemite\')\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

