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

@PreviewTest
@DesignScreenshotPreview
@Composable
fun noButtonFullVersionMediumIconWarningInfoTests() = DesignScreenshot(
    testName = "NoButton - FullVersion - MediumIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("Full Version Medium") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = title,
                            description = description
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
fun noButtonFullVersionSmallIconWarningInfoTests() = DesignScreenshot(
    testName = "NoButton - FullVersion - SmallIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("Full Version Medium") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonFullVersion(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = title,
                            description = description
                        )
                    )
                )
            }
        }
    ),
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun noButtonNoDescriptionMediumIconWarningInfoTests() = DesignScreenshot(
    testName = "NoButton - NoDescription - MediumIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Description Medium") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            title = title
                        )
                    )
                )
            }
        }
    ),
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun noButtonNoDescriptionSmallIconWarningInfoTests() = DesignScreenshot(
    testName = "NoButton - NoDescription - SmallIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Description Small") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoDescription(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            title = title
                        )
                    )
                )
            }
        }
    ),
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun noButtonNoTitleMediumIconWarningInfoTests() = DesignScreenshot(
    testName = "NoButton - NoTitle - MediumIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Title Medium") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutMediumIcon,
                            description = description
                        )
                    )
                )
            }
        }
    ),
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun noButtonNoTitleSmallIconWarningInfoTests() = DesignScreenshot(
    testName = "NoButton - NoTitle - SmallIcon - Warning Info Tests",
    contents = listOf(
        DesignScreenshotTestContainer("No Title Small") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(
                    state = State.WarningInfo(
                        warningInfoStateLayoutStyle = KPWarningInfoStateLayoutStyle.NoButtonNoTitle(
                            iconSize = StateLayoutIconSize.WarningInfoStateLayoutSmallIcon,
                            description = description
                        )
                    )
                )
            }
        }
    ),
)
