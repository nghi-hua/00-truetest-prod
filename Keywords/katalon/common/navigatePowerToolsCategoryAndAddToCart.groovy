package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class navigatePowerToolsCategoryAndAddToCart {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on link navCategories"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navCategories'))
        "Step 2: Click on link categoryPowerTools -> Navigate to page 'category/*'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_categoryPowerTools'))
        "Step 3: Click on link product01J0Hx284Fg34Ffzf5353Nybxz -> Navigate to page '#/product/*'"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_product01J0Hx284Fg34Ffzf5353Nybxz'))
        "Step 4: Click on button addToCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart'))
        "Step 5: Click on link navCart"
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_navCart'))
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

