@file:OptIn(ExperimentalKompostoApi::class)

package dialog

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.dialog.DialogButtons
import com.trendyol.design.core.dialog.KPGenericDialogContent
import com.trendyol.design.core.dialog.KPGenericDialogType
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

@PreviewTest
@DesignScreenshotPreview
@Composable
fun successDialogSingleButtonTest() = DesignScreenshot(
    testName = "successDialogSingleButtonTest",
    contents = listOf(
        DesignScreenshotTestContainer("SingleButton") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Success,
                    displayCloseButton = false,
                    title = "Success Message Title",
                    message = "Message Detail",
                    primaryButton = {
                        DialogButtons.Primary(
                            text = "Button",
                            modifier = Modifier.fillMaxWidth()
                        ) {
                        }
                    }
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun successDialogSingleButtonWithCloseTest() = DesignScreenshot(
    testName = "successDialogSingleButtonWithCloseTest",
    contents = listOf(
        DesignScreenshotTestContainer("SingleButtonWithClose") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Success,
                    displayCloseButton = true,
                    title = "Success Message Title",
                    message = "Message Detail",
                    primaryButton = {
                        DialogButtons.Primary(
                            text = "Button",
                            modifier = Modifier.fillMaxWidth()
                        ) {
                        }
                    }
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun successDialogTwoButtonsTest() = DesignScreenshot(
    testName = "successDialogTwoButtonsTest",
    contents = listOf(
        DesignScreenshotTestContainer("TwoButtons") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Success,
                    displayCloseButton = false,
                    title = "Success Message Title",
                    message = "Message Detail",
                    primaryButton = {
                        DialogButtons.Primary(
                            text = "Button",
                            modifier = Modifier.fillMaxWidth()
                        ) {
                        }
                    },
                    secondaryButton = {
                        DialogButtons.Secondary(
                            text = "Button",
                            modifier = Modifier.fillMaxWidth()
                        ) {
                        }
                    }
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun successDialogTwoButtonsWithCloseTest() = DesignScreenshot(
    testName = "successDialogTwoButtonsWithCloseTest",
    contents = listOf(
        DesignScreenshotTestContainer("TwoButtonsWithClose") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Success,
                    displayCloseButton = true,
                    title = "Success Message Title",
                    message = "Message Detail",
                    primaryButton = {
                        DialogButtons.Primary(
                            text = "Button",
                            modifier = Modifier.fillMaxWidth()
                        ) {
                        }
                    },
                    secondaryButton = {
                        DialogButtons.Secondary(
                            text = "Button",
                            modifier = Modifier.fillMaxWidth()
                        ) {
                        }
                    }
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun successDialogNoButtonTest() = DesignScreenshot(
    testName = "successDialogNoButtonTest",
    contents = listOf(
        DesignScreenshotTestContainer("NoButton") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Success,
                    displayCloseButton = false,
                    title = "Success Message Title",
                    message = "Message Detail"
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun successDialogNoButtonWithCloseTest() = DesignScreenshot(
    testName = "successDialogNoButtonWithCloseTest",
    contents = listOf(
        DesignScreenshotTestContainer("NoButtonWithClose") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Success,
                    displayCloseButton = true,
                    title = "Success Message Title",
                    message = "Message Detail"
                )
            }
        }
    )
)
