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
fun errorDialogSingleButtonTest() = DesignScreenshot(
    testName = "errorDialogSingleButtonTest",
    contents = listOf(
        DesignScreenshotTestContainer("Single") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Error,
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
fun errorDialogSingleButtonWithCloseTest() = DesignScreenshot(
    testName = "errorDialogSingleButtonWithCloseTest",
    contents = listOf(
        DesignScreenshotTestContainer("singleWithClose") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Error,
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
fun errorDialogTwoButtonsTest() = DesignScreenshot(
    testName = "errorDialogTwoButtonsTest",
    contents = listOf(
        DesignScreenshotTestContainer("twoButton") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Error,
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
fun errorDialogTwoButtonsWithCloseTest() = DesignScreenshot(
    testName = "errorDialogTwoButtonsWithCloseTest",
    contents = listOf(
        DesignScreenshotTestContainer("twoButtonWithClose") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Error,
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
fun errorDialogNoButtonTest() = DesignScreenshot(
    testName = "errorDialogNoButtonTest",
    contents = listOf(
        DesignScreenshotTestContainer("noButton") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Error,
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
fun errorDialogNoButtonWithCloseTest() = DesignScreenshot(
    testName = "errorDialogNoButtonWithCloseTest",
    contents = listOf(
        DesignScreenshotTestContainer("noButtonWithClose") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Error,
                    displayCloseButton = true,
                    title = "Success Message Title",
                    message = "Message Detail"
                )
            }
        }
    )
)
