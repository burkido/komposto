@file:OptIn(ExperimentalKompostoApi::class)

package statelayout.loading

import androidx.compose.runtime.Composable
import com.android.tools.screenshot.PreviewTest
import com.trendyol.design.core.annotation.ExperimentalKompostoApi
import com.trendyol.design.core.statelayout.KPStateComposeLayout
import com.trendyol.design.core.statelayout.State
import com.trendyol.design.core.statelayout.states.loading.LoadingType
import core.BoxWithHorizontalPadding
import core.DesignScreenshot
import core.DesignScreenshotPreview
import core.DesignScreenshotTestContainer

@PreviewTest
@DesignScreenshotPreview
@Composable
fun circularLoadingTests() = DesignScreenshot(
    testName = "Circular Loading Tests",
    contents = listOf(
        DesignScreenshotTestContainer("Circular Loading") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(state = State.ContentWithLoading(LoadingType.Circular))
            }
        }
    )
)

@PreviewTest
@DesignScreenshotPreview
@Composable
fun progressiveLoadingTests() = DesignScreenshot(
    testName = "Progressive Loading Tests",
    contents = listOf(
        DesignScreenshotTestContainer("Progressive Loading") {
            BoxWithHorizontalPadding {
                KPStateComposeLayout(state = State.ContentWithLoading(LoadingType.Progressive))
            }
        }
    )
)
