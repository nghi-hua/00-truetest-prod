import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile("/var/folders/t2/hz55jkws7xb07928q5lr1m0c0000gp/T/Katalon/Test Cases/AI-Generated/TC1-Verify Successful Checkout Process for Claw Hammer1148/20240524_115123/execution.properties")

TestCaseMain.beforeStart()

       TestCaseMain.startTestCaseBinding('Test Cases/AI-Generated/TC1-Verify Successful Checkout Process for Claw Hammer1148', new File("/var/folders/t2/hz55jkws7xb07928q5lr1m0c0000gp/T/Katalon/Test Cases/AI-Generated/TC1-Verify Successful Checkout Process for Claw Hammer1148/20240524_115124/testCaseBinding"))
    
