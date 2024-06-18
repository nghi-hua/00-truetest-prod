package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts

public class navigateAddToCartAndLogin {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on link clawHammer1148 -> Navigate to page '#/product/*'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_clawHammer1148'))
        "Step 2: Click on button addToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))
        "Step 3: Click on link navCart -> Navigate to page '#/*'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navCart'))
        "Step 4: Click on button proceed1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_proceed1'))
        "Step 5: Login into Application"
        TrueTestScripts.login()
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

