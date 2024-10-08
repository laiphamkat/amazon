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

"Step 2: Click on link Registry -> Navigate to page '/registries'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Registry'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link Registry - Navigate to page registries.png')

"Step 3: Click on header EarthsBiggestSelection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/registries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registries/header_EarthsBiggestSelection'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on header EarthsBiggestSelection.png')

"Step 4: Click on header KeepTrackOfEverything"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/registries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registries/header_KeepTrackOfEverything'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on header KeepTrackOfEverything.png')

"Step 5: Click on link HomeServicesExperienced -> Navigate to page 'gp/browse.html/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/registries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registries/link_HomeServicesExperienced'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link HomeServicesExperienced - Navigate to page gpbrowsehtml.png')

"Step 6: Click on link Furniture -> Navigate to page 'b/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gp/browse.html/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_gp_browse_html/link_Furniture'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link Furniture - Navigate to page b.png')

"Step 7: Click on link Mattresses"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/b/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_b/link_Mattresses'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link Mattresses.png')

"Step 8: Click on link CasperSleepElement -> Navigate to page '*/dp/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/b/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_b/link_CasperSleepElement'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link CasperSleepElement - Navigate to page dp.png')

"Step 9: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on button Close.png')

"Step 10: Click on link AllCategoriesMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/link_AllCategoriesMenu'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on link AllCategoriesMenu.png')

"Step 11: Click on link KindleEreadersAndBooks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/link_KindleEreadersAndBooks'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link KindleEreadersAndBooks.png')

"Step 12: Click on link ManageYourContentAndDevices"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/link_ManageYourContentAndDevices'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on link ManageYourContentAndDevices.png')

"Step 13: Click on link KindleEreadersAndBooks2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/link_KindleEreadersAndBooks2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on link KindleEreadersAndBooks2.png')

"Step 14: Click on link KindlePaperwhiteKids -> Navigate to page '/b'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/dp/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dp/link_KindlePaperwhiteKids'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link KindlePaperwhiteKids - Navigate to page b.png')

"Step 15: Click on link AdvertiseYourProducts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/b?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_b/link_AdvertiseYourProducts'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on link AdvertiseYourProducts.png')

"Step 16: Click on link CustomerService -> Navigate to page 'gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/gp/help/customer/display.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/b?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_b/link_CustomerService'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on link CustomerService - Navigate to page gphelpcustomergphelpcustomergphelpcustomergphelpcustomergphelpcustomerdisplayhtml.png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Explore Various Categories and Access Customer Service_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}