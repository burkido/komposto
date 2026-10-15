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
private val primaryButtonText = "Alışverişe Devam Et"

@PreviewTest
@DesignScreenshotPreview
@Composable
fun singleButtonFullVersionMediumIconWarningInfoTests() = DesignScreenshot(
    testName = "SingleButton - FullVersion - MediumIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("Full Version Medium") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.SingleButtonFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = title,
                            description = description,
                            primaryButtonText = primaryButtonText,
                            primaryButtonClickListener = {}
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
fun singleButtonFullVersionSmallIconWarningInfoTests() = DesignScreenshot(
    testName = "SingleButton - FullVersion - SmallIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("Full Version Small") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.SingleButtonFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = title,
                            description = description,
                            primaryButtonText = primaryButtonText,
                            primaryButtonClickListener = {}
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
fun singleButtonNoDescriptionMediumIconWarningInfoTests() = DesignScreenshot(
    testName = "SingleButton - NoDescription - MediumIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Description Medium") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.SingleButtonNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = title,
                            primaryButtonText = primaryButtonText,
                            primaryButtonClickListener = {}
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
fun singleButtonNoDescriptionSmallIconWarningInfoTests() = DesignScreenshot(
    testName = "SingleButton - NoDescription - SmallIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Description Small") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.SingleButtonNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = title,
                            primaryButtonText = primaryButtonText,
                            primaryButtonClickListener = {}
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
fun singleButtonNoTitleMediumIconWarningInfoTests() = DesignScreenshot(
    testName = "SingleButton - NoTitle - MediumIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Title Medium") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.SingleButtonNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            description = description,
                            primaryButtonText = primaryButtonText,
                            primaryButtonClickListener = {}
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
fun singleButtonNoTitleSmallIconWarningInfoTests() = DesignScreenshot(
    testName = "SingleButton - NoTitle - SmallIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Title Small") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.SingleButtonNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            description = description,
                            primaryButtonText = primaryButtonText,
                            primaryButtonClickListener = {}
                        )
                    )
                )
            }
        }
    )
)
