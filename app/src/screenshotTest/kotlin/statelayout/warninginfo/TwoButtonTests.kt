@file:OptIn(ExperimentalKompostoApi::class)

package statelayout.warninginfo

import androidx.compose.runtime.Composable
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.icon.StateLayoutIconSize
import com.trendyol.design.core.statelayout.KPStateComposeLayout
import com.trendyol.design.core.statelayout.KPWarningInfoStateLayoutStyle
import com.trendyol.design.core.statelayout.State
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

private val title = "İçerik Bulunamadı"
private val description = "Yeni içerikler keşfedebilirsin."
private val buttonText = "Alışverişe Devam Et"

@PreviewTest
@DesignScreenshotPreview
@Composable
fun twoButtonsFullVersionMediumIconWarningInfoTests() = DesignScreenshot(
    testName = "TwoButtons - FullVersion - MediumIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("Full Version Medium") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = title,
                            description = description,
                            primaryButtonText = buttonText,
                            primaryButtonClickListener = {},
                            secondaryButtonText = buttonText,
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun twoButtonsFullVersionSmallIconWarningInfoTests() = DesignScreenshot(
    testName = "TwoButtons - FullVersion - SmallIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("Full Version Small") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = title,
                            description = description,
                            primaryButtonText = buttonText,
                            primaryButtonClickListener = {},
                            secondaryButtonText = buttonText,
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun twoButtonsNoDescriptionMediumIconWarningInfoTests() = DesignScreenshot(
    testName = "TwoButtons - NoDescription - MediumIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Description Medium") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = title,
                            primaryButtonText = buttonText,
                            primaryButtonClickListener = {},
                            secondaryButtonText = buttonText,
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun twoButtonsNoDescriptionSmallIconWarningInfoTests() = DesignScreenshot(
    testName = "TwoButtons - NoDescription - SmallIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Description Small") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = title,
                            primaryButtonText = buttonText,
                            primaryButtonClickListener = {},
                            secondaryButtonText = buttonText,
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun twoButtonsNoTitleMediumIconWarningInfoTests() = DesignScreenshot(
    testName = "TwoButtons - NoTitle - MediumIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Title Medium") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            description = description,
                            primaryButtonText = buttonText,
                            primaryButtonClickListener = {},
                            secondaryButtonText = buttonText,
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun twoButtonsNoTitleSmallIconWarningInfoTests() = DesignScreenshot(
    testName = "TwoButtons - NoTitle - SmallIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Title Small") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.TwoButtonsNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            description = description,
                            primaryButtonText = buttonText,
                            primaryButtonClickListener = {},
                            secondaryButtonText = buttonText,
                            secondaryButtonClickListener = {}
                        )
                    )
                )
            }
        }
    )
)
