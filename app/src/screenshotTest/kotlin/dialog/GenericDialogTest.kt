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
import com.trendyol.design.core.icon.KPIcon
import com.trendyol.design.core.icon.KPIconSize
import com.trendyol.design.core.icon.KPIcons
import com.trendyol.design.core.icon.icons.outline.StateCaution
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

@PreviewTest
@DesignScreenshotPreview
@Composable
fun genericDialogSingleButtonTest() = DesignScreenshot(
    testName = "genericDialogSingleButtonTest",
    contents = listOf(
        DesignScreenshotTestContainer("SingleButton") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Custom,
                    displayCloseButton = false,
                    title = "Popup Title",
                    icon = {
                        KPIcon(
                            imageVector = KPIcons.Outline.StateCaution,
                            size = KPIconSize.XXXLarge
                        )
                    },
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
fun genericDialogSingleButtonWithCloseTest() = DesignScreenshot(
    testName = "genericDialogSingleButtonWithCloseTest",
    contents = listOf(
        DesignScreenshotTestContainer("SingleButtonWithClose") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Custom,
                    displayCloseButton = true,
                    title = "Popup Title",
                    icon = {
                        KPIcon(
                            imageVector = KPIcons.Outline.StateCaution,
                            size = KPIconSize.XXXLarge
                        )
                    },
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
fun genericDialogTwoButtonsTest() = DesignScreenshot(
    testName = "genericDialogTwoButtonsTest",
    contents = listOf(
        DesignScreenshotTestContainer("TwoButtons") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Custom,
                    displayCloseButton = false,
                    title = "Popup Title",
                    icon = {
                        KPIcon(
                            imageVector = KPIcons.Outline.StateCaution,
                            size = KPIconSize.XXXLarge
                        )
                    },
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
fun genericDialogTwoButtonsWithCloseTest() = DesignScreenshot(
    testName = "genericDialogTwoButtonsWithCloseTest",
    contents = listOf(
        DesignScreenshotTestContainer("TwoButtonsWithClose") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Custom,
                    displayCloseButton = true,
                    title = "Popup Title",
                    icon = {
                        KPIcon(
                            imageVector = KPIcons.Outline.StateCaution,
                            size = KPIconSize.XXXLarge
                        )
                    },
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
fun genericDialogNoButtonTest() = DesignScreenshot(
    testName = "genericDialogNoButtonTest",
    contents = listOf(
        DesignScreenshotTestContainer("NoButton") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Custom,
                    displayCloseButton = false,
                    title = "Popup Title",
                    icon = {
                        KPIcon(
                            imageVector = KPIcons.Outline.StateCaution,
                            size = KPIconSize.XXXLarge
                        )
                    },
                    message = "Message Detail"
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun genericDialogNoButtonWithCloseTest() = DesignScreenshot(
    testName = "genericDialogNoButtonWithCloseTest",
    contents = listOf(
        DesignScreenshotTestContainer("NoButtonWithClose") {
            BoxWithHorizontalPadding {
                KPGenericDialogContent(
                    type = KPGenericDialogType.Custom,
                    displayCloseButton = true,
                    title = "Popup Title",
                    icon = {
                        KPIcon(
                            imageVector = KPIcons.Outline.StateCaution,
                            size = KPIconSize.XXXLarge
                        )
                    },
                    message = "Message Detail"
                )
            }
        }
    )
)
