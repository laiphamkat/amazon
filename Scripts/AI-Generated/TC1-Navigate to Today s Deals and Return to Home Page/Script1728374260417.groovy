import truetest.custom.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on input Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on input Submit.png')

"Step 3: Click on link TodaysDeals -> Navigate to page '/primebigdealdays'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_TodaysDeals'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link TodaysDeals - Navigate to page primebigdealdays.png')

"Step 4: Click on span FilterDepartments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/primebigdealdays?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_primebigdealdays/span_FilterDepartments'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on span FilterDepartments.png')

"Step 5: Click on input Departments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/primebigdealdays?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_primebigdealdays/input_Departments'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on input Departments.png')

"Step 6: Click on link ProductCard -> Navigate to page '*/dp/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/primebigdealdays?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_primebigdealdays/link_ProductCard'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link ProductCard - Navigate to page dp.png')

"Step 7: Click on input Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/input_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on input Submit.png')

"Step 8: Click on link RingPeepholeCamera -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/link_RingPeepholeCamera'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link RingPeepholeCamera - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate to Today s Deals and Return to Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}