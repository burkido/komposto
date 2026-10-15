@file:OptIn(ExperimentalKompostoApi::class)

package bottomsheet.header

import androidx.compose.runtime.Composable
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.bottomsheet.header.KPBottomSheetHeader // Assuming KPBottomSheetHeader is the correct import
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

private val singleRowTitle = "Title"
private val doubleRowTitle =
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod"

@PreviewTest
@DesignScreenshotPreview
@Composable
fun bottomSheetHeaderRowTitleTest() = DesignScreenshot(
    testName = "BottomSheet Header Single Row Test",
    contents = listOf(
        DesignScreenshotTestContainer("BottomSheet Header Single Row") {
            BoxWithHorizontalPadding {
                KPBottomSheetHeader(title = singleRowTitle, onCloseIconClick = { }) // Replaced BottomSheetHeader with KPBottomSheetHeader
            }
        },
        DesignScreenshotTestContainer("BottomSheet Header Double Row") {
            BoxWithHorizontalPadding {
                KPBottomSheetHeader(title = doubleRowTitle, onCloseIconClick = { }) // Replaced BottomSheetHeader with KPBottomSheetHeader
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun bottomSheetHeaderBackIconTest() = DesignScreenshot(
    testName = "BottomSheet Header Back Icon Test",
    contents = listOf(
        DesignScreenshotTestContainer("BottomSheet Header Back Icon is Visible") {
            BoxWithHorizontalPadding {
                KPBottomSheetHeader( // Replaced BottomSheetHeader with KPBottomSheetHeader
                    title = singleRowTitle, onCloseIconClick = { },
                    isBackIconVisible = true
                )
            }
        },
        DesignScreenshotTestContainer("BottomSheet Header Back Icon is not Visible") {
            BoxWithHorizontalPadding {
                KPBottomSheetHeader( // Replaced BottomSheetHeader with KPBottomSheetHeader
                    title = singleRowTitle, onCloseIconClick = { },
                    isBackIconVisible = false
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun bottomSheetHeaderCloseIconTest() = DesignScreenshot(
    testName = "BottomSheet Header Close Icon Test",
    contents = listOf(
        DesignScreenshotTestContainer("BottomSheet Header Back Icon is Visible") {
            BoxWithHorizontalPadding {
                KPBottomSheetHeader( // Replaced BottomSheetHeader with KPBottomSheetHeader
                    title = singleRowTitle, onCloseIconClick = { },
                    isCloseIconVisible = true
                )
            }
        },
        DesignScreenshotTestContainer("BottomSheet Header Close Icon is not Visible") {
            BoxWithHorizontalPadding {
                KPBottomSheetHeader( // Replaced BottomSheetHeader with KPBottomSheetHeader
                    title = singleRowTitle, onCloseIconClick = { },
                    isCloseIconVisible = false
                )
            }
        }
    )
)
