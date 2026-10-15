@file:OptIn(ExperimentalKompostoApi::class)

package dialog

import androidx.compose.runtime.Composable
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.dialog.DialogButtons
import com.trendyol.design.core.dialog.KPAlertDialogContent
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

@PreviewTest
@DesignScreenshotPreview
@Composable
fun alertDialogSingleButtonTest() = DesignScreenshot(
    testName = "alertDialogSingleButtonTest",
    contents = listOf(
        DesignScreenshotTestContainer("Single") {
            BoxWithHorizontalPadding {
                KPAlertDialogContent(
                    message = "Description",
                    title = "Title",
                    negativeButton = {
                        Text(text = "Button", onClick = { })
                    }
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun alertDialogTwoButtonsTest() = DesignScreenshot(
    testName = "alertDialogTwoButtonsTest",
    contents = listOf(
        DesignScreenshotTestContainer("TwoButtons") {
            BoxWithHorizontalPadding {
                KPAlertDialogContent(
                    message = "Description",
                    title = "Title",
                    negativeButton = {
                        DialogButtons.Text(text = "Button", onClick = { })
                    },
                    positiveButton = {
                        DialogButtons.Text(text = "Button", onClick = { })
                    }
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun alertDialogThreeButtonsTest() = DesignScreenshot(
    testName = "alertDialogThreeButtonsTest",
    contents = listOf(
        DesignScreenshotTestContainer("ThreeButtons") {
            BoxWithHorizontalPadding {
                KPAlertDialogContent(
                    message = "Description",
                    title = "Title",
                    negativeButton = {
                        DialogButtons.Text(text = "Button", onClick = { })
                    },
                    positiveButton = {
                        DialogButtons.Text(text = "Button", onClick = { })
                    },
                    neutralButton = {
                        DialogButtons.Text(text = "Button", onClick = { })
                    },
                )
            }
        }
    )
)
